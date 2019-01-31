Feature: Verify CRM application login

@SanityTest
Scenario: Verifing CRM login
Given enter valid url
|browser|
|chrome|
When enter userName and Password
|username|password|
|praneeth|praneeth|
Then click on Signin button
Then close the browser

@RegressionTest
Scenario: Verifing CRM login
Given enter valid url
|browser|
|firefox|
When enter userName and Password
|username|password|
|praneethmanala|praneethmanala|
Then click on Signin button
Then close the browser

@SanityTest @RegressionTest
Scenario: Verifing CRM login
Given enter valid url
|browser|
|chrome|
When enter userName and Password
|username|password|
|praneeth|praneeth|
Then click on Signin button
Then close the browser