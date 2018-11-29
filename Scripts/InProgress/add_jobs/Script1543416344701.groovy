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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com')

WebUI.click(findTestObject('join to school/login_btn'))

WebUI.delay(3)

WebUI.setText(findTestObject('join to school/UserName_txt'), 'superadmin')

WebUI.setText(findTestObject('join to school/UserPassword_txt'), '123456')

WebUI.click(findTestObject('join to school/register_btn'))

WebUI.click(findTestObject('add_jobs/jobs_btn'))

WebUI.click(findTestObject('add_jobs/addjob_btn'))

WebUI.setText(findTestObject('add_jobs/name'), 'sw tester')

WebUI.setText(findTestObject('add_jobs/Email'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('add_jobs/phone'), '01120354871')

WebUI.selectOptionByValue(findTestObject('add_event/country'), '2', false)

WebUI.selectOptionByIndex(findTestObject('add_event/city'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('add_event/region'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('add_jobs/address'), 'helioplis')

WebUI.setText(findTestObject('add_event/description'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.setText(findTestObject('add_event/content'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.uploadFile(findTestObject('add_jobs/img'), 'C:\\Users\\M.Kamel\\git\\regression22\\Data Files\\1.jpg')

WebUI.click(findTestObject('add_jobs/save_btn'))

