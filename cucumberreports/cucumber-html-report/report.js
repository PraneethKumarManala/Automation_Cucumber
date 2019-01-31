$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/pmanala/workspace_New/automationCucumber/src/test/java/featuresfiles/CRM.feature");
formatter.feature({
  "line": 1,
  "name": "Verify CRM application login",
  "description": "",
  "id": "verify-crm-application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verifing CRM login",
  "description": "",
  "id": "verify-crm-application-login;verifing-crm-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "enter valid url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter userName and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CRM.enter_valid_url()"
});
formatter.result({
  "duration": 20562743439,
  "status": "passed"
});
formatter.match({
  "location": "CRM.enter_userName_and_Password()"
});
formatter.result({
  "duration": 2688536036,
  "status": "passed"
});
formatter.match({
  "location": "CRM.click_on_Signin_button()"
});
formatter.result({
  "duration": 5082354496,
  "status": "passed"
});
formatter.match({
  "location": "CRM.close_the_browser()"
});
formatter.result({
  "duration": 631625189,
  "status": "passed"
});
});