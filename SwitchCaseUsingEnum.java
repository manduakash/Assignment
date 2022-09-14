
/**
 * @author Akash Singh
**/

// Q.6 - Write a java class to accept five string name.

public class SwitchCaseUsingEnum {   // class
	enum names{
		arnab, sayan, sankha, akash, owashim
	}
	public static void main(String[] args) {   // main method
		
		names n= names.sayan;       // read the user input
		
		switch(n) {    // switch case
		case arnab : System.out.println("Switch Case is easy for Arnab.");
		break;
		
		case akash : System.out.println("Switch Case is easy for Akash.");
		break;
		
		case sankha : System.out.println("Switch Case is easy for sankha.");
		break;
		
		case sayan : System.out.println("Switch Case is easy for Sayan.");
		break;
		
		case owashim : System.out.println("Switch Case is easy for owashim.");
		break;
		
		default: System.out.println("There is no one.");
		
		}

	}

}
