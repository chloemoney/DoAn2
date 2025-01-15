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

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/img_o Thun ng Nam Gi Nhit C 3cm_object-cove_a1ef8e'))

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_Sweater In Trn  YODY/button_Mua ngay'))

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/span_Mua hng (1)'))

WebUI.setText(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/input_Ngi nhn_name'), 
    name)

WebUI.setText(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/input_Ngi nhn_phone'), 
    phone)

WebUI.setText(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/input_Ngi nhn_email'), 
    email)

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/span_Chon TinhThanh Ph, QunHuyn, PhngXa'))

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/div_Hng Yn'))

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/div_Huyn Yn M'))

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/div_Th trn Yn M'))

WebUI.setText(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/input_X Yn Ph_address'), 
    address)

WebUI.click(findTestObject('Object Repository/ThanhToan/ThanhToanHopLe/Page_YODY - Look Good - Feel Good/button_Thanh toan bng tin mt'))

