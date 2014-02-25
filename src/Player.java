
public class Player extends Obj {
	private String name;
	private Location loc;
	private double tankOrientation; //radian representation of image USE AffineTransform
	private double turretOrientation;//see above
	
	//make class using SQL pulls from database.
	public Player(String n, Location l, double taO, double tuO){
		name=n;
		loc=l;
		tankOrientation=taO;
		turretOrientation=tuO;
		
	}
	
	

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
