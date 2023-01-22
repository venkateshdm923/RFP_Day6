//program to find sum and average of array elements
package com.bridgelabz.fourthpackage;

public class AvgOfArrayNum {
	public static void main(String args[]) {

		int arr[] = { 10, 20, 30 };// declaring array
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Sum of the array elements is " + sum);
		System.out.print("Averege of the array elements is " + avg);

	}
}
