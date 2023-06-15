package com.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchRequest {
	
	
	@Test
	public void patchMethod () {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification RS = RestAssured.given()
				.body("{ \r\n"
				+ "\"name\": \"morpheus\",\r\n"
				+ " \"job\": \"leader3\",\r\n"
				+ " \"id\": \"31\",\r\n"
				+ " \"createdAt\": \"2023-02-20T03:25:37.765Z\" }");
				
		Response res = RS.request(Method.PATCH,"/2");
		
	   	System.out.println(res.asPrettyString());
	   	
	   	System.out.println(res.getStatusLine());	 
				
			                         
		   	
	}


}
