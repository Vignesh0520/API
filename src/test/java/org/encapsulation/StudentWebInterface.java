package org.encapsulation;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class StudentWebInterface {
	
	Map<String, Float> map;

	private String studentName;
	
	private long regNo;
	
	private float CGPA;
	
	public long getRegNo() {
		return regNo;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public float getCGPA() {
		return CGPA;
	}

	public void setStudentName(String studentName) {
		
		if(studentName.equals("Vignesh Raja")) {
			this.studentName = "Vignesh";
		} else if (studentName.equals("Raghu Raman")) {
			this.studentName = "Raghu";
		} else if (studentName.equals("Hariharan")) {
			this.studentName = "Hari";
		} else {
			this.studentName = "Invalid student name";
		}
		
	}

	public void setRegNo(long regNo) {
		if((regNo == 221003106l) && (this.studentName.equals("Vignesh"))) {
			this.regNo = 1l;
		} else if((regNo == 221003070l) && (this.studentName.equals("Raghu"))) {
			this.regNo = 2l;
		} else if((regNo == 221003032l) && (this.studentName.equals("Hari"))) {
			this.regNo = 3l;
		} 
		
	}
	
	public void setCGPA(float cGPA) {
		
		if(cGPA==1.0f) {
			this.CGPA = this.map.get("Vignesh Raja");
		} else if(cGPA==2.0f) {
			this.CGPA = this.map.get("Raghu Raman");
		} else if(cGPA==3.0f) {
			this.CGPA = this.map.get("Hariharan");
		}
	}
	
	public void retreiveData() throws IOException {
		
		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\Library\\StudentsData.txt");
		
		@SuppressWarnings("deprecation")
		List<String> readLines = FileUtils.readLines(file);
		
		map = new LinkedHashMap<String, Float>();
		
		for(String row : readLines) {
			String[] cell = row.split(" : ");
			float CGPA = Float.parseFloat(cell[2]);
			map.put(cell[0], CGPA);
		}

	}

}
