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

WebUI.click(findTestObject('1Inicio/img_Operacion'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos Del Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Selectores/00Oficinas/a_Bogota - CIEL'))

WebUI.delay(3)

'Abrimos Terminal'
WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/1Terminales menos WorkFlow/a_Terminal Informacion A01'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Llamar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgOcupado/a_Actualizacion de Datos'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('2 Operacion/Elementos del Sistema/Terminales/Terminal/Funciones Basicas/imgCerrar/btn_FindeJornada'))

WebUI.delay(3)

