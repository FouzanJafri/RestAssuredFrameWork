package pages;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class patchTest {
	
	@Test
	public void test1() {

	JSONObject json = new JSONObject();

	System.out.println(json.toJSONString());
	
	given()
	.header("Content_Type","application/json").
	contentType(ContentType.JSON)
	.body(json.toJSONString()).
	when().
	patch("https://reqres.in/api/users/2").
	then().
	statusCode(200).log().all();
	}


}
