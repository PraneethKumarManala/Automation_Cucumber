package com.automation.bhanuprathap.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresFileNew/MakeMyTripDocString.feature",
                 dryRun=true,
                 monochrome=true,
                 glue= {"stepDefinationNew"})
public class DocStringCheck extends AbstractTestNGCucumberTests{

	
}
