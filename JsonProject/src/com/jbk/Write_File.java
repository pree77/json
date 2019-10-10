package com.jbk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.tools.JavaFileObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Write_File {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject obj =new JSONObject();
		obj.put("name","pallavi");
		obj.put("location","mumbai");
		
		JSONArray list=new JSONArray();
		list.add("java");
		list.add("jsp");
		list.add("servlet");
		
		obj.put("courses", list);
		
		try(FileWriter file=new FileWriter("pp.json")){
			file.write(obj.toString());
			file.flush();
			
		}
		catch (IOException e) {
			e.printStackTrace();

	}
  System.out.println(obj);
}}
