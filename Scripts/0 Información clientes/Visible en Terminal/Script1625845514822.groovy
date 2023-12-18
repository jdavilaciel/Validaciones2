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

WebUI.click(findTestObject('Configuracion/1Principal/img_Datos Complementarios'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Datos Complementarios/img_Informacion Clientes'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/select_OrigenDeCliente'), 
    1)

WebUI.delay(3)

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_1Tipo Identificacion'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_2Identificacion'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_3Lugar de Expedicion'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_4Primer nombre'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_5Segundo nombre'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_6Primer apellido'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_7Segundo apellido'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_8Direccion'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_9Razon Social'))

WebUI.scrollToPosition(0, 1200)

WebUI.delay(3)

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_10Telefono Trabajo'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_11Telefono Residencia'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_12Telefono Celular'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_13Fecha afiliacion'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_14Fecha nacimiento'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_15E-mail'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_16Genero'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_17Estado cliente'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_18Codigo'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_19Barrio residencia'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_20Ciudad'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_21Tipo usuario cliente'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_22Tipo sangre'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_23Parametro 1'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_24Parametro 2'))

WebUI.check(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/1Visible en terminal/chk_25Parametro 3'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Datos Complementarios/Informacion Clientes/1 Parametros a mostrar del Cliente/Mostrar del Cliente/img_Actualizar'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos Del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Abrimos la Terminal'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/1Terminales menos WorkFlow/a_Terminal Informacion A01'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Llamar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgOcupado/a_Actualizacion de Datos'))

WebUI.delay(3)

'Verificamos si están presentes todos los elementos que se seleccionaron'
WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_1TipoIdentificacion'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_2Identificacion'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_3Lugar de expedicion'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_4Primer nombre'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_5Segundo nombre'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_6Primer apellido'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_7Segundo apellido'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_8Direccion'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_9Razon Social'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_10Telefono Trabajo'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_11Telefono Residencia'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_12Telefono Celular'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_13Fecha afiliacion ddmmaaaa'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_14Fecha nacimiento ddmmaaaa'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_15E-mail'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_16Genero'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_17EStado cliente'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_18Codigo'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_19Tipo usuario cliente'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_20Departamento'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_20Barrio residencia'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_21Ciudad'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/select_22Tipo sangre'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_23Parametro 1'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_24Parametro 2'))

WebUI.verifyElementVisible(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/0Campos/0Cliente/input_25Parametro 3'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgCerrar/btn_FindeJornada'))

WebUI.delay(3)

