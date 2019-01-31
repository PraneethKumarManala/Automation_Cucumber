package com.automation.extentReports;

import org.testng.ITestResult;
import org.testng.SkipException;
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
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class ExtentReporterDemo {

	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;  
	
	
	@BeforeTest
	public void startReport() {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/MyOwnReports/MyOwnReport.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    extent.setSystemInfo("OS", "Windows7");
	    extent.setSystemInfo("HostName", "PraneethManala");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("UserName", "PraneethManala");
	    
	    htmlReporter.config().setDocumentTitle("AutomationTesting.in demo reports");
	    htmlReporter.config().setReportName("My Own Report");
	    htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM); //htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlReporter.config().setTheme(Theme.STANDARD); //htmlReporter.config().setTheme(Theme.DARK);
			
	}
	@Test
	public void demoTestPass() {
		
		test = extent.createTest("demoTestPass","This Test will demonstrate the PASS test case");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void demoTestFail() {
		
		test = extent.createTest("demoTestFail","This Test will demonstrate the FAIL test case");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void demoTestSkip() {
		
		test = extent.createTest("demoTestSkip","This Test will demonstrate the SKIP test case");
		throw new SkipException("This test case is not ready for execution");
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" : Test case FAILED due to below reasons" , ExtentColor.RED));
			test.fail(result.getThrowable());
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() +" : Test case PASSED due to below reasons" , ExtentColor.GREEN));
			
		}
		
		else {
			
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() +" : Test case SKIPPED due to below reasons" , ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
		/*
		
		 */
		
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
		extent.flush();
		
	}
	
	
}
 