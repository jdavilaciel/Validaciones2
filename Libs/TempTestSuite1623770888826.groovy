import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/117.Usuarios.Contrasena.ExpRegular')

suiteProperties.put('name', '117.Usuarios.Contrasena.ExpRegular')

suiteProperties.put('description', 'Establece la expresi\u00F3n regular que debe tener la contrase\u00F1a.')

suiteProperties.put('stopImmediately', 'false')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\CIEL INGENIERIA\\KATALON\\Validaciones\\Reports\\20210615_102808\\117.Usuarios.Contrasena.ExpRegular\\20210615_102808\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/117.Usuarios.Contrasena.ExpRegular', suiteProperties, new File("E:\\CIEL INGENIERIA\\KATALON\\Validaciones\\Reports\\20210615_102808\\117.Usuarios.Contrasena.ExpRegular\\20210615_102808\\testCaseBinding"))
