$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/CareSpace Regression/LoginCareSpace.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Items should be available on the Login Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user lands on the Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.lands_to_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see the Persivia Telehealth Logo",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Telehealth_Logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to Login into the Standalone Credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Login.standalone_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to Login via CareSpace",
  "keyword": "* "
});
formatter.match({
  "location": "Login.CareSpace_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigate_to_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.User_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user will nevigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_nevigate_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user will see the authentication message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "XYz@gmail.com",
        "Fasih"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_lands_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters XYz@gmail.com and Fasih",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_username_password_CareSpace(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.User_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user will see the authentication message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_see_authentication_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Clicks on the Cancel button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user clicks on the Login via Carespace button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clicks_LoginCareSpace()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "Login.credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Cancel button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.cancel_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will not be logged into the Telehealth",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.remains_on_CareSpaceLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be navigated back to the Main login page",
  "keyword": "And "
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "status": "passed"
});
});