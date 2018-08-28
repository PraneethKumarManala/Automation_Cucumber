Feature: Free CRM login feature

Scenario Outline: lgoin CRM Test Scenario

Given User is already in login page
When Title of login page is FreeCRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then close the browser

Examples:
          | username            | password        |
          | praneethmanala      | praneethmanala  |
          | praneethmanala      | praneethmanala  |
          | praneethmanala      | praneethmanala  |
          | praneethmanala1     | praneethmanala1  |

#*******************************************************
#1.Without using Examples Keyword
#Scenario: lgoin CRM Test Scenario

#Given User is already in login page
#When Title of login page is FreeCRM
#Then user enters "praneethmanala" and "Praneeth@123"
#Then user clicks on Login button
#******************************************************



