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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com/teacher/create')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Name_txt'), RandomStringUtils.randomAlphabetic(10))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Reg as Teacher/Usernamee_txt'), RandomStringUtils.randomAlphabetic(10))

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Email_txt'), RandomStringUtils.randomAlphabetic(10) + teacher_var)

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Password_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/ConfirmPassword_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Phone_txt'), '01022723522')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher1/Country_Dropdown'), '1', false)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher1/DropdownCity'), '1', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Reg as Teacher1/Region_Dropdown'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Address_txt'), 'مصر الجديده')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Dateofbirth_txt'), '1/1/1996')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Id_txt'), '12345678978945')

WebUI.delay(0)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher1/School_Dropdown'), '1', false)

not_run: WebUI.verifyOptionNotSelectedByLabel(findTestObject('Reg as Teacher/School_Dropdown'), '1', false, 0)

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher1/Level_Dropdown'), '1', false)

not_run: WebUI.verifyOptionNotSelectedByLabel(findTestObject('Reg as Teacher/Level_Dropdown'), '1', false, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/speciality'), 'كيمياء')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher1/Messaage_txt'), 'lkjhgfdddddddddddddddddddddddddddddddddddddddddd')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Reg as Teacher1/image_btn'), 'C:\\Users\\M.Kamel\\git\\regression2\\Data Files\\1.jpg')

WebUI.click(findTestObject('Reg as Teacher1/save_btn'))

