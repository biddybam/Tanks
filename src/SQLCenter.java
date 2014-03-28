import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

//lets use a php script for simplicity.
//httpurlconnection
public class SQLCenter{
	private URLConnection connectionMain;
	private String user;
	private final String web="http://172.26.28.11/JohnM/tonk/requestPage.php?";
	
	public SQLCenter(String usr) throws Exception{
		user=usr;
		//connectionAll=new URL("http://172.26.28.11/JohnM/tonk/requestPage.php");
		
		connectionMain=null;
		
		
		
		/*connectionMain.setDoOutput(true);
		connectionMain.setDoInput(true);
		connectionMain.setInstanceFollowRedirects(false); 
		connectionMain.setRequestMethod("POST"); 
		connectionMain.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
		connectionMain.setRequestProperty("charset", "utf-8");
		connectionMain.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
		connectionMain.setUseCaches (false);	
		
		DataOutputStream wr = new DataOutputStream(connectionMain.getOutputStream ());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();*/
		
		
	}
	public void updatePlayer(Player mp)throws IOException{
		URL url = new URL(web+"usr='"+mp.getPlayerName()+"'");
		connectionMain=url.openConnection();
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connectionMain.getInputStream()));
	 			// just delimit needed info by spaces
		        String inputLine;
		        while ((inputLine = in.readLine()) != null){
		        	Scanner read=new Scanner(inputLine);
		        	while(read.hasNext()){
		        		//name health x y speed tankO turretO online
		        		String name=read.next();
		        		double health=read.nextDouble();
		        		int x=read.nextInt();
		        		int y=read.nextInt();
		        		double speed=read.nextDouble();
		        		double tankO=read.nextDouble();
		        		double turretO=read.nextDouble();
		        		boolean online=read.nextBoolean();
		        		//complete, put into player class;
		        		Location l=new Location(x,y);
		        		mp.updatePlayer(name, l, tankO, turretO, health, speed, online);
		        		}
		            
		        }
		        in.close();
		        
	}
	public Player getMainPlayer() throws IOException{
		URL url = new URL(web+"usr='"+user+"'");
		connectionMain=url.openConnection();
		Player mp = null;
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connectionMain.getInputStream()));
	 			// just delimit needed info by spaces
		        String inputLine;
		        while ((inputLine = in.readLine()) != null){
		        	Scanner read=new Scanner(inputLine);
		        	while(read.hasNext()){
		        		//name health x y speed tankO turretO online
		        		String name=read.next();
		        		double health=read.nextDouble();
		        		int x=read.nextInt();
		        		int y=read.nextInt();
		        		double speed=read.nextDouble();
		        		double tankO=read.nextDouble();
		        		double turretO=read.nextDouble();
		        		boolean online=read.nextBoolean();
		        		//complete, put into player class;
		        		Location l=new Location(x,y);
		        		mp=new Player(name, l, tankO, turretO, health, speed, online);
		        		}
		            
		        }
		        in.close();
		        return mp;
	}
	public ArrayList<Player> getAllPlayers() throws IOException{
		URL url = new URL(web+"usr=usr");
		connectionMain=url.openConnection();
		ArrayList<Player> list=new ArrayList<Player>();
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connectionMain.getInputStream()));
	 			// just delimit needed info by spaces
		        String inputLine;
		        while ((inputLine = in.readLine()) != null){
		        	Scanner read=new Scanner(inputLine);
		        	while(read.hasNext()){//should repeat ever 8, change if more vars
		        		//name health x y speed tankO turretO online
		        		String name=read.next();
		        		double health=read.nextDouble();
		        		int x=read.nextInt();
		        		int y=read.nextInt();
		        		double speed=read.nextDouble();
		        		double tankO=read.nextDouble();
		        		double turretO=read.nextDouble();
		        		boolean online=read.nextBoolean();
		        		//complete, put into player class;
		        		//System.out.println(read.next());
		        		Location l=new Location(x,y);
		        		Player p=new Player(name, l, tankO, turretO, health, speed, online);
		        		list.add(p);
		        		}
		            
		        }
		        in.close();
		        return list;
		
		
	}
	
}
