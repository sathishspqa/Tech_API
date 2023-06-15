package com.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	
	
	@Test
	public void deleteMethod () {
		
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification RS = RestAssured.given();
							
		Response res = RS.request(Method.DELETE,"/api/users/2");
		
	   	System.out.println(res.asPrettyString());
	   	
	   	System.out.println(res.getStatusLine());	 
				
			                         
		   	
	}


}
