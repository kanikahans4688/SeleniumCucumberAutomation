$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "WordPress Homepage",
  "description": "",
  "id": "wordpress-homepage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "HomePage validation",
  "description": "",
  "id": "wordpress-homepage;homepage-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I want launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on userbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter the details \"\u003cuserid\u003e\" and \"\u003cmail\u003e\" and \"\u003cfirstname\u003e\" and\"\u003clastname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on add new user button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "wordpress-homepage;homepage-validation;",
  "rows": [
    {
      "cells": [
        "userid",
        "mail",
        "firstname",
        "lastname"
      ],
      "line": 12,
      "id": "wordpress-homepage;homepage-validation;;1"
    },
    {
      "cells": [
        "Tom",
        "tom79@xyz.com",
        "Tom",
        "Henry"
      ],
      "line": 13,
      "id": "wordpress-homepage;homepage-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "HomePage validation",
  "description": "",
  "id": "wordpress-homepage;homepage-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I want launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on userbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter the details \"Tom\" and \"tom79@xyz.com\" and \"Tom\" and\"Henry\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on add new user button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.i_want_launch_the_browser()"
});
formatter.result({
  "duration": 26094214000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.i_login()"
});
formatter.result({
  "duration": 3270157800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.i_click_on_userbutton()"
});
formatter.result({
  "duration": 7644763000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 21
    },
    {
      "val": "tom79@xyz.com",
      "offset": 31
    },
    {
      "val": "Tom",
      "offset": 51
    },
    {
      "val": "Henry",
      "offset": 60
    }
  ],
  "location": "HomePageTest.i_enter_the_details_and_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 11581232700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.i_click_on_add_new_user_button()"
});
formatter.result({
  "duration": 6610943900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.i_quit_the_browser()"
});
formatter.result({
  "duration": 1405379300,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Wordpress loginPage",
  "description": "",
  "id": "wordpress-loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify login with valid credentials",
  "description": "",
  "id": "wordpress-loginpage;verify-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I want to launch the browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Verify the homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.i_want_to_launch_the_browser_and_open_url()"
});
formatter.result({
  "duration": 10153165100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_verify_the_page_title()"
});
formatter.result({
  "duration": 48203200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_enter_username_and_password()"
});
formatter.result({
  "duration": 2409488300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.verify_the_homepage_title()"
});
formatter.result({
  "duration": 11642200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.i_close_the_browser()"
});
formatter.result({
  "duration": 779639900,
  "status": "passed"
});
});