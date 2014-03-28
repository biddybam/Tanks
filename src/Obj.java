import java.awt.Color;



public class Obj {
	
	private Location loc;
	//represents map objects, players, and their characteristics
	public Obj(Location l){
		loc=l;
	}
	public Location getLoc(){
		return loc;
	}
	//try to keep light-weight

}
