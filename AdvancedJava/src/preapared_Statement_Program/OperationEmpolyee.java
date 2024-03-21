/*Program2=> Write a JDBC program to perform Login Operation on user data.
--------
Hints:Suppose U inserted 5 user details into database.Now in login process if any user(which is already registered into database)
 will enter his username and password then it will check that this username and password user is available in database or not.
If available then u will print "login Successfull" else "invalid user". 
Note:U will perform this operation using PreparedStatement Interface. */
package preapared_Statement_Program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OperationEmpolyee
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM UserDetails WHERE userName = ? AND Password = ?");
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the UserName :");
			String u=s.nextLine();
			System.out.print("Enter the Passworf:");
			String p = s.nextLine();
			ps.setString(1, u);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid User.");
            } 
			s.close();
		}		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
