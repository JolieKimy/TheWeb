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

WebUI.openBrowser('http://localhost:8080')

WebUI.click(findTestObject('Object Repository/Page_/span_The Web_navbar-toggler-icon (2) (2)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_/a_Login_1 (1)'))

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('Page_Please sign in/input_Username_username'), 'user')

WebUI.setEncryptedText(findTestObject('Page_Please sign in/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Please sign in/button_Sign in'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Object Repository/Page_/span_The Web_navbar-toggler-icon (3)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_/a_Cards (1)'))

WebUI.click(findTestObject('Object Repository/Page_/a_Update'))

WebUI.click(findTestObject('Object Repository/Page_/div_Name  Firstname  Birthdate  LocalisationSave'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Localisation_localisation (1)'), 'Kataland')

WebUI.click(findTestObject('Object Repository/Page_/button_Save (1)'))

WebUI.waitForPageLoad(1)

WebUI.closeBrowser()
