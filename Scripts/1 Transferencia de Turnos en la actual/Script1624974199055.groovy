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

WebUI.click(findTestObject('Configuracion/1Principal/img_Distribucion Geografica'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Distribucion Geografica/1Principal/img_Grupos'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/0Oficinas Emergente/a_Seleccionar'))

WebUI.delay(3)

'Grupo Información'
WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/Lista de Grupos/0General/a_Seleccionar'))

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Configuracion/Distribucion Geografica/Grupos/Edicion/select_TransferenciaTurnosEnLaActual'), 
    'Sala', false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/Botones/img_Actualizar'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/1Terminales menos WorkFlow/a_Terminal Informacion A01'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Llamar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgOcupado/a_Actualizacion de Datos'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Transferir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgCerrar/btn_FindeJornada'))

'Volvemos a grupos'
WebUI.navigateToUrl(GlobalVariable.UrlGrupos)

WebUI.acceptAlert()

WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/0Oficinas Emergente/a_Seleccionar'))

WebUI.delay(3)

'Grupo Información'
WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/Lista de Grupos/0General/a_Seleccionar'))

WebUI.scrollToPosition(0, 300)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Configuracion/Distribucion Geografica/Grupos/Edicion/select_TransferenciaTurnosEnLaActual'), 
    'Grupo', false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Distribucion Geografica/Grupos/Botones/img_Actualizar'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/1Terminales menos WorkFlow/a_Terminal Informacion A01'))

WebUI.switchToWindowIndex(2)

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Llamar'))

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgOcupado/a_Actualizacion de Datos'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Adicionales/img_Transferir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgCerrar/btn_FindeJornada'))

WebUI.delay(3)

