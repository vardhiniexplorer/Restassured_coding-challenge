package helper;

import org.testng.annotations.BeforeSuite;

import dataProvider.DataProvider;
import io.restassured.RestAssured;

public class BaseClass {

	@BeforeSuite
	public void setUp() {
		
		RestAssured.baseURI = new DataProvider().weatherapi();
		
	
	}

}
