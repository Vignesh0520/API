package org.logical_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachLetterOccurrence {
	public static void main(String[] args) {
		String s = "Capgemini Engineering";
		s = s.toLowerCase();
		System.out.println("Given String : " + s);

		// LinkedHashMap to maintain insertion order of characters
		Map<Character, Integer> eachLettersCount = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt != ' ') { // Ignore spaces
				// If character already exists in map, increment its count
				if (eachLettersCount.containsKey(charAt)) {
					Integer count = eachLettersCount.get(charAt);
					count++;
					eachLettersCount.put(charAt, count);
				} else {
					// If character does not exist, add it with count 1
					eachLettersCount.put(charAt, 1);
				}
			}
		}
		System.out.println("Count of each letter occurrence in String : " + eachLettersCount);
	}
}
