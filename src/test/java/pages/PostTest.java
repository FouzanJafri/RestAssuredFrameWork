package pages;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class PostTest {
	
	@Test
	public void test1() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Raghav");
//		map.put("job", "Teacher");
		
	
//		System.out.println(map);
		
//	JSONObject json = new JSONObject(map);

	JSONObject json = new JSONObject();
//	json.put("name", "Raghav");
//	json.put("job", "Teacher");

	System.out.println(json.toJSONString());
	
	given()
	.header("Content_Type","application/json").
	contentType(ContentType.JSON)
	.body(json.toJSONString()).
	when().post("https://reqres.in/api/users").
	then().
	statusCode(201);
	}
}
