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

WebUI.delay(3)

WebUI.click(findTestObject('HomeScreen/login_btn'))

WebUI.delay(3)

WebUI.setText(findTestObject('HomeScreen/Username_txt'), 'student')

WebUI.delay(3)

WebUI.setText(findTestObject('HomeScreen/Password_txt'), '123456')

WebUI.delay(3)

WebUI.click(findTestObject('HomeScreen/submit_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/schools_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/numbers_btn'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('AddReview/MainDiv_School'), 10)

WebUI.delay(4)

WebUI.focus(findTestObject('AddReview/MainDiv_School'))

WebUI.click(findTestObject('AddReview/MainDiv_School'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/add_review_btn'))

WebUI.delay(3)

WebUI.setText(findTestObject('AddReview/Description_txt'), 'very nice')

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/ranke'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/submit_review'))

WebUI.acceptAlert()

