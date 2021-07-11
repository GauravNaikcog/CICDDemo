package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario13_CICD extends TestConfigurations {

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_ITA_ELX(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_DEU_AEG(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}


	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_ITA_ELX_Iphone(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_DEU_AEG_Iphone(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_POL_ELX_D2(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}


	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void multprod_3Qty_RemoveVoucher_POL_ELX_D2_Iphone(SeleniumTestParameters testParameters) {
		   testParameters.setCurrentTestDescription("Verify the Order workflow as a Guest user with savings enabled adding Multiple products,"
		   		+ " more than 1 Quantity and removing the existing products and adding new products and completing the order workflow");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}