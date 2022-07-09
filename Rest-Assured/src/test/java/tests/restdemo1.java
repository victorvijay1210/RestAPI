package tests;

import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restdemo1 {

	
	
	
	@Test
	public void basic_get_test() {
		

		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
	System.out.println(response.getStatusCode());	
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusLine());
		System.out.println(response.header("Content-type"));
		       
		
		   int statuscode= response.getStatusCode();
		
        Assert.assertEquals(statuscode, 200);
		
		
	}
	

}
