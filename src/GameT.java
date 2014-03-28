import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameT extends JApplet {
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 750;
	
	//public int loopslot = -1; //current frame number
	
	public Tank tank;
	
	public GameT() throws Exception{
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
			
		//	this wasn't a smart idea but oh well
			
			
			
			
			
		}
		catch (Exception e){
			e.printStackTrace();
		
			}
	
	}
	
	
	public int getCurrentTime(){
		return tank.getCurrentTime();
	}
	

}
