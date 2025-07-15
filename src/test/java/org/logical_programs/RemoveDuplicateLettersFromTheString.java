package org.logical_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateLettersFromTheString {

	public static void main(String[] args) {

		String actualString = "Capgemini Engineering";

		String str = actualString.toLowerCase();

		char[] charArray = str.toCharArray();

		System.out.println("Actual String : \n" + Arrays.toString(charArray));

		// Use LinkedHashSet to maintain insertion order and remove duplicates
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		// Add each character to the set (duplicates will be ignored)
		for (char character : charArray) {
			set.add(character);
		}

		System.out.println("String after removing the duplicate letters : \n" + set);

	}

}
