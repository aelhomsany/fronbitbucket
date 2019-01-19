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
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com')

WebUI.delay(10)

WebUI.click(findTestObject('join to school/login_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/UserName_txt'), 'ragwanschool@yahoo.com')

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/UserPassword_txt'), '123456')

WebUI.delay(3)

WebUI.click(findTestObject('join to school/register_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('join to school/schools_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('join to school/yahiaschool_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('join to school/Joinschool_btn'))

