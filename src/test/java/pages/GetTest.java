package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetTest {

	@Test
	public void test1() {
		Response rep = get("https://reqres.in/api/users?page=2");
		System.out.println(rep.getStatusCode());
		System.out.println(rep.getBody().toString());
		System.out.println(rep.getStatusLine());
		System.out.println(rep.getTime());
		
		int code = rep.getStatusCode();
		Assert.assertEquals(code, 200);	
	}
	@Test
	public static void test2() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7));
	}
}
