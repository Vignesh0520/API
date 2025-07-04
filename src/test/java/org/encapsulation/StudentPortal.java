package org.encapsulation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Scanner;

public class StudentPortal {
	
	public static void main(String[] args) throws IOException {
		
		StudentWebInterface student1 = new StudentWebInterface();
		student1.retreiveData();
		student1.setStudentName("Vignesh Raja");
		student1.setRegNo(221003106l);
		float cgpa1 = (float) student1.getRegNo();
		student1.setCGPA(cgpa1);
		
		StudentWebInterface student2 = new StudentWebInterface();
		student2.retreiveData();
		student2.setStudentName("Raghu Raman");
		student2.setRegNo(221003070l);
		float cgpa2 = (float) student2.getRegNo();
		student2.setCGPA(cgpa2);
		
		StudentWebInterface student3 = new StudentWebInterface();
		student3.retreiveData();
		student3.setStudentName("Hariharan");
		student3.setRegNo(221003032l);
		float cgpa3 = (float) student3.getRegNo();
		student3.setCGPA(cgpa3);
		
		StudentWebInterface student4 = new StudentWebInterface();
		student4.retreiveData();
		student4.setStudentName("HariPrasad");
		student4.setRegNo(221003033l);
		float cgpa4 = (float) student4.getRegNo();
		student4.setCGPA(cgpa4);
		
		//UserDefinedList
		List<StudentWebInterface> list = new ArrayList<StudentWebInterface>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		System.out.println("\n----- User Defined List -----");
		for(int i=0; i<list.size(); i++) {
			String studentName = list.get(i).getStudentName();
			float cgpa = list.get(i).getCGPA();
			System.out.println(studentName+" have scored "+cgpa);
		}
		
		Set<StudentWebInterface> set = new LinkedHashSet<StudentWebInterface>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		System.out.println("\n----- User Defined Set -----");
		for(StudentWebInterface student : set) {
			String studentName = student.getStudentName();
			float cgpa = student.getCGPA();
			System.out.println(studentName+" have scored "+cgpa);
		}
		
		Map<String, StudentWebInterface> map = new LinkedHashMap<String, StudentWebInterface>();
		map.put("Vignesh Raja", student1);
		map.put("Raghu Raman", student2);
		map.put("Hariharan", student3);
		map.put("HariPrasad", student4);
		Set<Entry<String, StudentWebInterface>> entrySet = map.entrySet();
		System.out.println("\n----- User Defined Map -----");
		for(Entry<String, StudentWebInterface> student : entrySet) {
			String studentName = student.getValue().getStudentName();
			float cgpa = student.getValue().getCGPA();
			System.out.println(studentName+" have scored "+cgpa);
		}
			
/*		
		
		StudentWebInterface student = new StudentWebInterface();
		
		//retreiving the data from the txt file
		student.retreiveData();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String studentName = scanner.nextLine();
		System.out.print("Enter Register Number : ");
		long regNo = scanner.nextLong();
		scanner.close();

		student.setStudentName(studentName);
		student.setRegNo(regNo);
		
		float cgpa = student.getRegNo();
		student.setCGPA(cgpa);
		
		System.out.println(student.getStudentName()+" have scored "+student.getCGPA());
		
*/
		
	}
}
