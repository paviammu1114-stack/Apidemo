package org.Assured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

//it updates only partial or specified data 

public class PatchExample { // it just example given by chatgpt if u run it you won't recieve correct respose 
	                        // so it is just dummy 
	public static void main(String[] args) {

        baseURI = "https://dummy.restapiexample.com";

        String body = "{\n" +
                "  \"salary\": \"70000\"\n" +
                "}";

        given()
            .contentType(ContentType.JSON)
            .body(body)
        .when()
            .patch("/api/v1/update/1")
        .then()
            .statusCode(200);
    }


}
