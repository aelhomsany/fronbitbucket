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

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Name_txt'), 'eman mohamed')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/UserName_txt'), 'eman123')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Email_txt'), 'eman_mohamed1139@yahoo.com')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Password_txt'), '123456789')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/ConfirmPassword_txt'), '123456789')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Phone_txt'), '01066204128')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('ServiceProvider/Country_dropdown'), '1', false)

WebUI.verifyOptionSelectedByValue(findTestObject('ServiceProvider/Country_dropdown'), '1', false, 60)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('ServiceProvider/City_dropdown'), '2', false)

WebUI.verifyOptionSelectedByValue(findTestObject(null), '1', false, 60)

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Area_txt'), 'الجيزة')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Address_txt'), 'مصر الجديده')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/DateOfBirth_txt'), '1/10/1996')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Id_txt'), '12345678978945')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Website_txt'), 'http://www.schooolz.com')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/Description_txt'), 'aaaaaaaaaaaaaaaaaaaaaaa')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/KindOfServise_txt'), 'خدمات عامة')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/ContactName_txt'), 'eman abdelmonsef')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/ContactEmail_txt'), 'eman.mohamed1139@yahoo.com')

WebUI.delay(3)

WebUI.setText(findTestObject('ServiceProvider/ContactPhone_txt'), '01066204128')

WebUI.delay(3)

WebUI.click(findTestObject('ServiceProvider/Save_btn'))

