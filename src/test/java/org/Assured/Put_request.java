package org.Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;


public class Put_request { // this method will update or replace full data 
	 public static void main(String[] args) {
		 RestAssured.baseURI = "https://dummy.restapiexampl.com";
		  
		 String body = "{\n" + // this body is not proper so you won't get proper response 
	                "  \"name\": \"test\",\n" +
	                "  \"salary\": \"123\",\n" +
	                "  \"age\": \"23\"\n" +
	                "}";
		 
		  given()
		 .contentType(ContentType.JSON).body(body).when()
		 .put("api/v1/update/21").then().statusCode(200);
		  
		 
		 
	
	}
	

}
