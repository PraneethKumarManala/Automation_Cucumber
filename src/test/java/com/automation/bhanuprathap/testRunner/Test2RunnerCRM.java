package com.automation.bhanuprathap.testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

// Ctrl+Shift+O To import all the packages
/*
 * 1.CucumberOptions: are like property file or settings for your test
 * 2.By Junit :@RunWith(Cucumber.class) 
 * 3. Run all selected feature files 
 *    @CucumberOptions(features= {"/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresFileNew/CRM.feature","/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresFileNew/CRM2.feature"},
 * 
 * 
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features= "/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresFileNew/CRM2.feature",
glue= {"stepDefinationNew"}, //Path of step Defination
dryRun=false,     //shows the missig steps if we put dryRun=true
monochrome=true,  //Display the console output in readable formate
// strict=true,      //It throws error if any step defination is missed
plugin={"json:jsonReport/json.json",
		   "pretty:prettyReport.txt",
		   "html:htmlReport.html",
		   "junit:junitReport.xml",
		   "rerun:rerunReport.txt"}
//tags= {"@SanityTest"}
)
public class Test2RunnerCRM extends AbstractTestNGCucumberTests{

	//By using TestNG
	/*private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass() {
		
		testNGCucumberRunner= new TestNGCucumberRunner(this.getClass());
		
	}
	
	@Test(dataProvider="featuresFileNew")
	public void feature(CucumberFeatureWrapper cucumberfeature) {
		
		testNGCucumberRunner.runCucumber(cucumberfeature.getCucumberFeature());
		
	}
	@DataProvider
	public Object[][] featuresFileNew(){ 
		
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun=true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}*/
}
