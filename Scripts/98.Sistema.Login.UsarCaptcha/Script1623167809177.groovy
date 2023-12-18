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

WebUI.callTestCase(findTestCase('Inicio Sesion sin variables'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1Inicio/img_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/1Principal/img_Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Sistema/1Principal/img_Parametros Generales'))

WebUI.delay(3)

'Sistema.Login.UsarCaptcha'
WebUI.setText(findTestObject('Configuracion/Sistema/Parametros Generales/Filtro 1er valor/input_Texto a buscar1'), 'Sistema.Login.UsarCaptcha')

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/botones filtro/btn_Filtrar'))

WebUI.delay(2)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/a_Editar'))

WebUI.delay(2)

'Cambiamos a Si= Habilitado; No=No habilitado'
WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/input_Valor'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro SI NO/li_Si'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/a_Guardar'))

WebUI.delay(5)

WebUI.click(findTestObject('0Inicio Sesion/Menu Tres Rayas/img_MenuUsuarioRayas'))

WebUI.delay(5)

WebUI.click(findTestObject('0Inicio Sesion/Menu Tres Rayas/nuevos/a_Cerrar sesion'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

