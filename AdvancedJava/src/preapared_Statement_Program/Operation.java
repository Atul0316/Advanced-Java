package preapared_Statement_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Operation 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			PreparedStatement ps = con.prepareStatement("Select * from Student where RollNO=?");
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the Roll No:");
			int rno=s.nextInt();
			ps.setInt(1, rno);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{	
			     System.out.print(rs.getString(1)+'\t');
			     System.out.print(rs.getInt(2)+"\t");
			    System.out.println(rs.getInt(3));
			    s.close();
			}
			else
				System.err.println("IT'S INVALID ROLL NUMBER.... PLEASE ENTER VALID ROLL NUMBER");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
