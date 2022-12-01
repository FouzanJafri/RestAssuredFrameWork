package shrutiApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetTest {

	@Test
	public void test1() {		
	    baseURI = "https://personal-xeac5n69.outsystemscloud.com/Test1_service/rest/v3";	
		given()
		.header("Authorization","Bearer VGVzdDp0ZXN0QDEwMA==")
		.get("/ListRoombyCustom?Roomid=1")
		.then()
		.statusCode(200).log().all()
		.toString();
	}
	
}
