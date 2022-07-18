//@author AKASH SINGH
// java program for traversing sum of odd numbers

import java.util.Scanner;

public class ArrayQ3 {

	public static void main(String[] args) {	// main method
		
		// instantiating the array and scanner class
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		// taking user input
		System.out.println("Enter array values...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		// finding sum of odd numbers of this array 
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				sum += arr[i];
			}
		}
		
		System.out.print("sum = "+ sum);		// s.o.p of odd sum
		
		
		scan.close();	// for closing input stream
	}

}
