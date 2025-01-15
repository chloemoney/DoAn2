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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://yody.vn/')

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_YODY - Look Good - Feel Good/svg_Tin hot_R6baqlmta'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_YODY - Look Good - Feel Good/button_qun jean'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_qun jean - Tm kim/div_B lc'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_qun jean - Tm kim/div_en'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_qun jean - Tm kim/div_S'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_qun jean - Tm kim/div_Di 350.000'))

WebUI.click(findTestObject('Object Repository/TimKiem/Page_YODY - Look Good - Feel Good/TimKiemBoLoc/Page_qun jean - Tm kim/button_p dng  (3)'))

