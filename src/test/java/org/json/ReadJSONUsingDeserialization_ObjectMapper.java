package org.json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.pojo.Batter;
import org.json.pojo.Batters;
import org.json.pojo.Root;
import org.json.pojo.Topping;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Read data from a JSON file using the deserialization approach
public class ReadJSONUsingDeserialization_ObjectMapper {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		// Create a File instance pointing to the JSON file
		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\src\\test\\resources\\JSON_Data.json");

		// Create a FileReader to read the JSON file
		FileReader fileReader = new FileReader(file);

		// Create an ObjectMapper for deserialization
		ObjectMapper objectMapper = new ObjectMapper();

		// Deserialize the JSON content into the Root class
		Root rootObject = objectMapper.readValue(fileReader, Root.class);

		// Print basic properties from the root object
		System.out.println(rootObject.getId());
		System.out.println(rootObject.getType());
		System.out.println(rootObject.getName());
		System.out.println(rootObject.getPpu());

		// Retrieve and print all batter information
		Batters batters = rootObject.getBatters(); // Get Batters object
		ArrayList<Batter> batter = batters.getBatter(); // Get list of Batter objects
		for (int i = 0; i < batter.size(); i++) {
			System.out.println(batter.get(i).getId());
			System.out.println(batter.get(i).getType());
		}

		// Retrieve and print all topping information
		ArrayList<Topping> topping = rootObject.getTopping(); // Get list of Topping objects
		for (int i = 0; i < topping.size(); i++) {
			System.out.println(topping.get(i).getId());
			System.out.println(topping.get(i).getType());
		}
	}

}
