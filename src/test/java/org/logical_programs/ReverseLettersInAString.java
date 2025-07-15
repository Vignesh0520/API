package org.logical_programs;
// This class reverses the letters of each word in a given string
public class ReverseLettersInAString {
	
	public static void main(String[] args) {
		
		String s = "Shanmugha Arts, Science, Technology & Research Academy";
		String reversedString = "";
		
		// Split the input string into words using space as delimiter
		String[] subStrings = s.split(" ");
		
		// Iterate through each word
		for(int i=0; i<subStrings.length; i++) {
			String str = subStrings[i];

			// Reverse the current word and append to reversedString
			for(int j=str.length()-1; j>=0; j--) {
				reversedString = reversedString + str.charAt(j);
			}
			
			// Add a space after each reversed word
			reversedString = reversedString + " ";			
		}		
		// Remove any leading/trailing spaces
		String trim = reversedString.trim();
		reversedString = trim;

		// Print the original and reversed strings
		System.out.println("Actual String : "+s);
		System.out.println("Reversed String : "+reversedString);
	}

}
