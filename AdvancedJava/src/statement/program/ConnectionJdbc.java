package statement.program;
import java.sql.*;
public class ConnectionJdbc  //Type 2 Driver 
{
	public static void main(String[] args) throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:oci8:@xe","system", "manager");
			System.out.println("Connection Establish Successfully");
			//con.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
