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

WebUI.navigateToUrl('https://www.schooolz.com/service_provider/create')

WebUI.delay(40)

WebUI.setText(findTestObject('ServiceProvider/Name_txt'), 'esraa')

WebUI.setText(findTestObject('ServiceProvider/UserName_txt'), 'esraa_mohamed')

WebUI.setText(findTestObject('ServiceProvider/Email_txt'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('ServiceProvider/Password_txt'), '123456')

WebUI.setText(findTestObject('ServiceProvider/ConfirmPassword_txt'), '123456')

WebUI.setText(findTestObject('ServiceProvider/UserPhone_txt'), '01140215487')

WebUI.setText(findTestObject('ServiceProvider/country_txt'), 'جمهوريه مصر العربيه')

WebUI.setText(findTestObject('ServiceProvider/City_txt'), 'القاهره')

WebUI.setText(findTestObject('ServiceProvider/Region_txt'), 'الشروق')

WebUI.setText(findTestObject('ServiceProvider/Address_txt'), 'jhbf bjhbsjs jhbjbfh')

WebUI.setText(findTestObject('ServiceProvider/BirthDate_txt'), '1/10/2015')

WebUI.setText(findTestObject('ServiceProvider/UserSSn_txt'), '12345678901234')

WebUI.setText(findTestObject('ServiceProvider/UserWebsite_txt'), 'https://www.google.com')

WebUI.setText(findTestObject('ServiceProvider/Description_txt'), 'kjn bkjbkjn jbkbj jkbkb kjbkb kjbk bkjbkbk bkbkb bkbkjb bkbkb kb kb bkjb kjbkb bjkb kjbjkb jbkb  hkbkbknkbhjfbdjh bhjbhujk hjbhjbhjb ')

WebUI.setText(findTestObject('ServiceProvider/ServiceType_txt'), 'خدمات عامه')

WebUI.setText(findTestObject('ServiceProvider/ContactName_txt'), 'eeeeee')

WebUI.setText(findTestObject('ServiceProvider/ContactMail_txt'), 'eee@yahoo.com')

WebUI.setText(findTestObject('ServiceProvider/ContactPhone_txt'), '01120345879')

WebUI.acceptAlert()

WebUI.click(findTestObject('ServiceProvider/Save_btn'))

