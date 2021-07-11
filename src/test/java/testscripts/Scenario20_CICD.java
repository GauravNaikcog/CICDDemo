package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario20_CICD extends TestConfigurations {
	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_ITA_ELX(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_ITA_ELX_Iphone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_DEU_AEG(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_DEU_AEG_Iphone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_ITA_ELX_D2(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
		
	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void parcel_Delivery_WithoutServices_ITA_ELX_D2_Iphone(SeleniumTestParameters testParameters) {
		testParameters.setCurrentTestDescription("Validate that the order workflow with parcel delivery method without any product services tagged to product");
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	

}
