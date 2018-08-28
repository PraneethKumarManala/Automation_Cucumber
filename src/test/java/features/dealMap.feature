Feature: Deal data creation

Scenario: lgoin CRM create a new deal scenario
Given User is already in login page
When Title of login page is FreeCRM
Then user enters username and password
|username      |password      |
|praneethmanala|praneethmanala|
Then user clicks on Login button
Then user is an home page
Then moves to new deal page
Then user enters deal details 
|title|amount| probobility|commission |
|Test Deal3| 1000 | 50 | 10 |
|Test Deal4| 2000 | 60 | 20 |
Then close the browser