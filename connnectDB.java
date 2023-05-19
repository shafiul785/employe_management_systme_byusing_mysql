package employee_mgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class connnectDB
{	static Connection con;
	public static Connection createDBconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","12345");
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
		

}
