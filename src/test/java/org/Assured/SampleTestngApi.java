package org.Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleTestngApi { // we did this in testng method
	@Test
	private void GetRequest() {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
		ResponseBody responsebody = response.body();
		System.out.println(responsebody.asPrettyString());

	}

}
