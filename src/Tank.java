import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

//lets make this the view of the map, view encompasses 1000x800 range

public class Tank extends JPanel implements Runnable, KeyListener{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;
	
	private Player clientPlayer;
	private GameMap globalMap;
	private int count;
	public Thread th;
	
	

	public Tank()  throws InterruptedException {
		super();
		setSize(WIDTH, HEIGHT);
		count=0;
		th=new Thread(this);
		th.start();
		globalMap=new GameMap();
	 
	}
	public void paint(Graphics g){
		update(g);	
	}
	public void update(Graphics g){
		super.paintComponent(g);
		g.drawLine(-50, count, WIDTH, HEIGHT);
		System.out.println(System.getProperty("user.name"));
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

	//GAME LOGIC
	public void run(){
		while(true){
		//System.out.println(count);
		count++;
		
			try {
				
				th.sleep(15);
				paint(getGraphics());
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		
			
		
		}
		
		
	}

	public int getCurrentTime() {
		return count; //returns thread iterations
	}

	
}
