package ConduitAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Arrays;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class CreateArticleTest {

	
	@Test
	public void createArticle() {
		 baseURI="https://conduit-api.bondaracademy.com/api/articles";
	     String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxMzc1M30sImlhdCI6MTc0NzM2MzA5OCwiZXhwIjoxNzUyNTQ3MDk4fQ.yr2rRtk0d5BMPS6zHQCVp_2f5kRmaIOD5VWsUJigHJU";


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
	        		.header("Authorization",token)
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

