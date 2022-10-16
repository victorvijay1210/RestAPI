package tests;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class restpostdemo {
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void post_test() throws Throwable {
		
	//	JsonSerializer json = JsonSerializer.DEFAULT_READABLE;
		
	//	pojodata1 pojo = new pojodata1("Ajay", "Engineer");
		
	//String data=	json.serialize(pojo);
		

		JSONObject obj  = new JSONObject();
		

	//	String job = "doctor";
		
		obj.put("name" ,"Revathy");
	obj.put("job", "developer");
		
//	String json = "{   \"job\": "+"\""+job+"\""+",\r\n"
//			+ "    \"name\": \"Ajay\"\r\n"
//			+ "    }";
	
	
	
//	System.out.println(json.toString());
	//System.out.println(obj.toJSONString());
		
		baseURI="https://reqres.in/";
		
//		given().
//		header("Content-Type", "json/application").
//		contentType(ContentType.JSON).
//		accept(ContentType.JSON).
//		body(obj.toJSONString()).
////		//body(data).
////		body(json).
//	//	body(new File("src\\test\\java\\tests\\jsonfolder\\payload.json")).
//		when().
//		post("api/users").
//		then().
//		statusCode(201).
//		log().all();
		
	}

}
