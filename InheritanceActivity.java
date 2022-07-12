//@author Akash Singh
//Hands-on Exercise 

package assignment;

// creating an employee class
class Employee {
	//Problem 1
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	// creating overloded construction
	public Employee(long id, String name, String address, long phone){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	// method for calculating salary
	void calculateSalary() {
		double salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
		System.out.println("Salary of "+employeeName+" is "+salary);
	}
	// Adding default transport allowance method  
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println(employeeName + "'s transport allowance is " + transportAllowance);
	}
}

// deriving manager class from employee class
class Manager extends Employee { // child class of employee class
	
	//using super class to overloading the parent constructor
	public Manager(long id, String name, String address, long phone){ // constructor of derived class
		
		//overloading super constructor
		super(id, name, address, phone);
		super.employeeId = id;
		super.employeeName = name;
		super.employeeAddress = address;
		super.employeePhone = phone;
	}
	
	// Adding default transport allowance method  
	@Override
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println(employeeName + "'s transport allowance is " + transportAllowance);
	}
}

//deriving trainee class from employee class
class Trainee extends Employee { // child class of employee class
	
	//using super class to overloading the parent constructor
	public Trainee(long id, String name, String address, long phone){ // constructor of derived class
		
		//overloading default super constructor
		super(id, name, address, phone);
		super.employeeId = id;
		super.employeeName = name;
		super.employeeAddress = address;
		super.employeePhone = phone;
	}
}



public class InheritanceActivity {

	public static void main(String[] args) { // main method
		
		// Test case #1 
		Manager peter = new Manager(126534, "Peter", "Chennai India", 237844);
		peter.basicSalary=65000;
		peter.calculateSalary();
		
		// Test case #1 
		Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085);
		jack.basicSalary=45000;
		jack.calculateSalary();
		
		//calling the transport allowance methods
		peter.calculateTransportAllowance();
		jack.calculateTransportAllowance();
	}

}
