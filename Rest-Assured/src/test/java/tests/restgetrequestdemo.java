package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//use jsonpath finder 
public class restgetrequestdemo {
	
	@Test
	public void get_test() {
		
  baseURI="https://reqres.in/";
		
		
	given().get("api/users?page=2").then().statusCode(200).body("data[0].first_name", equalTo("Michael"))
   .body("data.first_name", hasItems("Michael","Lindsay"));
		

}
	

}
