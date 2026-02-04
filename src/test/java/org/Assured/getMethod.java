package org.Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class getMethod {
	@Test
	private void GetRequest() {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");

//		System.out.println(response.asPrettyString());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.contentType());
//		System.out.println(response.getTime());
		
		
//		
		// BDD style 
		given().get("https://dummy.restapiexample.com/api/v1/employee/1").then().statusCode(200);

	}

}
