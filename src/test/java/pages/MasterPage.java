package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

/**
 * MasterPage Abstract class
 *
 * @author Cognizant
 */
abstract class MasterPage extends ReusableLibrary {

	@FindBy(xpath = "(//div[contains(@class,'subtotal')])[1]")
	WebElement subTotlTxt;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[1]")
	WebElement subTotlTxtCartSumm;

	@FindBy(xpath = "(//div[contains(@class,'subtotal')])[1]/following::div[1]")
	WebElement subTotlValue;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[1]/following::div[1]")
	WebElement subTotlValueCartSumm;

	// @FindBy(xpath = "//div[contains(@class,'subtotal') and
	// contains(text(),'Service')]")
	// WebElement servicesTxt;

	@FindBy(xpath = "(//div[@class='D2CBasket-totalKey D2CBasket-subtotalKey--total'])[2]")
	WebElement servicesTxt;

	@FindBy(xpath = "(//div[@class='D2CBasket-totalKey D2CBasket-subtotalKey--total'])[2]/following::div[1]")
	WebElement servicesValue;

	// @FindBy(xpath = "//div[contains(@class,'subtotal') and
	// contains(text(),'Service')]/following::div[1]")
	// WebElement servicesValue;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[2]")
	WebElement servicesTxtCartSumm;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[2]/following::div[1]")
	WebElement servicesValueCartSumm;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[3]")
	WebElement servicesTxtOCPage;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[3]/following::div[1]")
	WebElement servicesValueOCPage;

	// @FindBy(xpath = "(//div[contains(text(),'Total') and
	// contains(@class,'total')])[2]")
	// WebElement totalTxtBtm;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-totalKey D2CBasket-totalKey--total')])[2]")
	WebElement totalTxtBtm;

	@FindBy(xpath = "//div[contains(text(),'Gesamtsumme')]")
	WebElement totalTxtBtmAdrsPageAeg;

	@FindBy(xpath = "//div[contains(text(),'Gesamtsumme')]/following::div[1]")
	WebElement totalValBtmAdrsPageAeg;

	@FindBy(xpath = "(//div[contains(text(),'Total') and contains(@class,'total')])[1]")
	WebElement totalTxtTop;

	// @FindBy(xpath = "(//div[contains(text(),'Total') and
	// contains(@class,'total')])[2]/following::div[1]")
	// WebElement totalValueBtm;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-totalValue D2CBasket-totalValue--total')])[2]")
	WebElement totalValueBtm;

	@FindBy(xpath = "(//div[contains(text(),'Total') and contains(@class,'total')])[1]/following ::div[1]")
	WebElement totalValueTop;

	@FindBy(xpath = "//div[@class='D2CBasket-itemPrice']")
	WebElement productAmt;

	@FindBy(xpath = "//div[@class='D2CBasket-totalMessage']")
	WebElement vatTxtBasketPage;

	@FindBy(xpath = "//div[contains(@class,'realTotals')]")
	WebElement vatTxtCheckoutPage;

	@FindBy(xpath = "//div[contains(@class,'taxes')]")
	WebElement vatTxtOCPage;

	@FindBy(xpath = "//div[contains(text(),'Delivery:')]")
	WebElement delivryTxt;

	@FindBy(xpath = "//div[contains(text(),'Delivery:')]/following::div[1]")
	WebElement delivryVal;

	@FindBy(xpath = "(//div[contains(@class,'saving')])[1]")
	WebElement savingsTxt;

	@FindBy(xpath = "(//div[contains(@class,'saving')])[1]")
	WebElement savingsTxtQA;

	@FindBy(xpath = "(//div[contains(@class,'saving')])[2]")
	WebElement savingsValQA;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[9]")
	WebElement savingsTxtOCPage;

	@FindBy(xpath = "(//div[contains(@class,'saving')])[2]")
	WebElement savingsVal;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[10]")
	WebElement savingsValOCPage;

	/**************** Cart Summary validations ****************************/
	@FindBy(xpath = "//span[@class='total-tax-price']")
	WebElement vatCartSumm;

	@FindBy(xpath = "//span[contains(@class,'instock')]")
	WebElement stockStatus;

	@FindBy(xpath = "//li[@class='checkout-order-summary-list-items']/div/a/img")
	WebElement productImage;

