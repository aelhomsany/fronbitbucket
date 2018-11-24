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

WebUI.delay(5)

WebUI.click(findTestObject('join to school/schools_btn'))

WebUI.click(findTestObject('join to school/yahiaschool_btn'))

WebUI.click(findTestObject('join to school/Joinschool_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('join to school/name_txt'), 'esraa_mohamed')

WebUI.setText(findTestObject('join to school/Email_txt'), 'esraa@yahoo.com')

WebUI.setText(findTestObject('join to school/phone_txt'), '1234567890')

WebUI.selectOptionByValue(findTestObject('join to school/DropDown_country'), '2', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('join to school/DropDown_city'), '34', false)

WebUI.verifyOptionNotPresentByValue(findTestObject('join to school/DropDown_city'), '34', false, 60)

WebUI.delay(3)

WebUI.setText(findTestObject('join to school/Address_txt'), 'kjfhdsj kjb kb jbkjb k jbkjnkj kkj nkjbkj kjbjbjk kjbk ')

