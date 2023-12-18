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

'Captura del turno generado'
WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/4 Generar Turno/img_Con Impresion'))

WebUI.delay(1)

'Captura del turno generado'
WebUI.takeFullPageScreenshot()

WebUI.delay(2)

'Cambiamos a la ventana principal'
WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos Del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

'Abrimos Terminal'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/1Terminales menos WorkFlow/a_Terminal Informacion A01'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Llamar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgOcupado/a_Actualizacion de Datos'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Transferir'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/0 Especialidades/a_select'))

WebUI.check(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/0 Especialidades/chk_Cirujanos'))

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/0 Especialidades/a_select'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/1 Profesionales/a_select'))

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/1 Profesionales/a_select'))

WebUI.check(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/1 Profesionales/chk_Cardiologo'))

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/1 Profesionales/a_select'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/2 Usuario/select_Usuario'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/a_Grupo Informacin'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Destino de Transferencia/img_Aceptar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgTransferir/Cola de transferencia/a_Informacion2'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Buscar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgBuscar/etiquetas/span_Suspendido'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

