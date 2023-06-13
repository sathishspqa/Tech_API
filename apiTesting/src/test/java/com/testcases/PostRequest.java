package com.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	
	@Test
	public void postNewrecord () {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification RS = RestAssured.given()
				.body("{ \r\n"
				+ "\"name\": \"morpheus\",\r\n"
				+ " \"job\": \"leader\",\r\n"
				+ " \"id\": \"31\",\r\n"
				+ " \"createdAt\": \"2023-02-20T03:25:37.765Z\" }");
				
		Response res = RS.request(Method.POST,"/2");
		
	   	System.out.println(res.asPrettyString());
	   	
	   	System.out.println(res.getStatusLine());	 
				
			                         
		   	
	}


}
