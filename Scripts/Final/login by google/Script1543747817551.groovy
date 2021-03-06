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

WebUI.delay(5)

WebUI.click(findTestObject('HomeScreen/login_btn'))

WebUI.delay(5)

WebUI.click(findTestObject('login by google/g_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('login by google/email'), 'aradocsauto@gmail.com')

WebUI.delay(5)

WebUI.click(findTestObject('login by google/submit_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('login by google/password'), '@r@Docs0100')

WebUI.delay(5)

WebUI.click(findTestObject('login by google/submit1'))

WebUI.delay(5)

