package org.logical_programs;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		String s = "Viges#hRa@ja@05%20";
		String result1 = "";

		// Approach 1: Using Regular Expression to remove all characters except letters and digits
		// [^A-Za-z0-9] matches any character that is NOT a letter or digit
		
		String result2 = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("Approach 1 - Result : " + result2);

		// Approach 2: Using loop and Character class methods
		
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (Character.isLetter(charAt)) {
				result1 = result1 + charAt;
			} else if (Character.isDigit(charAt)) {
				result1 = result1 + charAt;
			}
		}
		System.out.println("Approach 2 - Result : " + result1);
	}
}
