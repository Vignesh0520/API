package org.logical_programs;

import java.util.Arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {

		int[] a = { 7, 0, 9, 4, 0, 0, 7, 0, 7, 2, 8, 8, 0, 8 };

		// Expected output b = {7, 9, 4, 7, 7, 2, 8, 8, 8, 0, 0, 0, 0, 0};

		int b[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[index] = a[i];
				index++;
			}
		}
		System.out.println("Result = " + Arrays.toString(b));
	}
}
