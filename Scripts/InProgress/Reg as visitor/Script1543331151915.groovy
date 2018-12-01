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

WebUI.navigateToUrl('http://www.schooolz.com/visitor/create')

WebUI.setText(findTestObject('reg as visitor/name'), 'esraa9535')

WebUI.setText(findTestObject('reg as visitor/username'), 'esraa222')

WebUI.setText(findTestObject('reg as visitor/email'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('reg as visitor/password'), '123456789')

WebUI.setText(findTestObject('reg as visitor/confirmpassword'), '123456789')

WebUI.setText(findTestObject('reg as visitor/phone'), '1234567890')

WebUI.selectOptionByValue(findTestObject('reg as visitor/country'), '1', false)

WebUI.selectOptionByIndex(findTestObject('reg as visitor/city'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('reg as visitor/region'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('reg as visitor/address'), 'helioplis')

WebUI.setText(findTestObject('reg as visitor/birth date'), '10/10/2010')

WebUI.setText(findTestObject('reg as visitor/ssn'), '12345678912345')

WebUI.uploadFile(findTestObject('reg as visitor/image'), 'C:\\Users\\M.Kamel\\git\\regression22\\Data Files\\1.jpg')

WebUI.click(findTestObject('reg as visitor/save_btn'))

