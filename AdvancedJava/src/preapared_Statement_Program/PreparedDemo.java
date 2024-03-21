package preapared_Statement_Program;
import java.sql.*;
import java.util.Scanner; 
public class PreparedDemo
{
	public static void main(String[] args) throws Exception 
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","manager");  
		PreparedStatement ps= con.prepareStatement("insert into Student values(?,?,?)");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Name:");
		String Name = sc.next();
		System.out.print("Enter the Roll No:");
		int roll = sc.nextInt();
		System.out.print("Enter the Marks:");
		int marks = sc.nextInt();
		ps.setString(1, Name);
		ps.setInt(2,roll);
		ps.setInt(3,marks);
		ps.executeUpdate();
		System.out.println("DATA INSERTED SECCUSSFULLY");
		sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
