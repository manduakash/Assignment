//@author AKASH SINGH
// java program for reverse traversing the array

import java.util.Scanner;

public class ArrayQ4 {		// class

	public static void main(String[] args) {	// main method
		
		// instantiating the array and scanner class
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		// taking user input
		System.out.println("Enter array values...");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		// reverse traversing the array 
		System.out.print("Array in reverse: ");
		for (int i = arr.length-1; i >= 0  ; i--) {
			System.out.print(arr[i]+ " ");			// s.o.p reverse
		}
		
		
		
		
		scan.close();	// for closing input stream
	}

}
