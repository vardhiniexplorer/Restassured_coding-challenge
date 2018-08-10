package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataProvider {

	Properties pro;

	public DataProvider() {
		pro = new Properties();
		try {
			pro.load(new FileInputStream(new File("./Config/Config.properties")));
		} catch (Exception e) {

			System.out.println("Not able to read/load config file");
		}
	}

	
	
	
	public String weatherapi() {
		return pro.getProperty("weatherapi");
	}

	
	
}
