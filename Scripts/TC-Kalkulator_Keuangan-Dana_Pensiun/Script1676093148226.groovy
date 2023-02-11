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

WebUI.openBrowser(GlobalVariable.urlSequis)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sequis_Web/logo_sequis'))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-asuransiJiwa'), findTestData('Test Data').getValue('Menu', 1))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-asuransiKesehatan'), findTestData('Test Data').getValue('Menu', 
        2))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-investasi'), findTestData('Test Data').getValue('Menu', 3))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-tentangSequis'), findTestData('Test Data').getValue('Menu', 4))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-layanan'), findTestData('Test Data').getValue('Menu', 5))

WebUI.verifyElementText(findTestObject('Sequis_Web/menu-artikel'), findTestData('Test Data').getValue('Menu', 6))

WebUI.click(findTestObject('Sequis_Web/menu-layanan'))

WebUI.click(findTestObject('Sequis_Web/submenu-kalkulatorKeuangan'))

WebUI.click(findTestObject('Sequis_Web/droplist-hitungKategori'))

WebUI.click(findTestObject('Sequis_Web/option-danaPensiun'))

WebUI.setText(findTestObject('Sequis_Web/input-penghasilan'), '5000000')

WebUI.clearText(findTestObject('Sequis_Web/input-inflasi'))

WebUI.setText(findTestObject('Sequis_Web/input-inflasi'), '4.5')

WebUI.click(findTestObject('Sequis_Web/button-step1-selanjutnya'))

WebUI.clearText(findTestObject('Sequis_Web/input-usia'))

WebUI.setText(findTestObject('Sequis_Web/input-usia'), '23')

WebUI.clearText(findTestObject('Sequis_Web/input-usiaPensiun'))

WebUI.setText(findTestObject('Sequis_Web/input-usiaPensiun'), '60')

WebUI.click(findTestObject('Sequis_Web/button-step2-selanjutnya'))

WebUI.clearText(findTestObject('Sequis_Web/input-ratio'))

WebUI.setText(findTestObject('Sequis_Web/input-ratio'), '90')

WebUI.click(findTestObject('Sequis_Web/button-step3-selanjutnya'))

WebUI.clearText(findTestObject('Sequis_Web/input-pensiun'))

WebUI.setText(findTestObject('Sequis_Web/input-pensiun'), '10')

WebUI.clearText(findTestObject('Sequis_Web/input-bungaDeposito'))

WebUI.setText(findTestObject('Sequis_Web/input-bungaDeposito'), '4')

WebUI.click(findTestObject('Sequis_Web/button-step4-selanjutnya'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/totalDanaPensiun'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/jumlahTabungan'))

WebUI.closeBrowser()

