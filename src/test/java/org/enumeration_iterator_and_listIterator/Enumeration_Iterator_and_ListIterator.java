package org.enumeration_iterator_and_listIterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration_Iterator_and_ListIterator {

	public static void main(String[] args) {

		// Using Enumeration (Legacy)
		System.out.println("=== Enumeration ===");
		Vector<String> vec = new Vector<>();
		vec.add("One");
		vec.add("Two");
		vec.add("Three");

		Enumeration<String> enumeration = vec.elements();
		while (enumeration.hasMoreElements()) {
			String value = enumeration.nextElement();
			System.out.println("Element: " + value);
		}

		// Using Iterator
		System.out.println("\n=== Iterator ===");
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("Element: " + value);
			if (value.equals("B")) {
				iterator.remove(); // removing "B"
			}
		}

		System.out.println("After remove using Iterator: " + list);

		// Using ListIterator
		System.out.println("\n=== ListIterator ===");
		List<String> list2 = new ArrayList<>();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");

		ListIterator<String> listIterator = list2.listIterator();

		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println("Forward Element: " + value);
			if (value.equals("Y")) {
				listIterator.set("YYY"); // replacing Y with YYY
				listIterator.add("InsertedAfterYYY"); // inserting after YYY
			}
		}

		// Traversing in reverse
		System.out.println("\nTraversing backward:");
		while (listIterator.hasPrevious()) {
			System.out.println("Backward Element: " + listIterator.previous());
		}

		System.out.println("\nFinal List using ListIterator: " + list2);
	}

}

/*

Output:

=== Enumeration ===
Element: One
Element: Two
Element: Three

=== Iterator ===
Element: A
Element: B
Element: C
After remove using Iterator: [A, C]

=== ListIterator ===
Forward Element: X
Forward Element: Y
Forward Element: Z

Traversing backward:
Backward Element: Z
Backward Element: InsertedAfterYYY
Backward Element: YYY
Backward Element: X

Final List using ListIterator: [X, YYY, InsertedAfterYYY, Z]

*/
