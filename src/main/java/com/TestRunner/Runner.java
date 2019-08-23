package com.TestRunner;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.configFileReader.*;


@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", 
				 glue= {"com.StepDefinitions"},
				 plugin= {"html:target/cucumber-html-report", 
						  "json:target/cucumber-json-report.json",
						  "junit:target/cucumber-xml-report.xml",
						  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},
				 tags = {"@Functional" })
						 //monochrome=true, to display console output in proper readable format
                         //strict=true, it will check for any undefined step definition:: mapping of steps with feature file scenario
                         //dryRun=false) to check the mapping is proper between feature file and step definition file)

public class Runner {
	@AfterClass
	 public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(new ConfigFileReader().getReportConfigPath()));
	}
}
