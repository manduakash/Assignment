//@Author Akash Singh
//Java Program to create a employee object without using 'new' keyword

class Employee{
	
	//using static to access these without creating any objects 
	 static int id;
	 static String name;
	
	 static void displayEmployee() {
		 System.out.println("Employed id and name = " + id + " "+ name );
	 }
	
}

public class Question_no1 {
	
	//main method
	public static void main(String[] args) {
		
		//passing the employee details without instantiating any object
		
		//emp1
		Employee.id=101;
		Employee.name="Akash";
		Employee.displayEmployee();//output
	
		//emp2
		Employee.id=102;
		Employee.name="Sayan";
		Employee.displayEmployee();//output
		
		//emp3
		Employee.id=103;
		Employee.name="Sagnik";
		Employee.displayEmployee();//output
		
		//emp4
		Employee.id=104;
		Employee.name="Mrinal";
		Employee.displayEmployee();//output
		
		//emp5
		Employee.id=105;
		Employee.name="Ankit";
		Employee.displayEmployee();//output
		
	}

}
