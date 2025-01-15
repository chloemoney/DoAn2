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

WebUI.click(findTestObject('Object Repository/ChiTietSP/Page_YODY Online/img_o Phao N Phi N Pro_object-cover w-full _5b297b'))

WebUI.click(findTestObject('Object Repository/ChiTietSP/Page_o Khoc Nam Gia nh 3c Pro  YODY/div_Ghi_product-color-chip_box__QcjDW produ_7c5d37'))

WebUI.click(findTestObject('ChiTietSP/Page_o Khoc Nam Gia nh 3c Pro  YODY/div_Nu_product-color-chip_box__QcjDW produc_9a6261'))

WebUI.click(findTestObject('Object Repository/ChiTietSP/Page_o Khoc Nam Gia nh 3c Pro  YODY/span_XL'))

WebUI.click(findTestObject('Object Repository/ChiTietSP/Page_o Khoc Nam Gia nh 3c Pro  YODY/svg_S lng_Rsj1h5daqqlmta'))

WebUI.click(findTestObject('Object Repository/ChiTietSP/Page_o Khoc Nam Gia nh 3c Pro  YODY/svg_S lng_Rcj1h5daqqlmta'))

