package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/FreeCRM.feature",
                  glue={"stepDefinition"},
                  plugin= {"pretty:reports/pretty/pretty.txt",
                            "html:reports/html/report.html",
                            "json:reports/json/jsonreport.json",
                            "junit:cucumberreports/cucuber-junit-xml/junit.xml",
                   		    "usage:cucumberreports/cucumber-usage-report/usage.json"},
                            
                  dryRun=false,
                  monochrome=true
                  )
public class RunnerClass extends AbstractTestNGCucumberTests{

	
	
	
}
