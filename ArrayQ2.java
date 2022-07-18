//@author AKASH SINGH
// java program for traversing even numbers of an array

import java.util.Scanner;

public class ArrayQ2 {		// class

	public static void main(String[] args) {	// main method 
		
		// instantiating the array and scanner objects
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		// taking user input
		System.out.println("Enter array values...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		// printing even numbers of this array
		
		// logic 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {					// main logic line
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		scan.close();	// for closing input stream
	}

}
