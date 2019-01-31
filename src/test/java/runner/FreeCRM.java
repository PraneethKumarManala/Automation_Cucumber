package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresfiles/CRM.feature",
                 glue= {"stepDefinitions"},
                 plugin= {"pretty:CRMReports/pretty/prettyreport.txt",
              		   "json:CRMReports/json/jsonreport.json",
              		   "junit:CRMReports/junit/junitreport.xml",
              		   "usage:CRMReports/usage/usagereport.json",
              		   "html:CRMReports/html/htmlreport.html",
              		   "rerun:CRMReports/rerun/rerunreport.txt"},
                 dryRun=false,
                 monochrome=true)
public class FreeCRM {

	 //OR   tags= ={"@SanityTest,@RegressionTest"} -- Executes  SanityTest Scenarios and RegressionTest Scenarios inividually
	 //And  tags= ={"@SanityTest","@RegressionTest"}-- Executes the test cases having both SanityTest and RegressionTest tags
	//Not   tags= ={"~@SanityTest,@RegressionTest"} -- Not executes SanityTests tag
	
	//Hooks --> Defines the precondition-->@Before and postcondition-->@After
}
