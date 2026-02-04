package org.Assured;
import static io.restassured.RestAssured.*;
// ask server what method can i use here? 
public class OptionSample {
	public static void main(String[] args) {// it just example given by chatgpt if u run it you won't recieve correct respose 
                                            // so it is just dummy

        baseURI = "https://dummy.restapiexample.com";

        given()
        .when()
            .options("/api/v1/employee")
        .then()
            .statusCode(200);
    }

}
