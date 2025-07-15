package org.logical_programs;

// Class to reverse a given string
public class StringReverse {
	
	public static void main(String[] args) {
		
		// Original string to be reversed
		String name = "Raja Muthuvijayan";

		// Variable to store the reversed string
		String reversedString = "";

		// Get the length of the original string
		int length = name.length();

		// Loop through the string from end to start
		for(int i = length-1; i>=0; i--) {
			// Append each character in reverse order
			reversedString = reversedString + name.charAt(i);
		}
		
		// Print the original and reversed string
		System.out.println("Actual String : "+name);
		System.out.println("Reversed String : "+reversedString);
	}

}
