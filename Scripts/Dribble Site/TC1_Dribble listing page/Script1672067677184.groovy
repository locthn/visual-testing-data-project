import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.comment("Open dribble listing page")

WebUI.openBrowser('https://dribbble.com/tags/web_animation')

WebUI.setViewPortSize(1888, 900)

WebUI.comment('Take header screenshot to validate')

TestObject header = findTestObject('Object Repository/Dribbble_listing_animation_page/header')
WebUI.takeElementScreenshotAsCheckpoint('listing_page_header', header)

WebUI.comment('Scroll to bottom and scan footer')
TestObject footer = findTestObject('Object Repository/Dribbble_listing_animation_page/footer')
WebUI.scrollToElement(footer, 10)
WebUI.takeElementScreenshotAsCheckpoint('listing_page_footer', footer)

WebUI.comment('Scroll to listing page and scan products list -> failed as always')
TestObject title = findTestObject('Object Repository/Dribbble_listing_animation_page/title')
WebUI.scrollToElement(title,10)
WebUI.takeFullPageScreenshotAsCheckpoint("listing page")
