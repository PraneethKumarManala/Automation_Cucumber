package com.automation.accelerators;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ActionDrivers extends Base{/*

	public static ExtentReports reporter;
	public static Map<Long, String> threadToExtentTestMap = new HashMap<Long, String>();
	public static Map<String, ExtentTest> nameToTestMap = new HashMap<String, ExtentTest>();
	
	public synchronized static ExtentTest getTest() {
		Long threadID = Thread.currentThread().getId();

		if (threadToExtentTestMap.containsKey(threadID)) {
			String testName = threadToExtentTestMap.get(threadID);
			return nameToTestMap.get(testName);
		}	
		//system log, this shouldnt happen but in this crazy times if it did happen log it.
		return null;
	}
	
	
	public static String captureScreenShot(String fileName) throws IOException {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File(fileName));
		
		System.out.println("Screen Shot Taken");
		
		return fileName;
	}
	
	int num=1;
	public void takeScreenShotForPass(String PositinName ,ExtentTest logger) throws IOException {
		
		num++;
		String screenShotFullName=PositinName+"_"+num+Base.timeStamp+".png";
		captureScreenShot(System.getProperty("user.dir")+"/"+Base.filepath()+screenShotFullName);
		//logger.log(LogStatus.INFO, logger.addScreenCapture(screenShotFullName));
		num++;
	}
	
*/}
