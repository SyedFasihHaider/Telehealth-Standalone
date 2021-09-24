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



class HomePage {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("the user is on the Home page")
	def user_HomePage() {
	}

	@Then("the user will be able to Copy the Generic Link")
	def Copy_Link(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_Copy'), 0)
	}

	@And("the user will be able to Invite Via SMS and Email")
	def user_Inivite_Email_SMS() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_Invite'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_EmailInvite'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_SMSInvite'), 0)
	}

	@And("the user will be able to see the Group Call option on the Home page")
	def GroupCall_HomePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_StartGC'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_GroupCallTab'), 0)
		WebUI.takeFullPageScreenshot()
	}

	@And("the user will be able to see the Welcome Text and Provider Name on the Home Page")
	def welcome_text() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_WelcomeTag'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_UserName'), 0)
		WebUI.takeFullPageScreenshot()
	}

	@And("the user will be able to see the Persivia Telehealth Logo and Text")
	def Persivia_TH_Logo_Text() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_PersiviaLogo'), 0)
	}

	@And("the user will be able to see the Home Tab in the left menu")
	def Left_Menu_Home() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_HomeTab'), 0)
	}

	@And("the user will be able to see the Adminstration Tab in the left menu")
	def Left_Menu_Admin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'), 0)
	}

	@And("the user will be able to see the Logs under Adminstration Tab in the left menu")
	def Logs_Admin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/obj_Logs'), 0)
	}

	@And("the user will be able to see the Analytics under Adminstration Tab in the left menu")
	def Analytics_Admin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_Analytics'), 0)
	}

	/**@And("the user will be able to see the Settings under Adminstration Tab in the left menu")
	def Settings_Admin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_Settings'), 0)
	}*/

	@And("the user will be able to see the Patient Queue on the Home page")
	def Patient_Queue() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/HomePage/Obj_PatientQueue'), 0)
	}

	@And("the user will be able to see the Logout button on the Home Page")
	def Logout_TH() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/Logout/Obj_Logout'), 0)
		WebUI.delay(2)
		
	}
}