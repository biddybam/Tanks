import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

//lets use a php script for simplicity.
//httpurlconnection
public class SQLCenter{
	private HttpURLConnection connectionMain;
	private URL connectionAll;
	
	public SQLCenter(String usr) throws Exception{
		String urlParameters="usr="+usr;
		String request="http://172.26.28.11/JohnM/requestPage.php";
		connectionAll=new URL("http://172.26.28.11/JohnM/requestPage.php");
		URL url=new URL(request);
		connectionMain =(HttpURLConnection) url.openConnection();
		connectionMain.setDoOutput(true);
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
		wr.close();
		
		
	}
	public Player getMainPlayer() throws IOException{
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
		        		
		        		}
		            
		        }
		        in.close();
		        return null;
	}
	public ArrayList<Player> getAllPlayers() throws IOException{
		ArrayList<Player> list=new ArrayList<Player>();
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connectionMain.getInputStream()));
	 			// just delimit needed info by spaces
		        String inputLine;
		        while ((inputLine = in.readLine()) != null){
		        	Scanner read=new Scanner(inputLine);
		        	for(int i=0;i<8;i++){//should repeat ever 8, change if more vars
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
		        		System.out.println(read.next());
		        		}
		            
		        }
		        in.close();
		        return list;
		
		
	}
	
}
