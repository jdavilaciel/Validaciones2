package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Url inicio Digiturno</p>
     */
    public static Object Url
     
    /**
     * <p>Profile default : Url para Terminales</p>
     */
    public static Object UrlTerminales
     
    /**
     * <p>Profile default : Url para Grupos</p>
     */
    public static Object UrlGrupos
     
    /**
     * <p>Profile default : Para Terminal 2 PQRS</p>
     */
    public static Object UrlTerminal2
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Url = selectedVariables['Url']
            UrlTerminales = selectedVariables['UrlTerminales']
            UrlGrupos = selectedVariables['UrlGrupos']
            UrlTerminal2 = selectedVariables['UrlTerminal2']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
