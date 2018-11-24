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

WebUI.delay(10)

WebUI.click(findTestObject('join to school/login_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/UserName_txt'), 'student')

WebUI.setText(findTestObject('join to school/UserPassword_txt'), '123456')

WebUI.click(findTestObject('join to school/register_btn'))

WebUI.click(findTestObject('join to school/schools_btn'))

WebUI.click(findTestObject('join to school/yahiaschool_btn'))

WebUI.click(findTestObject('join to school/Joinschool_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/name_txt'), 'esraa_mohamed')

WebUI.setText(findTestObject('join to school/Email_txt'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('join to school/phone_txt'), '1234567890')

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/birthdate_txt'), '1/10/2010')

WebUI.selectOptionByValue(findTestObject('join to school/DropDown_country'), '2', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('join to school/DropDown_city'), '34', false)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('join to school/DropDown_region'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('join to school/Address_txt'), 'helioplis square')

WebUI.selectOptionByValue(findTestObject('join to school/EducationalStage_txt'), '3', false)

WebUI.setText(findTestObject('join to school/Experience_txt'), 'HTML ,css')

WebUI.uploadFile(findTestObject('join to school/Image_img'), 'C:\\Users\\elnahas\\git\\regressionEsraa\\Data Files')

