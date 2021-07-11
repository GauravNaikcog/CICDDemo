package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class AdditionalSC04_CICD extends TestConfigurations{

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void verifyPrices_MultProd_Add1Service_Navigate_Remv1Service_BasketPage_ITA_ELX(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Verify the prices in basket page and cart summary of the checkout page once we add and  remove services one by one  in basket page");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}



	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void verifyPrices_MultProd_Add1Service_Navigate_Remv1Service_BasketPage_ITA_ELX_D2(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Verify the prices in basket page and cart summary of the checkout page once we add and  remove services one by one  in basket page");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void verifyPrices_MultProd_Add1Service_Navigate_Remv1Service_BasketPage_DEU_AEG(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Verify the prices in basket page and cart summary of the checkout page once we add and  remove services one by one  in basket page");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
}