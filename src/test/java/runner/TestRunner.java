package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



/* BDD=> Behavior driven development(Extension of TDD)== TDD+Incremental Requirement Analysis
 * CucumberOptions
 * Use in TestRunner
 * ******************
 * 1.features ===> we have to give Where exactly the .feature file is.(The path of the feature file)
 * 2.glue ====> We have to give the Step definition path (The path of the Step Definition )
 * 3.format ====>reports html/json/xml{"pretty","html:test-output" ,"json:json-output/cucumber.json","junit:junit_xml/junit.xml"}
 * 4.dryRun
 *   if dryRun=true ===> It will show in console if any steps are missed between StepDefinition and .feature file 
 *                     (first we put dryRun=true and then execute )
 *   if dryRn=false ====> It will execute all steps one by one   
 * 5.monochrome===> Display the console output in a proper readable format
 * 6.strict===> if strict=true ==> it will check if any steps are not defined inside the step definition file  
 * 
 * Use in Step Definition file
 * ******************************
 * 7.tags==>used in feature file
 *   OR==> Represented by ","(camma)==> tags= {"@RegressionTest,@smokeTest"})=={"@RegressionTest OR @smokeTest"})
 *   AND==>tags= {"@RegressionTest","@smokeTest"})=={"@RegressionTest AND @smokeTest"})
 *   Ignoring Test Cases==> use "~" symbol ===>  tags= {"~@smokeTest","@End2End"}) ==> it will execute only End2End Tests and ignoring smokeTests
 * 
 * *******************************
 * 8.Hooks:
 *   1.@Before`
 *   2.@After
 * 
 * 9.TagedHooks ==> if we want to execute some code only for particular scenario
 *   *********
 * 
 * */
/*@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/tagedHooks.feature" ,
                 glue= {"stepDefinition"},
                 format= {"pretty","html:test-output" ,"json:json-output/cucumber.json","junit:junit_xml/junit.xml"},
                 dryRun=false,
                 monochrome=true,
                 strict=true,
                 tags= {"~@smokeTest","~@End2End","~@RegressionTest"})

public class TestRunner {
	
}*/

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/dealMap.feature" ,
                 glue= {"stepDefinition"},
                 plugin= {"pretty:target/cucumber-pretty.txt",
                		 "html:target/cucumber-html-report" ,
                		 "json:target/cucumber-json-report/cucumber.json",
                		 "junit:target/cucuber-junit-xml/junit.xml",
                		 "usage:target/cucumber-usage-report/usage.json"},
                 dryRun=false,
                 monochrome=true,
                 strict=true
                )

public class TestRunner {

	
	
	
}
