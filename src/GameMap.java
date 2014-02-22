import java.util.ArrayList;




public class GameMap {

	//map of game area for Tank class to draw from, contains all obstcles, players, shots, etc.
	//probably draw/read from png/bitmap file, using normal arrays hopefully won't be too intensive
	
	private ArrayList<Player> playerList;
	
	private ArrayList<Obj> objectList;
	private ArrayList<Obj> nearbyObjects;
	
	public GameMap(){
		//TO-BE IMPLEMENTED
		playerList=new ArrayList<Player>(); //use SQL table, have true/false for online, retrieve online only
		objectList=new ArrayList<Obj>(); //use an SQL join on static objects and online players (maybe offline as well)
		nearbyObjects=new ArrayList<Obj>(); //THIS IS FINE
	}
	
	//FUNCTION BELOW RETURNS EVERYTHING, PLAYERS, ROCKS, THE WHOLE SHA-BANG
	public ArrayList<Obj> getNearbyObjs(Location playerLoc){ //this method is returning the Objects that are within 1500 pixels of current player's location
															//for the sake of drawing off screen (should be looked at for efficiency).
		for(Obj p:objectList){
			if(areClose(p.getLoc(), playerLoc)&&!nearbyObjects.contains(p))
				nearbyObjects.add(p); //if close and not in array, add
			else if(!areClose(p.getLoc(), playerLoc)&&nearbyObjects.contains(p))
				nearbyObjects.remove(p); //if not close and in array, remove			
		}
		
		return nearbyObjects;
		
	}
	
	public boolean areClose(Location loc1, Location loc2){ //returns true if magnitude of distance is less than 1500
		int xDist=Math.abs(loc1.locX-loc2.locX);
		int yDist=Math.abs(loc1.locY-loc2.locY);
		int expression=(int)(Math.sqrt(Math.pow(xDist, 2)+Math.pow(yDist, 2)));
		if (expression<1500)
			return true;
		else
			return false;
	}
	
	
	
	
}
