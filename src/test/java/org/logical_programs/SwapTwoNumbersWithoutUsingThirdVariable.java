package org.logical_programs;

// swap two numbers without using a third variable
public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		int num1 = 70;
		int num2 = 94;
		
		System.out.println("Before Swapping : "+"num1 = "+num1+" num2 = "+num2);
		
		num1 = num1 + num2; // num1 = 70 + 94 = 164
		num2 = num1 - num2;	// num2 = 164 - 94 = 70
		num1 = num1 - num2;	// num1 = 164 - 70 = 94
		
		System.out.println("After Swapping : "+"num1 = "+num1+" num2 = "+num2);
		
	}
}
