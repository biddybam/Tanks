
public class Player extends Obj {
	private String name;

	private double tankOrientation; //radian representation of image USE AffineTransform
	private double turretOrientation;//see above
	
	//make class using SQL pulls from database.
	
	

	public String getPlayerName(){
		return name;
	}
	public double getTankOrientation(){
		return tankOrientation;
	}
	public double getTurretOrientation(){
		return turretOrientation;
	}

}
