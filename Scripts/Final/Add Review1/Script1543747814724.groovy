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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://www.schooolz.com')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('HomeScreen/login_btn'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('HomeScreen/Username_txt'), 'student')

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('HomeScreen/Password_txt'), '123456')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('HomeScreen/submit_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/schools_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/numbers_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/rehab_school'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/add_review_btn'))

WebUI.delay(3)

WebUI.setText(findTestObject('AddReview/Description_txt'), 'very nice')

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/ranke'))

WebUI.delay(3)

WebUI.click(findTestObject('AddReview/submit_review'))