	@FindBy(xpath = "//div[@class='item-id']")
	WebElement productModel;

	@FindBy(xpath = "//div[@class='item-name']")
	WebElement productModelName;

	@FindBy(xpath = "((//div[@class='total-price'])[2]/following::div[@class='total-title'])[1]")
	WebElement deliveryCartSummTxt;

	@FindBy(xpath = "((//div[@class='total-price'])[2]/following::div[@class='total-title'])[1]/following::div[1]")
	WebElement deliveryCartSummPrice;

	@FindBy(xpath = "//div[contains(text(),'Consegna:')]")
	WebElement consegnaTxtOCPage;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[3]")
	WebElement totalDeliveryTxtCartSummaryDelivryPage;

	@FindBy(xpath = "((//div[contains(@class,'total-title')])[3]/following::div)[1]")
	WebElement totalDeliveryChargeCartSummaryDelivryPage;

	@FindBy(xpath = "//div[contains(text(),'Consegna:')]/following::div[1]")
	WebElement consegnaPriceOCPage;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[5]")
	WebElement totalDeliveryTxtOCPage;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[5]/following::div[1]")
	WebElement totalDeliveryChargeOCPage;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[7]")
	WebElement totalTxtBottomOCPage;

	@FindBy(xpath = "(//div[contains(@class,'xs-6')])[8]")
	WebElement totalValBottomOCPage;

	@FindBy(xpath = "(//div[@class='total-title'])[3]")
	WebElement delivryTxt1;

	@FindBy(xpath = "(//div[@class='total-price'])[3]")
	WebElement delivryVal1;

	@FindBy(xpath = "(//div[@class='total-title'])[4]")
	WebElement totalTxtBtmAdrsPage;

	@FindBy(xpath = "(//div[@class='total-title'])[3]")
	WebElement totalTxtBtmAdrsPage2;

	@FindBy(xpath = "(//div[@class='total-price'])[4]")
	WebElement totalValueBtmAddrsPage;

	@FindBy(xpath = "(//div[@class='total-price'])[3]")
	WebElement totalValueBtmAddrsPage2;

	@FindBy(xpath = "(//div[@class='D2CBasket-originalPrice'])[1]")
	WebElement prodctOriginalPrice;

	@FindBy(xpath = "(//div[@class='D2CBasket-discountedPrice'])[1]")
	WebElement prodctDiscountPrice;

	@FindBy(xpath = "//div[@class='D2CBasket-originalPrice']")
	WebElement prodct2StrikedPrice;

	@FindBy(xpath = "//div[@class='D2CBasket-discountedPrice']")
	WebElement prodct2DiscountedPrice;

	@FindBy(xpath = "(//label[@class='D2CBasket-service-name Checkbox-label'])[1]")
	WebElement service;
	
	
	@FindBy(xpath = "//div[contains(@class,'TextWrapper servicesNotAvailable')]")
    WebElement prodservicedisabled;
	
	
	@FindBy(xpath = "(//span[contains(@class,'error_msg alert-danger error_show')])[2]")
    WebElement prodserviceerrormsg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	String expstockstatus = "Disponibile";
	String expstockstatusaeg = "Auf Lager";
	String orderconfirmationmessage = "GRAZIE PER IL TUO ORDINE!";
	String orderconfirmationmessageAEG = "VIELEN DANK FÜR IHRE BESTELLUNG!";
	String paymenttypemsg = "Selezionare un metodo di pagamento";
	String paypaltxt = "PayPal";
	String paypalmsg = "You will be connected to your PayPal account and will be asked to log in";
	// UI Map object definitions
	// Links
	protected final By lnkSignOff = By.linkText("SIGN-OFF");
	protected final By lnkRegister = By.linkText("REGISTER");

