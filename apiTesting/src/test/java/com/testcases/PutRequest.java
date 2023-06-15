package com.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	
	
	@Test
	public void putMethod () {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification RS = RestAssured.given()
				.body("{ \r\n"
				+ "\"name\": \"morpheus2\",\r\n"
				+ " \"job\": \"Zion Resident2\",\r\n"
				+ " \"id\": \"315\",\r\n"
				+ " \"new Put Update\": \"2023-02-20T03:25:37.765Z\" }");
				
		Response res = RS.request(Method.PUT,"/2");
		
	   	System.out.println(res.asPrettyString());
	   	
	   	System.out.println(res.getStatusLine());	 
				
			                         
		   	
	}


}
