package org.Assured;
 
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SampleGetRequest {
	public static void main(String[] args) {
		
//	Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
//	int statusCode = response.statusCode(); //to find which states code like 100 series or 200 series
//	String statusLine = response.statusLine(); //to find status code and also status text like 'http/1.1'
//	String contentType = response.contentType();//to find what kinda data the API receiving like 'json/xml data
//	long time = response.getTime();	// to find how many time it takes to response
//	String asPrettyString = response.asPrettyString();//to get the api response body in a clean&readable format
//	
//		System.out.println(statusCode);
//		System.out.println(statusLine);  
//		System.out.println(contentType);
//		System.out.println(time);
//		System.out.println(asPrettyString);
//		
		// BDD style 
		RestAssured.baseURI = "https://dummy.restapiexample.com"; 
		      
Response response = given().queryParam("page", 2).when().get("/api/v1/employee/1").then().extract().response();
    // System.out.println(response.asPrettyString());
     JsonPath jsonPath = response.jsonPath();  
     Object object = jsonPath.getInt("data.id");
     
     System.out.println(object);
				
	}

}
