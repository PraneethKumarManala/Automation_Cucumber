Feature: Verify CRM application login

Scenario Outline:: Verifing CRM login
Given select "<browser>" enter valid url
When enter "<userName>" and "<Password>"
Then click on Signin button
Then close the browser
Examples:
|browser|userName|Password|
|chrome|praneeth|praneeth|
|firefox|praneeth|praneeth|
