package New_App_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Working_With_Database {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "demo_data";
		String DBdriver = "com.mysql.jdbc.Driver";
		String username = "root";
		String password = "Ansari@27";
		
		Connection conn;
		
		//Create Object
		Class.forName(DBdriver).newInstance();
		
		//Create database connection 
		conn = DriverManager.getConnection(url+dbname,username,password);
		
		//Insert Query
		PreparedStatement  ps = conn.prepareStatement("select * from employee_details");
		
		//execute Query
		ResultSet rs = ps.executeQuery();
		
//		while(rs.next()) {
//			System.out.println(rs.getString(2));
//		}
		
		while(rs.next()) {
			for (int i = 1; i <=4; i++) {
				System.out.print(rs.getString(i)+ " ");
				
			}
			System.out.println();
		}
		
	}

}
