package com.unicam.spm2020_2021;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static void createJSON() {
		
		String arrayStr = 
	            "["+
	            		"{"+
	                    "\"age\":\"22\","+
	                    "\"name\":\"Jon Doe\","+
	                    "\"city\":\"Camerino\","+
	                "},"+"{"+
                    "\"age\":\"20\","+
                    "\"name\":\"Luca Cervioni\","+
                    "\"city\":\"Civitanova Marche\","+
                "}," +
	            "]";
		
		JSONArray array = new JSONArray(arrayStr);
		//array.put(arrayStr);
		System.out.println(array);
		
        //System.out.println(obj.toString());
        
		FileWriter file;
		try {
			file = new FileWriter("C:/Users/lucac/Desktop/Corsi/output.json");
			file.write(array.toString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
    public static void main( String[] args )
    {
        createJSON();
    }
}
