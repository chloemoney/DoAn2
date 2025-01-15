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

WebUI.navigateToUrl('https://yody.vn/pages/yody-online?click_id=acuZ23oWwfZfVMV&utm_medium=cpa&utm_source=cityads&wm_id=Q1ERPL&gad_source=1')

WebUI.click(findTestObject('Object Repository/TinTuc/Page_YODY Online/path'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_YODY Online/h3_Tin hot'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_TT M - GI M'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_TT M - GI M/span_Blog'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_V YODY'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_V YODY/span_Blog'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_Khuyn Mi'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Khuyn Mi Tng Bng Ti YODY - Sn Sale Cc _ada3a3/span_Blog'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_u i i tc'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_u i i tc - YODY/span_Blog'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_Thi Trang Th Gii'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Thi Trang Th Gii - Tp Ch Thi Trang YODY/span_Blog'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/svg__r1vp'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Xu hng thi trang mi nht - Tin tc Fashi_54592e/div_Bo v khch hng'))

WebUI.click(findTestObject('Object Repository/TinTuc/Page_Bo v khch hng - YODY/span_Blog'))

