//@author Akash Singh
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	static {
		try {
			//loading and registering the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection con() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "root");
	}
}
