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



class CallLogs {
	/**
	 * User Clicks on the Logs under the Administration Tab
	 */

	@When("the user clicks on the Adminstration Panel")
	def clicks_On_Administration() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
	}

	@And("the user clicks on the Logs options")
	def Clicks_on_Logs() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}

	@Then("the user will be lands on the Call page")
	def lands_onCallLogs() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallLogsPage'), 0)
	}

	/**
	 * Default Logs Page under the Logs sections
	 */

	@When("the user lands on the Logs section")
	def user_landsOn() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}

	@Then("the user will see the Default Calls Logs Page")
	def default_LogsCallLogs() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallLogsPage'), 0)
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Regression/CallLogs/Obj_CallLogsPage'))
		WebUI.takeFullPageScreenshot()
	}

	/**
	 * Items Present On the Call logs Page
	 */

	@When("the user lands on the Call Logs Page")
	def lands() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}

	@Then("the User will be able to See the Call logs Heading")
	def Calls_LogsHeading() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallLogsHeading'), 0)
	}

	@And("the user will be able to see the Filter icon")
	def filter_Icon() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_FilterIconShow'), 0)
	}

	@And("Upon clicking on the Call type tooltip user will be able to see the Call types")
	def CalltypeSHow() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeIcon'), 0)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeIcon'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeGC'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PAudioIcon'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PAudioText'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PVideoIcon'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PVideoText'), 0)
	}

	@And("the User will be able to see the Name Column")
	def NameColumn() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ColumnName'), 0)
	}

	@And("the user will be able to see the Date Column")
	def DateColumn() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ColumnDate'), 0)
	}

	@And("the user will be able to see the Start Time Column")
	def StartTime() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ColumnStartTime'), 0)
	}

	@And("the user will be able to see the End Time Column")
	def EndTime() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ColumnEndTime'), 0)
	}

	@And("the user will be able to see the Duration Column")
	def DurationColumn() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_Duration'), 0)
	}

	@And("the user will be able to see the Call Type Filter")
	def CallType_Filter() {
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_FilterIconShow'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeFilter-All'), 0)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeFilter-All'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeFilter-GC'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeFilter-P2P'), 0)
	}

	@And("the user will be able to see the Name Field to search Specific Name from the Logs")
	def NameField_Call() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_SearchName'), 0)
	}

	@And("the user will be able to see the From Date-Time Filter")
	def FromDateTimeElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_FromDateTime'), 0)
	}

	@And("the user will be able to see the To Date-Time Filter")
	def ToDateTimeElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ToDateTime'), 0)
	}

	@And("the user will be able to see the Clear Button to clears the Filters")
	def ClearButtonElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ClearButton'), 0)
	}

	@And("the user will be able to see the Search Button")
	def SearchButtonElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_SearchButton'), 0)
	}

	@And("the user will be able to see the Showing records")
	def ShowRecordElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
	}

	@And("the user will be able to see the Pagination window")
	def PaginationElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CenterPaginations'), 0)
	}

	@And("the user will be able to see the Show items on the right Bottom")
	def PaginationItemListElement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'), 0)
	}

	/**
	 * Items Present On the Call logs Page
	 */

	@When("the user clicks on the Call type Tool Tip")
	def ClickCallTypeToolTip() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeIcon'), 0)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeIcon'))
	}

	@Then("the user will be able to see the Group Call with Group Call icon")
	def VerifyGCICONandGC() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeGC'), 0)
	}

	@And("the user will be able to see the Peer to Peer Audio Call and Peer with Audio icon")
	def VerifyP2PAudioCallIconAndText() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PAudioIcon'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PAudioText'), 0)
	}

	@And("the user will be able to see the Peer to Peer Video Call and Peer with Video icon")
	def VerifyP2PVideoCallIconAndText() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PVideoIcon'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_CallTypeP2PVideoText'), 0)
	}

	/**
	 * By Default Pagination
	 */
	@When("the user Lands on the Calls logs Page")
	def CallLogs_Page() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}

	@Then("the user will be able to see the Default Pagiantion which is set to 10")
	def Default_Pagination() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'), 0)
	}

	@And("the user will be able to see the Records Showing on the Page")
	def RecordsOnThePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
	}
	
	/**
	 * User Changes the Default Pagination to 25items Per Page
	 */
	@When("the provider lands on the Call Logs Page")
	def Provider_callLogpage() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}
	
	@And("the user clicks on the Show Records Drop Down")
	def Show_records_Dropdown() {
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'))
	}
	
	@And("the user selects the 25 Items per page")
	def User_Selects_25Items() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination25'))
	}
	
	@Then("there will be 25 items on the page")
	def Verify_ItemsSelected() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
		WebUI.verifyTextPresent('to 25', false)
		WebUI.takeFullPageScreenshot()
	}
	
	/**
	 * User Changes the Default Pagination to 50Items Per Page
	 */
	
	@When("the Provider is Landed on the Call Logs Page")
	def Call_LogPage() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}
	
	@And("the user click on the Show Items Per Page DropDown")
	def show_items() {
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'))
	}
	
	@And("the user selects the 50 Items per page")
	def Show_50Items() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination50'))
	}
	
	@Then("there will be 50 items on the page")
	def Items_Page() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
		WebUI.verifyTextPresent('to 50', false)
		WebUI.takeFullPageScreenshot()
	}
	
	/**
	 * User Changes the Default Pagination to 100Items Per Page
	 */
	
	@When("the Provider is Landed on the Call Logs Page to select the new Pagination")
	def Call_logs_selectionsItems() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}
	
	@And("the user click on the Show Records Drop Down and selects 100items Per Page")
	def select_dropdown_NewItems() {
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination100'))
	}
	
	@Then("there will be 100 items on the page")
	def Items_100Page() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
		WebUI.verifyTextPresent('to 100', false)
		WebUI.takeFullPageScreenshot()
	}
	
	
	/**
	 * User Changes the Default Pagination to 5Items Per Page
	 */
	
	@When("the user is Landed on the Call Logs Page to select the new Pagination")
	def new_landed_CallPage() {
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/Obj_Administration'))
		WebUI.click(findTestObject('Object Repository/Regression/HomePage/obj_Logs'))
	}
	
	@And("the user click on the Show Records Drop Down and selects 5items Per Page")
	def items_5Page() {
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination10'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Regression/CallLogs/Obj_Pagination5'))
	}
	
	@Then("there will be 5 items on the page")
	def verify_5items() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Regression/CallLogs/Obj_ShowInformation'), 0)
		WebUI.verifyTextPresent('to 5', false)
		WebUI.takeFullPageScreenshot()
	}
}