package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// http://github.com/damianszczepanik/cucumber-reporting/
//@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresfiles/CRM.feature" ,
                 glue= {"stepDefinitions"},
                 plugin= {"pretty:target/cucumber-pretty.txt",
                		 "html:cucumberreports/cucumber-html-report" ,
                		 "json:cucumberreports/cucumber-json-report/cucumber.json",
                		 "junit:cucumberreports/cucuber-junit-xml/junit.xml",
                		 "usage:cucumberreports/cucumber-usage-report/usage.json"},
                 dryRun=false,
                 monochrome=true,
                 strict=true
                )
public class TestRunnerUsingTestNG extends AbstractTestNGCucumberTests{
	
	
}
