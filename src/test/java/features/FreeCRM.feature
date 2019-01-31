Feature: Login Free CRM Application and verify home page title
Scenario: Login Free CRM Application
Given specify location and launch browser and url
|location|browser|url|
|local|chrome|https://www.freecrm.com/index.html|
|local|firefox|https://www.freecrm.com/index.html|
When enter username and password
|username|password|
|praneethmanala|praneethmanala|
Then click on login button
Then verify Title of the home page
Then close the browser