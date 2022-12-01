package shrutiApi;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostReq {
	
	
	@Test(dataProvider = "dataprovide",dataProviderClass = DataProvideTest.class)
	private void test1(int RoomNum,String Adult,String Children,int Price) {
		baseURI = "https://personal-xeac5n69.outsystemscloud.com/Test1_service/rest/v3";
		
		RequestSpecification httpReq = RestAssured.given().header("Authorization","Bearer VGVzdDp0ZXN0QDEwMA==");
		
		JSONObject request = new JSONObject();
		request.put("RoomNumber",RoomNum );
		request.put("AdultsCapacity",Adult );
		request.put("ChildrenCapacity",Children );
		request.put("Price",Price );
		
		httpReq.body(request.toJSONString());
		
		
		Response response = httpReq.request(Method.POST,"/CreateRoom");
		
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
	}

}
