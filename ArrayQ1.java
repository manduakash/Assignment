//@author AKASH SINGH
// Java program for finding sum, max, min, avg of an array

import java.util.Scanner;

public class ArrayQ1 {
	//method for finding max value
	static void max(int arr[]) {
		// logic
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The max value = "+ max);
	}
	
		//method for finding min value
		static void min(int arr[]) {
			// logic
			int min = arr[0];
			for(int i=1; i<arr.length; i++) {
				if(min>arr[i]) {
					min=arr[i];					// here is the min logic 
				}
			}
			System.out.println("The min value = "+ min);
		}

		//method for finding sum value
		static void sum(int arr[]) {
			// logic
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];					// here I am doing the summation logic
			}
			System.out.println("The total sum value = "+ sum);
		}
		
		//method for finding sum value
		static void avg(int arr[]) {
			// logic
			int sum = 0;
			double avg = 0;
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			// here I am doing the average calculation
			avg = ((double) sum/arr.length);			// avg=sum/total no. of elements
			System.out.println("The total average value = "+ avg);
		}		
		
		
		
	public static void main(String[] args) {	// main method
		
		// instantiating the array and scanner objects
		int[] arr = new int[10];	// array
		Scanner scan = new Scanner(System.in);	// for input
		
		// taking array elements by user input
		System.out.println("Enter array values...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		// here I am calling the static methods
		// S.O.P of all methods
		sum(arr);
		max(arr);
		min(arr);
		avg(arr);
		
		
		scan.close();	// for closing input stream
		
	}

}
