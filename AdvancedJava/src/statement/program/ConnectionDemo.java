package statement.program;
import java.sql.*;
public class ConnectionDemo // Type 4 Driver
{
	public static void main(String[] args) throws  SQLException
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  //Oracle Driver loaded
		Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","manager");   //Connection to Database 
		System.out.println("Connection Establish Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
