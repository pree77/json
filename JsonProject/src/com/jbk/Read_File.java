package com.jbk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_File {
	public static void main(String[] args) throws IOException, ParseException {
		JSONObject obj=(JSONObject) readJsonSimpleDemo("write.json");
		System.out.println(obj);
		System.out.println(obj.get("name"));
		}
	public static Object readJsonSimpleDemo(String filename) throws IOException, ParseException {
		FileReader reader=new FileReader(filename);
		JSONParser jsonParser=new JSONParser();
		return jsonParser.parse(reader);
		
	}

}












