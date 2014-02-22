import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLCenter{
	public static void main (String[] args){
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
