package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class student_driven_menu {     // main method
	
	public static void main(String[] args){    // main method
		
		try {
		// create an object of CrudDemo class
		student_driven_menu s = new student_driven_menu();
	
		// to select what operation to be done from user
		while(true) {
			System.out.println("\n1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			// read the user input
			int choice = Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
			
			
			// switch case
			switch(choice) {
			
			// 1. Insert
			case 1: 
				s.insertData();
				break;
				
			// 2. Display
			case 2:
				s.displayData();
				break;
				
			// 3. Delete	
			case 3:
				s.deleteData();
				break;
				
			// 4. Update
			case 4:
				s.updateData();
				break;
				
			// 5. Exit	
			case 5:
				System.out.println("Have a nice day...");
				break;
				
			default:
				System.out.println("wrong input");
				break;
			}
			if(choice==5) {
				break;
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	
	//----------------------------------------------------------------------------------
	// a method to estabilish connection
	public Connection getConnect() {
		// try block
		try {
			// loading driver and getting connection
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash" ,"root" ,"root");
			
			return conn;
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	// method to insert the data
	public void insertData() {
		// taking user inputs
		int roll_no = Integer.parseInt(JOptionPane.showInputDialog("Enter roll no."));
		String name = JOptionPane.showInputDialog("Enter student's name...");
		int Class = Integer.parseInt(JOptionPane.showInputDialog("Enter student's standard..."));
		String address = JOptionPane.showInputDialog("Enter student's address...");
		
		try {
			// call getConnection() method
			Connection conn = getConnect();
			// declare the sql statement
			PreparedStatement pstm = conn.prepareStatement("insert into student values(?,?,?,?)");
			// setting all inputs into db
			pstm.setInt(1, roll_no);
			pstm.setString(2, name);
			pstm.setInt(3, Class);
			pstm.setString(4, address);
		
			// execute the statement
			pstm.execute();
			System.out.println("Inserted succesfully.");
			// close the objects
			pstm.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// method to display the data
	public void displayData() {
		// try block
		try {
			
			// called getConnection() method
			Connection conn = getConnect();
			// declare the sql statement
			Statement stm = conn.createStatement();
			// show the result of statement
			ResultSet rs = stm.executeQuery("select * from student");
			
			System.out.println("--------------------------");
			// traversing through table
			while(rs.next()) {
				
				System.out.println("roll_no='"+rs.getInt(1)+"' "+"name='"+rs.getString(2)+"' "+"class='"+rs.getInt(3)+"' "+"address='"+rs.getString(4)+"' ");
			}
			System.out.println("--------------------------");
			// close the objects
			rs.close();
			stm.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	// method to delete the data
	public void deleteData(){
		// try block
		try {
			// called the connection method
			Connection conn = getConnect();
			// declare the sql statement
			Statement stm = conn.createStatement();
			System.out.println("Enter Roll no to delete: ");
			int x = stm.executeUpdate("delete from student where roll_no = "+Integer.parseInt(JOptionPane.showInputDialog("Enter student's roll no which you wanna delete"))+"");
			
			// execute the statement
			// condition to check operation done or not
			if(x>=1) { 
				System.out.println("Selected data deleted!");
			}
			else {
				System.out.println("Data not found!");
			}
			// close objects
			stm.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	// method to update the data
	public void updateData() {
		// try block
		try {
			// called getConnection() nethod
			Connection conn = getConnect();
			PreparedStatement pstm = conn.prepareStatement("update student set name = ?, class = ?, address = ? where roll_no = ?");
			// taking user inputs
			int roll_no = Integer.parseInt(JOptionPane.showInputDialog("Enter roll no."));
			String name = JOptionPane.showInputDialog("Enter student's name...");
			int Class = Integer.parseInt(JOptionPane.showInputDialog("Enter student's standard..."));
			String address = JOptionPane.showInputDialog("Enter student's address...");
			// setting all inputs into db

			pstm.setInt(4, roll_no);
			pstm.setString(1, name);
			pstm.setInt(2, Class);
			pstm.setString(3, address);

			// execute the statement
			int x = pstm.executeUpdate();
			// close objects
			pstm.close();
			conn.close();
			// condition to check the operation done or not
			if(x>=1) {
				System.out.println("Update done.");
			}
			else {
				System.out.println("Data not found!");
			}

		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
