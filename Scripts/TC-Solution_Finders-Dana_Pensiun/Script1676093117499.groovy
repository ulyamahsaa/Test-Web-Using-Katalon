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

WebUI.verifyElementVisible(findTestObject('Sequis_Web/cari-kebutuhan'))

WebUI.click(findTestObject('Sequis_Web/cari-kebutuhan'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-silahkanPilih'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-proteksiJiwa'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-proteksiKesehatan'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-danaPendidikan'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-investasi'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-danaPensiun'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-daftarRumahSakit'))

WebUI.verifyElementVisible(findTestObject('Sequis_Web/option-klaim'))

WebUI.scrollToElement(findTestObject('Sequis_Web/option-danaPensiun'), 3)

WebUI.scrollToElement(findTestObject('Sequis_Web/content-banner'), 3)

WebUI.click(findTestObject('Sequis_Web/option-danaPensiun'))

WebUI.verifyElementText(findTestObject('Sequis_Web/cari-kebutuhan'), 'Dana Pensiun')

WebUI.click(findTestObject('Sequis_Web/button-submit'))

WebUI.click(findTestObject('Sequis_Web/button-step1-selanjutnya'))

WebUI.click(findTestObject('Sequis_Web/jenisKelamin-female'))

WebUI.click(findTestObject('Sequis_Web/droplist-usia'))

WebUI.click(findTestObject('Sequis_Web/option-usia-17_25'))

WebUI.click(findTestObject('Sequis_Web/status-single'))

WebUI.click(findTestObject('Sequis_Web/button-step2-selanjutnya'))

WebUI.click(findTestObject('Sequis_Web/droplist-pengeluaranPerBulan'))

WebUI.click(findTestObject('Sequis_Web/option-pengeluaran-kurangDari5'))

WebUI.click(findTestObject('Sequis_Web/droplist-tabunganPerBulan'))

WebUI.click(findTestObject('Sequis_Web/option-tabungan-1_2'))

WebUI.click(findTestObject('Sequis_Web/droplist-alokasiDana'))

WebUI.click(findTestObject('Sequis_Web/option-alokasiDana-kurangDari1'))

WebUI.click(findTestObject('Sequis_Web/button-step3-selanjutnya'))

WebUI.click(findTestObject('Sequis_Web/button-dapatkanHasil'))

