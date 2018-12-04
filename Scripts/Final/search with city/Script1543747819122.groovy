import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://www.schooolz.com')

not_run: WebUI.click(findTestObject('advanced search1/home_search_btn'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('advanced search1/advanced_search_btn'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('advanced search1/country'))

not_run: WebUI.delay(3)

not_run: WebUI.check(findTestObject('advanced search1/country_checkbox'))

not_run: WebUI.verifyElementChecked(findTestObject('advanced search1/country_checkbox'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('advanced search1/city'))

WebUI.delay(3)

WebUI.check(findTestObject('advanced search1/city_checkbox'))

WebUI.verifyElementChecked(findTestObject('advanced search1/city_checkbox'), 0)

WebUI.delay(10)
WebUI.verifyTextPresent(findTestObject('search with city/valid_result', 20))

