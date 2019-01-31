package com.automation.extentReports;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CapturingScreenShot_Extent {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;  
	WebDriver driver;
	
	@BeforeTest
	public void startReport() {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/MyOwnReports/CaptureExtentReport.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	
	}
	
	@Test
	public void captureScreenShot() throws InterruptedException {
		
		test= extent.createTest("captureScreenShot");
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("praneethmanala");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("praneethmanala");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		Assert.assertTrue(false);
		
	}


	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			String screenshotPath=GetScreenShot.Capture(driver, "MyScreenShot");
			test.fail(MarkupHelper.createLabel(result.getName()+" Test case Passed ", ExtentColor.GREEN));
			test.fail(result.getThrowable());
			test.fail("Screenshot Below: "+test.addScreenCaptureFromPath(screenshotPath));
			
		}
	}
	
	
	@AfterTest
	public void tearDown() {
		
		extent.flush();
		
	}
	

}

