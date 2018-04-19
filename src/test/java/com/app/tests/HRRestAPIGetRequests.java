package com.app.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class HRRestAPIGetRequests {
  
	/*
	 * When I send a GET request to REST Url http://34.223.219.142:1212/ords/hr/employees
	   Then response status should be 200
	 * 
	 * 
	 */
  @Test
  public void simpleGet() {
	  when()
		  .get("http://34.223.219.142:1212/ords/hr/employees")
		  .then()
		  .statusCode(200);
  }
  
  /*
   * When I send a GET request to REST Url http://34.223.219.142:1212/ords/hr/countries
	   Then I should see JSON Response
   * 
   */
  
  @Test
  public void printResponse() {
	  when().get("http://34.223.219.142:1212/ords/hr/countries")
	  .body().prettyPrint();
  }
  
  /*
   * When I send a GET request to REST Api Url
	http://34.223.219.142:1212/ords/hr/countries/US
	And Accept type is "application/json"
	Then response status code should be 200
   */
  
  @Test
  public void getWithHeaders() {
	  with().accept(ContentType.JSON) //accept - application/json
	  .when().get("http://34.223.219.142:1212/ords/hr/countries/US")
	  .then().statusCode(200);
  }
  
  
  
  
  
  
  
  
  
  
}
