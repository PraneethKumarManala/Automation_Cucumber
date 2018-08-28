$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/dealMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "lgoin CRM create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;lgoin-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "praneethmanala",
        "praneethmanala"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is an home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probobility",
        "commission"
      ],
      "line": 13
    },
    {
      "cells": [
        "Test Deal3",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test Deal4",
        "2000",
        "60",
        "20"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination_PageObjectModel.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 26281211310,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.title_of_login_page_is_FreeCRM()"
});
formatter.result({
  "duration": 101217909,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027PMANALA\u0027, ip: \u0027192.168.2.161\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\pmanala\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: c1b34c804c7536abb464362ece32c1d5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:280)\r\n\tat com.automation.accelerators.Base.compareTitle(Base.java:79)\r\n\tat stepDefinition.StepDefination_PageObjectModel.title_of_login_page_is_FreeCRM(StepDefination_PageObjectModel.java:37)\r\n\tat ✽.When Title of login page is FreeCRM(/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/dealMap.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.user_is_an_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.moves_to_new_deal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.user_enters_deal_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_PageObjectModel.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});