package outsystem;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class MovieApi {
	

	@Test
	public void test1() {		
	    baseURI = "https://personal-f1urviao.outsystemscloud.com/IMDB_core/rest/MoviesApi";	
		given()
		.header("token","81489980dhahbchdbhbSFGHDRNBHghsf81489980")
		.header(" ", " ")
		.get("/GetMovies")
		.then()
		.statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void test2() {		
	    JSONObject res = new JSONObject();
	    //res.put("id", "699");
	    res.put("Title", "Testing");
	    res.put("Year", 2022);
	    res.put("PlotSummary", "TestTestTestTest");
	    res.put("GrossTakingsAmount", 5.1);
	    res.put("IsAvailableOnDvD", true);
	    res.put("MovieGenreId", 0);
	    
	    
		
	    baseURI = "https://personal-f1urviao.outsystemscloud.com/IMDB_core/rest/MoviesApi/";	
		given()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(res.toJSONString())
		.post("/PostMovies")
		.then()
		.statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void test_Put() {		
	    JSONObject res = new JSONObject();
	   // res.put("id", 24);
	    res.put("Title", "Testing");
	    res.put("Year", 2022);
	    res.put("PlotSummary", "TestingTestingTesting");
	    res.put("GrossTakingsAmount", 5.1);
	    res.put("IsAvailableOnDvD", true);
	    res.put("MovieGenreId", 0);
	    
	    
		
	    baseURI = "https://personal-f1urviao.outsystemscloud.com/IMDB_core/rest/MoviesApi/";	
		given()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(res.toJSONString())
		.put("/PutMovies")
		.then()
		.statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void test_Delete() {		
	    
		
	    baseURI = "https://personal-f1urviao.outsystemscloud.com/IMDB_core/rest/MoviesApi/";	
		given()
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.delete("/DeleteMovies?MoviesId=28")
		.then()
		.statusCode(200).log().all();
	}


}
