/*
 * @author Akash Singh 
*/

public class Question_no2 {
	private Question_no2(){	//making private constructor
		System.out.println("nobuddy can now create obj of this class outside of this class range....");
	}
}



class Main{ //another class
	public static void main(String[] args) { //main method
		Question_no2 obj = new Question_no2();	//no buddy can able to create object of this class now
	}
}
