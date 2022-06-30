//@Author Akash Singh
//Java Program to check eligible for donate blood or not

import javax.swing.*; //for GUI dialog boxes

public class EligibleDonateBlood {
	
	//main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame(); //using JFrame for dialog boxes

		//taking input
		String age = JOptionPane.showInputDialog(jFrame,"Type your age here!");
		String weight = JOptionPane.showInputDialog(jFrame,"Type your weight here!");
		
		//type casting
		int age_Int = Integer.parseInt(age);
		int weight_Int = Integer.parseInt(weight);
		
		//Logic part
		if((age_Int >= 25) && (weight_Int >= 48)) {
			JOptionPane.showMessageDialog(jFrame, "You are eligible for donating blood!");
		}else {
			JOptionPane.showMessageDialog(jFrame, "Your are not eligible for donating blood!");
		}
	}

}
