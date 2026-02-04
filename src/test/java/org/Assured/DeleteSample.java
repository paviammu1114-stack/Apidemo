package org.Assured;
import static io.restassured.RestAssured.*;
// it delete datas permnantly basically removes datas

public class DeleteSample {// it just example given by chatgpt if u run it you won't recieve correct respose 
                           // so it is just dummy 
	
	 public static void main(String[] args) {

	        baseURI = "https://dummy.restapiexample.com";

	        given()
	        .when()
	            .delete("/api/v1/delete/1")
	        .then()
	            .statusCode(200);
	    }

	

}
