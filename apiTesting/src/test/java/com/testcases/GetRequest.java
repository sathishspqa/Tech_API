package com.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	
	@Test
	public void getAll () {
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		RequestSpecification RS = RestAssured.given();
		
	   	Response res = RS.request(Method.GET);
		
	   	System.out.println(res.asPrettyString());
	   	
	   	System.out.println(res.getStatusLine());
	   	
	   	
	}


}
