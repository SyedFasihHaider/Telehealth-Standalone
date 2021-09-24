$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/CareSpace Regression/HomePage.feature");
formatter.feature({
  "name": "Home Page",
  "description": "Given the user is on the Telehealth Login Page",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Provider directed to the Home Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Home page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.user_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to Copy the Generic Link",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.Copy_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to Invite Via SMS and Email",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.user_Inivite_Email_SMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Group Call option on the Home page",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.GroupCall_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Welcome Text and Provider Name on the Home Page",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.welcome_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Persivia Telehealth Logo and Text",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Persivia_TH_Logo_Text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Home Tab in the left menu",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Left_Menu_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Adminstration Tab in the left menu",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Left_Menu_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Logs under Adminstration Tab in the left menu",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Logs_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Analytics under Adminstration Tab in the left menu",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Analytics_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Patient Queue on the Home page",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Patient_Queue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Logout button on the Home Page",
  "keyword": "* "
});
formatter.match({
  "location": "HomePage.Logout_TH()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});