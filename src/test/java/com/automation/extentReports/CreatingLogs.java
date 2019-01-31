package com.automation.extentReports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreatingLogs {


	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;  
	
	
	@BeforeTest
	public void startReport() {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/MyOwnReports/MyOwnLogReport.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	
	}

	@Test
	public void logGeneration() {
		
		test = extent.createTest("logGeneration");
		test.log(Status.INFO, "CreateTestMethod() will return the extentTest object");
		test.log(Status.INFO, "I am in actual test case");
		
		//Using lables
		
		test.info(MarkupHelper.createLabel("******* Using Lables *******", ExtentColor.RED));
		test.info(MarkupHelper.createLabel("This is Test Logger1", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("This is Test Logger2", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("This is Test Logger3", ExtentColor.BLUE));		
		test.info(MarkupHelper.createLabel("This is Test Logger4", ExtentColor.BLUE));		
	}

	@AfterTest
	public void teraDown() { 
		
		extent.flush();
	}
	
}

