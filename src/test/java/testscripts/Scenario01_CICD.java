package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario01_CICD extends TestConfigurations{

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void buy_X_Get_Y_Free_CICD_TC01_ITA_ELX(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
		
		@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
		public void buy_X_Get_Y_Free_CICD_TC01_DEU_AEG(SeleniumTestParameters testParameters) {

			testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

			DriverScript driverScript = new DriverScript(testParameters);
			driverScript.driveTestExecution();

			tearDownTestRunner(testParameters, driverScript);
		}

		@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
		public void buy_X_Get_Y_Free_CICD_TC01_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {

			testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

			DriverScript driverScript = new DriverScript(testParameters);
			driverScript.driveTestExecution();

			tearDownTestRunner(testParameters, driverScript);
	}
			
			@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
			public void buy_X_Get_Y_Free_CICD_TC01_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}


			
			
			
			@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
			public void buy_X_Get_Y_Free_CICD_TC01_POL_ELX_D2(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}

			@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
			public void buy_X_Get_Y_Free_CICD_TC01_POL_ELX_D2_iPhone(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate that the CICD changes for Buy x get y free scenario");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}			
			
			
			
			
			
			
			
			
			
			
			
			
			
}