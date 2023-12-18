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

WebUI.click(findTestObject('Configuracion/1Principal/img_Seguridad'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/img_Usuarios'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/1Principal/img_Consultar Usuarios'))

WebUI.delay(3)

WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/input__TextoABuscar'), 
    'Jaime')

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/img_Filtrar'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/span_admin'))

WebUI.delay(3)

'Captura de los atributos asignados al Usuario Jaime'
WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.back()

WebUI.delay(3)

WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/input__TextoABuscar'), 
    'jaime2')

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/img_Filtrar'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Consultar Usuarios/1Filtro por Nombre de usuario/span_admin'))

WebUI.delay(3)

'Captura de los atributos asignados al Usuario Jaime2'
WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

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

WebUI.click(findTestObject('1Inicio/img_Gestion'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/1Principal/img_Turnos'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Filtros/0 Oficinas/a_select'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Filtros/0 Oficinas/li_Bogota - CIEL'))

WebUI.delay(3)

'Captura turnos mostrados'
WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Lista de Turnos/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Lista de Turnos/1 Especialidades/a_select'))

WebUI.click(findTestObject('Gestion/Turnos/Lista de Turnos/1 Especialidades/chk_Marcar Todos'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Lista de Turnos/3 Usuario/select_Usuario'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Gestion/Turnos/Lista de Turnos/3 Usuario/select_Usuario'), 1)

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Lista de Turnos/btn_Reasignar turnos'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Filtros/0 Oficinas/a_select'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Filtros/0 Oficinas/li_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion/Turnos/Filtros/btn_Obtener Turnos'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

