package com.app.tests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Sumproduct;
import org.testng.annotations.Test;

import com.app.utilities.ConfigurationReader;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiDay4POSTRequests {
	
	/*
	POST SCENARIO:

		given content type is Json
		And Accept type is Json
		When I send POST request to 
		http://34.223.219.142:1212/ords/hr/regions
		with request body :
		{
			"region_id" : 5,
			"region_name" : "murodil's region"
		}
		Then status code should be 200
		And response body should match request body
	*/
	
	
	@Test
	public void postNewRegion() {
		String url = ConfigurationReader.getProperty("hrapp.baseresturl") + "/regions/";
		
		//String requestJson = "{\"region_id\" : 5,\"region_name\" : \"murodil's region\"}";
		
		Map requestMap = new HashMap<>();
		requestMap.put("region_id", 555);
		requestMap.put("region_name", "murodil's region");
		
		Response response = given().accept(ContentType.JSON)
							.and().contentType(ContentType.JSON)
							.and().body(requestMap)
							.when().post(url);
		
		System.out.println(response.statusLine());
		response.prettyPrint();
	}
	
}
