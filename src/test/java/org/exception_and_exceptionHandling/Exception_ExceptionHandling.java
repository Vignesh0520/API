package org.exception_and_exceptionHandling;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exception_ExceptionHandling {
	
	// ArithmeticException
	private void arithmetic_Exception(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("result = "+result);
		} catch(ArithmeticException ae) {
			System.out.println("\nArithmeticException : num1/num2 is infinite.");
			System.out.println("num2 should not be zero!.");
		}
	}
	
	// NullPointerException
	// Multiple Catch Block
	private void nullPointer_Exception() {
		try {
			Set s = new TreeSet();
			s.add(10);
			s.add(null);
			System.out.println(s);
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException.");
		} catch(NullPointerException npe) {
			System.out.println("NullPointerException : TreeSet won't allows null values.");
		} finally {
			System.out.println("Finally block of nullPointer_Exception().");
		}
	}
	
	// IndexOutOfBoundsException
	private void indexOutOfBounds_Exception() {
		try {
			List list = new ArrayList(); 
			list.add("Vignesh");
			list.add(6.4554f);
			list.add(false);
			System.out.println("list.get(3) = "+list.get(3));
		} catch(IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBoundsException : Trying to access invalid index.");
		}
	}
	
	// ArrayIndexOutOfBoundsException
	private void arrayIndexOutOfBounds_Exception() {
		try {
			int array[] = {1,2,3,4,5};
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException : Trying to access invalid index of Array.");
		}
	}
	
	// StringIndexOutOfBoundsException
	private void stringIndexOutOfBounds_Exception(int index) {
		try {
			String name = "Vignesh";
			System.out.println("Character present at index "+index+" is "+name.charAt(index));
		}catch(StringIndexOutOfBoundsException sie) {
			System.out.println("StringIndexOutOfBoundsException : Trying to access invalid index of String.");
		}
	}
	
	// NumberFormatException
	private void numberFormat_Exception(String s) {
		try {
			int number = Integer.parseInt(s);
			System.out.println("number = "+number);
		} catch(NumberFormatException nfe) {
			System.out.println("NumberFormatException : "+s+" has character.");
			System.out.println("Integer.parseInt(s); -> need string, which has only numbers.");
		}
	}
	
	// ClassCastException
	private void classCast_Exception() {
		try {
			Set s = new TreeSet();
			s.add("Vignesh");
			s.add(1);
		} catch(ClassCastException cce){
			System.out.println("ClassCastException : TreeSet can store only Similar Datatype values.");
		}
	}
	
	//InputMismatchException
	private void inputMismatch_Exception() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter age : ");
			int age = s.nextInt();
			System.out.println("age = "+age);
			s.close();
		}catch(InputMismatchException ime) {
			System.out.println("InputMismatchException : enter the valid input, input must be Byte value.");
		}
	}
	
	// UserDefinedException
	private void getPhoneNo(long PhoneNo) {
		try {
			String phoneNumber = String.valueOf(PhoneNo);
			int length = phoneNumber.length();
			if(length != 10) {
				throw new UserDefinedException("Enter the valid PhoneNumber!.");
			}
		} catch (UserDefinedException ude) {
			System.out.println("UserDefinedException : "+ude.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Exception_ExceptionHandling e = new Exception_ExceptionHandling();
		e.arithmetic_Exception(1, 0);
		e.nullPointer_Exception();
		e.indexOutOfBounds_Exception();
		e.arrayIndexOutOfBounds_Exception();
		e.stringIndexOutOfBounds_Exception(7);
		e.numberFormat_Exception("123e");
		e.classCast_Exception();
		e.inputMismatch_Exception();
		e.getPhoneNo(709477l);
	}

}
