package com.configFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	Properties properties = new Properties(); 
	
	public String getReportConfigPath() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\girishwar.patil\\git\\BDD_Using_Selenium_Cucumber\\BDD_using_Selenium_Cucumber\\configuration.properties");
		properties.load(fis);
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
