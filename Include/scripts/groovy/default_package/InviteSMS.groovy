package default_package
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class InviteSMS {
	/**
	 * Scenario: Invite via SMS Pop- up Verification
	 */
	@When("the user clicks on the Invite Option")
	def user_CLicks_on_InviteOption_HomePage() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
	}

	@Then("the user will be able to select the Invite via SMS option")
	def Selects_Invite_SMSOption() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'))
	}

	@And("the user will be able to see the Invite Via SMS Text and SMS icon on the Pop-up")
	def SMS_Pop_up() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_Invite_Via_SMS_Heading'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_SMSIcon'), 0)
	}

	@And("the user will be able to see the Patient Mobile Number Heading and Patient Mobile Number field")
	def Patient_Mobile_Number_Heading_and_Field() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_PatientPhoneNumberHeading'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_SMSNumberField'), 0)
	}

	@And("the user will be able to see the Message Heading and Message body which includes the Template of the SMS")
	def Message_heading_and_Message_Body_HomePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailBody'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_MessageHeading'), 0)
	}

	/*@And("the user will be able to see the Choose language Heading and able to select other Language through drop down")
	 def Choose_Language_SMSInvite() {
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ChooseLanguageHeading'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ChooseLanguageDropDown'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_SpanishLanguage'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_EnglishLanguage'), 0)
	 }
	 @And("by default english will be selected as Language")
	 def ByDefault_English_SMS() {
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ByDefaultLanguage'), 0)
	 }*/

	@And("the user will be able to see the Send SMS Button")
	def Send_SMS_Button() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_SendSMS'), 0)
	}

	@And("the user will be able to see the Cancel Button to close the SMS Pop-Up")
	def Cancel_SMS_Button() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_CancelButton'), 0)
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_CancelButton'))
	}

	/**
	 * Scenario: Invite via SMS with valid Mobile Number
	 */

	@When("the user opens the SMS invite option")
	def SMS_inivte_option() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'))
	}
	@And("the user enters the valid mobile (.*)")
	def user_enters_MobileNumber(String Number) {
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Regression/InviteSMS/Obj_SMSNumberField'),Number)
	}

	@And("the user clicks on the Send SMS Button")
	def user_send_SMS() {
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_SendSMS'))
		
	}

	@Then("the SMS will be sent to the respective mobile number")
	def SMS_sent() {
		WebUI.delay(2)
	}

	@And("there will be a Sucessful message will be shown on the top After send button is pressed")
	def SMS_alert() {
		
		WebUI.verifyTextPresent('SMS sent. Message status: Queued', false)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteSMS/Obj_SMSAlert'), 0)
		WebUI.delay(1)
	}

	/**
	 * Scenario: Invite via SMS with invalid Mobile Number
	 */
	@When("the provider clicked on the on the invite option and open the SMS Invite")
	def provider_opens_the_SMS_invite (){
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'))
	}

	@And("the user enters the invalid mobile (.*)")
	def user_enters_SMSMobileNumber(String Number) {

		WebUI.setText(findTestObject('Object Repository/Regression/InviteSMS/Obj_SMSNumberField'),Number)
	}

	@And("the system will analyse the mobile number")
	def system_analyse_Number() {
	}

	@Then("the system will generate an error under the Mobile Number field")
	def SMS_invalid_format_error() {
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_SendSMS'))
		WebUI.verifyTextPresent('Phone number format is not valid', false)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_CancelButton'))
	}

	/**
	 * Scenario:Invite via SMS Template without Passcode
	 */

	@When("the user opens the SMS invite")
	def SMS_invite_PopUp() {

		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'))
	}
	@And("the user will see the SMS Template in the SMS Body")
	def SMS_body() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailBody'), 0)
	}
	@And("there will be no passcode in the SMS Body")
	def no_passcode_SMS() {
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_CancelButton'))
	}

	/**
	 * Scenario:Invite via SMS Template with Passcode
	 */
	/**@When("the user clicks on the SMS Invite")
	def invite_via_sms_PopUp() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'))
	}
	@And("the user will be able to see the SMS Template")
	def sms_body_template() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailBody'), 0)
	}

	@And("there will be a passcode in the SMS Template")
	def passcode_embeded_SMS() {
		WebUI.verifyTextPresent('The passcode to enter the room is:', false)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Regression/InviteSMS/Obj_CancelButton'))
	}*/
}