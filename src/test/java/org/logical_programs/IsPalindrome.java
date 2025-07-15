package org.logical_programs;

// This class checks if a given string is a palindrome (case-insensitive)
public class IsPalindrome {
	public static void main(String[] args) {
		String actualString = "Radar";
		String reversedString = "";

		// Convert input to lowercase for case-insensitive comparison
		String s = actualString.toLowerCase();

		// Reverse the string
		for (int i = s.length() - 1; i >= 0; i--) {
			reversedString = reversedString + s.charAt(i);
		}

		if (s.equals(reversedString)) {
			System.out.println(actualString + " is a palindrome.");
		} else {
			System.out.println(actualString + " is not a palindrome.");
		}
	}
}
