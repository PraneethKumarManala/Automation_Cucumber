Feature: Login CRM Application

Scenario Outline: login in CRM application by entering username and password
Given specify "<location>" and launch "<browser>" and "<url>"
When enter "<username>" and "<password>"
Then click on login button
Then verify Title of the home page
Then close the browser
Examples:
 |location|browser|url|username|password|
 |local|firefox|https://www.freecrm.com/index.html|praneethmanala|praneethmanala|
 |local|chrome|https://www.freecrm.com/index.html|praneethmanala|praneethmanala|

