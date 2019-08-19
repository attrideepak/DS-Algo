package API.REST;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.ErrorPojo;
import requestpayload.PostRequest;

public class PostRequestTest{
	
	PostRequest requestPayload = new PostRequest();

	@Test
   public void postApi() {
	   RestAssured.baseURI = "http://inventory4.zoomaws.com:8080/inventory";
	   RequestSpecification request = RestAssured.given();	
	   
	   request.body(requestPayload.postJson().toString());
	   request.header("Content-Type","application/json");
	   
	   
	   
	  // System.out.println(requestPayload.postJson());
	   
	   
	  // request.headers(headers)
	   
	   //request.queryParam(parameterName, parameterValues)
	   
	  // request.pathParam(parameterName, parameterValue)
	   
	   Response response = request.post("/cargroups");

	   
	   
	   	   
//	   System.out.println("Response body is " + response.getBody().asString());
//
//	   System.out.println("Error message is : " +response.jsonPath().get("message"));
//	   
//	   System.out.println("Status code is    : "+statusCode);
	   
	   Gson gson = new Gson();
	   ErrorPojo errorResponse = gson.fromJson(response.getBody().asString(), ErrorPojo.class);
	   
	   System.out.println(errorResponse.getCode());
	   System.out.println(errorResponse.getMessage());
	   
	   
	   
}
   
}
