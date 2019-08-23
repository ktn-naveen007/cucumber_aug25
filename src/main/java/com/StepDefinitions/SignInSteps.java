package com.StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class SignInSteps{
	
	WebDriver driver;
	
	@Given("^Enter the URL for Amazon$")
	public void enter_the_URL_for_Amazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Girish-Cucumber\\BDD_using_Selenium_Cucumber\\BDD_using_Selenium_Cucumber\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}

	@When("^Click on SignIn button$")
	public void click_on_SignIn_button() throws Throwable {
		WebElement signInlnk = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));	
		WebElement signInBtn = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(signInlnk).build().perform();
		
		signInBtn.click();
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8766866368");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Test@123");
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
	   driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']//input[@type='submit']")).click();
	}

	@Then("^User should be on Home Page$")
	public void user_should_be_on_Home_Page() throws Throwable {
	    String welcomeMsg = driver.findElement(By.xpath("//span[contains(text(),'Hello, girish')]")).getText();
	    System.out.println("Welcome Message is : " + welcomeMsg);
	    Assert.assertEquals("Hello, girish", welcomeMsg);
	}
	
	//functionality to capture screenshot of failed test scenarios
	@After
	public void tearDown(Scenario scenario) throws IOException {
	    if (scenario.isFailed()) {
	    	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
			FileUtils.copyFile(screenshotFile, new File("E:\\Girish-Cucumber\\BDD_using_Selenium_Cucumber\\BDD_using_Selenium_Cucumber" + scenario.getName() + ".png"));
			
			File destinationPath = new File("E:\\Girish-Cucumber\\BDD_using_Selenium_Cucumber\\BDD_using_Selenium_Cucumber" + scenario.getName() + ".png");
			
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
			System.out.println("Screenshot captured");
	    }
	}
}
