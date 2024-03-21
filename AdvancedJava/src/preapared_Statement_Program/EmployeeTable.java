/*Program-1:Write a JDBC program to register(insert) the user details into database.
----------
Table->UserDetails
-------
Hints:Take some property of user using Scanner class-
-----    
properties=> userName,Password,uFName,uLName,mailId,phNumber.

case1- If user data inserted successfully then print one message "User registration Successfull" else
------- 
"Invalid Process". */
package preapared_Statement_Program;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class EmployeeTable 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","manager");  
			PreparedStatement ps= ((java.sql.Connection) con).prepareStatement("insert into userDetails values(?,?,?,?,?,?)"); //Dynamic Query
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter userName:");
            String userName = sc.nextLine();
            System.out.println("Enter Password:");
            String password = sc.nextLine();
            System.out.println("Enter First Name:");
            String fName = sc.nextLine();
            System.out.println("Enter Last Name:");
            String lName = sc.nextLine();
            System.out.println("Enter Email ID:");
            String email = sc.nextLine();
            System.out.println("Enter Phone Number:");
            String phone = sc.nextLine();
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, fName);
            ps.setString(4, lName);
            ps.setString(5, email);
            ps.setString(6, phone);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("User registration successful.");
            } else {
                System.out.println("Invalid Process.");
            }
            sc.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
