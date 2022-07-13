//@author Akash Singh
//Hands-on excercise: Interface activity

package assignment;

 interface LibraryUser{ 	// interface class
	
	// declaring methods 
	void registerAccount();
	void requestBook();
}

//-------------------------------------------------------------------------------------------

class KidUser implements LibraryUser{	// creating a class implementing Library interface
	int age;
	String bookType;
	
	public void registerAccount(){		// defining the method
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account...");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid...");
		}
	}
	
	public void requestBook(){		// defining the method
		if(bookType == "Kids"){
			System.out.println("Book Issued successfully, please return the book within 10 days...\n \n");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books...\n \n");
		}
	}
}

//-------------------------------------------------------------------------------------------

class AdultUser implements LibraryUser{		// creating a class implementing Library interface
	int age;
	String bookType;
	
	public void registerAccount(){		// defining the method
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account...");
		}else {
			System.out.println("Sorry, Age must be greater than 12 to register as a Adult...");
		}
	}
	
	public void requestBook(){		// defining the method
		if(bookType=="Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days...\n \n");
		}else {
			System.out.println("Oops, you are allowed to take only adults Fiction books...\n \n");
		}
	}
}

//---------------------------------------------------------------------------------------------

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		//TEST CASE#1
		
		//creating KidUser objects
		KidUser kid1 = new KidUser();
		KidUser kid2 = new KidUser();
		
		// assigning the values and invoking the methods
		System.out.println("For the kid 1:-");
		kid1.age=10;
		kid1.registerAccount(); 
		kid1.bookType="Kids";
		kid1.requestBook();
		
		// assigning another values and invoking the methods
		System.out.println("For the kid 2:-");
		kid2.age=18;
		kid2.registerAccount();
		kid2.bookType="Fiction";
		kid2.requestBook();

//----------------------------------------------------------------------------------------------		
		//TEST CASE#2
		
		//creating AdultUser objects
		AdultUser adult1 = new AdultUser();
		AdultUser adult2 = new AdultUser();
		
		// assigning the values and invoking the methods
		System.out.println("For the adult 1:-");
		adult1.age=5;
		adult1.registerAccount();
		adult1.bookType="Kids";
		adult1.requestBook();
		
		// assigning another values and invoking the methods
		System.out.println("For the adult 2:-");
		adult2.age=23;
		adult2.registerAccount();
		adult2.bookType="Fiction";
		adult2.requestBook();
	}
}
