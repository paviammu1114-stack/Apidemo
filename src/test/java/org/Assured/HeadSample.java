package org.Assured;
import static io.restassured.RestAssured.*;
 // check if Api alive no response body

public class HeadSample {
	 public static void main(String[] args) {// it just example given by chatgpt if u run it you won't recieve correct respose 
                                            // so it is just dummy 

	        baseURI = "https://dummy.restapiexample.com";

	        given()
	        .when()
	            .head("/api/v1/employee/1")
	        .then()
	            .statusCode(200);
	    }

}
