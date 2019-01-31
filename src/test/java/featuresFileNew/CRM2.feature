Feature: Login functionality of CRM application

#Feature : Feature defines the logical test functionality you will test in this feature file.
#Scenario: Each Feature will contain some number of tests to test the feature.Each test is called a Scenario
#Given Keyword :Precondition to the test
#When Keyword :Test Step Execution
#Then Keyword :Verification of the output with expected result
#And It is used to add conditions to your steps
#But It is used to add negative type comments.

Background:
Given launch browser initially 
When enter correct url       

@SanityTest
Scenario: verify login functionality
Then enter "praneethmanala" and "praneethmanala" 
Then close the browser

@RegressionTest
Scenario Outline: verify login function
Then enter "<userName>" and "<password>"
Then close the browser


Examples:
|userName|password|
|praneethmanalafirefox1|praneethmanala|
|praneethmanalafirefox2|praneethmanala|
