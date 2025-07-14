package org.logical_programs;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String name = "Raja Muthuvijayan";
		String reversedString = "";
		int length = name.length();
		for(int i = length-1; i>=0; i--) {
			reversedString = reversedString + name.charAt(i);
		}
		System.out.println("Actual String : "+name);
		System.out.println("Reversed String : "+reversedString);
	}

}
