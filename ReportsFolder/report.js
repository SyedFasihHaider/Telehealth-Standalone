$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/CareSpace Regression/InviteEmail.feature");
formatter.feature({
  "name": "Invite Email",
  "description": "  Given the user is on the Telehealth Home Page",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Invite via Email Pop- up Verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the provider clicks on the Invite Option",
  "keyword": "When "
});
formatter.match({
  "location": "InviteEmail.CLicks_on_InviteOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to select the Invite via Email option",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteEmail.Selects_Invite_EmailOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Invite Via Email Text and Email icon on the Pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.Email_Pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Patient email address Heading and Patient Email address field",
  "keyword": "* "
});
formatter.match({
  "location": "InviteEmail.Patient_Email_Add_Heading_and_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Message Heading and Message body which includes the Template of the Email",
  "keyword": "* "
});
formatter.match({
  "location": "InviteEmail.Message_heading_and_Message_Body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Send Email Button",
  "keyword": "* "
});
formatter.match({
  "location": "InviteEmail.Send_Email_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Cancel Button",
  "keyword": "* "
});
formatter.match({
  "location": "InviteEmail.Cancel_Email_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invite via Email with valid Email Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user opens the Email invite option",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters the valid \u003cEmail\u003e address",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the Send Email Button",
  "keyword": "And "
});
formatter.step({
  "name": "the email will be sent to the respective email address",
  "keyword": "Then "
});
formatter.step({
  "name": "there will be a Sucessful message will be shown on the top",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email"
      ]
    },
    {
      "cells": [
        "fasih.haider@sltn.net"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invite via Email with valid Email Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user opens the Email invite option",
  "keyword": "When "
});
formatter.match({
  "location": "InviteEmail.emails_inivte_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the valid fasih.haider@sltn.net address",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.user_enters_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Send Email Button",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.user_send_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email will be sent to the respective email address",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteEmail.email_sent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there will be a Sucessful message will be shown on the top",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.email_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invite via email with invalid Email Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the provider clicked on the on the invite option and open the Email Invite",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters the invalid \u003cEmail\u003e address",
  "keyword": "And "
});
formatter.step({
  "name": "the system will analyse the email address",
  "keyword": "And "
});
formatter.step({
  "name": "the system will generate an error under the Email field",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email"
      ]
    },
    {
      "cells": [
        "abc.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invite via email with invalid Email Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the provider clicked on the on the invite option and open the Email Invite",
  "keyword": "When "
});
formatter.match({
  "location": "InviteEmail.provider_opens_the_email_invite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the invalid abc.com address",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.user_enters_emailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system will analyse the email address",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.system_analyse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system will generate an error under the Email field",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteEmail.email_invalid_format_error()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invite via Email Template without Passcode",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user opens the Email invite",
  "keyword": "When "
});
formatter.match({
  "location": "InviteEmail.email_invite_PopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will see the Email Template in the Email Body",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.email_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there will be no passcode in the Email Body",
  "keyword": "And "
});
formatter.match({
  "location": "InviteEmail.no_passcode()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});