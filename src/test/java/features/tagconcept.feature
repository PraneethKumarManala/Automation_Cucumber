@FunctionalTest
Feature: Free CRM Application testing

@smokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@RegressionTest
Scenario: Login with correct username and password
Given This is a invalid login test

@smokeTest
Scenario: Create a deal
Given This is a deal test case

@smokeTest @RegressionTest
Scenario: Create a tasks
Given This is a tasks test case

@smokeTest
Scenario: verify left panel links
Given click on left panel links

@smokeTest @End2End
Scenario: Search a deal
Given This is search deal test

@smokeTest
Scenario: Search a case
Given This is search case test

@RegressionTest
Scenario: Search a task
Given This is search task test

@RegressionTest @End2End
Scenario: Search a cases
Given This is search cases test

@RegressionTest
Scenario: Search a call
Given This is search call test

@End2End
Scenario: Search a email
Given This is search email test

@End2End
Scenario: validate a report
Given report validation

@smokeTest @RegressionTest
Scenario: logout test
Given close the browser


Scenario: close test
Given quit the browser



