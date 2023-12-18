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

WebUI.click(findTestObject('Configuracion/1Principal/img_Jornadas de Atencion'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Jornadas de Atencion/0Oficinas Emergente/a_Seleccionar'))

WebUI.delay(3)

'Tipo de Jornada'
WebUI.setText(findTestObject('Configuracion/Jornadas de Atencion/2Lista de Jornadas/input_TextoABuscar'), 'App')

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Jornadas de Atencion/2Lista de Jornadas/a_Seleccionar'))

WebUI.delay(3)

'Tipo de Jornada'
WebUI.selectOptionByLabel(findTestObject('Configuracion/Jornadas de Atencion/2Edicion/select_Tipo'), 'App', false)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Jornadas de Atencion/2Edicion/img_Actualizar2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

'Proceso para ver configuración de Terminal'
WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/1Principal/img_Elementos del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Elementos del Sistema/1Principal/img_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Elementos del Sistema/Selectores/0Lista de Selectores/a_Seleccionar1'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 400)

WebUI.delay(3)

WebUI.check(findTestObject('Configuracion/Elementos del Sistema/Selectores/1Edicion/rbt_Tipo de Selector Movil'))

WebUI.click(findTestObject('Configuracion/Elementos del Sistema/Selectores/1Edicion/img_Actualizar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Elementos del Sistema/Selectores/0Pestanas/span_Jornadas y Colas'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Configuracion/Elementos del Sistema/Selectores/2Jornada por Oficina/span_App'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)
