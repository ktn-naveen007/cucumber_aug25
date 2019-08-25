$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddUser.feature");
formatter.feature({
  "line": 1,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "enter valid user name and password",
  "description": "",
  "id": "login-to-application;enter-valid-user-name-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cURL\u003e\" to invoke application",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify i am on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter valid \"\u003cusername\u003e\" username",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter valid \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify landing page is adduser page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on adduser link",
  "keyword": "When "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-to-application;enter-valid-user-name-and-password;",
  "rows": [
    {
      "cells": [
        "browser",
        "URL",
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-to-application;enter-valid-user-name-and-password;;1"
    },
    {
      "cells": [
        "Chrome",
        "http://yp1007034lt/yash-test/",
        "naveen@gmail.com",
        "yash1234"
      ],
      "line": 18,
      "id": "login-to-application;enter-valid-user-name-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "enter valid user name and password",
  "description": "",
  "id": "login-to-application;enter-valid-user-name-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"http://yp1007034lt/yash-test/\" to invoke application",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify i am on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter valid \"naveen@gmail.com\" username",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter valid \"yash1234\" password",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify landing page is adduser page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on adduser link",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    }
  ],
  "location": "LoginSteps.i_open(String)"
});
formatter.result({
  "duration": 3177395190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://yp1007034lt/yash-test/",
      "offset": 15
    }
  ],
  "location": "LoginSteps.i_enter_valid_to_invoke_application(String)"
});
formatter.result({
  "duration": 1327511702,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_verify_i_am_on_login_page()"
});
formatter.result({
  "duration": 27556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveen@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.i_enter_valid_username(String)"
});
formatter.result({
  "duration": 175495633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yash1234",
      "offset": 15
    }
  ],
  "location": "LoginSteps.i_enter_valid_password(String)"
});
formatter.result({
  "duration": 81461370,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "duration": 489027328,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_verify_landing_page_is_adduser_page()"
});
formatter.result({
  "duration": 15551118,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_adduser_link()"
});
formatter.result({
  "duration": 6149003177,
  "status": "passed"
});
formatter.after({
  "duration": 356889,
  "status": "passed"
});
});