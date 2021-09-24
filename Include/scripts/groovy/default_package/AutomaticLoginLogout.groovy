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


import cucumber.api.java.Before
import cucumber.api.java.After



class AutomaticLoginLogout {
	/**
	 * The step definitions below used to Login Automatically into the Telehealth Standalone
	 */
	@Before()
	public void Login () {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.URL)
		WebUI.click(findTestObject('Object Repository/Regression/LoginPage/Obj_LoginWithCareSpace'))
		WebUI.setText(findTestObject('Object Repository/Regression/CareSpaceLogin/Obj_Email'),GlobalVariable.Username)
		WebUI.setText(findTestObject('Object Repository/Regression/CareSpaceLogin/Obj_Password'),GlobalVariable.Password)
		WebUI.click(findTestObject('Object Repository/Regression/CareSpaceLogin/Obj_Submit'))
	}

	/**
	 * The step definitions below used to Logout from Telehealth after every Scenario
	 */

	@After()
	public void Logout () {
		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Logout'))
		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Yes'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}