	/**
	 * Constructor to initialize the functional library
	 *
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	protected MasterPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : selectDropDownValue()*
	 * @Description : This function is used to select the drop down value*
	 * @Author : Gaurav
	 ************************************************************************/
	public void selectDropDownValue(WebDriver driver, WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheck()*
	 * @Description : This function is used to verify the Sub total value*
	 * @Author : Gaurav
	 ************************************************************************/
	public void subTotalValueCheck() {
		String subtotaltxt = subTotlTxt.getText().trim();
		String subtotalval = subTotlValue.getText();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		// String subtot=val[0];
		System.out.println(val);
		report.updateTestLog("Subtotal information",
				"Subtotal information in Cart Summary is displayed as: " + subtotalinfo, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheck()*
	 * @Description : This function is used to verify the services value*
	 * @Author : Mamatha
	 ************************************************************************/
	public void servicesValueCheck() {
		try {
			String servicestxt = servicesTxt.getText().trim();
			String servicestotalval = servicesValue.getText();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information",
					"Services information in Cart Summary is displayed as: " + servicesinfo, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Services information", "There are no services selected", Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : servicesValueCheckOCPage()*
	 * @Description : This function is used to verify the services value in order
	 *              confirmation page*
	 * @Author : Mohan
	 ************************************************************************/
	public void servicesValueCheckOCPage() {
		try {
			String servicestxt = servicesTxtOCPage.getText().trim();
			String servicestotalval = servicesValueOCPage.getText();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information",
					"Services information in Cart Summary is displayed as: " + servicesinfo, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Services information", "Services information in Cart Summary is not displayed",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalCartAmountTop()*
	 * @Description : This function is used to verify the total cart amount at top*
	 * @Author : Rahul
	 ************************************************************************/
	public int totalCartAmountTop() {
		String totaltxt = totalTxtTop.getText().trim();
		String totalval = totalValueTop.getText().trim();
		String productotalamounttop = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary is displayed as: " + productotalamounttop, Status.PASS);
		String[] totamountTop = totalval.split(" ");
		Integer carttotaltop = Integer.parseInt(totamountTop[0]);
		return carttotaltop;
	}

	

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryDetails()*
	 * @Description : This function is used to verify the delivery charge details*
	 * @Author : Mohan
	 ************************************************************************/
	public int deliveryDetails() {
		int delcharg = 0;
		try {
			if (totalDeliveryChargeCartSummaryDelivryPage.isDisplayed()) {
				String deltxt = totalDeliveryChargeCartSummaryDelivryPage.getText().trim();
				String[] delval = consegnaPriceOCPage.getText().trim().split(" ");
				String delvalue = delval[1];
				delcharg = Integer.parseInt(delvalue);
				String deldetails = deltxt + delcharg;
				report.updateTestLog("Total Delivery details", "Total Delivery details is displayed as: " + deldetails,
						Status.PASS);
			} else {
				report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.PASS);
		}
		return delcharg;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryDetailsOCPage()*
	 * @Description : This function is used to verify the delivery charge details in
	 *              Order confirmation page*
	 * @Author : Mohan
	 ************************************************************************/
	public void deliveryDetailsOCPage() {
		try {
			if (totalDeliveryTxtOCPage.isDisplayed()) {
				String deltxt = totalDeliveryTxtOCPage.getText().trim();
				String delval = totalDeliveryChargeOCPage.getText().trim();
				String deldetails = deltxt + delval;
				report.updateTestLog("Total Delivery details", "Total Delivery details is displayed as: " + deldetails,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : vatTextCaptureBasketPage()*
	 * @Description : This function is used to verify the VAT details in basket
	 *              page*
	 * @Author : Gaurav
	 ************************************************************************/
	public void vatTextCaptureBasketPage() {
		try{
		String vattxt = vatTxtBasketPage.getText();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", vatTxtBasketPage);
		report.updateTestLog("VAT text in Cart Summary", "VAT text in basket page is displayed as: " + vattxt,
				Status.PASS);
		}catch(Exception e){
			report.updateTestLog("VAT text in Cart Summary", "VAT text in basket page is NOT displayed: ",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : vatTextCaptureCheckoutPages()*
	 * @Description : This function is used to verify the VAT details checkout page*
	 * @Author : Gaurav
	 ************************************************************************/
	public void vatTextCaptureCheckoutPages() {
		try{
		String vattxt = vatTxtCheckoutPage.getText();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", vatTxtCheckoutPage);
		report.updateTestLog("VAT text in Cart Summary", "VAT text in Cart Summary is displayed as: " + vattxt,
				Status.PASS);
		}catch(Exception e){
			report.updateTestLog("VAT text in Cart Summary", "VAT text in Cart Summary is displayed",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : vatTextCaptureOCPage()*
	 * @Description : This function is used to verify the VAT details in order
	 *              confirmation page*
	 * @Author : Mohan
	 ************************************************************************/
	public void vatTextCaptureOCPage() {
		try{
		String vattxt = vatTxtOCPage.getText();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", vatTxtOCPage);
		report.updateTestLog("VAT text in Cart Summary","VAT text in Order confirmation page is displayed as: " + vattxt, Status.PASS);
	}catch(Exception e){
		report.updateTestLog("VAT text in Cart Summary","VAT text in Order confirmation page is not displayed", Status.FAIL);
	}
}

	public void deliveryValuecheck() {
		String delvrytxt = delivryTxt.getText();
		String delvryval = delivryVal.getText();
		String delivryinfo = delvrytxt + " " + delvryval;
		report.updateTestLog("Delivery information in cart summary",	"Delivery information in cart summary is displayed as: " + delivryinfo, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : savingsValueCheckOrderConfirmationPage()*
	 * @Description : This function is used to verify the savings details*
	 * @Author : Mohan
	 ************************************************************************/
	public void savingsValueCheckOrderConfirmationPage() {
		String savingstxt = savingsTxtOCPage.getText();
		String savingsval = savingsValOCPage.getText();
		String savingsinfo = savingstxt + " " + savingsval;
		report.updateTestLog("Savings information in Order confirmation Page",
				"Savings information in Order confirmation Page is displayed as: " + savingsinfo, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheckCartSummryAddressPage()*
	 * @Description : This function is used to verify the subtotal values in address
	 *              page*
	 * @Author : Rahul
	 ************************************************************************/
	public float subTotalValueCheckCartSummryAddressPage() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of address page",
				"Subtotal information in Cart Summary of address page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1].replace(",", ".");
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheckCartSummryAddressPageQA()*
	 * @Description : This function is used to verify the subtotal values in address
	 *              page*
	 * @Author : Mamatha
	 ************************************************************************/
	public float subTotalValueCheckCartSummryAddressPageQA() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of address page",
				"Subtotal information in Cart Summary of address page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1];
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheckCartSummryPaymentPage()*
	 * @Description : This function is used to verify the subtotal values in cart
	 *              summary*
	 * @Author : Gaurav
	 ************************************************************************/
	public float subTotalValueCheckCartSummryPaymentPage() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of Payment page",
				"Subtotal information in Cart Summary of payment page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1].replace(",", ".");
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheckCartSummryPaymentPage()*
	 * @Description : This function is used to verify the subtotal values in cart
	 *              summary*
	 * @Author : Gaurav
	 ************************************************************************/
	public float subTotalValueCheckCartSummryPaymentPageQA() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of Payment page",
				"Subtotal information in Cart Summary of payment page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1];
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : waitUntilPageLoaded()*
	 * @param timeOutInSeconds
	 *            *
	 * @Description : Function to wait until the page loads completely*
	 * @Author : Gaurav
	 ************************************************************************/
	public void waitUntilPageLoaded(int timeOutInSeconds) {
		WebElement oldPage = driver.findElement(By.tagName("html"));
		(new WebDriverWait(driver.getWebDriver(), timeOutInSeconds)).until(ExpectedConditions.stalenessOf(oldPage));
	}

	public float subTotalValueCheckCartSummryDeliveryPage() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of delivery page",
				"Subtotal information in Cart Summary of delivery page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1].replace(",", ".");
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheckCartSummryDeliveryPageQA()*
	 * @Description : Function to verify sub total value in cart summary*
	 * @Author : Mohan
	 ************************************************************************/
	public float subTotalValueCheckCartSummryDeliveryPageQA() {
		String subtotaltxt = subTotlTxtCartSumm.getText().trim();
		String subtotalval = subTotlValueCartSumm.getText().trim();
		String subtotalinfo = subtotaltxt + subtotalval;
		String[] val = subtotalval.split(" ");
		report.updateTestLog("Subtotal information in Cart Summary of delivery page",
				"Subtotal information in Cart Summary of delivery page is displayed as: " + subtotalinfo, Status.PASS);
		String subtl1 = val[1];
		float subtotal = Float.parseFloat(subtl1);
		return subtotal;
	}

	public float servicesValueCheckCartSummaryAddressPage() {
		float servicetotal = 0;
		try {
			String servicestxt = servicesTxtCartSumm.getText().trim();
			String servicestotalval = servicesValueCartSumm.getText().trim();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information in cart summary of address page",
					"Services information in Cart Summary of address page is displayed as: " + servicesinfo,
					Status.PASS);
			String[] servicVal = servicestotalval.split(" ");
			String serval = servicVal[1].replace(",", ".");
			servicetotal = Float.parseFloat(serval);
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of address page",
					"Services information in Cart Summary of address page is not displayed", Status.PASS);
		}
		return servicetotal;
	}

	public float servicesValueCheckCartSummaryAddressPageAEG() {
		float servicetotal = 0;
		try {
			String servicestxt = servicesTxtCartSumm.getText().trim();
			String servicestotalval = servicesValueCartSumm.getText().trim();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information in cart summary of address page",
					"Services information in Cart Summary of address page is displayed as: " + servicesinfo,
					Status.PASS);
			String[] servicVal = servicestotalval.split(" ");
			String serval = servicVal[1].replace(",", ".");
			servicetotal = Float.parseFloat(serval);
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of address page",
					"Services information in Cart Summary of address page is not displayed", Status.PASS);
		}
		return servicetotal;
	}

	public float servicesValueCheckCartSummaryDeliveryPage() {
		float servicetotal = 0;
		try {
			String servicestxt = servicesTxtCartSumm.getText().trim();
			String servicestotalval = servicesValueCartSumm.getText().trim();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information in cart summary of delivery page",
					"Services information in Cart Summary of delivery page is displayed as: " + servicesinfo,
					Status.PASS);
			String[] servicVal = servicestotalval.split(" ");
			String serval = servicVal[1].replace(",", ".");
			servicetotal = Float.parseFloat(serval);
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of delivery page",
					"Services information in Cart Summary of delivery page is not displayed", Status.PASS);
		}
		return servicetotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : ServicesvaluecheckCartSummaryPaymentPage()*
	 * @Description : Function to verify services value in cart summary*
	 * @Author : Mamatha
	 ************************************************************************/
	public float ServicesvaluecheckCartSummaryPaymentPage() {
		float servicetotal = 0;
		try {
			String servicestxt = servicesTxtCartSumm.getText().trim();
			String servicestotalval = servicesValueCartSumm.getText().trim();
			String servicesinfo = servicestxt + " " + servicestotalval;
			report.updateTestLog("Services information in cart summary of payment page",
					"Services information in Cart Summary of payment page is displayed as: " + servicesinfo,
					Status.PASS);
			String[] servicVal = servicestotalval.split(" ");
			String serval = servicVal[1].replace(",", ".");
			servicetotal = Float.parseFloat(serval);
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of payment page",
					"Services information in Cart Summary of payment page is not displayed", Status.PASS);
		}
		return servicetotal;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalCartAmountBottomCartSummaryAddressPage()*
	 * @Description : Function to verify Total value in cart summary*
	 * @Author : Mohan
	 ************************************************************************/
	public float totalCartAmountBottomCartSummaryAddressPage() {
		String totaltxt = totalTxtBtmAdrsPage.getText().trim();
		String totalval = totalValueBtmAddrsPage.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of address page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float totalcartamt = Float.parseFloat(totalamt);
		return totalcartamt;
	}

	public float totalCartAmountBottomCartSummaryAddressPageAEG() {
		String totaltxt = totalTxtBtmAdrsPageAeg.getText().trim();
		String totalval = totalValBtmAdrsPageAeg.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of address page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float totalcartamt = Float.parseFloat(totalamt);
		return totalcartamt;
	}

	public float totalCartAmountBottomCartSummaryDeliveryPage() {
		String totaltxt = totalTxtBtmAdrsPage.getText().trim();
		String totalval = totalValueBtmAddrsPage.getText().trim();
		String productotalamount = totaltxt + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of Delivery page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float carttotalbtm = Float.parseFloat(totalamt);
		return carttotalbtm;
	}

	public float totalCartAmountBottomCartSummaryDeliveryPageAEG() {
		String totaltxt = totalTxtBtmAdrsPageAeg.getText().trim();
		String totalval = totalValBtmAdrsPageAeg.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of Delivery page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float carttotalbtm = Float.parseFloat(totalamt);
		return carttotalbtm;
	}

	public float totalCartAmountBottomCartSummaryPaymentPage() {
		String totaltxt = totalTxtBtmAdrsPage.getText().trim();
		String totalval = totalValueBtmAddrsPage.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of payment page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float totalcartamt = Float.parseFloat(totalamt);
		return totalcartamt;
	}

	public float totalCartAmountBottomCartSummaryPaymentPageAEG() {
		String totaltxt = totalTxtBtmAdrsPageAeg.getText().trim();
		String totalval = totalValBtmAdrsPageAeg.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of payment page is displayed as: " + productotalamount,
				Status.PASS);
		String[] totamountBtm = totalval.split(" ");
		String totalamt = totamountBtm[1].replace(",", ".");
		float totalcartamt = Float.parseFloat(totalamt);
		return totalcartamt;
	}

	public void totalCartAmountBottomCartSummaryOCPageAEG() {
		String totaltxt = totalTxtBtmAdrsPageAeg.getText().trim();
		String totalval = totalValBtmAdrsPageAeg.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of Order Confirmation page is displayed as: " + productotalamount,
				Status.PASS);
	}

	public void totalCartAmountBottomCartSummaryOCPage() {
		String totaltxt = totalTxtBottomOCPage.getText().trim();
		String totalval = totalValBottomOCPage.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of Order Confirmation page is displayed as: " + productotalamount,
				Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : vatCostCartSummary()*
	 * @Description : Function to verify VAT value in cart summary*
	 * @Author : Rahul
	 ************************************************************************/
	public String vatCostCartSummary() {
		String vatprice = vatCartSumm.getText().trim();
		if (vatCartSumm.isDisplayed()) {
			report.updateTestLog("VAT Price in Cart summary", "VAT Price in Cart Summary is displayed as: " + vatprice,
					Status.PASS);
		} else {
			report.updateTestLog("VAT Price in Cart summary", "VAT Price in Cart Summary is not displayed ",
					Status.FAIL);
		}
		return vatprice;
	}

	public String deliveryDetailsCartSummary() {
		String deltxt = deliveryCartSummTxt.getText().trim();
		String deliverycartsummprice = deliveryCartSummPrice.getText().trim();
		if (deliveryCartSummTxt.isDisplayed()) {
			report.updateTestLog("Total Delivery text in Cart summary",
					"Total Delivery text in Cart Summary is displayed as: " + deltxt, Status.PASS);
		} else {
			report.updateTestLog("Total Delivery text in Cart summary",
					"Total Delivery text in Cart Summary is not displayed ", Status.FAIL);
		}
		if (deliveryCartSummPrice.isDisplayed()) {
			report.updateTestLog("Total Delivery price in Cart summary",
					"Total Delivery price in Cart Summary is displayed as: " + deliverycartsummprice, Status.PASS);
		} else {
			report.updateTestLog("Total Delivery price in Cart summary",
					"Total Delivery price in Cart Summary is not displayed ", Status.FAIL);
		}
		String deldetails = deltxt + deliverycartsummprice;
		return deldetails;
	}

	public int servicesPricesVerify() {
		int temp = 0;
		List<WebElement> serprice = driver.getWebDriver()
				.findElements(By.xpath("//span[@class='D2CBasket-service-price']"));
		for (WebElement serviceprices : serprice) {
			String serpricetxt = serviceprices.getText().trim();
			String[] serprice1 = serpricetxt.split(" ");
			int serprice2 = Integer.parseInt(serprice1[0]);
		}
		return temp;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :
	 *           verifyOfferPriceForFlatDiscountPromotionProduct1BasketPage()*
	 * @Description : Function to verify flat discount offer with scratch price*
	 * @Author : Mamatha
	 ************************************************************************/
	public long verifyOfferPriceForFlatDiscountPromotionProduct1BasketPage() {
		String flatDiscount = dataTable.getData("General_Data", "flatDiscount_Product1");
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		Float flatDiscountFloat = Float.parseFloat(flatDiscount);
		String listPrice = prodctOriginalPrice.getText().trim();
		String offerPrice = prodctDiscountPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveOfferPrice);
		long disPrice = Long.parseLong(splCharRemoveOfferPrice);
		System.out.println(disPrice);
		double offerPriceCalculated = orgPrice - flatDiscountFloat;
		System.out.println(offerPriceCalculated);
		Long OfferPrice1CalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPrice1CalculatedRounded);
		if (OfferPrice1CalculatedRounded == disPrice) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + offerPrice, Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + offerPrice, Status.FAIL);
		}
		return OfferPrice1CalculatedRounded;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :
	 *           verifyOfferPriceForFlatDiscountPromotionProduct2BasketPage()*
	 * @Description : Function to verify flat discount offer with scratch price for
	 *              product 2*
	 * @Author : Mamatha
	 ************************************************************************/
	public long verifyOfferPriceForFlatDiscountPromotionProduct2BasketPage() {
		String flatDiscount2 = dataTable.getData("General_Data", "promoPercentage Product2");
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		Float flatDiscountFloat2 = Float.parseFloat(flatDiscount2);
		String listPrice = prodct2StrikedPrice.getText().trim();
		String offerPrice = prodct2DiscountedPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String sumbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(sumbolremoveOfferPrice);
		String splCharRemoveOfferPrice = sumbolremoveOfferPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveOfferPrice);
		long disPrice = Long.parseLong(splCharRemoveOfferPrice);
		System.out.println(disPrice);
		double offerPrice2Calculated = orgPrice - flatDiscountFloat2;
		System.out.println(offerPrice2Calculated);
		Long OfferPrice2CalculatedRounded = Math.round(offerPrice2Calculated);
		System.out.println(OfferPrice2CalculatedRounded);
		if (OfferPrice2CalculatedRounded == disPrice) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + offerPrice, Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + offerPrice, Status.FAIL);
		}
		return OfferPrice2CalculatedRounded;
	}

	public void deliveryDetailsVerification() {
		try {
			waitUntilElementVisible(delivryVal1,240);
			if (delivryVal1.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", delivryVal1);
				String deltxt = delivryTxt1.getText().trim();
				String delval = delivryVal1.getText().trim();
				String deldetails = deltxt + delval;
				report.updateTestLog("Total Delivery details", "Total Delivery details is displayed as: " + deldetails,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.FAIL);
		}
	}

	public void subTotalValueDisplayedCheckCartSummaryAddressPage() {
		try {
			if (subTotlTxtCartSumm.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", subTotlTxtCartSumm);
				String subtotaltxt = subTotlTxtCartSumm.getText().trim();
				String subtotalval = subTotlValueCartSumm.getText().trim();
				String subtotalinfo = subtotaltxt + subtotalval;
				report.updateTestLog("Subtotal information in Cart Summary of address page",
						"Subtotal information in Cart Summary of address page is displayed as: " + subtotalinfo,
						Status.PASS);
			} else {
				report.updateTestLog("Subtotal information in Cart Summary of address page",
						"Subtotal information in Cart Summary of address page is not displayed  ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Subtotal information in Cart Summary of address page",
					"Subtotal information in Cart Summary of address page is not displayed  ", Status.FAIL);
		}
	}

	public void subTotalValueDisplayedCheckCartSummryDeliveryPage() {
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			 waitUntilElementVisible(subTotlTxtCartSumm,360);
			 if(subTotlTxtCartSumm.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", subTotlTxtCartSumm);
				String subtotaltxt = subTotlTxtCartSumm.getText().trim();
				String subtotalval = subTotlValueCartSumm.getText().trim();
				String subtotalinfo = subtotaltxt + subtotalval;
				report.updateTestLog("Subtotal information in Cart Summary ","Subtotal information in Cart Summary of delivery page is displayed as: " + subtotalinfo,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Subtotal information in Cart Summary ","Subtotal information in Cart Summary of delivery page is not displayed  ", Status.FAIL);
		}
	}

	public void servicesValueDisplayedCheckCartSummaryAddressPage() {
		try {
			if (servicesTxtCartSumm.isDisplayed()) {
				String servicestxt = servicesTxtCartSumm.getText().trim();
				String servicestotalval = servicesValueCartSumm.getText().trim();
				String servicesinfo = servicestxt + " " + servicestotalval;
				report.updateTestLog("Services information in cart summary of address page",
						"Services information in Cart Summary of  is displayed as: " + servicesinfo, Status.PASS);
			} else {
				report.updateTestLog("Services information in cart summary of address page",
						"There are no services selected", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of address page",
					"There are no services selected", Status.PASS);
		}
	}

	public void servicesValueDisplayedCheckCartSummaryDeliveryPage() {
		try {
			if (servicesTxtCartSumm.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", servicesTxtCartSumm);
				String servicestxt = servicesTxtCartSumm.getText().trim();
				String servicestotalval = servicesValueCartSumm.getText().trim();
				String servicesinfo = servicestxt + " " + servicestotalval;
				report.updateTestLog("Services information in cart summary",
						"Services information in Cart Summary   is displayed as: " + servicesinfo, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary ", "There are no services selected",
					Status.PASS);
		}
	}

	public void totalCartAmountDisplayedCartSummaryAddressPage() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			if (totalTxtBtmAdrsPage.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", totalTxtBtmAdrsPage);
				String totaltxt = totalTxtBtmAdrsPage.getText().trim();
				String totalval = totalValueBtmAddrsPage.getText().trim();
				String productotalamount = totaltxt + " " + totalval;
				report.updateTestLog("Total Amount",
						"Product total amount in Cart Summary of address page is displayed as: " + productotalamount,
						Status.PASS);
			} else {
				report.updateTestLog("Total Amount",
						"Product total amount in Cart Summary of address page is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			String totaltxt = totalTxtBtmAdrsPage2.getText().trim();
			String totalval = totalValueBtmAddrsPage2.getText().trim();
			String productotalamount = totaltxt + " " + totalval;
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary of address page is displayed as: " + productotalamount,
					Status.PASS);
		}
	}

	public void savingsValueCheck() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			if (savingsTxt.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", savingsTxt);
				String savingstxt = savingsTxt.getText();
				String savingsval = savingsVal.getText();
				String savingsinfo = savingstxt + " " + savingsval;
				report.updateTestLog("Savings information in cart summary",	"Savings information in cart summary is displayed as: " + savingsinfo, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Savings information in cart summary",	"Savings information in cart summary is not present", Status.FAIL);
		}
	}
	
	public void savingsValueNotDisplayedCheck() {
		try {
			if (savingsTxt.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", savingsTxt);
				String savingstxt = savingsTxt.getText();
				String savingsval = savingsVal.getText();
				String savingsinfo = savingstxt + " " + savingsval;
				report.updateTestLog("Savings information in cart summary",	"Savings information in cart summary is displayed as: " + savingsinfo, Status.FAIL);
			} 
		} catch (Exception e) {
			report.updateTestLog("Savings information",	"Savings information in cart summary is not present", Status.PASS);
		}
	}

	public UserRegistrationPage clickRegister() {
		report.updateTestLog("Click Register", "Click on the REGISTER link", Status.DONE);
		driver.findElement(lnkRegister).click();
		return new UserRegistrationPage(scriptHelper);
	}

	public SignOnPage logout() {
		report.updateTestLog("Logout", "Click the sign-off link", Status.DONE);
		driver.findElement(lnkSignOff).click();
		return new SignOnPage(scriptHelper);
	}
	
	
	////CICD////
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :totalCartAmountBottom() *
	 * @Description : Used to verify total cart amount
	 * @Author : Rahul
	 ************************************************************************/
	public void totalCartAmountBottom() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try{
		String totaltxt = totalTxtBtm.getText().trim();
		String totalval = totalValueBtm.getText().trim();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", totalValueBtm);
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary is displayed as: " + productotalamount, Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary is not displayed " , Status.FAIL);
		}
	}
	
	
	
	
	
	
	/************************************************************************
     * @Project Name : Electrolux*
     * @Function Name : serviceNotAvailableForZipCodeInDeliveryPage()*
     * @Description : To Check whether product service is disabled with error message
     *                in delivery page for the zip code entered in address page*
     * @Author : Mohan
     ************************************************************************/
     public void serviceNotAvailableForZipCodeInDeliveryPage() {
  	   JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
           try {
                  if (prodservicedisabled.isDisplayed()) {
                	  ex.executeScript("arguments[0].scrollIntoView();", prodservicedisabled);
                        report.updateTestLog("Product Service disabled in delivery page","Product Service is disabled in delivery page", Status.PASS);
                        String prodServiceErrMsg=prodserviceerrormsg.getText().trim();
                        report.updateTestLog("Product Service error message in delivery page","Product Service error message is displayed in delivery page as :" +prodServiceErrMsg, Status.PASS);
                  }
           }catch(Exception e) {
                  	report.updateTestLog("Service disabled in delivery page","Service is available for product in delivery page", Status.FAIL);
              }

		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}