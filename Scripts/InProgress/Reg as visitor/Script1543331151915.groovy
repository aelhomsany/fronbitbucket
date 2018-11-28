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

WebUI.setText(findTestObject('reg as visitor/name'), 'esraa')

WebUI.setText(findTestObject('reg as visitor/username'), 'esraa mohamed')

WebUI.setText(findTestObject('reg as visitor/email'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('reg as visitor/password'), '123456789')

WebUI.setText(findTestObject('reg as visitor/confirmpassword'), '123456789')

WebUI.setText(findTestObject('reg as visitor/phone'), '1234567890')

WebUI.selectOptionByValue(findTestObject('reg as visitor/country'), '1', false)

WebUI.selectOptionByValue(findTestObject('reg as visitor/city'), '1', false)

WebUI.selectOptionByValue(findTestObject('reg as visitor/region'), '14', false)

WebUI.setText(findTestObject('reg as visitor/address'), 'helioplis')

WebUI.setText(findTestObject('reg as visitor/birth date'), '10/10/2010')

WebUI.setText(findTestObject('reg as visitor/ssn'), '12345678912345')

not_run: WebUI.uploadFile(findTestObject(null), '')

WebUI.click(findTestObject('reg as visitor/save_btn'))

