package outsystem;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class GetTest {

	@Test
	public void test1() {		
	    baseURI = "https://personal-xeac5n69.outsystemscloud.com/Test1_service/rest/v2";	
		given()
		.header("X-Room-AppId","ghjfxdfAvs596vcGfsvf0ef1")
		.header("X-Room-Key","6tsdgdjl9fsKDd5zsvnwmdjosDmrufbs93susadLHDvjfhbnwtTRbsnucnrb")
		.get("/ListRoombyCustom")
		.then()
		.statusCode(200).log().all();
	}
	
//	@Test
//	public void test2() {		
//	    JSONObject res = new JSONObject();
//	   // res.put("id", "699");
//	    res.put("RoomNumber", 6969);
//	    res.put("AdultsCapacity", "5");
//	    res.put("ChildrenCapacity", "0");
//	    res.put("Price", 501);
//	    
//		
//		baseURI = "https://personal-xeac5n69.outsystemscloud.com/Test1_service/rest/v2";	
//		given()
//		.header("X-Room-AppId","ghjfxdfAvs596vcGfsvf0ef1")
//		.header("X-Room-Key","6tsdgdjl9fsKDd5zsvnwmdjosDmrufbs93susadLHDvjfhbnwtTRbsnucnrb")
//		.contentType(ContentType.JSON).accept(ContentType.JSON)
//		.body(res.toJSONString())
//		.post("/CreateRoom")
//		.then()
//		.statusCode(200).log().all();
//	}


}
