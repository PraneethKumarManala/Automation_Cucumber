package com.automation.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxDriverclass {
	
	WebDriver driver;
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
	   // driver.navigate().to("https://www.freecrm.com/index.html");
	    driver.get("https://www.freecrm.com/index.html");
	}

	
}
