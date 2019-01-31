package com.automation.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(@Optional("firefox") String browser) {
		
		if(browser.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
	    	driver = new ChromeDriver();
	    	}
		else if(browser.equals("firefox")) {
	    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
	    	driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@Test
	@Parameters({"username","password"})
	public void login(@Optional("praneethmanala")String username,@Optional("praneethmanala")String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
}
