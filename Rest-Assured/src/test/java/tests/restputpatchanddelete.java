package tests;


import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;




public class restputpatchanddelete {
	
	@SuppressWarnings("unchecked")
	@Test
	public void putrequest_test() {
		
		
		
JSONObject obj  = new JSONObject();
		
		obj.put("name", "Ajay");
		obj.put("job", "lawer");
		
		baseURI="https://reqres.in/";
		
		System.out.println(obj.toJSONString());
		
		baseURI="https://reqres.in/";
		
		given().
		header("Content-Type", "json/application").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
		put("api/users/2").
		then().
		statusCode(200).
		log().all();
	
	
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void patchrequest_test() {
		
		JSONObject obj  = new JSONObject();

		obj.put("name", "Ajay");
		obj.put("job", "lawer");
		
		baseURI="https://reqres.in/";
		
		System.out.println(obj.toJSONString());
		
		baseURI="https://reqres.in/";
		
		given().
		header("Content-Type", "json/application").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
		patch("api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	
	
	@Test
	public void deleterequest_test() {
		
			
		baseURI="https://reqres.in/";
		
		given().
		when().
		delete("api/users/2").
		then().
		statusCode(204).
		log().all();
		
	}

}
