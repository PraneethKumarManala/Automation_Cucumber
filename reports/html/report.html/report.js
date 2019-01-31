$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Login Free CRM Application and verify home page title",
  "description": "",
  "id": "login-free-crm-application-and-verify-home-page-title",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Free CRM Application",
  "description": "",
  "id": "login-free-crm-application-and-verify-home-page-title;login-free-crm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "specify location and launch browser and url",
  "rows": [
    {
      "cells": [
        "location",
        "browser",
        "url"
      ],
      "line": 4
    },
    {
      "cells": [
        "local",
        "chrome",
        "https://www.freecrm.com/index.html"
      ],
      "line": 5
    },
    {
      "cells": [
        "local",
        "firefox",
        "https://www.freecrm.com/index.html"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "praneethmanala",
        "praneethmanala"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify Title of the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRM_Login.specify_location_and_launch_browser_and_url(DataTable)"
});
formatter.result({
  "duration": 86719968838,
  "error_message": "org.openqa.selenium.NoSuchSessionException: \nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027PMANALA\u0027, ip: \u0027192.168.2.182\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: WebDriverError@chrome://marionette/content/error.js:227:5\nInvalidSessionIDError@chrome://marionette/content/error.js:382:5\nassert.that/\u003c@chrome://marionette/content/assert.js:383:13\nassert.session@chrome://marionette/content/assert.js:49:3\nexecute/req\u003c@chrome://marionette/content/server.js:536:9\nTaskImpl_run@resource://gre/modules/Task.jsm:331:42\nTaskImpl@resource://gre/modules/Task.jsm:280:3\nasyncFunction@resource://gre/modules/Task.jsm:252:14\nTask_spawn@resource://gre/modules/Task.jsm:166:12\nexecute@chrome://marionette/content/server.js:529:15\nonPacket@chrome://marionette/content/server.js:500:7\n_onJSONObjectReady/\u003c@chrome://marionette/content/transport.js:501:9\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:122)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:125)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:103)\r\n\tat stepDefinition.FreeCRM_Login.specify_location_and_launch_browser_and_url(FreeCRM_Login.java:37)\r\n\tat ✽.Given specify location and launch browser and url(/Users/pmanala/workspace_New/automationCucumber/src/test/java/features/FreeCRM.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FreeCRM_Login.enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCRM_Login.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCRM_Login.verify_Title_of_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCRM_Login.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});