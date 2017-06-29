package com.nbcu.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NasaSoundNegativeOneTest {
	
	@BeforeClass
	public void init(){
		
		RestAssured.baseURI = "https://api.nasa.gov";
		RestAssured.basePath = "/planetary";
		
	}
	
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
	
	// This test identifies a DEFECT where -1 returns a count of 10 result.  The application does not validate for -1.
	// The application throws internal server exceptions when a negative numbers like -5  is used as the limit value.
	// Two Defects identified:  DEFECT #1: -1 should not display any data but should give user a meaning message.  
	// DEFECT #2: Negative numbers that are not -1 should be validated by the application and handled gracefully.
	@Test
	public void getNegativeOneNasaSounds(){
		
		given()
		.param("q", "apollo")
		.param("limit", -1)
		.param("api_key", "DEMO_KEY")
		.when()
		.get("/sounds")
	    .then()
	    .statusCode(400);
		
	}

}
