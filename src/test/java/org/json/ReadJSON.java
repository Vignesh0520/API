package org.json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {
	public static void main(String[] args) throws IOException, ParseException {

		// https://opensource.adobe.com/Spry/samples/data_region/JSONDataSetSample.html#Example4
		
		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\API\\"
				+ "src\\test\\resources\\JSON_Data.json");
		FileReader fileReader = new FileReader(file);
		JSONParser jsonParser = new JSONParser();
//		className objRef = new ClassNAme();
//		objRef.methodName
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));

		Object object = jsonObject.get("batters");
		JSONObject batters = (JSONObject) object;
		Object batter = batters.get("batter");
		JSONArray batter_jsonArray = (JSONArray) batter;
		for (int i = 0; i < batter_jsonArray.size(); i++) {
			Object object2 = batter_jsonArray.get(i);
			JSONObject batter_type = (JSONObject) object2;
			System.out.println(batter_type.get("id"));
			System.out.println(batter_type.get("type"));
		}

		Object object2 = jsonObject.get("topping");
		JSONArray topping = (JSONArray) object2;
		System.out.println(topping.size());
		for (int i = 0; i < topping.size(); i++) {
			Object object3 = topping.get(i);
			JSONObject topping_type = (JSONObject) object3;
			System.out.println(topping_type.get("id"));
			System.out.println(topping_type.get("type"));
		}
	}
}
