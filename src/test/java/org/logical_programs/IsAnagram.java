package org.logical_programs;
import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are Not an Anagram");
			return;
		} else {
			// If lengths are equal, proceed to check for anagrams
			// Convert strings to character arrays and sort them
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			// Sort the character arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			// Compare the sorted character arrays
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println(str1 + " and " + str2 + " are Anagram");
			} else {
				System.out.println(str1 + " and " + str2 + " are Not an Anagram");
			}
		}
	}
}
