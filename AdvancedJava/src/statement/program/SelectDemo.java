package statement.program;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectDemo 
{
	public static void main(String[] args) throws  SQLException
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  //Oracle Driver loaded
		java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","manager");   //Connection to Database 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from userDetails");
		ResultSetMetaData rm = rs.getMetaData();
		int n = rm .getColumnCount();
		for(int i=1; i<=n; i++)
		{  
			System.out.print(rm.getColumnName(i)+"\t");
		}
		System.out.println();
		       while(rs.next())
		       {
//	            	{
//			                  System.out.print(rs.getString("Name")+"\t");    1st Way to writing code
//			                  System.out.print(rs.getInt("RollNO")+"\t");
//			                  System.out.println(rs.getInt("MARKS"));
//		              }
			                  for(int i =1 ; i<=n; i++)
			                  {
			                	  System.out.print(rs.getString(i)+"\t");   // Second way to Retriving Data 
			                  }
			                  System.out.println();
			                  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


