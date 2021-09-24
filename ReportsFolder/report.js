$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/CareSpace Regression/InviteSMS.feature");
formatter.feature({
  "name": "Invite SMS",
  "description": "  Given the user is on the Telehealth Home Page",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Invite via SMS Pop- up Verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Invite Option",
  "keyword": "When "
});
formatter.match({
  "location": "InviteSMS.user_CLicks_on_InviteOption_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to select the Invite via SMS option",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteSMS.Selects_Invite_SMSOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Invite Via SMS Text and SMS icon on the Pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.SMS_Pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Patient Mobile Number Heading and Patient Mobile Number field",
  "keyword": "* "
});
formatter.match({
  "location": "InviteSMS.Patient_Mobile_Number_Heading_and_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Message Heading and Message body which includes the Template of the SMS",
  "keyword": "* "
});
formatter.match({
  "location": "InviteSMS.Message_heading_and_Message_Body_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Send SMS Button",
  "keyword": "* "
});
formatter.match({
  "location": "InviteSMS.Send_SMS_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will be able to see the Cancel Button to close the SMS Pop-Up",
  "keyword": "* "
});
formatter.match({
  "location": "InviteSMS.Cancel_SMS_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invite via SMS with valid Mobile Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user opens the SMS invite option",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters the valid mobile \u003cNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the Send SMS Button",
  "keyword": "And "
});
formatter.step({
  "name": "the SMS will be sent to the respective mobile number",
  "keyword": "Then "
});
formatter.step({
  "name": "there will be a Sucessful message will be shown on the top After send button is pressed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Number"
      ]
    },
    {
      "cells": [
        "+1 9294154089"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invite via SMS with valid Mobile Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user opens the SMS invite option",
  "keyword": "When "
});
formatter.match({
  "location": "InviteSMS.SMS_inivte_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the valid mobile +1 9294154089",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.user_enters_MobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Send SMS Button",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.user_send_SMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the SMS will be sent to the respective mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteSMS.SMS_sent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there will be a Sucessful message will be shown on the top After send button is pressed",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.SMS_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invite via SMS with invalid Mobile Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the provider clicked on the on the invite option and open the SMS Invite",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters the invalid mobile \u003cNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the system will analyse the mobile number",
  "keyword": "And "
});
formatter.step({
  "name": "the system will generate an error under the Mobile Number field",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Number"
      ]
    },
    {
      "cells": [
        "+1 929415"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invite via SMS with invalid Mobile Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the provider clicked on the on the invite option and open the SMS Invite",
  "keyword": "When "
});
formatter.match({
  "location": "InviteSMS.provider_opens_the_SMS_invite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the invalid mobile +1 929415",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.user_enters_SMSMobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system will analyse the mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.system_analyse_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system will generate an error under the Mobile Number field",
  "keyword": "Then "
});
formatter.match({
  "location": "InviteSMS.SMS_invalid_format_error()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invite via SMS Template without Passcode",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user opens the SMS invite",
  "keyword": "When "
});
formatter.match({
  "location": "InviteSMS.SMS_invite_PopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user will see the SMS Template in the SMS Body",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.SMS_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there will be no passcode in the SMS Body",
  "keyword": "And "
});
formatter.match({
  "location": "InviteSMS.no_passcode_SMS()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});