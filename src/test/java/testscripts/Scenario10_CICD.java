package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario10_CICD extends TestConfigurations{

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void address_same_edit_checkCICD_TC10_ITA_ELX(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
		
		@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
		public void address_same_edit_checkCICD_TC10_DEU_AEG(SeleniumTestParameters testParameters) {

			testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

			DriverScript driverScript = new DriverScript(testParameters);
			driverScript.driveTestExecution();

			tearDownTestRunner(testParameters, driverScript);
		}

		@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
		public void address_same_edit_checkCICD_TC10_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {

			testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

			DriverScript driverScript = new DriverScript(testParameters);
			driverScript.driveTestExecution();

			tearDownTestRunner(testParameters, driverScript);
		}
			
			@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
			public void address_same_edit_checkCICD_TC10_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}

			
			
			@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
			public void address_same_edit_checkCICD_TC10_POL_ELX_D2(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}

			@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
			public void address_same_edit_checkCICD_TC10_POL_ELX_D2_iPhone(SeleniumTestParameters testParameters) {

				testParameters.setCurrentTestDescription("Validate edit from payment to addrss and delivery page both billing and mailing adress same");

				DriverScript driverScript = new DriverScript(testParameters);
				driverScript.driveTestExecution();

				tearDownTestRunner(testParameters, driverScript);
			}			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}