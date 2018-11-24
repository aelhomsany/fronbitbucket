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

WebUI.navigateToUrl('https://www.schooolz.com/teacher/create')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Name_txt'), 'eman mohamed')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Email_txt'), 'eman555@yahoo.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Password_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/ConfirmPassword_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Phone_txt'), '01022723522')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Teacher/Country_Dropdown'), '1', false)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('Teacher/Country_Dropdown'), '1', false, 60)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Teacher/DropdownCity'), '1', false)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Teacher/DropdownCity'), '3', false, 60)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Teacher/Region_Dropdown'), '1', false)

not_run: WebUI.verifyOptionSelectedByValue(findTestObject('Teacher/Region_Dropdown'), '1', false, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Address_txt'), 'مصر الجديده')

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Teacher/Dateofbirth_txt'), '1/1/1996')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Id_txt'), '12345678978945')

WebUI.delay(0)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Teacher/School_Dropdown'), '1', false)

WebUI.verifyOptionNotSelectedByLabel(findTestObject('Teacher/School_Dropdown'), '1', false, 0)

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('Teacher/Level_Dropdown'), '1', false)

WebUI.verifyOptionNotSelectedByLabel(findTestObject('Teacher/Level_Dropdown'), '1', false, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/speciality'), 'كيمياء')

WebUI.delay(5)

WebUI.setText(findTestObject('Teacher/Messaage_txt'), 'lkjhgfdddddddddddddddddddddddddddddddddddddddddd')

WebUI.delay(5)

