Feature: Login functionality of CRM application


Scenario Outline: verify login function
Given launch browser initially1
When enter correct url1 
Then enter1 "<userName>" and "<password>"
Then close1 the browser

Examples:
|userName|password|
|praneethmanalachrome|praneethmanalachrome|