package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario03_CICD extends TestConfigurations {
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_ITA_ELX(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_DEU_AEG(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}



	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_POL_ELX_D2(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void cicd_Regression_TC003_POL_ELX_D2_iPhone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription(
				"Verify the Order workflow as a Guest user, using Multiple products, More than 1 Quantity and with promotion  with all services selected in SWE ELX application");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}












}