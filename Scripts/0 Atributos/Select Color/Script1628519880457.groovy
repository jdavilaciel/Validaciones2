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

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos Del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

'Abrimos selector'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/0 Lista de Selectores/a_Abrir Selector'))

WebUI.delay(5)

'Para ir a la ventana del selector abierto'
WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('2 Operacion/Elementos del Sistema/Selectores/2 Escoger por jerarquia/input_Escoger por Jerarqua2'), 
    'info')

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/2 Escoger por jerarquia/a_WIZ Informacion General'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/select_Especialidades (click)'))

WebUI.check(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/chk_Especialidades_Cirujanos'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/textarea_Observaciones'))

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/select_Profesionales(click)'))

WebUI.check(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/chk_Profesionales_Cardiologo'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/textarea_Observaciones'))

'Captura del turno generado'
WebUI.takeFullPageScreenshot()

WebUI.delay(2)

attribute = WebUI.getAttribute(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/select_Usuario'), 
    'color')

WebUI.delay(3)

if ((attribute==red) == true) {
    WebUI.executeJavaScript('NO está logueado el usuario', [])
} else {
    WebUI.setAlertText('Si está logueado')
}

WebUI.delay(3)

