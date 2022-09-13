package JDBC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUploader {
	int department_id, employee_id, employee_salary;
	long employee_contactNo, DBemployee_contactNo;
	String department_name, department_head, department_description, employee_name, employee_address;
	//for storing db datas
	int DBemployee_id, DBdepartment_id, DBemployee_salary;
	String DBemployee_name;
	double PF;
	
	//method for storing department details
	public void storeDepartmentDetails(int department_id, String department_name, String department_head, String department_description) throws SQLException, Exception{
		Connection conn = Helper.con();
		Statement st = conn.createStatement();
		
		st.executeUpdate("insert into department_table values("+department_id+", '"+department_name+"', '"+department_head+"', '"+department_description+"')");
		System.out.println("Department details has been added successfully.... ");
		
	}
	//method for storing employee details
		public void storeEmployeeDetails(int employee_id, String employee_name, double employee_salary, long employee_contactNo, String employee_address, int department_id) throws SQLException,Exception{
			Connection conn = Helper.con();
			Statement st = conn.createStatement();
			
			//validations
			ResultSet rs = st.executeQuery("select employee_id, employee_name, employee_contactNo, employee_salary, department_id from employee_table,department_table where employee_id="+employee_id);
			while(rs.next()) {
				DBemployee_id=rs.getInt(1);
				DBemployee_name=rs.getString(2);
				DBemployee_contactNo=rs.getLong(3);
				DBemployee_salary=rs.getInt(4);
				DBdepartment_id=rs.getInt(5);
			}
			
			if((DBemployee_id==employee_id) || (DBemployee_name==employee_name) || (DBemployee_contactNo==employee_contactNo)){
				throw new duplicateDataException("Employee already exists");
			}
			if(employee_salary<1000) {
				throw new lessSalaryAmountException("Salary can not be less than 1000/-");
			}
			else {
			st.executeUpdate("insert into employee_table values("+employee_id+", '"+employee_name+"', "+employee_salary+", "+employee_contactNo+", '"+employee_address+"', "+department_id+")");
			System.out.println("Employee details has been added successfully.... ");
			}
		}
		
		//fetching datas
		public void retrieveEmployeeDetails(int DBemployee_id) throws SQLException{
			Connection conn = Helper.con();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select employee_id, employee_name, employee_contactNo, employee_address, department_name, department_head from employee_table,department_table where employee_id="+DBemployee_id);
			while(rs.next()) {
				employee_id=rs.getInt(1);
				employee_name=rs.getString(2);
				employee_contactNo=rs.getLong(3);
				employee_address=rs.getString(4);
				department_name=rs.getString(5);
				department_head=rs.getString(6);
			}
			if(employee_id==0) {
				System.out.println("Employee ID not present...");
			}else {				
				System.out.println("\nemployee_id= '"+employee_id+"', \nemployee_name= '"+employee_name+"', \nemployee_contactNo= '"+employee_contactNo+" ', \nemployee_address= '"+employee_address+"', \ndepartment_name= '" +department_name+ "', \ndepartment_head= '"+department_head+"'\n");
			}
		}
		//fetching datas
		public void calculatePF(int employee_id) throws SQLException{
			Connection conn = Helper.con();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select employee_id,  employee_salary from employee_table where employee_id="+employee_id);
			while(rs.next()) {
				DBemployee_id=rs.getInt(1);
				employee_salary=rs.getInt(2);	
			}
			if(DBemployee_id==0) {
				System.out.println("Employee ID not present...");
			}else {				
				if((employee_salary>=1000)&&(employee_salary<=10000)) {
					PF=employee_salary*0.05;
				}
				if((employee_salary>=10000)&&(employee_salary<=100000)) {
					PF=employee_salary*0.06;
				}
				if(employee_salary>100000) {
					PF=employee_salary*0.07;
				}
				System.out.println("Employee PF amount is: "+PF);
			}
		}
}

//exception classes 
class duplicateDataException extends Exception{
	private static final long serialVersionUID = 1L;
	duplicateDataException(String s){
		super(s);
	}
}

class lessSalaryAmountException extends Exception{
	private static final long serialVersionUID = 1L;
	lessSalaryAmountException(String s){
		super(s);
	}
}

class departmentNotPresentException extends Exception{
	private static final long serialVersionUID = 1L;
	departmentNotPresentException(String s){
		super(s);
	}
}
