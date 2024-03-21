package statement.program;
import java.sql.*;
public class Connection
{
	public static void main(String[] args) throws  SQLException
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  //Oracle Driver loaded
		java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");   //Connection to Database 
		System.out.println("Connection Establish Successfully");
		Statement stmt = con.createStatement();
	//	stmt.execute("CREATE TABLE Student(Name varchar2(10), RollNo number(2), Marks Number(3))");
		stmt.executeUpdate("insert into Student Values('Atul', 39, 85)");
		stmt.executeUpdate("insert into Student Values('Vivek', 49, 95)");
		stmt.executeUpdate("insert into Student Values('Mayur', 50, 100)");
		stmt.executeUpdate("insert into Student Values('Dipak', 65, 100)");
		System.out.println(" Record inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
