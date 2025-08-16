package MySQLDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 1) Create a connection
// 2) Create statement/Query
// 3) Execute statement/Query 
// 4) Store the results in the result set - for select command
// 5) close connection


public class MySQLSelectCommands {

	public static void main(String[] args) throws SQLException {
		
		// 1) Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
		// 2) Create statement/Query
		
		Statement stmt = con.createStatement();
	
		 String s = "SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME FROM EMPLOYEES";
		
		// 3,4) Execute statement/Query and Store the results in the result set
		
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next()) {
			
			int emp_id = rs.getInt("EMPLOYEE_ID");
			String first_name = rs.getString("FIRST_NAME");
			String last_name = rs.getString("LAST_NAME");
			
			System.out.println(emp_id+"  "+first_name+"   "+last_name);
		}
		
		
		
		// 4) close connection
		
		con.close();
		
		System.out.println("Query Execusted!!!!!!!!!!!!!!!!!1");

	}

}
