package ConduitAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Arrays;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateArticleTest {

	private  String token;
	@BeforeTest
	public void loginConduit() {
        RestAssured.baseURI = "https://conduit-api.bondaracademy.com/api";
	      RestAssured.useRelaxedHTTPSValidation();
	      User login = new User("vijayvj1210@gmail.com", "Qwert$123");
	      LoginPayoad user = new LoginPayoad(login);
		// Deserialize the response
	        Response response = given()
	                .header("Content-Type", "application/json")
	                .body(user)
                    .log().body()              
	            .when()
	                .post("/users/login")
	            .then()
                .log().body()              // log the incoming JSON
                .extract().response();  
	     // 4) Print status and full body so you can see exactly what came back
	        System.out.println("Status code: " + response.getStatusCode());
	        System.out.println("Response body:" + response.asPrettyString());

	        // 5) Now extract the token
	        token = response.jsonPath().getString("user.token");

		 
	}
	
	@Test
	public void createArticle() {
		 baseURI="https://conduit-api.bondaracademy.com/api";
		 RestAssured.useRelaxedHTTPSValidation();
	        // Create inner Article object
	        Article article = new Article(
	            "Test Articale",
	            "This is Test Articale",
	            "Hello all, very good morning",
	            Arrays.asList("Testing")
	        );

	        // Wrap it inside ArticleRequest
	        ArticleRequest articleRequest = new ArticleRequest(article);  	
	        // Send POST request
	        Response response = given()
	        		.header("Authorization","Token"+" "+token)
	                                .header("Content-Type", "application/json")
	                                .body(articleRequest)
	                            .when()
	                                .post("/articles")
	                            .then()
	                                .statusCode(201)
	                                .extract().response();

	        // Print the raw response
	        System.out.println("Response Body:");
	        System.out.println(response.asPrettyString());
	    }
	}

