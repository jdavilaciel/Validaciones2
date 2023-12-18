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

'CrearUsuario.CrearTerminales'
WebUI.setText(findTestObject('Configuracion/Sistema/Parametros Generales/Filtro 1er valor/input_Texto a buscar1'), 'CrearUsuario.CrearTerminales')

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/botones filtro/btn_Filtrar'))

WebUI.delay(2)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/a_Editar'))

WebUI.delay(2)

'si o no'
WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/input_Valor'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro SI NO/li_No'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Configuracion/Sistema/Parametros Generales/Cambiar Parametro Valor/a_Guardar'))

WebUI.delay(3)

WebUI.click(findTestObject('1Inicio/a_Inicio'))

WebUI.delay(3)

'para crear usuario'
WebUI.click(findTestObject('1Inicio/img_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/img_Usuarios'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/1Principal/img_Agregar Usuarios'))

WebUI.delay(3)

'datos usuario a crear'
WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/1Informacion Principal/input_Usuario'), 
    'juan')

WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/1Informacion Principal/input_Nombre a mostrar'), 
    'Juan')

WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/1Informacion Principal/input_Correo'), 'juan@gmail.com')

WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/1Informacion Principal/input_Celular'), 
    '3197654321')

'Seleccionar Oficina ciel'
WebUI.selectOptionByIndex(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/select_Colombia'), 
    1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/select_Departamentos'), 
    1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/select_Ciudades'), 
    1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/select_Oficinas'), 
    1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/select_Colombia'), 
    1)

WebUI.delay(3)

'Escoger Oficina Bogota y luego Ciel'
WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/chk_Bogota'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'filtrar'
WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/btn_FiltrarOficinas'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/chk_Bogota-Ciel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Agregar Usuarios/Agregar Usuario1/img_Nuevo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/1Principal/img_Usuarios por Terminales'))

WebUI.delay(3)

'Buscar usuario creado'
WebUI.setText(findTestObject('Configuracion/Seguridad/Usuarios/Usuarios por Terminales/2Usuarios/input__TextoABuscar'), 
    'juan')

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Usuarios por Terminales/2Usuarios/img_Filtrar'))

WebUI.delay(3)

WebUI.click(findTestObject('Configuracion/Seguridad/Usuarios/Usuarios por Terminales/2Usuarios/a_Seleccionar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

'Cambiar el nombre de la imagen de acuerdo al caso'
WebUI.delay(3)

