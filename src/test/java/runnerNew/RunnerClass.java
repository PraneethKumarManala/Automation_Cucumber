package runnerNew;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresFileNew/CRM2.feature",
                  glue= {"stepDefinationNew"}, //Path of step Defination
                  dryRun=false,     //shows the missig steps if we put dryRun=true
                  monochrome=true,  //Display the console output in readable formate
                 // strict=true,      //It throws error if any step defination is missed
                  plugin={"json:jsonReport/json.json",
                		   "pretty:prettyReport.txt",
                		   "html:htmlReport.html",
                		   "junit:junitReport.xml"}
                 )
public class RunnerClass {

}
