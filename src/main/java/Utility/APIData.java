package Utility;

import java.io.IOException;
import java.util.ArrayList;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class APIData {

	public static ArrayList<String> bookTitles() throws IOException, ParseException {
		Response res = RestAssured.get("https://gorest.co.in/public/v2/posts?limit=1");
		res.header("9ee063137dac23cfe5fa0aeee9f0b33aa6b07e1affeac999457b0ace5b539bfb");
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(res.asString());
		JSONArray books = (JSONArray) obj;
		ArrayList<String> bookTitles = new ArrayList<String>();
		for (int i = 0; i < books.size(); i++) {
			JSONObject book = (JSONObject) books.get(i);
			bookTitles.add((String) book.get("id").toString());
		}
		return bookTitles;
	}
	public static void main(String[] args) {
		try {
			System.out.println(APIData.bookTitles());
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
}
