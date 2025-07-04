package org.writejson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.writejson.pojo.Batter;
import org.writejson.pojo.Batters;
import org.writejson.pojo.Root;
import org.writejson.pojo.Topping;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJsonUsingSerialization {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\src\\test\\resources\\WriteJSON.json");
		ObjectMapper objectMapper = new ObjectMapper();

		Batter batter1 = new Batter("1001", "Regular");
		Batter batter2 = new Batter("1002", "Chocolate");
		Batter batter3 = new Batter("1003", "Blueberry");
		Batter batter4 = new Batter("1004", "Devil's Food");
		ArrayList<Batter> batter = new ArrayList<Batter>();
		batter.add(batter1);
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		Batters batters = new Batters(batter);

		Topping topping1 = new Topping("5001", "None");
		Topping topping2 = new Topping("5002", "Glazed");
		Topping topping3 = new Topping("5005", "Sugar");
		Topping topping4 = new Topping("5007", "Powdered Sugar");
		Topping topping5 = new Topping("5006", "Chocolate with Sprinkles");
		Topping topping6 = new Topping("5003", "Chocolate");
		Topping topping7 = new Topping("5004", "Maple");
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(topping1);
		topping.add(topping2);
		topping.add(topping3);
		topping.add(topping4);
		topping.add(topping5);
		topping.add(topping6);
		topping.add(topping7);

		Root root = new Root("0001", "donut", "Cake", 0.55, batters, topping);

		objectMapper.writeValue(file, root);

	}

}
