package com.nbcu.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NasaSoundsGetTest {
	
	@BeforeClass
	public void init(){
		
		RestAssured.baseURI = "https://api.nasa.gov";
		RestAssured.basePath = "/planetary";
		
	}
	
	@Test
	public void getTenNasaSounds(){
		/**
		 * BDD Style format
		 * 
		 * given()
		 * Set cookies, add authentication, add parameters, set header information
		 * .when()
		 * GET, POST, PUT, DELETE, etc.
		 * .then()
		 * Validate status code returned from server, extract response, extract cookies, extract headers, extract response body
		 * 
		 */
		
	    Response response = given()
		.param("q", "apollo")
		.param("limit", 10)
		.param("api_key", "DEMO_KEY")
		.when()
		.get("/sounds");
	    //.then()
	    //.statusCode(200);
	
	System.out.println(response.prettyPrint());	
	}	

}
