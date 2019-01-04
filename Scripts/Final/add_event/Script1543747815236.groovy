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

not_run: WebUI.delay(3)

not_run: WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.navigateToUrl('http://www.schooolz.com')

not_run: WebUI.delay(3)

WebUI.click(findTestObject('add_event/login_btn'))

WebUI.delay(3)

WebUI.setText(findTestObject('add_event/username'), 'yahaschool@yahoo.com')

WebUI.setText(findTestObject('add_event/password'), '123456')

WebUI.click(findTestObject('add_event/register_btn'))

WebUI.click(findTestObject('event_btn'))

WebUI.click(findTestObject('add_event/addevent_btn'))

WebUI.setText(findTestObject('add_event/name'), 'esraa')

WebUI.setText(findTestObject('add_event/event_statring'), '10/1/2019')

WebUI.setText(findTestObject('add_event/event_ending'), '20/1/2019')

WebUI.selectOptionByValue(findTestObject('add_event/country'), '1', false)

WebUI.selectOptionByIndex(findTestObject('add_event/city'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('add_event/region'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('add_event/address'), 'helioplis')

WebUI.uploadFile(findTestObject('add_event/img'), 'C:\\Users\\M.Kamel\\git\\regression22\\Data Files\\1.jpg')

WebUI.setText(findTestObject('add_event/description'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.setText(findTestObject('add_event/content'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.setText(findTestObject('add_event/target'), 'lnl nknkn kkbk bkjbk kbk nkn k bkj kbk bkj bkj bk ')

WebUI.click(findTestObject('add_event/save_btn'))

