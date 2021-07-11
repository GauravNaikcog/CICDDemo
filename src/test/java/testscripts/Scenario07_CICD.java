package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario07_CICD extends TestConfigurations {

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_ITA_ELX(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_DEU_AEG(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}




	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_POL_ELX_D2(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC007_ITA_ELX_D2_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Checkout Address_Verify the Validations in Checkout Address page - Delivery and Billing address as different");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}





}