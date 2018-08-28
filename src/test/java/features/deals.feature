Feature: Deal data creation

Scenario: lgoin CRM create a new deal scenario
Given User is already in login page
When Title of login page is FreeCRM
Then user enters username and password
|praneethmanala|praneethmanala|
Then user clicks on Login button
Then user is an home page
Then moves to new deal page
Then user enters deal details 
|Test Deal| 1000 | 50 | 10 |
Then close the browser