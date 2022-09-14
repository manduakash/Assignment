/*
 * @author Akash Singh 
*/
//create a public class that no one can create its instance from another class

public class NoOneCanCreate_Obj {
	private NoOneCanCreate_Obj(){	//making private constructor
		System.out.println("nobuddy can now create obj of this class outside of this class range....");
	}
}



class Main{ //another class
	public static void main(String[] args) { //main method
		NoOneCanCreate_Obj obj = new NoOneCanCreate_Obj();	//no buddy can able to create object of this class now
	}
}
