package pages;

import static io.restassured.RestAssured.given;

import java.net.URI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class DeleteTest {
	@Test
	public void test1() {

	
	given().
		delete("https://reqres.in/api/users/2").
	then().
		statusCode(200).log().all();
	}


}
