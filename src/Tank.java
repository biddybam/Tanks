import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

//lets make this the view of the map, view encompasses 1000x800 range

public class Tank extends JPanel implements Runnable, KeyListener{
	private static final int WIDTH = 1000;
	private static final int HEIGHT =750;
	private SQLCenter sql;
	
	private Player clientPlayer;
	private GameMap globalMap;
	private int count;
	public Thread th;
	
	

	public Tank()  throws Exception {
		super();
		setSize(WIDTH, HEIGHT);
		count=0;
		th=new Thread(this);
		th.start();
		globalMap=new GameMap();
		clientPlayer=new Player("dummy",new Location(0,0), 0, 0, 0, 0, true);	 
	}
	public void setClientPlayer(Player p){ //annoying threading and design
		clientPlayer=p;
	}
	public void paint(Graphics g){
		update(g);	
	}
	public void update(Graphics g){
		super.paintComponent(g);
		//g.drawLine(-50, count, WIDTH, HEIGHT);
		g.drawLine(480, 305, 480, 345);
		g.drawLine(480, 305, 520, 305);
		g.drawLine(520, 305, 520, 345);
		g.drawLine(480, 345, 520, 345);
		//System.out.println(System.getProperty("user.name"));
		//System.out.println(count);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void SQL(String usr){
		try{
		sql=new SQLCenter(usr);
		/*for(Player p:sql.getAllPlayers())
			System.out.println(p); //just a test line*/
	//	System.out.println(sql.getAllPlayers().get(0).getPlayerName()); //test line
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	//GAME LOGIC
	public void run(){
		SQL("test");
		try {
			clientPlayer=sql.getMainPlayer();
			while(true){
				//System.out.println(count);
				count++;
		
			
				
				th.sleep(15);
				paint(getGraphics());
				
				
			}
		
			
		
		}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
	}
	public Player getClientPlayer(){
		return clientPlayer;
	}

	public int getCurrentTime() {
		return count; //returns thread iterations
	}

	
}
