package org.Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_request {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://dummy.restapiexample.com"; 
		
		String requestbody = "{\r\n"
				+ "    \"status\": \"success\",\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"name\": \"test\",\r\n"
				+ "        \"salary\": \"123\",\r\n"
				+ "        \"age\": \"23\",\r\n"
				+ "        \"id\": 25\r\n"
				+ "    }\r\n"
				+ "}";
		
	
Response response = given().contentType(ContentType.JSON).body(requestbody).when().post("/api/v1/create").then().extract()
 .response();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
      
		
		
		
	}
	
	
}
