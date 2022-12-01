package shrutiApi;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Req {
	
	@Test
	public void getDet() throws ParseException {
		//Url
		RestAssured.baseURI = "https://personal-xeac5n69.outsystemscloud.com/Test1_service/rest/v3";
		
		//Request
		RequestSpecification httpReq = RestAssured.given().header("Authorization","Bearer VGVzdDp0ZXN0QDEwMA==");
		
		
		//response
		Response responce = httpReq.request(Method.GET,"/ListRoombyCustom?Roomid=1");
		
		String responseBody = responce.getBody().asString();
		System.out.println(responseBody);

//		int rescode = responce.getStatusCode();
//		System.out.println(rescode);
//		
//		String resLine = responce.getStatusLine();
//		System.out.println(resLine);
//		
//		//headerCatch
//		String contentType = responce.header("Content-type");
//		System.out.println(contentType);
		
//		//all header
//		Headers allheader = responce.headers();
//		for (Header header : allheader) {
//			System.out.println(header.getName() + "  " + header.getValue());
//		}
		
		JSONParser jsonParse = new JSONParser();
		Object object = jsonParse.parse(responce.asString());
		
		JSONArray books = ((JSONArray) object);
//		ArrayList<String> 
		
		
		
		
	}
}
