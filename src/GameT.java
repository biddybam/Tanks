import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameT extends JApplet {
	private static final int WIDTH =1000;
	private static final int HEIGHT = 800;
	
	//public int loopslot = -1; //current frame number
	
	public Tank tank;
	
	public GameT() throws InterruptedException{
		super();
		setSize(WIDTH, HEIGHT);
		
		tank = new Tank();
		
		
		tank.setFocusable(true);
		getContentPane().add(tank);
		
		setVisible(true);
		
	}
	
	public void start(){
		
		try {
		//	super.repaint(5, 0, 0, 1000, 800);
		//	GameT run=new GameT();
			
		}
		catch (Exception e){
			e.printStackTrace();
		
			}
	
	}
	
	
	public int getCurrentTime(){
		return tank.getCurrentTime();
	}
	

}
