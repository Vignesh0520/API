package org.logical_programs;

public class StringManipulation {

	public static void main(String[] args) {

		String string1 = "Vignesh";
		String string2 = "Raja"; // Expected output : VRiagjnaesh
		int maxLength = 0;
		String result = "";

		if (string1.length() > string2.length()) {
			maxLength = string1.length();
		} else {
			maxLength = string2.length();
		}

		for (int i = 0; i < maxLength; i++) {

			if (i < string1.length()) {
				result = result + string1.charAt(i);
			}

			if (i < string2.length()) {
				result = result + string2.charAt(i);
			}
		}
		System.out.println("Result = " + result);
	}
}
