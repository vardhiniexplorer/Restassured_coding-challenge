package testcases;

import org.testng.annotations.Test;


import helper.BaseClass;
import helper.Utility;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class TestWeatherAPI extends BaseClass{

	@Test
	public void verifyStatus()
	{
		
	
		//verifying status code
		
		int response=RestAssured.given()
				.queryParam("appid","04a566a0cde4b45f95a7128fd9217c0d")
				.queryParam("q","London,Uk")
				.get()
				.getStatusCode();
		System.out.println(response);
		Utility.verifyResponseCode200(response);
		
		
		//Verify the response value
		String responsebody= given()
				.queryParam("appid","04a566a0cde4b45f95a7128fd9217c0d")
				.queryParam("q","London,Uk")
				.get()
				.body()
				.asString();
		Utility.verifyJsonData(responsebody,"id","2643743");
		
		
		//Print the response in console
		System.out.println(given()
				.queryParam("appid","04a566a0cde4b45f95a7128fd9217c0d")
				.queryParam("q","London,Uk")
				.get().prettyPrint());
		        
		
		
	}
	
	
	
	
	
	
}
