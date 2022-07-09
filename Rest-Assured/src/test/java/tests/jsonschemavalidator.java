package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class jsonschemavalidator {
	
	@Test
	public void jsonvalidator() {
		
		
		 baseURI="https://reqres.in/";
			
			
			given().get("api/users?page=2").
			then().
			assertThat().body(matchesJsonSchemaInClasspath("tests/jsonfolder/Schema.json")).
			statusCode(200);
		
		
	}

}
