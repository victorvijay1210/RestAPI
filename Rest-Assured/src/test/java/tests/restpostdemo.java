package tests;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class restpostdemo {
	
	
	
	
	@Test
	public void post_test() throws Throwable {
		
		JsonSerializer json = JsonSerializer.DEFAULT_READABLE;
		
		pojodata1 pojo = new pojodata1("Ajay", "Engineer");
		
	String data=	json.serialize(pojo);
		
		
//		JSONObject obj  = new JSONObject();
//		
//		obj.put("name", "Ajay");
//		obj.put("job", "Engineer");
		
		
	//	System.out.println(data.toJSONString());
		
		baseURI="https://reqres.in/";
		
		given().
		header("Content-Type", "json/application").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		//body(obj.toJSONString()).
		body(data).
		when().
		post("api/users").
		then().
		statusCode(201).
		log().all();
		
	}

}
