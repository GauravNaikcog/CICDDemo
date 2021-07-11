package com.cognizant.framework.selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.browserstack.local.Local;
import com.cognizant.framework.FrameworkException;
import com.cognizant.framework.Settings;

public class BrowserStackDriverFactory {

	private BrowserStackDriverFactory() {
		// To prevent external instantiation of this class
	}

	/**
	 * Function to return the BrowserStack DesktopCloud {@link RemoteWebDriver}
	 * object based on the parameters passed
	 * 
	 * @param browserStackURL
	 *            The BrowserStack URL to be used for the test execution
	 * @param browser
	 *            The Browser {@link Browser}
	 * @param browserVersion
	 *            The browser version
	 * @param platformName
	 *            The platform to be used for the test execution (Windows, Mac,
	 *            etc.)
	 * @param testParameters
	 *            The testParameters {@link SeleniumTestParameters}
	 * 
	 * @return The corresponding {@link RemoteWebDriver} object
	 */

	public static WebDriver getBrowserStackRemoteWebDriver(String browserStackURL, Browser browser,
			String browserVersion, Platform platformName, SeleniumTestParameters testParameters) {
		WebDriver driver = null;
		Properties mobileproperties = Settings.getMobilePropertiesInstance();
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platform", platformName);
		desiredCapabilities.setCapability("browser_version", browserVersion);
		desiredCapabilities.setCapability("browser", browser);
		desiredCapabilities.setCapability("screen-resolution", mobileproperties.get("BrowserStackScreenResolution"));
		try {
			driver = new RemoteWebDriver(new URL(browserStackURL), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new FrameworkException(
					"The RemoteWebDriver/Browser invokation has problem, please re-check the capabilities and check the BrowserStack details URL, Username and accessKey ");
		}
		return driver;
	}

	/**
	 * Function to return the object for RemoteWebDriver {@link RemoteWebDriver}
	 * object
	 * 
	 * @param executionPlatform
	 *            executionPlatform{@link MobileExecutionPlatform}
	 * @param deviceName
	 *            The deviceName
	 * @param browserStackURL
	 *            The BrowserStack URL
	 * @param testParameters
	 *            The testParameters {@link SeleniumTestParameters}
	 * 
	 * @return Instance of the {@link RemoteWebDriver} object
	 */
	public static WebDriver getBrowserStackRemoteWebDriverMobile(MobileExecutionPlatform executionPlatform,
			String deviceName, String browserStackURL, SeleniumTestParameters testParameters) {

		WebDriver driver = null;
		Settings.getMobilePropertiesInstance();

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		try {
			switch (executionPlatform) {

			case WEB_ANDROID:
				
				System.out.println("Inside Web Android");

				//desiredCapabilities.setCapability("browser", "Android");
				//desiredCapabilities.setCapability("os_version", "10.0");
				desiredCapabilities.setCapability("autoAcceptAlerts", true);
				desiredCapabilities.setCapability("gpsEnabled", true);
				desiredCapabilities.setCapability("autoDismissAlerts", true);
				desiredCapabilities.setCapability("browser", executionPlatform);
				desiredCapabilities.setCapability("device", deviceName);
				desiredCapabilities.setCapability("browserstack.debug","true");
				desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
						
//				desiredCapabilities.setCapability("os_version", "10.0");
//				desiredCapabilities.setCapability("device", "Google Pixel 3");
//				desiredCapabilities.setCapability("real_mobile", "true");
//				desiredCapabilities.setCapability("browserstack.local", "false");

				try {
					System.out.println("Inside Web Android try");
					driver = new RemoteWebDriver(new URL(browserStackURL), desiredCapabilities);
					desiredCapabilities.setCapability("autoAcceptAlerts", true);
					desiredCapabilities.setCapability("gpsEnabled", true);
					desiredCapabilities.setCapability("autoDismissAlerts", true);
					desiredCapabilities.setCapability("browser", executionPlatform);
					desiredCapabilities.setCapability("device", deviceName);
					desiredCapabilities.setCapability("browserstack.debug","true");
					desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
					//driver = new RemoteWebDriver(new URL(), desiredCapabilities);
				} catch (MalformedURLException e) {
					throw new FrameworkException(
							"The RemoteWebDriver/browser invokation has problem, please re-check the capabilities and check the BrowserStack details URL, Username and accessKey ");
				}
				break;

			case WEB_IOS:
				
						
				desiredCapabilities.setCapability("autoAcceptAlerts", true);
				//System.setProperty("http.proxyHost","proxy.cognizant.com");
		        //System.setProperty("http.proxyPort","6050");
				desiredCapabilities.setCapability("browserstack.local", "true");
				//# creates an instance of Local
				Local bsLocal = new Local();
				HashMap<String, String> bsLocalArgs = new HashMap<String, String>();
				bsLocalArgs.put("key", "2vTLgPn3qDAuAUhjjXQr");

				//# starts the Local instance with the required arguments
				bsLocal.start(bsLocalArgs);

				//# check if BrowserStack local instance is running
				System.out.println(bsLocal.isRunning());

				//#stop the Local instance
				//bsLocal.stop();
				desiredCapabilities.setCapability("locationContextEnabled", true);
				desiredCapabilities.setCapability("autoDismissAlerts", true);
				desiredCapabilities.setCapability("browser", executionPlatform);
				desiredCapabilities.setCapability("device", deviceName);
				desiredCapabilities.setCapability("browserstack.debug","true");
				desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
//				desiredCapabilities.setCapability("browser", "iPhone");
//				desiredCapabilities.setCapability("os_version", "13");
//				desiredCapabilities.setCapability("device", deviceName);
//				desiredCapabilities.setCapability("browserstack.debug","true");
//				desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
//				desiredCapabilities.setCapability("platform", "MAC");
//				//desiredCapabilities.setCapability("device", deviceName);
				// desiredCapabilities.setCapability("browserstack.debug",
				// "true");

				try {
					
					driver = new RemoteWebDriver(new URL(browserStackURL), desiredCapabilities);
//					System.setProperty("http.proxyHost","proxy.cognizant.com");
//			        System.setProperty("http.proxyPort","6050");
//					desiredCapabilities.setCapability("browserstack.local", "true"); 
					desiredCapabilities.setCapability("autoAcceptAlerts", true);
					desiredCapabilities.setCapability("autoGrantPermissions", "true");
					desiredCapabilities.setCapability("locationContextEnabled", true);
					desiredCapabilities.setCapability("autoDismissAlerts", true);
					desiredCapabilities.setCapability("browser", executionPlatform);
					desiredCapabilities.setCapability("device", deviceName);
					desiredCapabilities.setCapability("browserstack.debug","true");
					desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());

				} catch (MalformedURLException e) {
					throw new FrameworkException(
							"The RemoteWebDriver invokation/browser has problem, please re-check the capabilities and check the BrowserStack details URL, Username and accessKey ");
				}
				break;
				
				
			case IOS:
				desiredCapabilities.setCapability("autoAcceptAlerts", true);
				desiredCapabilities.setCapability("locationContextEnabled", true);
				desiredCapabilities.setCapability("autoDismissAlerts", true);
				desiredCapabilities.setCapability("browser", executionPlatform);
				desiredCapabilities.setCapability("device", deviceName);
				desiredCapabilities.setCapability("browserstack.debug","true");
				desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
//				desiredCapabilities.setCapability("browser", "iPhone");
//				desiredCapabilities.setCapability("os_version", "13");
//				desiredCapabilities.setCapability("device", deviceName);
//				desiredCapabilities.setCapability("browserstack.debug","true");
//				desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());
//				desiredCapabilities.setCapability("platform", "MAC");
//				//desiredCapabilities.setCapability("device", deviceName);
				// desiredCapabilities.setCapability("browserstack.debug",
				// "true");
				//desiredCapabilities.setCapability("build", testParameters.getCurrentTestcase());

				try {
					driver = new RemoteWebDriver(new URL(browserStackURL), desiredCapabilities);

				} catch (MalformedURLException e) {
					throw new FrameworkException(
							"The RemoteWebDriver invokation/browser has problem, please re-check the capabilities and check the BrowserStack details URL, Username and accessKey ");
				}
				break;
				

			default:
				throw new FrameworkException("Unhandled ExecutionMode!");

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new FrameworkException(
					"The BrowserStack driver invocation created a problem , please check the capabilities");
		}
		return driver;

	}

}
