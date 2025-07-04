package org.file_operations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		File folder = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\FileOperationLibrary");
		
		// mkdir() - to create the folder.
		boolean mkdir = folder.mkdir();
		
		if(mkdir == true) {
			System.out.println("Folder named FileOperationLibrary is created");
		} else {
			System.out.println("Folder named FileOperationLibrary is not created");
		}
		
		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\FileOperationLibrary\\userName.txt");
		
		// createNewFile() - to create a file.
		boolean createNewFile = file.createNewFile();
		
		if(createNewFile == true) {
			System.out.println("File named userName.txt is created");
		} else {
			System.out.println("File named userName.txt is not created");
		}
		
		// exists() - Check if File Exists
		boolean exists = file.exists();
		
		if(exists == true) {
			System.out.println("File named userName.txt exist");
		} else {
			System.out.println("File named userName.txt is not exist");
		}
		
		// canRead() - Check if File is Readable
		boolean canRead = file.canRead();
		
		if(canRead == true) {
			System.out.println("File userName.txt is readable");
		} else {
			System.out.println("File userName.txt is not readable");
		}
		
		// canWrite - Check if File is Writable
		boolean canWrite = file.canWrite();
		
		if(canWrite == true) {
			System.out.println("File userName.txt is writable");
		} else {
			System.out.println("File userName.txt is not writable");
		}
		
		// list() - List Files and Folders in a Directory
		String[] items = folder.list();
		System.out.println("\nList of files present in folder named FileOperationLibrary are :");
		for(String name : items) {
			System.out.println(name);
		}
		
		// Write or Append to a File 
		// FileUtils.write(file, "Java is fun", true); // true = append, false = overwrite
		FileUtils.write(file, "vignesh0520\n", false);
		FileUtils.write(file, "_.maathu._\n", true);
		FileUtils.write(file, "revathiraja0\n", true);
		FileUtils.write(file, "mahalakshmisweets", true);
		
		
		System.out.println("\nContent present in the file - userName.txt are : ");	
		// FileUtils.readLines(fileName); - Read File Content
		List<String> readLines = FileUtils.readLines(file);
		for(int i=0; i<readLines.size(); i++) {
			System.out.println(readLines.get(i));
		}
	}

}
