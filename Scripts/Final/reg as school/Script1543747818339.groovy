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

WebUI.navigateToUrl('https://www.schooolz.com/school/create')

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('reg as schoool/school_name'), RandomStringUtils.randomAlphabetic(10))

WebUI.setText(findTestObject('reg as schoool/uname_txt'), RandomStringUtils.randomAlphabetic(10))

WebUI.setText(findTestObject('reg as schoool/email_txt'), RandomStringUtils.randomAlphabetic(10) + '@yahoo.com')

WebUI.setText(findTestObject('reg as schoool/password_txt'), '123456789')

WebUI.setText(findTestObject('reg as schoool/confirm pass_txt'), '123456789')

WebUI.setText(findTestObject('reg as schoool/phone_txt'), '1234567890')

WebUI.selectOptionByValue(findTestObject('reg as schoool/country_dropdown menu'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/city_dropdown menu'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/region_dropdown menu'), '8', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/week starting_dropdown menu'), 'السبت', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/ending week_dropdown menu'), 'الخميس', false)

WebUI.delay(5)

WebUI.setText(findTestObject('reg as schoool/starting time_txt'), '01:00AM')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/ending time_txt'), '10:00PM')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/school address_txt'), 'heliopli square')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/fax_txt'), '12345678912')

WebUI.setText(findTestObject('reg as schoool/school_facebook'), 'https://www.facebook.com/aaaaa.52056223')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/school_twitter'), 'https://www.twitter.com/aaaaa.52056223')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/school_insta'), 'https://www.instgram.com/aaaaa.52056223')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/school_linkedin'), 'https://www.linkedin.com/aaaaa.52056223')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('add_jobs/img'), GlobalVariable.f_path)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/school_activities'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/school type_dropdown menu'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/category'), '1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('reg as schoool/gender'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/fees'), '12345')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/capacity'), '100')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/rooms'), '100')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/labs'), '100')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/playground'), '100')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/teachers'), '100')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/longitude'), '10')

WebUI.delay(3)

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/latitude'), '10')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/message'), 'hb kbnkjn nnjjnkj')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/description'), 'kldln njlnflnd lnvld nldvnl kndlsknv')

WebUI.delay(3)

WebUI.setText(findTestObject('reg as schoool/vision'), 'sndj nkjSNDJLVN NJnvla jhnvj nvkjn')

WebUI.delay(3)

WebUI.click(findTestObject('reg as schoool/submit'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('reg as schoool/success_msg'), 0)

