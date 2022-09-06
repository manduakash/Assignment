package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_management_system {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//loading driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash" ,"root" ,"root");	//getting connection 
			Statement stm = conn.createStatement();	//creating statement
			
			
			stm.executeUpdate("create table student(roll_no int, name varchar(20), class int, address varchar(20));");	//executeing inserting query
			stm.executeUpdate("insert into student values(1, 'sayan', 4, 'Kolkata')");	//executeing inserting query
			stm.executeUpdate("insert into student values(2, 'sankha', 4, 'Kolkata')");	//executeing inserting query
			stm.executeUpdate("insert into student values(3, 'akash', 4, 'Kolkata')");	//executeing inserting query
			
			System.out.println("inserted succesfully");
			
			ResultSet rs = stm.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println("roll_no='"+rs.getInt(1)+"' "+"name='"+rs.getString(2)+"' "+"class='"+rs.getInt(3)+"' "+"address='"+rs.getString(4)+"' ");
			}
			conn.close();	// closing connection
		} catch (Exception e) {	//exception handeling
			System.out.println(e);
		}
	}
}
