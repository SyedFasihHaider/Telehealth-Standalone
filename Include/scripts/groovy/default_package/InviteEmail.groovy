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



class InviteEmail {
	/**
	 * Scenario: Invite via Email Pop- up Verification
	 */
	@When("the provider clicks on the Invite Option")
	def CLicks_on_InviteOption() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
	}

	@Then("the user will be able to select the Invite via Email option")
	def Selects_Invite_EmailOption() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_EmailInvite'))
	}

	@And("the user will be able to see the Invite Via Email Text and Email icon on the Pop-up")
	def Email_Pop_up() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_Invite_via_Email_Heading'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailIcon'), 0)
	}

	@And("the user will be able to see the Patient email address Heading and Patient Email address field")
	def Patient_Email_Add_Heading_and_Field() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailFieldHeading'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailField'), 0)
	}

	@And("the user will be able to see the Message Heading and Message body which includes the Template of the Email")
	def Message_heading_and_Message_Body() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailBody'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_MessageHeading'), 0)
	}

	/*@And("the user will be able to see the Choose language Heading and able to select other Language through drop down")
	 def Choose_Language() {
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ChooseLanguageHeading'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ChooseLanguageDropDown'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_SpanishLanguage'), 0)
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_EnglishLanguage'), 0)
	 }
	 @And("by default english will be selected as Language")
	 def ByDefault_English() {
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_ByDefaultLanguage'), 0)
	 }*/

	@And("the user will be able to see the Send Email Button")
	def Send_Email_Button() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_SendEmailButton'), 0)
	}

	@And("the user will be able to see the Cancel Button")
	def Cancel_Email_Button() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_CancelButton'), 0)
		WebUI.click(findTestObject('Object Repository/Regression/InviteEmail/Obj_CancelButton'))
	}

	/**
	 * Scenario: Invite via Email with valid Email Address
	 */

	@When("the user opens the Email invite option")
	def emails_inivte_option() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_EmailInvite'))
	}
	@And("the user enters the valid (.*) address")
	def user_enters_email(String Email) {

		WebUI.setText(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailField'),Email)
	}

	@And("the user clicks on the Send Email Button")
	def user_send_email() {
		WebUI.click(findTestObject('Object Repository/Regression/InviteEmail/Obj_SendEmailButton'))
	}

	@Then("the email will be sent to the respective email address")
	def email_sent() {
	}

	@And("there will be a Sucessful message will be shown on the top")
	def email_alert() {
		WebUI.verifyTextPresent('Email sent. Message status: Queued', false)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailAlert'), 0)
	}

	/**
	 * Scenario: Invite via email with invalid Email Address
	 */
	@When("the provider clicked on the on the invite option and open the Email Invite")
	def provider_opens_the_email_invite (){
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_EmailInvite'))
	}

	@And("the user enters the invalid (.*) address")
	def user_enters_emailAddress(String Email) {

		WebUI.setText(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailField'),Email)
	}

	@And("the system will analyse the email address")
	def system_analyse() {
	}

	@Then("the system will generate an error under the Email field")
	def email_invalid_format_error() {
		WebUI.click(findTestObject('Object Repository/Regression/InviteEmail/Obj_SendEmailButton'))
		WebUI.verifyTextPresent('Email format is not valid', false)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Regression/InviteEmail/Obj_CancelButton'))
	}

	/**
	 * Scenario:Invite via Email Template without Passcode
	 */

	@When("the user opens the Email invite")
	def email_invite_PopUp() {

		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_EmailInvite'))
	}
	@And("the user will see the Email Template in the Email Body")
	def email_body() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/InviteEmail/Obj_EmailBody'), 0)
	}
	@And("there will be no passcode in the Email Body")
	def no_passcode() {
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Regression/InviteEmail/Obj_CancelButton'))
	}

	/**
	 * Scenario:Invite via Email Template with Passcode
	 */
	/**@When("the user clicks on the Email Invite")
	 def invite_via_email_PopUp() {
	 WebUI.click(findTestObject('Object Repository/Regression/Home Page/Obj_Invite'))
	 WebUI.click(findTestObject('Object Repository/Regression/Home Page/Obj_EmailInvite'))
	 }
	 @And("the user will be able to see the Email Template")
	 def email_body_template() {
	 WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Invite Email/Obj_EmailBody'), 0)
	 }
	 @And("there will be a passcode in the Email Template")
	 def passcode_embeded() {
	 WebUI.verifyTextPresent('The passcode to enter the room is:', false)
	 WebUI.delay(1)
	 WebUI.click(findTestObject('Object Repository/Regression/Invite Email/Obj_CancelButton'))
	 }*/
}