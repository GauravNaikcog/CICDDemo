package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario06_CICD extends TestConfigurations{

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_ITA_ELX(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_DEU_AEG(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_POL_ELX_D2(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multi_prod_quantity_voucher_CICD_TC06_POL_ELX_D2_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify multiple product multiple quantity with voucher");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	
	
	


}