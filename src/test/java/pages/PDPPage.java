package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class PDPPage extends MasterPage {

	@FindBy(xpath = "//span[@class='D2CMiniBasket-itemCount']")
	WebElement basketIcon;

	@FindBy(xpath = "//button[contains(@data-binding,'Accept')]")
	WebElement cookieAccept;

	@FindBy(xpath = "(//button[contains(@class,'AddToBasket')])[1]")
	WebElement addToBasket;

	@FindBy(xpath = "(//a[contains(@href,'basket')])[2]")
	WebElement viewBasket;

	@FindBy(xpath = "(//label[@class='Checkbox-label'])[1]")
	WebElement plpPageProductCheckbox;

	@FindBy(xpath = "//div[@class='D2CPDP-Promoted-Product']")
	WebElement plpPageProductY;

	// @FindBy(xpath = "(//div[contains(@class,'D2CPDP-Promoted')])[2]")
	// WebElement promotedProduct;

	@FindBy(xpath = "(//div[contains(@class,'D2CPDP-Promoted')])")
	WebElement promotedProduct;

	@FindBy(xpath = "//div[contains(@class,'Checkbox D2CPDP-Promoted-Product-Checkbox')]")
	WebElement promotionSelectionCheckbox;

	// @FindBy(xpath =
	// "//label[contains(@for,'D2CPDP-Promoted-Product--checkbox')]")
	// WebElement promotionSelectionCheckbox;

	@FindBy(xpath = "//span[contains(text(),'POSTI Delivery fi')]")
	WebElement postiDeliveryText;

	@FindBy(xpath = "//span[contains(text(),'POSTNORD Delivery sv')]")
	WebElement postNordDeliveryText;

	@FindBy(xpath = "//button[contains(@data-binding,'Accept')]")
	WebElement cookieaccept;

	public PDPPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to add to basket multiple products*
	 * @Author : Mohan
	 ************************************************************************/
	public void addToBasketMultiProducts() throws InterruptedException {
		driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		String applicationUrlData2 = dataTable.getData("General_Data", "ApplicationURL2");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		WebDriverWait wait =new WebDriverWait(driver.getWebDriver(), 120);
		driver.get(applicationUrlData2);
		wait.until(ExpectedConditions.visibilityOf(addToBasket));		
		ex.executeScript("arguments[0].click();", addToBasket);
		report.updateTestLog("Add to Basket", "Product 2 is added to basket : " + applicationUrlData2, Status.PASS);
		//Thread.sleep(8000);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to add to basket single product*
	 * @Author : Gaurav
	 ************************************************************************//*
	public void addToBasketSingleProduct() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver.getWebDriver(),60);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
	try {
			wait.until(ExpectedConditions.visibilityOf(cookieaccept));
			cookieAccept.click();
			report.updateTestLog("Cookie accept button", "Clicked on cookie accept button", Status.PASS);
			//Thread.sleep(4000);
		} catch (Exception e) {
			report.updateTestLog("Cookie accept button", "Cookie accept button is not present", Status.PASS);
		}
	
	   driver.getWebDriver().getCurrentUrl();
	   driver.getWebDriver().navigate().to(driver.getCurrentUrl());
	     //driver.getRemoteWebDriver().navigate().refresh();
		 driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 wait.until(ExpectedConditions.elementToBeClickable(addToBasket));
		 //Thread.sleep(4000);
		 
			//driver.getWebDriver().navigate().refresh();
		 //driver.getWebDriver().manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		try{
		 if(addToBasket.isDisplayed()){
			 ex.executeScript("arguments[0].scrollIntoView();", addToBasket);
			 ex.executeScript("arguments[0].click();", addToBasket); 
			 report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		 }
		} catch(Exception e){
			report.updateTestLog("Add to Basket", "Add to basket button is not available", Status.FAIL);
		 }
		} 
		 catch(Exception e){
			 driver.getWebDriver().navigate().refresh();
				driver.getWebDriver().manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			 ex.executeScript("arguments[0].scrollIntoView();", addToBasket);
		 	 ex.executeScript("arguments[0].click();", addToBasket); 
		     report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		// driver.getWebDriver().navigate().refresh();
		 //driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 //wait.until(ExpectedConditions.visibilityOf(addToBasket));
		
		 //Thread.sleep(8000);
		 
		 Thread.sleep(3000);
		 }
	*/
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to add to basket single product*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addToBasketSingleProduct() throws InterruptedException {
		String applicationUrlData = dataTable.getData("General_Data", "ApplicationUrl");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		Thread.sleep(4000);
		try {
			WebDriverWait(driver.getWebDriver(), cookieAccept, 120);
			waitUntilElementVisible(cookieAccept, 120);
			cookieAccept.click();
			report.updateTestLog("Cookie accept button", "Clicked on cookie accept button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Cookie accept button", "Cookie accept button is not present", Status.PASS);
		}
		driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		ex.executeScript("arguments[0].scrollIntoView();", addToBasket);
		ex.executeScript("arguments[0].click();", addToBasket);
		// addtobasket.click();
		report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		report.consolidateScreenshotsInWordDoc();
		Thread.sleep(4000);
	}
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to add to basket single product*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addToBasketSingleProductNew() throws InterruptedException {
		driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver.getWebDriver(),120);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();

		try {
		ex.executeScript("arguments[0].scrollIntoView();", addToBasket);
		ex.executeScript("arguments[0].click();", addToBasket);
		report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		Thread.sleep(3000);
	}
	catch(Exception e){
		report.updateTestLog("Add to Basket", "Add to basket button is not available", Status.FAIL);
	}
		report.consolidateScreenshotsInWordDoc();
}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to Add to Basket second product*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addToBasketProduct2() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), addToBasket, 60);
		addToBasket.click();
		report.updateTestLog("Add to Basket for product 2", "Product 2 is added to basket", Status.PASS);
		Thread.sleep(8000);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to click on Add to Basket Button*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addToBasket() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(addToBasket));
		addToBasket.click();
		report.updateTestLog("Add to basket", "Product is added to basket", Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to click on View Basket Button*
	 * @Author : Gaurav
	 ************************************************************************/
	public void viewBasket() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 180);
		wait.until(ExpectedConditions.visibilityOf(basketIcon));
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].click();", basketIcon);
//		wait.until(ExpectedConditions.visibilityOf(viewBasket));
		JavascriptExecutor e = (JavascriptExecutor) driver.getWebDriver();
		e.executeScript("arguments[0].click();", viewBasket);
		System.out.println("Clicked on basket icon");
		report.updateTestLog("View Basket", "Clicked on View Basket", Status.PASS);
		report.consolidateScreenshotsInWordDoc();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to verify the Buy X Get Y applied
	 *              product*
	 * @Author : Gaurav
	 ************************************************************************/
	public void buyXGetYProduct() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(addToBasket));
		if (plpPageProductCheckbox.isSelected()) {
			report.updateTestLog("Product Y checkbox in PDP Page",
					"Checkbox for product Y is selected by default in PDP page", Status.PASS);
		} else {
			report.updateTestLog("Product Y checkbox in PDP Page",
					"Checkbox for product Y is not selected by default in PDP page", Status.FAIL);
		}
		if (plpPageProductY.isDisplayed()) {
			report.updateTestLog("Product Y details in PDP Page", "Product Y details is displayed in PDP page",
					Status.PASS);
		} else {
			report.updateTestLog("Product Y details in PDP Page", "Product Y details is not displayed in PDP page",
					Status.FAIL);
		}
		addToBasket.click();
		report.updateTestLog("Add to basket", "Product is added to basket", Status.PASS);
		Thread.sleep(6000);
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : promotionAppliedProductVerification()*
	 * @Description : This function is used to verify the promotion applied product*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promotionAppliedProductVerification() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {

			WebDriverWait(driver.getWebDriver(), promotedProduct, 120);
			waitUntilElementVisible(promotedProduct, 120);

			if (promotedProduct.isDisplayed()) {
				report.updateTestLog("Promotion applied product",
						"Promotion applied product Y is displayed for the selected product X", Status.PASS);
			} else {
				report.updateTestLog("Promotion applied product",
						"Promotion applied product Y is not displayed for the selected product X", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promotion applied product",
					"Promotion applied product Y is not displayed for the selected product X", Status.FAIL);
		}
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : promotionCheckboxSelection()*
	 * @Description : This function is used to select the promotion product
	 *              checkbox*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promotionSelectionCheckboxVerification() throws InterruptedException {
		Thread.sleep(8000);
		try {
			WebDriverWait(driver.getWebDriver(), promotionSelectionCheckbox, 120);
			waitUntilElementVisible(promotionSelectionCheckbox, 120);

			if (promotionSelectionCheckbox.isDisplayed()) {
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is displayed for the selected product", Status.PASS);
			} else {
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is not displayed for the selected product", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promotion Selection Checkbox",
					"Promotion Selection Checkbox is not displayed for the selected product", Status.FAIL);
		}
		report.consolidateScreenshotsInWordDoc();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionCheckboxSelection()*
	 * @Description : This function is used to select the promotion product
	 *              checkbox*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promotionCheckboxSelection() {
		try {
			if (promotionSelectionCheckbox.isSelected()) {
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is checked for the selected product", Status.PASS);
			} else {
				promotionSelectionCheckbox.click();
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is checked for the selected product", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Promotion Selection Checkbox",
					"Promotion Selection Checkbox is not checked for the selected product", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promotionCheckboxSelection1()*
	 * @Description : This function is used to select the promotion product
	 *              checkbox*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promotionCheckboxSelection1() {
		try {
			promotionSelectionCheckbox.click();
			if (promotionSelectionCheckbox.isSelected()) {
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is checked for the selected product", Status.PASS);
			} else {
				promotionSelectionCheckbox.click();
				report.updateTestLog("Promotion Selection Checkbox",
						"Promotion Selection Checkbox is checked for the selected product", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Promotion Selection Checkbox",
					"Promotion Selection Checkbox is not checked for the selected product", Status.FAIL);
		}
	}

	public void AddtoBasketSingleProductPostiService() throws InterruptedException {
		Thread.sleep(3000);
		try {
			cookieAccept.click();
			report.updateTestLog("Cookie accept button", "Clicked on cookie accept button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Cookie accept button", "Cookie accept button is not present", Status.PASS);
		}
		Thread.sleep(5000);
		String postiService = postiDeliveryText.getText().trim();
		if (postiDeliveryText.isDisplayed()) {
			report.updateTestLog("POSTIservice delivery method is available",
					"POSTIservice delivery method should be available: " + postiService, Status.PASS);
		}
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].click();", addToBasket);
		report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		Thread.sleep(4000);
	}

	public void AddtoBasketSingleProductPostNordService() throws InterruptedException {
		Thread.sleep(3000);
		try {
			cookieAccept.click();
			report.updateTestLog("Cookie accept button", "Clicked on cookie accept button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Cookie accept button", "Cookie accept button is not present", Status.PASS);
		}
		Thread.sleep(5000);
		String postiService = postNordDeliveryText.getText().trim();
		if (postNordDeliveryText.isDisplayed()) {
			report.updateTestLog("POST Nord service delivery method available",
					"POST Nord service delivery method should available: " + postiService, Status.PASS);
		}
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].click();", addToBasket);
		report.updateTestLog("Add to Basket", "Product 1 is added to basket", Status.PASS);
		Thread.sleep(4000);
	}

	public void cookieAccept() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver.getWebDriver(),120);
		try {
			wait.until(ExpectedConditions.visibilityOf(cookieaccept));
			cookieaccept.click();
			report.updateTestLog("Cookie accept button", "Clicked on cookie accept button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Cookie accept button", "Cookie accept button is not present", Status.PASS);
		}
	}
}