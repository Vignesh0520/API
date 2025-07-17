package org.logical_programs;

public class NumberReverse {

	public static void main(String[] args) {

		int number = 94427;
		int reminder = 0;
		int reversedNumber = 0;
		System.out.println("Given number is " + number);

		while (number > 0) {
			reminder = number % 10;
			reversedNumber = (reversedNumber * 10) + reminder;
			number = number / 10;
		}

		System.out.println("Reversed number is " + reversedNumber);

	}

}
