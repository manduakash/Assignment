//@Author Akash Singh
// Java program for checking eligible for voting or not

import javax.swing.*; //using for GUI dialog boxes

public class EligibleVote {
	
	//main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();//creating Jframe for GUI dialog
		
		//taking input
		String age = JOptionPane.showInputDialog(jFrame, "Tyep your age here in the box");
		
		int age_Int = Integer.parseInt(age);//type casting

		//logic
		if(age_Int >= 18) {
			JOptionPane.showMessageDialog(jFrame,"You are eligible for voting!");
		}else {
			JOptionPane.showMessageDialog(jFrame,"You are not eligible for voting!");
		}
	}

}
