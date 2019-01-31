$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRM.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality of CRM application",
  "description": "",
  "id": "login-functionality-of-crm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "verify login function",
  "description": "",
  "id": "login-functionality-of-crm-application;verify-login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "launch browser initially1",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter correct url1",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter1 \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close1 the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-functionality-of-crm-application;verify-login-function;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 11,
      "id": "login-functionality-of-crm-application;verify-login-function;;1"
    },
    {
      "cells": [
        "praneethmanalachrome",
        "praneethmanalachrome"
      ],
      "line": 12,
      "id": "login-functionality-of-crm-application;verify-login-function;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6403527814,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify login function",
  "description": "",
  "id": "login-functionality-of-crm-application;verify-login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "launch browser initially1",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter correct url1",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter1 \"praneethmanalachrome\" and \"praneethmanalachrome\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close1 the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginCRM.launch_browser_initially1()"
});
formatter.result({
  "duration": 248225503,
  "status": "passed"
});
formatter.match({
  "location": "LoginCRM.enter_correct_url1()"
});
formatter.result({
  "duration": 13984326460,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "praneethmanalachrome",
      "offset": 8
    },
    {
      "val": "praneethmanalachrome",
      "offset": 35
    }
  ],
  "location": "LoginCRM.enter1_and(String,String)"
});
formatter.result({
  "duration": 5794741214,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 2060534879,
  "status": "passed"
});
formatter.uri("CRM2.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality of CRM application",
  "description": "",
  "id": "login-functionality-of-crm-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5759704101,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#Feature : Feature defines the logical test functionality you will test in this feature file."
    },
    {
      "line": 4,
      "value": "#Scenario: Each Feature will contain some number of tests to test the feature.Each test is called a Scenario"
    },
    {
      "line": 5,
      "value": "#Given Keyword :Precondition to the test"
    },
    {
      "line": 6,
      "value": "#When Keyword :Test Step Execution"
    },
    {
      "line": 7,
      "value": "#Then Keyword :Verification of the output with expected result"
    },
    {
      "line": 8,
      "value": "#And It is used to add conditions to your steps"
    },
    {
      "line": 9,
      "value": "#But It is used to add negative type comments."
    }
  ],
  "line": 11,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 12,
  "name": "launch browser initially",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enter correct url",
  "keyword": "When "
});
formatter.match({
  "location": "LoginCRM2.launch_browser_initially()"
});
