package org.logical_programs;

import java.util.Arrays;

public class SecondLargestElementInAnArray {
	
	public static void main(String[] args) {
		// Initialize the array
		int array[] = { 70, 94, 77, 28, 88 };

		// Sort the array in ascending order using bubble sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// Print the sorted array, largest element and second largest element
		System.out.println("Sorted array = " + Arrays.toString(array));
		System.out.println("First Largest Element = " + array[array.length - 1]);
		System.out.println("Second Largest Element = " + array[array.length - 2]);
	}
}
