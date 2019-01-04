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

WebUI.navigateToUrl('http://www.schooolz.com/student/create')

WebUI.setText(findTestObject('reg as visitor/name'), RandomStringUtils.randomAlphabetic(10))

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/username'), RandomStringUtils.randomAlphabetic(10))

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/email'), RandomStringUtils.randomAlphabetic(10) + parenrt_mail)

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/password'), '123456789')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/confirmpassword'), '123456789')

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('reg as visitor/phone'), '1234567890')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as visitor/country'), '1', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('reg as visitor/city'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('reg as visitor/region'), '3', false)

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/address'), 'helioplis')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as visitor/birth date'), '10/10/2010')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Reg student2/school'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Reg student2/school level'), '1', false)

WebUI.delay(3)

not_run: WebUI.uploadFile(findTestObject('Reg student2/img'), 'C:\\Users\\M.Kamel\\git\\regression2\\Data Files\\1.jpg')

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Reg student2/save_btn'))

WebUI.delay(5)

