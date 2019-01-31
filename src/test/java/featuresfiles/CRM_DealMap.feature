Feature: Verify CRM application login

Scenario: Verifing CRM login
Given enter valid url
When enter userName and Password
|username|password|
|praneeth|praneeth|
Then click on Signin button
Then close the browser