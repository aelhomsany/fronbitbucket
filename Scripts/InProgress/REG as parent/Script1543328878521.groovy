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

WebUI.navigateToUrl('http://www.schooolz.com/parent/create')

WebUI.delay(5)

WebUI.setText(findTestObject('REG as parent/par_name'), RandomStringUtils.randomAlphabetic(10))

WebUI.delay(3)

par_uname = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('REG as parent/user_name'), par_uname)

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/Email'), RandomStringUtils.randomAlphabetic(10) + mail_var)

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/password'), '123456789')

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/conf_password'), '123456789')

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/phone'), '5264982013')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('REG as parent/country'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('REG as parent/city'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('REG as parent/region'), '8', false)

WebUI.delay(5)

WebUI.setText(findTestObject('REG as parent/address'), 'helioplis')

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/date_birth'), '10/10/2010')

WebUI.delay(3)

WebUI.setText(findTestObject('REG as parent/ssn'), '7825493254')

WebUI.delay(3)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('REG as parent/image'), 'C:\\Users\\M.Kamel\\git\\regression22\\Data Files\\1.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('REG as parent/save_btn'))

