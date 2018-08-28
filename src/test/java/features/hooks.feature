Feature: Free CRM app test

Scenario: Free CRM create deal test
Given user is an deal page
When user fills the deal form
Then deal is created


Scenario: Free CRM create deal test
Given user is an deal page
When user fills the deal form
Then deal is created


Scenario Outline:: Free CRM create deal test
Given user is an deal page
When user fills the deal form
Then deal is created
 Examples: 
  |mail1|
  |mail2|
  |mail3|