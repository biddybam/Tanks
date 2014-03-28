
public class Player  {
	private String name;
	private Location loc;
	private double tankOrientation; //radian representation of image USE AffineTransform
	private double turretOrientation;//see above
	private double health;
	private double speed;
	private boolean online;
	
	//make class using SQL pulls from database.
	public Player(String n, Location l, double taO, double tuO, double h, double s, boolean o){
		loc=l;
		name=n;
		tankOrientation=taO;
		turretOrientation=tuO;
		health = h;
		speed=s;
		online=o;
		
	}
	public void updatePlayer(String n, Location l, double taO, double tuO, double h, double s, boolean o){
		loc=l;
		name=n;
		tankOrientation=taO;
		turretOrientation=tuO;
		health = h;
		speed=s;
		online=o;
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
	public double getHealth(){
		return health;
	}
	public double getSpeed(){
		return speed;
	}
	public boolean isOnline(){
		return online;
	}
	public String toString(){
		return "Name = "+name+"\n"
			+  "Location = "+loc+"\n"
			+  "Health = "+health+"\n"
			+  "Tank Orientation = "+tankOrientation+"\n"
			+  "Turret Orientation = "+turretOrientation+"\n"
			+  "Speed = "+speed+"\n"
			+  "Online = "+online+"\n";
		
	}

}
