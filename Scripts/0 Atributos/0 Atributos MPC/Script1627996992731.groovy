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

WebUI.click(findTestObject('1Inicio/img_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/img_Usuarios'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/1Principal/img_Atributos'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Atributos/2Lista de Niveles/a_Seleccionar1'))

WebUI.delay(3)

'Captura de los atributos creados'
WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.back()

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

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos Del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Selectores'))

WebUI.delay(3)

'Escogemos oficina'
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

WebUI.delay(3)

'Cambiamos a la ventana principal'
WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('0Inicio Sesion/Menu Tres Rayas/img_TresRayas_MenuUsuario'))

WebUI.click(findTestObject('0Inicio Sesion/Menu Tres Rayas/a_Cerrar sesion'))

'Abrimos sesión con usuario Jaime'
WebUI.delay(3)

WebUI.setText(findTestObject('0Inicio Sesion/input__Usuario'), 'jaime')

WebUI.setText(findTestObject('0Inicio Sesion/input__Clave'), 'Digiturno5')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

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

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Buscar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/imgBuscar/etiquetas/span_Suspendido'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(8)

'Cambiamos de ventana y navegamos al MPC'
WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.navigateToUrl('http://localhost:8823/Player.aspx?recurso=Imagen')

WebUI.delay(3)

WebUI.click(findTestObject('0 MPC/div_Base'))

WebUI.acceptAlert()

WebUI.delay(3)

'Cambiamos de ventana y a la terminal abierta'
WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Buscar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgCerrar/btn_FindeJornada'))

WebUI.delay(3)

