package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class Scenario17_CICD extends TestConfigurations{

	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_ITA_ELX(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_DEU_AEG(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_ITA_ELX_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_DEU_AEG_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}


	
	
	
	@Test(dataProvider = "DesktopBrowsers", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_POL_ELX(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "MobileDeviceIOS", dataProviderClass = TestConfigurations.class)
	public void exclude_include_zipcode_CICD_TC17_POL_ELX_D2_iPhone(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Verify services and delivery for exclude and include zipcode");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}