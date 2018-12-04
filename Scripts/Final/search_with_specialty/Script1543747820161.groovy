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
import com.kms.katalon.core.logging.KeywordLogger



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com')

WebUI.click(findTestObject('advanced search1/home_search_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('advanced search1/advanced_search_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('advanced search1/spciality'))

WebUI.delay(3)

WebUI.check(findTestObject('advanced search1/governmental_checkbox'))

WebUI.verifyElementChecked(findTestObject('advanced search1/governmental_checkbox'), 0)

WebUI.delay(10)
WebUI.verifyTextPresent(findTestObject('search_with_speciality/valid_result', 20))


