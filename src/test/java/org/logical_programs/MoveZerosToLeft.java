package org.logical_programs;

import java.util.Arrays;

public class MoveZerosToLeft {
	public static void main(String[] args) {

		int[] a = { 7, 0, 9, 4, 0, 0, 7, 0, 7, 2, 8, 8, 0, 8 };

		// Expected output b = {0, 0, 0, 0, 0, 7, 9, 4, 7, 7, 2, 8, 8, 8};

		int b[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[count++] = a[i];
			}
		}
		System.out.println("Result = "+Arrays.toString(b));
	}
}
