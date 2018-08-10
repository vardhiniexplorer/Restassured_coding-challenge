package helper;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

public class Utility 
{

	
	public void newmethod()
	{
		
	}
	
	public static void verifyResponseCode200(int actual)
	{
		Assert.assertEquals(actual, 200);	
	}
	
	public static void verifyResponseCode(int actual,int expected)
	{
		Assert.assertEquals(actual, expected);	
	}
	
	public static JsonPath JSONParser(String response)
	{
		JsonPath json=new JsonPath(response);
		return json;
	}
	
	public static void verifyJsonData(String response,String key,String value)
	{
		JsonPath json=new JsonPath(response);
		String data=json.getString(key);
		Assert.assertEquals(data, value);
	}
	
	
	public static void verifyJsonDataContains(String response,String key,String value)
	{
		JsonPath json=new JsonPath(response);
		String data=json.getString(key);
		Assert.assertTrue(data.contains(value));
	}
	
	public static String jsonData(String response,String key)
	{
		JsonPath json=new JsonPath(response);
		String data=json.getString(key);
		return data;
	}
	
	
}
