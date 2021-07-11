package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class PaymentPage extends MasterPage {

	AddressPage addrspage = new AddressPage(scriptHelper);
	DeliveryPage delivrypage = new DeliveryPage(scriptHelper);

	@FindBy(xpath = "//input[@id='paymentMethod-adyen_cc']")
	WebElement creditCard;

	@FindBy(xpath = "//input[@class='adyen-checkout__input adyen-checkout__input--text adyen-checkout__input--large']")
	WebElement cardName;

	@FindBy(xpath = "//input[@id='encryptedCardNumber' and @type ='tel']")
	WebElement cardNum;

	@FindBy(xpath = "//input[@id='encryptedExpiryDate' and @type ='tel']")
	WebElement cardExpDate;

	@FindBy(xpath = "//input[@id='encryptedSecurityCode' and @type ='tel']")
	WebElement cardCvv;

	@FindBy(xpath = "(//input[@id='placerOrderAccept']/following::span)[1]")
	WebElement termsAndCondn;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	WebElement confirmPaybtn;

	@FindBy(xpath = "//span[@class='coupon-code']")
	WebElement vouchrCodePaymentPage;

	@FindBy(xpath = "//i[@class='icon-star']/following::span")
	WebElement vouchrCodemsgPaymentPage;

	@FindBy(xpath = "//h5[@class='paymentOptionHeading']")
	WebElement paymentTypeHeadingMsg;

	@FindBy(xpath = "(//span[contains(@class,'chckt-pm__name')])[1]")
	WebElement creditCardOptionTxt;

	@FindBy(xpath = "//input[@type='radio' and @value='paypal']")
	WebElement paypalRadioBtn;

	@FindBy(xpath = "//span[contains(text(),'PayPal')]")
	WebElement payPaltxt;

	@FindBy(xpath = "//input[@id='email']")
	WebElement paypalUserName;

	@FindBy(xpath = "//button[@id='btnNext']")
	WebElement paypalNxtBtn;

	@FindBy(xpath = "//input[@id='password']")
	WebElement paypalPwd;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement paypalLoginBtn;

	@FindBy(xpath = "//button[@id='acceptAllButton']")
	WebElement paypalCookieBtn;

	@FindBy(xpath = "//span[@class='promotion']")
	WebElement promoRibbonPaymentPage;

	@FindBy(id="payment-submit-btn")
	WebElement paypalConfirmBtn;

	@FindBy(xpath = "//input[contains(@class,'btn full confirmButton continueButton')]")
	WebElement paypalConfirmBtn1;

	@FindBy(xpath = "(//div[contains(@class,'chckt-form chckt-form')])[2]")
	WebElement paypalMsg;

	@FindBy(xpath = "(//span[@class='lastdigits'])[1]")
	WebElement paypalVisaLastDigits;

	@FindBy(xpath = "(//span[@class='fsName'])[1]")
	WebElement paypalVisaTxt;

	@FindBy(xpath = "//div[@class='qty']/span[@class='strikePrice']")
	WebElement strikedPrice;

	@FindBy(xpath = "(//div[@class='qty'])[2]")
	WebElement discountPrice;

	@FindBy(xpath = "(//div[@class='qty'])[1]")
	WebElement discountPrice1;

	@FindBy(xpath = "//div[@id='owl-demo']//div[1]")
	WebElement installazioneLink;

	@FindBy(xpath = "//div[@id='owl-demo']//div[1]//img[1]")
	WebElement installazioneImg;

	@FindBy(xpath = "//div[contains(@class,'headerCompWrapperBck')]//div[2]//img[1]")
	WebElement spedizioneGratuitaImg;

	@FindBy(xpath = "//div[contains(@class,'headerCompWrapperBck')]//div[3]//img[1]")
	WebElement giorniDiResoImg;

	@FindBy(xpath = "//div[contains(@class,'headerCompWrapperBck')]//div[4]//img[1]")
	WebElement peaceOfMindImg;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[4]/following::div[1]")
	WebElement totalBtmValue;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[3]/following::div[1]")
	WebElement totalBtmValue2;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[4]")
	WebElement totalBtmTxt;

	@FindBy(xpath = "(//div[contains(@class,'total-title')])[3]")
	WebElement totalBtmTxt2;

	@FindBy(xpath = "//div[@class='checkout-steps ']/a[1]/div[2]")
	WebElement addressSectionEditLinkPayPge;

	@FindBy(xpath = "//div[@class='checkout-steps ']/a[2]/div[2]")
	WebElement deliverySectionEditLinkPayPge;

	@FindBy(xpath = "(//span[@class='service-text'])[1]")
	WebElement installtnTxtCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[1]")
	WebElement installtnSerPriceCartSumm;

	@FindBy(xpath = "(//span[@class='service-text'])[2]")
	WebElement disposalTxtCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[2]")
	WebElement disposalSerPriceCartSumm;

	@FindBy(xpath = "(//span[@class='service-text'])[3]")
	WebElement protectionTxtCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[3]")
	WebElement protectionSerPriceCartSumm;

	@FindBy(xpath = "//div[@class='price']")
	WebElement productPrice;

	@FindBy(xpath = "(//input[contains(@value,'klarna')])[1]")
	WebElement klarnaInvoiceRadioButton;

	@FindBy(xpath = "//input[@value='klarna_account']")
	WebElement klarnaAccountRadioButton;

	@FindBy(xpath = "//iframe[@id='klarna-pay-later-main']")
	WebElement frameIdPayLater;

	@FindBy(xpath = "//iframe[@id='klarna-pay-over-time-main']")
	WebElement frameIdSliceIt;

	@FindBy(xpath = "//iframe[@id='klarna-pay-over-time-fullscreen']")
	WebElement frameIdSliceItPopup;

	@FindBy(xpath = "//iframe[@id='klarna-pay-later-fullscreen']")
	WebElement frameIdPayLaterPopup;

	@FindBy(xpath = "(//label[contains(@id,'installments-fixed_amount')])[4]")
	WebElement sliceItInstallmentFour;

	@FindBy(xpath = "//label[@id='installments-invoice|-1__container']")
	WebElement payLaterInstallmentOne;

	@FindBy(xpath = "(//div[@id='purchase-approval__nav-bar-wrapper']")
	WebElement klarnaPaylaterPopup;

	@FindBy(xpath = "//input[@id='purchase-approval-form-national-identification-number']")
	WebElement personNumberTextField;

	@FindBy(xpath = "//input[@id='purchase-approval-form-date-of-birth']")
	WebElement personNumberDobTextField;

	@FindBy(xpath = "//span[@id='purchase-approval-form-continue-button__text']")
	WebElement klarnaConfirmButton;

	@FindBy(xpath = "//span[contains(text(),'Klarna')]")
	WebElement ocPagePaymentMethodKlarna;

	@FindBy(xpath = "//div[@class='klarnaDescriptionText']")
	WebElement ocPagePaymentDescriptionKlarna;

	@FindBy(xpath = "//div[@class='checkout-success__body__headline']")
	WebElement orderConfirmationMessage;

	@FindBy(xpath = "//input[contains(@class,'holderName')]")
	WebElement Cardname;

	@FindBy(xpath = "//input[@id='encryptedCardNumber' and @type ='text']")
	WebElement Cardnum;

	@FindBy(xpath = "//input[contains(@class,'btn full confirmButton continueButton')]")
	WebElement PaypalConfirmBtn1;

	@FindBy(xpath = "//input[@id='encryptedExpiryDate' and @type ='text']")
	WebElement Cardexpdate;

	@FindBy(xpath = "//input[@id='encryptedSecurityCode' and @type ='text']")
	WebElement Cardcvv;

	/// cicd/////
	@FindBy(xpath = "(//span[@class='edit-link'])[1]")
	WebElement addressEditLink;

	@FindBy(xpath = "(//span[@class='edit-link'])[2]")
	WebElement deliveryEditLink;

	@FindBy(xpath = "//input[@value='trustly']")
	WebElement trustlyBtn;

	@FindBy(xpath = "(//span[@class='middle'])[1]")
	WebElement bankOptionTrustly;

	@FindBy(xpath = "(//a[@class='button core_action_button button_next'])")
	WebElement continueBtnTrusly;

	@FindBy(xpath = "//input[@name='loginid']")
	WebElement personNumberInputField;

	@FindBy(xpath = "(//div[@class='form_item message'])/span[2]")
	WebElement trustlyOtp;

	@FindBy(xpath = "(//input[@type='password'])")
	WebElement otpInputField;

	@FindBy(xpath = "(//div[@class='form_item message'])[2]/span[2]")
	WebElement trustlyOtp2;
	
	
	
	
	//****************************************Gaurav Naik:START****************************************************************	
		
		@FindBy(xpath = "(//span[contains(@class,'mini-cart-count')])[2]")
		WebElement miniBasketicon;
		
		@FindBy(xpath = "(//span[contains(@class,'edit-link')])[2]")
		WebElement editLinkdeliverypage;
		
		
		
		@FindBy(xpath = "(//div[@class='edit']/span[@class='edit-link'])[2]")
		WebElement editButton;
		
		@FindBy(id = "errorMsgForEmptyFields")
		WebElement paymenterror;
		
		
		@FindBy(xpath = "//div[contains(@class,'label-container')]")
		WebElement paypalcontainer;
		
	//****************************************Gaurav Naik:END****************************************************************
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	public PaymentPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageVerify()*
	 * @Description :This function is used verify the payment page content
	 * @Author : Gaurav
	 ************************************************************************/
	public void paymentPageVerify() {
		// try {
		// try {
		// creditCard.click();
		// report.updateTestLog("Credit card radio button", "Clicked on Credit Card
		// Radio button", Status.PASS);
		// } catch (Exception e) {
		// report.updateTestLog("Credit card radio button",
		// "Credit Card Radio button is not available for selection", Status.FAIL);
		// }
		// try {
		// String cardnameData = dataTable.getData("General_Data", "CardHolders Name");
		// cardName.sendKeys(cardnameData);
		// report.updateTestLog("Card Holders name", "Credit Card holders name is
		// entered", Status.PASS);
		// } catch (Exception e) {
		// report.updateTestLog("Card Holders name",
		// "Credit Card holders name field is not available for selection",
		// Status.FAIL);
		// }
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);
		// driver.switchTo().frame(0);
		// try {
		// String cardnumberData = dataTable.getData("General_Data", "Credit Card
		// Number");
		// cardNum.sendKeys(cardnumberData);
		// report.updateTestLog("Credit card Number", "Credit Card number is entered",
		// Status.PASS);
		// } catch (Exception e) {
		// report.updateTestLog("Credit card Number", "Credit Card number field is not
		// available for selection",
		// Status.FAIL);
		// }
		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(1);
		// try {
		// String expirydateData = dataTable.getData("General_Data", "Expiry Date");
		// cardExpDate.sendKeys(expirydateData);
		// report.updateTestLog("Expiry Date", "Expiry date is entered", Status.PASS);
		// } catch (Exception e) {
		// report.updateTestLog("Expiry Date", "Expiry date field is not available for
		// selection", Status.FAIL);
		// }
		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(2);
		// try {
		// String cvvData = dataTable.getData("General_Data", "CVV");
		// cardCvv.sendKeys(cvvData);
		// report.updateTestLog("CVC/CVV", "CVC/CVV is entered", Status.PASS);
		// } catch (Exception e) {
		// report.updateTestLog("CVC/CVV", "CVC/CVV field is not available for
		// selection", Status.FAIL);
		// }
		// driver.switchTo().defaultContent();
		//
		// } catch (Exception e) {
		// System.out.println(e);
		// }
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			
			// waitUntilElementVisible(Creditcard, 120);
			try {
				creditCard.click();
				report.updateTestLog("Credit card radio button", "Clicked on Credit Card Radio button", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Credit card radio button",
						"Credit Card Radio button is not available for selection", Status.FAIL);
			}
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			try {
				String cardnumberData = dataTable.getData("General_Data", "Credit Card Number");
				Cardnum.sendKeys(cardnumberData);
				report.updateTestLog("Credit card Number", "Credit Card number is entered", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Credit card Number", "Credit Card number field is not available for selection",
						Status.FAIL);
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			try {
				String expirydateData = dataTable.getData("General_Data", "Expiry Date");
				Cardexpdate.sendKeys(expirydateData);
				report.updateTestLog("Expiry Date", "Expiry date is entered", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Expiry Date", "Expiry date field is not available for selection", Status.FAIL);
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			try {
				String cvvData = dataTable.getData("General_Data", "CVV");
				Cardcvv.sendKeys(cvvData);
				report.updateTestLog("CVC/CVV", "CVC/CVV is entered", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("CVC/CVV", "CVC/CVV field is not available for selection", Status.FAIL);
			}
			driver.switchTo().defaultContent();
			try {
				String cardnameData = dataTable.getData("General_Data", "CardHolders Name");
				Cardname.sendKeys(cardnameData);
				report.updateTestLog("Card Holders name", "Credit Card holders name is entered", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Card Holders name",
						"Credit Card holders name field is not available for selection", Status.FAIL);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : termsAndConditions()*
	 * @Description :This function is used select the terms and conditions checkbox
	 * @Author : Rahul
	 ************************************************************************/
	public void termsAndConditions() throws InterruptedException {
		try {
			WebDriverWait(driver.getWebDriver(), termsAndCondn, 60);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", termsAndCondn);
			report.updateTestLog("Terms and Condtions", "Terms and Condtions checkbox is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Terms and Conditions checkbox",
					"Terms and Conditions checkbox is not displayed in Payment page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : validationOfPaymentPage()*
	 * @Description :This function is used to verify the payment page options
	 * @Author : Mamatha
	 ************************************************************************/
	public void validationOfPaymentPage() throws InterruptedException {
		try {
			WebDriverWait(driver.getWebDriver(), creditCard, 120);
			creditCard.click();
			if (creditCard.isSelected()) {
				report.updateTestLog("Credit Card option Radio button",
						"Credit Card option Radio button is displayed in Payment page", Status.PASS);
			} else {
				report.updateTestLog("Credit Card option Radio button",
						"Credit Card option Radio button is not displayed in Payment page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Credit Card option Radio button",
					"Credit Card option Radio button is not displayed in Payment page", Status.FAIL);
		}
		String creditdebittxt = creditCardOptionTxt.getText().trim();
		report.updateTestLog("Credit/Debit Card text",
				"Credit/Debit Card text is displayed in Payment page as : " + creditdebittxt, Status.PASS);
		WebDriverWait(driver.getWebDriver(), paypalRadioBtn, 10);
		paypalRadioBtn.click();
		if (paypalRadioBtn.isSelected()) {
			report.updateTestLog("Paypal radio button", "Paypal radio button is displayed in Payment page as expected",
					Status.PASS);
		} else {
			report.updateTestLog("Paypal radio button",
					"Paypal radio button is not displayed in Payment page as expected", Status.FAIL);
		}
		String actpaypaltxt = payPaltxt.getText().trim();
		report.updateTestLog("Paypal option text",
				"Paypal option text is displayed in Payment page as :" + actpaypaltxt, Status.PASS);
		if (actpaypaltxt.equals(paypaltxt)) {
			report.updateTestLog("Paypal option text", "Paypal option text is displayed in Payment page as expected",
					Status.PASS);
		} else {
			report.updateTestLog("Paypal option text",
					"Paypal option textn is not displayed in Payment page as expected", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paypalPayment()*
	 * @Description :This function is used to verify the paypal payment
	 * @Author : Mamatha
	 ************************************************************************/
	public void paypalPayment() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver.getWebDriver(),120);
		paypalRadioBtn.click();
		report.updateTestLog("Paypal radio button", "Clicked on Paypal Radio button", Status.PASS);
		termsAndConditions();
		confirmAndPay();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			paypalCookieBtn.click();
			report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
		}
		wait.until(ExpectedConditions.visibilityOf(paypalUserName));
		String paypalemailData = dataTable.getData("General_Data", "PaypalEmailid");
		paypalUserName.clear();
		paypalUserName.sendKeys(paypalemailData);
		report.updateTestLog("Paypal email id", "Paypal email id is entered as :" + paypalemailData, Status.PASS);
		String paypalpwdData = dataTable.getData("General_Data", "Paypalpassword");
		paypalPwd.sendKeys(paypalpwdData);
		report.updateTestLog("Paypal password", "Paypal password is entered as :" + paypalpwdData, Status.PASS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			WebDriverWait(driver.getWebDriver(), paypalCookieBtn, 10);
			paypalCookieBtn.click();
			report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
		}
		paypalLoginBtn.click();
		report.updateTestLog("Paypal login button", "Clicked on Login button", Status.PASS);
	try {
			wait.until(ExpectedConditions.visibilityOf(paypalCookieBtn));
			paypalCookieBtn.click();
			report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
		}
		try {
			WebDriverWait(driver.getWebDriver(), paypalConfirmBtn, 120);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", paypalConfirmBtn);
			report.updateTestLog("Paypal payment Confirm button", "Clicked on Confirm button", Status.PASS);
		} catch (Exception ex) {
			WebDriverWait(driver.getWebDriver(), paypalConfirmBtn, 120);
			JavascriptExecutor ex1 = (JavascriptExecutor) driver.getWebDriver();
			ex1.executeScript("arguments[0].click();", paypalConfirmBtn);
			report.updateTestLog("Paypal payment Confirm button", "Clicked on Confirm button", Status.PASS);
		}

/*		try {
			paypalCookieBtn.click();
			report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
		}*/
		//paypalConfirmBtn1.click();
		report.updateTestLog("Paypal payment Confirm button", "Clicked on Confirm button", Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInPaymentPage()*
	 * @Description :This function is used to verify voucher details
	 * @Author : Mamatha
	 ************************************************************************/
	public void voucherVerifyInPaymentPage() {
		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
			String voucherData = dataTable.getData("General_Data", "Voucher code");
			if (vouchercode.equals(voucherData)) {
				report.updateTestLog("Voucher code applied",
						"Voucher code in payment page is displayed as expected: " + vouchercode, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Voucher code applied", "Voucher code in payment page is not displaying as expected",
					Status.FAIL);
		}
		try {
		 if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in payment page is displayed as : " + addrsspromoribbon,
						Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in payment page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInPaymentPage()*
	 * @Description :This function is used to verify promotion details*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promoVerifyInPaymentPage() {
		try {
			WebDriverWait(driver.getWebDriver(), promoRibbonPaymentPage, 120);
			String ribbondetails = promoRibbonPaymentPage.getText().trim();
			report.updateTestLog("Promo ribbon for product 1 in Payment page",
					"Promo ribbon for product 1 in Payment page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 1 in Payment page",
					"Promo ribbon for product 1 is not displayed in Payment page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInPaymentPage2Products()*
	 * @Description :To verify promotion details for 2nd product*
	 * @Author : Mamatha
	 ************************************************************************/
	public void promoVerifyInPaymentPage2Products() {
		try {
			WebDriverWait(driver.getWebDriver(), addrspage.promoRibbonAddrsPagePrduct2, 120);
			String ribbondetails = addrspage.promoRibbonAddrsPagePrduct2.getText().trim();
			report.updateTestLog("Promo ribbon for product 2 in payment page",
					"Promo ribbon for product 2 in payment page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 2 in payment page",
					"Promo ribbon for product 2 in payment page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageCartSummaryValidations()*
	 * @Description :This function is used to verify cart sumamry details
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageCartSummaryValidations() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		String actstockstatus = stockStatus.getText();
		if (actstockstatus.equals(expstockstatus)) {
			report.updateTestLog("Stock status in cart summary of the delivery page",
					"Stock status in delivery page is displayed as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status in cart summary of the delivery page ",
					"Stock status is not displayed in delivery page", Status.FAIL);
		}
		String modelID = productModel.getText().trim();
		if (productModel.isDisplayed()) {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is displayed in Cart Summary of delivery page as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodprice = addrspage.productPrice.getText().trim();
		if (addrspage.productPrice.isDisplayed()) {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is displayed in Cart Summary of delivery page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodctamtwithqty = addrspage.productQty.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x ");
		String productprice = quantity[0].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity on cart summary of delivery page",
				"Product amount with quantity on cart summary of delivery page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is displayed as expected on cart summary of delivery page and is displayed as: "
							+ qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is not displayed as expected on cart summary of delivery page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is matching with main product price in Cart Summary of delivery page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of delivery page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		if (addrspage.installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("First service text in Cart Summary of delivery page",
					"First service text is displayed in Cart Summary of delivery page as:" + installtiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("First service text in Cart Summary of delivery page",
					"First service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("First service price in Cart Summary of delivery page",
					"First service price is displayed in Cart Summary of delivery page as:" + installatnprice,
					Status.PASS);
		} else {
			report.updateTestLog("First service price in Cart Summary of delivery page",
					"First service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String disposaltxt = addrspage.disposalTxtcartsumm.getText().trim();
		String disposalprice = addrspage.disposalSerPriceCartSumm.getText().trim();
		if (addrspage.disposalTxtcartsumm.isDisplayed()) {
			report.updateTestLog("Second service text in Cart Summary of delivery page",
					"Second service text is displayed in Cart Summary of delivery page as:" + disposaltxt, Status.PASS);
		} else {
			report.updateTestLog("Second service text in Cart Summary of delivery page",
					"Second service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Second service price in Cart Summary of delivery page",
					"Second service price is displayed in Cart Summary of delivery page as:" + disposalprice,
					Status.PASS);
		} else {
			report.updateTestLog("Second service price in Cart Summary of delivery page",
					"Second service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String protctiontxt = addrspage.protectionTxtCartSumm.getText().trim();
		String protctionprice = addrspage.protectionSerPriceCartSumm.getText().trim();
		if (addrspage.protectionTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Third service text in Cart Summary of delivery page",
					"Third service text is displayed in Cart Summary of delivery page as:" + protctiontxt, Status.PASS);
		} else {
			report.updateTestLog("Third service text in Cart Summary of delivery page",
					"Third service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.protectionSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Third service price in Cart Summary of delivery page",
					"Third service price is displayed in Cart Summary of delivery page as:" + protctionprice,
					Status.PASS);
		} else {
			report.updateTestLog("Third service price in Cart Summary of delivery page",
					"Third service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (delivrypage.delivryModeTxtCartSumm.isDisplayed()) {
			String homedeltxtcartsumm = delivrypage.delivryModeTxtCartSumm.getText().trim();
			System.out.println(homedeltxtcartsumm);
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is displaying in Cart Summary of delivery page as expected and is displayed as:"
							+ homedeltxtcartsumm,
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of delivery page",
					Status.FAIL);
		}
		if (delivrypage.homeDelChargeCartSumm.isDisplayed()) {
			String homedelchargecartsum = delivrypage.homeDelChargeCartSumm.getText().trim();
			System.out.println(homedelchargecartsum);
			report.updateTestLog("Home Delivery charge in Cart Summary",
					"Home Delivery(Ground Floor) charge is displaying as expected in Cart Summary of delivery page and is displayed as:"
							+ homedelchargecartsum,
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of delivery page",
					Status.FAIL);
		}
		float subtl = subTotalValueCheckCartSummryPaymentPage();
		float servl = ServicesvaluecheckCartSummaryPaymentPage();
		float delvery = deliveryDetails();
		float total = subtl + servl + delvery;
		String totalcalculated = String.valueOf(total);
		System.out.println(total);
		float totalvalbtm = totalCartAmountBottomCartSummaryPaymentPage();
		String totalinUI = String.valueOf(totalvalbtm);
		report.updateTestLog("Total cart amount in Cart Summary of payment page",
				"Total cart amount in Cart Summary of payment page is displayed as: " + total, Status.PASS);
		if (totalcalculated.equals(totalinUI)) {
			report.updateTestLog("Total cart amount in Cart Summary of payment page",
					"Total cart amount in Cart Summary of payment page is as expected", Status.PASS);
		} else {
			report.updateTestLog("Total cart amount in Cart Summary of payment page",
					"Total cart amount in Cart Summary of payment page is not as expected", Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageCartSummaryValidation()*
	 * @Description :This function is used to verify cart summary details
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageCartSummaryValidation() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		try {
			String actstockstatus = stockStatus.getText().trim();
			report.updateTestLog("Stock status in cart summary of the Payment page",
					"Stock status in Payment page is displayed as : " + actstockstatus, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Stock status in cart summary of the Payment page ",
					"Stock status is not displayed in Payment page", Status.FAIL);
		}
		String modelID = productModel.getText().trim();
		if (productModel.isDisplayed()) {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is displayed in Cart Summary of delivery page as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodprice = addrspage.productPrice.getText().trim();
		if (addrspage.productPrice.isDisplayed()) {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is displayed in Cart Summary of delivery page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodctamtwithqty = addrspage.productQty.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x ");
		String productprice = qty[1].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity on cart summary of delivery page",
				"Product amount with quantity on cart summary of delivery page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is displayed as expected on cart summary of delivery page and is displayed as: "
							+ qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is not displayed as expected on cart summary of delivery page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is matching with main product price in Cart Summary of delivery page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of delivery page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		try {
			if (addrspage.installtnTxtCartSumm.isDisplayed()) {
				report.updateTestLog("First Service text",
						"First Service text is displayed in Payment page as:" + installtiontxt, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service", "First Service is not selected for the product", Status.PASS);
		}
		try {
			if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("First Service price",
						"First Service price is displayed in Payment page as:" + installatnprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service text", "First Service is not selected for the product", Status.PASS);
		}
		try {
			String recycletxt = addrspage.disposalTxtcartsumm.getText().trim();
			String recycleprice = addrspage.disposalSerPriceCartSumm.getText().trim();
			if (addrspage.disposalTxtcartsumm.isDisplayed()) {
				report.updateTestLog("Second Service text",
						"Second Service text is displayed in Payment page as:" + recycletxt, Status.PASS);
			}
			if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("Second Service price",
						"Second Service price is displayed in Payment page as:" + recycleprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service", "Second Service is not selected for the product", Status.PASS);
		}
		try {
			try {
				String freereturntxt = addrspage.protectionTxtCartSumm.getText().trim();
				report.updateTestLog("Third Service text",
						"Third Service text is displayed in Payment page as:" + freereturntxt, Status.PASS);
				String freereturnprice = addrspage.protectionSerPriceCartSumm.getText().trim();
				report.updateTestLog("Third Service price",
						"Third Service price is displayed in Payment page as:" + freereturnprice, Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Third Service", "Third Service is not selected for the product", Status.PASS);
			}
			if (delivrypage.delivryModeTxtCartSumm.isDisplayed()) {
				String homedeltxtcartsumm = delivrypage.delivryModeTxtCartSumm.getText().trim();
				System.out.println(homedeltxtcartsumm);
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is displaying in Cart Summary of Payment page as expected and is displayed as:"
								+ homedeltxtcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of Payment page",
						Status.FAIL);
			}
			if (delivrypage.homeDelChargeCartSumm.isDisplayed()) {
				String homedelchargecartsum = delivrypage.homeDelChargeCartSumm.getText().trim();
				System.out.println(homedelchargecartsum);

				report.updateTestLog("Home Delivery charge in Cart Summary",
						"Home Delivery(Ground Floor) charge is displaying as expected in Cart Summary of Payment page and is displayed as:"
								+ homedelchargecartsum,
						Status.PASS);
			} else {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of Payment page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of Payment page",
					Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageCartSummaryValidationsAEG()*
	 * @Description :To verify cart summary details in AEG
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageCartSummaryValidationsAEG() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		String actstockstatus = stockStatus.getText();
		if (actstockstatus.equals(expstockstatusaeg)) {
			report.updateTestLog("Stock status in cart summary of the delivery page",
					"Stock status in delivery page is displayed as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status in cart summary of the delivery page ",
					"Stock status is not displayed in delivery page", Status.FAIL);
		}
		String modelID = productModel.getText().trim();
		if (productModel.isDisplayed()) {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is displayed in Cart Summary of delivery page as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in Cart Summary of delivery page",
					"Product model id is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodprice = addrspage.productPrice.getText().trim();
		if (addrspage.productPrice.isDisplayed()) {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is displayed in Cart Summary of delivery page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in Cart Summary of delivery page",
					"Product price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String prodctamtwithqty = addrspage.productQty.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x ");
		String productprice = quantity[0].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity on cart summary of delivery page",
				"Product amount with quantity on cart summary of delivery page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is displayed as expected on cart summary of delivery page and is displayed as: "
							+ qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity on cart summary of delivery page",
					"Product quantity is not displayed as expected on cart summary of delivery page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is matching with main product price in Cart Summary of delivery page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of delivery page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		if (addrspage.installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("First service text in Cart Summary of delivery page",
					"First service text is displayed in Cart Summary of delivery page as:" + installtiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("First service text in Cart Summary of delivery page",
					"First service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("First service price in Cart Summary of delivery page",
					"First service price is displayed in Cart Summary of delivery page as:" + installatnprice,
					Status.PASS);
		} else {
			report.updateTestLog("First service price in Cart Summary of delivery page",
					"First service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String disposaltxt = addrspage.disposalTxtcartsumm.getText().trim();
		String disposalprice = addrspage.disposalSerPriceCartSumm.getText().trim();
		if (addrspage.disposalTxtcartsumm.isDisplayed()) {
			report.updateTestLog("Second service text in Cart Summary of delivery page",
					"Second service text is displayed in Cart Summary of delivery page as:" + disposaltxt, Status.PASS);
		} else {
			report.updateTestLog("Second service text in Cart Summary of delivery page",
					"Second service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Second service price in Cart Summary of delivery page",
					"Second service price is displayed in Cart Summary of delivery page as:" + disposalprice,
					Status.PASS);
		} else {
			report.updateTestLog("Second service price in Cart Summary of delivery page",
					"Second service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		String protctiontxt = addrspage.protectionTxtCartSumm.getText().trim();
		String protctionprice = addrspage.protectionSerPriceCartSumm.getText().trim();
		if (addrspage.protectionTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Third service text in Cart Summary of delivery page",
					"Third service text is displayed in Cart Summary of delivery page as:" + protctiontxt, Status.PASS);
		} else {
			report.updateTestLog("Third service text in Cart Summary of delivery page",
					"Third service text is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		if (addrspage.protectionSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Third service price in Cart Summary of delivery page",
					"Third service price is displayed in Cart Summary of delivery page as:" + protctionprice,
					Status.PASS);
		} else {
			report.updateTestLog("Third service price in Cart Summary of delivery page",
					"Third service price is not displayed in Cart Summary of delivery page", Status.FAIL);
		}
		try {
			String fourthsertxt = addrspage.fourthServiceTxtCartSumm.getText().trim();
			String fourthserprice = addrspage.fourthServicePriceCartSumm.getText().trim();
			report.updateTestLog("Fourth service text in Cart Summary of Address page",
					"Fourth service text is displayed in Cart Summary of Address page as:" + fourthsertxt, Status.PASS);
			report.updateTestLog("Fourth service price in Cart Summary of Address page",
					"Fourth service price is displayed in Cart Summary of Address page as:" + fourthserprice,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fourth service text in Cart Summary of Address page",
					"Fourth service text is not added for the product", Status.PASS);
		}
		if (delivrypage.delivryModeTxtCartSumm.isDisplayed()) {
			String homedeltxtcartsumm = delivrypage.delivryModeTxtCartSumm.getText().trim();
			System.out.println(homedeltxtcartsumm);
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is displaying in Cart Summary of delivery page as expected and is displayed as:"
							+ homedeltxtcartsumm,
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of delivery page",
					Status.FAIL);
		}
		if (delivrypage.homeDelChargeCartSumm.isDisplayed()) {
			String homedelchargecartsum = delivrypage.homeDelChargeCartSumm.getText().trim();
			report.updateTestLog("Home Delivery charge in Cart Summary",
					"Home Delivery(Ground Floor) charge is displaying as expected in Cart Summary of delivery page and is displayed as:"
							+ homedelchargecartsum,
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of delivery page",
					Status.FAIL);
		}
		float subtl = subTotalValueCheckCartSummryPaymentPage();
		float servl = ServicesvaluecheckCartSummaryPaymentPage();
		float delvery = deliveryDetails();
		float total = subtl + servl + delvery;
		String totalcalculated = String.valueOf(total);
		float totalvalbtm = totalCartAmountBottomCartSummaryPaymentPageAEG();
		String totalinUI = String.valueOf(totalvalbtm);
		report.updateTestLog("Total cart amount in Cart Summary of payment page",
				"Total cart amount in Cart Summary of payment page is displayed as: " + total, Status.PASS);
		if (totalcalculated.equals(totalinUI)) {
			report.updateTestLog("Total cart amount in Cart Summary of payment page",
					"Total cart amount in Cart Summary of payment page is as expected", Status.PASS);
		} else {
			report.updateTestLog("Total cart amount in Cart Summary of payment page",
					"Total cart amount in Cart Summary of payment page is not as expected", Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationPaymentPage()*
	 * @Description :This function is used to verify buy x get y promotion
	 * @Author : Mamatha
	 ************************************************************************/
	public void buyXGetYProductValidationPaymentPage() {
		if (addrspage.product1PromoRibbonAddrsPage.isDisplayed()) {
			String promomsg = addrspage.product1PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the payment page is displayed as : " + promomsg,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the payment page is not displayed", Status.FAIL);
		}
		if (addrspage.product2PromoRibbonAddrsPage.isDisplayed()) {
			String promomsgproducty = addrspage.product2PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the payment page is displayed as : "
							+ promomsgproducty,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the payment page is not displayed", Status.FAIL);
		}
		if (addrspage.productYCartSummAddrsPage.isDisplayed()) {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the payment page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the payment page is not displayed", Status.FAIL);
		}
		String productyqty = addrspage.productYQty.getText().trim();
		report.updateTestLog("Product Y Quantity in cart summary of the address page",
				"Product Y quantity in cart summary of the payment page is displayed as :" + productyqty, Status.PASS);
		if (addrspage.productYPriceCartSummaAdrsPage.isDisplayed()) {
			String productyprice = addrspage.productYPriceCartSummaAdrsPage.getText().trim();
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the payment page is displayed as :" + productyprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the payment page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : uspPromotionHeaderBannerValidationPaymentPage()*
	 * @Description :This function is used to verify USP promotion
	 * @Author : Mamatha
	 ************************************************************************/
	public void uspPromotionHeaderBannerValidationPaymentPage() {
		if (addrspage.uspBanner1Title.isDisplayed()) {
			String uspbanner1 = addrspage.uspBanner1Title.getText().trim();
			report.updateTestLog("Title of USP Banner 1 in payment page",
					"Title of USP Banner 1 in payment page is displayed as :" + uspbanner1, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 1 in payment page",
					"Title of USP Banner 1 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner1Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 1 in payment page",
					"Icon of USP Banner 1 in payment page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 1 in payment page",
					"Icon of USP Banner 1 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Title.isDisplayed()) {
			String uspbanner2 = addrspage.uspBanner2Title.getText().trim();
			report.updateTestLog("Title of USP Banner 2 in payment page",
					"Title of USP Banner 2 in payment page is displayed as :" + uspbanner2, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 2 in payment page",
					"Title of USP Banner 2 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 2 in payment page",
					"Icon of USP Banner 2 in payment page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 2 in payment page",
					"Icon of USP Banner 2 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Title.isDisplayed()) {
			String uspbanner3 = addrspage.uspBanner3Title.getText().trim();
			report.updateTestLog("Title of USP Banner 3 in payment page",
					"Title of USP Banner 3 in payment page is displayed as :" + uspbanner3, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 3 in payment page",
					"Title of USP Banner 3 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 3 in payment page",
					"Icon of USP Banner 3 in payment page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 3 in payment page",
					"Icon of USP Banner 3 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Title.isDisplayed()) {
			String uspbanner4 = addrspage.uspBanner4Title.getText().trim();
			report.updateTestLog("Title of USP Banner 4 in payment page",
					"Title of USP Banner 4 in payment page is displayed as :" + uspbanner4, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 4 in payment page",
					"Title of USP Banner 4 in payment page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 4 in payment page",
					"Icon of USP Banner 4 in payment page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 4 in payment page",
					"Icon of USP Banner 4 in payment page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceforPercentagePromotionProduct1PaymentPage()*
	 * @Description :To verify percentage promo for product 1*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceforPercentagePromotionProduct1PaymentPage() {
		String promoPercentage = dataTable.getData("General_Data", "promoPercentage Product1");
		Float promoPercentageFloat = Float.parseFloat(promoPercentage);
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		String offerPrice = discountPrice1.getText().trim();
		String listPrice = strikedPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,x]", "");
		System.out.println(splCharRemoveOfferPrice);
		String spaceRemoveofferPrice = splCharRemoveOfferPrice.replaceAll("\\s+", "");
		long disPrice = Long.parseLong(spaceRemoveofferPrice);
		System.out.println(disPrice);
		double perentageDiscountCalculated = orgPrice * promoPercentageFloat;
		System.out.println(perentageDiscountCalculated);
		double offerPriceCalculated = orgPrice - perentageDiscountCalculated;
		System.out.println(offerPriceCalculated);
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (spaceRemoveofferPrice.contains(String.valueOf(OfferPriceCalculatedRounded))) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceforPercentagePromotionProduct2PaymentPage()*
	 * @Description :To verify percentage promo for product 2*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceforPercentagePromotionProduct2PaymentPage() {
		String promoPercentage = dataTable.getData("General_Data", "promoPercentage Product2");
		Float promoPercentageFloat = Float.parseFloat(promoPercentage);
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		String offerPrice = discountPrice.getText().trim();
		String listPrice = strikedPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,x]", "");
		System.out.println(splCharRemoveOfferPrice);
		String spaceRemoveofferPrice = splCharRemoveOfferPrice.replaceAll("\\s+", "");
		long disPrice = Long.parseLong(spaceRemoveofferPrice);
		System.out.println(disPrice);
		double perentageDiscountCalculated = orgPrice * promoPercentageFloat;
		System.out.println(perentageDiscountCalculated);
		double offerPriceCalculated = orgPrice - perentageDiscountCalculated;
		System.out.println(offerPriceCalculated);
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (spaceRemoveofferPrice.contains(String.valueOf(OfferPriceCalculatedRounded))) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :
	 *           verifyOfferPriceForFlatDiscountPromotionProduct1PaymentPage()*
	 * @Description :To verify Flat discount promo for product 1*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct1PaymentPage() {
		String flatDiscount = dataTable.getData("General_Data", "flatDiscount Product1");
		Integer flatDiscountint = Integer.parseInt(flatDiscount);
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		String offerPrice = discountPrice1.getText().trim();
		String listPrice = strikedPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,x]", "");
		System.out.println(splCharRemoveOfferPrice);
		String spaceRemoveofferPrice = splCharRemoveOfferPrice.replaceAll("\\s+", "");
		long disPrice = Long.parseLong(spaceRemoveofferPrice);
		System.out.println(disPrice);
		double offerPriceCalculated = orgPrice - flatDiscountint;
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (spaceRemoveofferPrice.contains(String.valueOf(OfferPriceCalculatedRounded))) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :
	 *           verifyOfferPriceForFlatDiscountPromotionProduct2PaymentPage()*
	 * @Description : To verify Flat discount promo for product 2*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct2PaymentPage() {
		String flatDiscount = dataTable.getData("General_Data", "flatDiscount Product1");
		Integer flatDiscountint = Integer.parseInt(flatDiscount);
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		String offerPrice = discountPrice.getText().trim();
		String listPrice = strikedPrice.getText().trim();
		String symbolRemoveListPrice = listPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolRemoveListPrice);
		String splCharRemoveListPrice = symbolRemoveListPrice.trim().replaceAll("[.,]", "");
		System.out.println(splCharRemoveListPrice);
		String spaceRemoveListPrice = splCharRemoveListPrice.replaceAll("\\s+", "");
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,x]", "");
		System.out.println(splCharRemoveOfferPrice);
		String spaceRemoveofferPrice = splCharRemoveOfferPrice.replaceAll("\\s+", "");
		long disPrice = Long.parseLong(spaceRemoveofferPrice);
		System.out.println(disPrice);
		double offerPriceCalculated = orgPrice - flatDiscountint;
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (spaceRemoveofferPrice.contains(String.valueOf(OfferPriceCalculatedRounded))) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + OfferPriceCalculatedRounded,
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageUspVerify()*
	 * @Description :This function is used to verify USP promo verify
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageUspVerify() {
		try {
			installazioneLink.click();
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is displayed as Clickable Hyperlink in payment page", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is not displayed as Clickable Hyperlink in payment page", Status.FAIL);
		}
		try {
			if (installazioneImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Header Banner Img",
						"USP Promotion Header Banner Image is displayed in payment page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Header Banner Img",
					"USP Promotion Header Banner Image is not displayed in payment page", Status.FAIL);
		}

		try {
			if (spedizioneGratuitaImg.isDisplayed()) {

				report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
						"USP Promotion Spedizione gratuita Img Cart is displayed in payment page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
					"USP Promotion Spedizione gratuita Img Cart is not displayed in payment page", Status.FAIL);
		}
		try {
			if (giorniDiResoImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion days of free Return Img",
						"USP Promotion Spedizione Days of free Return is displayed in payment page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion days of free Return Img",
					"USP Promotion Spedizione Days of free Return is not displayed in payment page", Status.FAIL);
		}

		try {
			if (peaceOfMindImg.isDisplayed()) {
				report.updateTestLog(
						"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
						"USP Promotion Peace of mind and full assistance included is displayed in payment page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog(
					"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
					"USP Promotion Peace of mind and full assistance included is not displayed in payment page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalCartAmountBtmCartSummaryPaymentPage()*
	 * @Description :This function is used to verify total cart amount
	 * @Author : Mamatha
	 ************************************************************************/
	public void totalCartAmountBtmCartSummaryPaymentPage() {
		try {
			String totaltxt = totalBtmTxt.getText().trim();
			String totalval = totalBtmValue.getText().trim();
			String productotalamount = totaltxt + " " + totalval;
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary of payment page is displayed as: " + productotalamount,
					Status.PASS);
		} catch (Exception e) {
			String totaltxt = totalBtmTxt2.getText().trim();
			String totalval = totalBtmValue2.getText().trim();
			String productotalamount = totaltxt + " " + totalval;
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary of payment page is displayed as: " + productotalamount,
					Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageVeriyWithPromotionProduct()*
	 * @Description :This function is used to verify promotion verification
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageVeriyWithPromotionProduct() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			waitUntilElementVisible(strikedPrice,80);
			if (strikedPrice.isDisplayed()) {
				String product2strikedprice = strikedPrice.getText().trim();
				report.updateTestLog("Payment page Product 2 Striked off price",
						"Product is applied with promotion and Product Striked off price is displayed as: "
								+ product2strikedprice,
						Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Payment page Product 2 Striked off price","Product  Striked off price is not displayed", Status.FAIL);
		}
		try {
			WebDriverWait(driver.getWebDriver(), discountPrice, 60);
			if (discountPrice.isDisplayed()) {
				String product2discprice = discountPrice.getText().trim();
				report.updateTestLog("Payment page Product 2 discounted price",	"Product  discounted price is displayed as: " + product2discprice, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Payment page Product 2 discounted price",	"Product  discounted price is not displayed", Status.FAIL);
		}
		promoVerifyInPaymentPage();
		promoVerifyInPaymentPage2Products();
		subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountBtmCartSummaryPaymentPage();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : confirmAndPay()*
	 * @Description :This function is used to click on confirm and pay button
	 * @Author : Mamatha
	 ************************************************************************/
	public void confirmAndPay() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", confirmPaybtn);
			ex.executeScript("arguments[0].click();", confirmPaybtn);
			report.updateTestLog("Confirm and Pay button", "Clicked on Confirm and pay button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Confirm and Pay button", "Not Clicked on Confirm and pay button", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : klarnaPayLaterSelection()*
	 * @Description :Selects Klarna Invoice and confirms the payment
	 * @Author : Mamatha
	 ************************************************************************/
	public void klarnaPayLaterSelection() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].click();", klarnaInvoiceRadioButton);
			if (klarnaInvoiceRadioButton.isSelected()) {
				report.updateTestLog("Klarna Invoice Radio button",
						"Klarna Invoice Radio button is displayed and selected in Payment page", Status.PASS);
			} else {
				report.updateTestLog("Klarna Invoice Radio button",	"Klarna Invoice Radio button is not selected in Payment page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Klarna Invoice Radio button",
					"Klarna Invoice Radio button is not displayed in Payment page", Status.FAIL);
		}
		try {
			waitUntilElementVisible(frameIdPayLater, 120);
			driver.switchTo().frame(frameIdPayLater);
			waitUntilElementVisible(payLaterInstallmentOne, 120);
			if (payLaterInstallmentOne.isDisplayed()) {
				report.updateTestLog("installment selection",
						"Klarna installment is displayed and selected in Payment page", Status.PASS);
			} else {
				report.updateTestLog("installment selection",
						"Klarna installment is not available for this shop in Payment page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("installment selection",
					"Klarna installment is not available for this shop in Payment page", Status.PASS);
		}
		driver.switchTo().defaultContent();
		termsAndConditions();
		confirmAndPay();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageCartSummaryValidationsAEG()*
	 * @Description :Enter Klarna Paylater details and move to OC page
	 * @Author : Mamatha
	 ************************************************************************/
	public void klarnaPaylaterEnterDetails() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		String personNumber = dataTable.getData("General_Data", "personNumber");
		try {
			driver.switchTo().frame(frameIdPayLaterPopup);
			try {
				personNumberTextField.isDisplayed();
			} catch (Exception e) {
				personNumberTextField = personNumberDobTextField;
			}
			for (int i = 0; i < personNumber.length(); i++) {
				System.out.println("entered loop" + i);
				char data = personNumber.charAt(i);
				String stringData = Character.toString(data);
				try {
					personNumberTextField.sendKeys(stringData);
					System.out.println("input : " + stringData);
				} catch (Exception e) {
					personNumberDobTextField.sendKeys(stringData);
				}
			}
			report.updateTestLog("Person Number", "Person Number entered as " + personNumber, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Person Number", "Person Number was not entered", Status.FAIL);
		}
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", klarnaConfirmButton);
			report.updateTestLog("Confirm Button", "clicked on confrim button", Status.PASS);
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			report.updateTestLog("Confirm Button", "clicked on confrim button", Status.PASS);
		}
		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			ocPagePaymentMethodKlarna.isDisplayed();
			String paymentMethod = ocPagePaymentMethodKlarna.getText().trim();
			report.updateTestLog("Order Confirmation Page Payment method","Payment Method shows in OC page is displayed as " + paymentMethod, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Order Confirmation Page Payment method",
					"Payment Method Klarna Invoice is not displayed in OC page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : klarnaSliceItSelection()*
	 * @Description :Selects Klarna sliceit and confirms the payment
	 * @Author : Mamatha
	 ************************************************************************/
	public void klarnaSliceItSelection() throws InterruptedException {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			klarnaAccountRadioButton.click();
			if (klarnaAccountRadioButton.isSelected()) {
				report.updateTestLog("Klarna Invoice Radio button",
						"Klarna Invoice Radio button is displayed and selected in Payment page", Status.PASS);
			} else {
				report.updateTestLog("Klarna Invoice Radio button",
						"Klarna Invoice Radio button is not selected in Payment page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Klarna Invoice Radio button",
					"Klarna Invoice Radio button is not displayed in Payment page", Status.FAIL);
		}
		try {
			waitUntilElementVisible(frameIdSliceIt, 20);
			driver.switchTo().frame(frameIdSliceIt);
			waitUntilElementVisible(sliceItInstallmentFour, 20);
			if (sliceItInstallmentFour.isDisplayed()) {
				report.updateTestLog("installment selection",
						"Klarna installment is displayed and selected in Payment page", Status.PASS);
			} else {
				report.updateTestLog("installment selection",
						"Klarna installment is not displayed for this shop in Payment page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("installment selection",
					"Klarna installment is not displayed for this shop in Payment page", Status.PASS);
		}
		driver.switchTo().defaultContent();
		termsAndConditions();
		confirmAndPay();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : klarnaSliceitEnterDetails()*
	 * @Description :Enter Klarna sliceit details and move to OC Page
	 * @Author : Mamatha
	 ************************************************************************/
	public void klarnaSliceitEnterDetails() {
		String personNumber = dataTable.getData("General_Data", "personNumber");
		try {
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.switchTo().frame(frameIdSliceItPopup);
			try {
				personNumberTextField.isDisplayed();
			} catch (Exception e) {
				personNumberTextField = personNumberDobTextField;
			}
			for (int i = 0; i < personNumber.length(); i++) {
				char data = personNumber.charAt(i);
				String stringData = Character.toString(data);
				personNumberTextField.sendKeys(stringData);
				System.out.println("input : " + stringData);
			}
			report.updateTestLog("Person Number", "Person Number entered as " + personNumber, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Person Number", "Person Number was not entered", Status.FAIL);
		}
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", klarnaConfirmButton);
			klarnaConfirmButton.click();
			report.updateTestLog("Confirm Button", "clicked on confrim button", Status.PASS);
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			report.updateTestLog("Confirm Button", "clicked on confrim button", Status.PASS);
		}
		try {
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			ocPagePaymentMethodKlarna.isDisplayed();
			String paymentMethod = ocPagePaymentMethodKlarna.getText();
			report.updateTestLog("Order Confirmation Page Payment method",
					"Payment Method shows in OC page is displayed as " + paymentMethod, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Order Confirmation Page Payment method",
					"Payment Method Klarna Invoice is not displayed in OC page", Status.FAIL);
		}
		try {
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			ocPagePaymentDescriptionKlarna.isDisplayed();
			String paymentdesc = ocPagePaymentDescriptionKlarna.getText();
			report.updateTestLog("Order Confirmation Page Payment description",
					"Payment Method description  is displayed OC page as " + paymentdesc, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Order Confirmation Page Payment description",
					"Payment Method description  is not displayed in OC page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : editPreviousStepsVerifyPayPage()*
	 * @Description :Edit the previous checkout step from paypage
	 * @Author : Mamatha
	 ************************************************************************/
	public void editPreviousStepsVerifyPayPage() throws InterruptedException {
		try {
			WebDriverWait(driver.getWebDriver(), addressSectionEditLinkPayPge, 120);
			if (addressSectionEditLinkPayPge.isEnabled()) {
				report.updateTestLog("Address Section Edit Link",
						"The Edit Option enabled for Address Section in the Payment page", Status.PASS);
			} else {
				report.updateTestLog("Address Section Edit Link",
						"The Edit Option is not enabled for Address Section in the Payment page", Status.FAIL);
			}
			if (deliverySectionEditLinkPayPge.isEnabled()) {
				report.updateTestLog("Delivery Section Edit Link",
						"The Edit Option enabled for Delivery Section in the Payment page", Status.PASS);
			} else {
				report.updateTestLog("Delivery Section Edit Link",
						"The Edit Option is not enabled for Delivery Section in the Payment page", Status.FAIL);
			}
		} catch (Exception ex) {
			report.updateTestLog("Edit previous checkout steps",
					"The Edit Option is not available for the previous checkouts in the Payment page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageServiceInformationValidations()*
	 * @Description :To Verify the services information in Payment page
	 * @Author : Mamatha
	 ************************************************************************/
	public void paymentPageServiceInformationValidations() {
		String installtiontxt = installtnTxtCartSumm.getText().trim();
		String installatnprice = installtnSerPriceCartSumm.getText().trim();
		if (installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("First service text in Summary",
					"Service text is displayed in Summary as:" + installtiontxt, Status.PASS);
		} else {
			report.updateTestLog("First service text in Cart Summary of Address page",
					"First service text is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		if (installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("First service price in Summary",
					"Installation service price is displayed as:" + installatnprice, Status.PASS);
		} else {
			report.updateTestLog("First service price in Cart Summary of Address page",
					"First service price is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		String disposaltxt = disposalTxtCartSumm.getText().trim();
		String disposalprice = disposalSerPriceCartSumm.getText().trim();
		if (disposalTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Second service text in Summary",
					"Service text is displayed in Summary as:" + disposaltxt, Status.PASS);
		} else {
			report.updateTestLog("Second service text in Cart Summary of Address page",
					"Second service text is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		if (disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Second service price in Summary",
					"Service price is displayed Summary as:" + disposalprice, Status.PASS);
		} else {
			report.updateTestLog("Second service price in Cart Summary of Address page",
					"Second service price is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		String protctiontxt = protectionTxtCartSumm.getText().trim();
		String protctionprice = protectionSerPriceCartSumm.getText().trim();
		if (protectionTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Third service text in Summary",
					"Service text is displayed in Summary as:" + protctiontxt, Status.PASS);
		} else {
			report.updateTestLog("Third service text in Cart Summary of Address page",
					"Third service text is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		if (protectionSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Third service price in Summary",
					"Service price is displayed in Summary as:" + protctionprice, Status.PASS);
		} else {
			report.updateTestLog("Third service price in Cart Summary of Address page",
					"Third service price is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		String prodprice = productPrice.getText().trim();
		if (productPrice.isDisplayed()) {
			report.updateTestLog("Verify no any promotions in summary",
					"No promotin should be display as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Verify no any promotions in summary", "Promotin should be display", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : EWServicePromoVerifyPaymentPage()*
	 * @Description :To verify the Extended Warranty Promo in Payment Page*
	 * @Author : MOHAN
	 ************************************************************************/
	public void EWServicePromoVerifyPaymentPage() {
		try {
			WebDriverWait(driver.getWebDriver(), addrspage.ewServiceText, 120);
			String ewservicespromo = addrspage.ewServiceText.getText().trim();
			report.updateTestLog("EW Services Promo",
					"The Extended Warranty Services Promo in payment page page is Displayed as : " + ewservicespromo,
					Status.PASS);
			String ewservicepricepromo = addrspage.ewServiceprice.getText().trim();
			if (ewservicepricepromo.equals("")) {
				report.updateTestLog("Extended Warranty Services Promo price",
						"The Extended Warranty Services Promo Price is Displayed as 0" + ewservicepricepromo,
						Status.PASS);
			} else {
				report.updateTestLog("Extended Warranty Services Promo price",
						"The Extended Warranty Services Promo Price is not displaying as 0", Status.PASS);
			}
		} catch (Exception e) {

			report.updateTestLog("EW service", "The EW service is not set up", Status.FAIL);
		}
	}

	//// CICD/////
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageTotalSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in payment page when savings enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void paymentPageTotalSavingsCheck() {
		subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountBtmCartSummaryPaymentPage();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in payment page when savings not present*
	 * @Author : Gaurav
	 ************************************************************************/
	public void paymentPageTotalNoSavingsCheck() {
		subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountBtmCartSummaryPaymentPage();
		savingsValueNotDisplayedCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :click_EditAddress_FromPaymentPage() *
	 * @Description :To verify the edit address option from payment page*
	 * @Author : Rahul
	 ************************************************************************/
	public void click_EditAddress_FromPaymentPage() {
		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			if (addressEditLink.isDisplayed()) {
				if (addressEditLink.isEnabled()) {
					report.updateTestLog("Edit link for address", "Edit link for address is enabled in payment page",
							Status.PASS);
					addressEditLink.click();
					report.updateTestLog("Edit link for address", "Edit link for address is Clicked in payment page",
							Status.PASS);
				} else {
					report.updateTestLog("Edit link for address",
							"Edit link for address is not enabled in payment page", Status.FAIL);
				}
			} else {
				report.updateTestLog("Edit link for address", "Edit link for address is not displayed in payment page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Edit link for address", "Edit link for address is not enabled in payment page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :click_EditDelivery_FromPaymentPage() *
	 * @Description :To verify the edit address option from payment page*
	 * @Author : Rahul
	 ************************************************************************/
	public void click_EditDelivery_FromPaymentPage() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			
			if (deliveryEditLink.isDisplayed()) {
				if (deliveryEditLink.isEnabled()) {
					report.updateTestLog("Edit link for delivery", "Edit link for address is enabled in payment page",
							Status.PASS);
					deliveryEditLink.click();
					report.updateTestLog("Edit link for delivery", "Edit link for address is Clicked in payment page",
							Status.PASS);
				} else {
					report.updateTestLog("Edit link for delivery",
							"Edit link for address is not enabled in payment page", Status.FAIL);
				}
			} else {
				report.updateTestLog("Edit link for delivery", "Edit link for address is not displayed in payment page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Edit link for delivery", "Edit link for address is not enabled in payment page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : trustlyPaymentVerify()*
	 * @Description :This function is used verify the Trustly payment*
	 * @Author : Mohan
	 ************************************************************************/
	public void trustlyPaymentVerify() throws InterruptedException {
		String personNumTxt = dataTable.getData("General_Data", "TrustlyPerSonNum");
		try {
			trustlyBtn.click();
			report.updateTestLog("Trustly Payment", "Clicked on Trustly payment button ", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Trustly Payment", "Trustly payment button is Not displayed", Status.FAIL);
		}
		termsAndConditions();
		confirmAndPay();
		try {
			if (bankOptionTrustly.isDisplayed()) {
				report.updateTestLog("Trustly Banks", "Trustly Banks Options are displayed", Status.PASS);
				bankOptionTrustly.click();
				report.updateTestLog("Trustly Banks", "Trustly Banks Options is Selected", Status.PASS);
			} else {
				report.updateTestLog("Trustly Banks", "Trustly Banks Options are Not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly Banks", "Trustly Banks Options are Not displayed", Status.FAIL);
		}
		continueBtnClickTrustly();
		try {
			Thread.sleep(4000);
			if (personNumberInputField.isDisplayed()) {
				report.updateTestLog("Trustly - PersonNumber", "PersonNumber Input Field is Displayed", Status.PASS);
				personNumberInputField.sendKeys(personNumTxt);
				report.updateTestLog("Trustly - PersonNumber", "PersonNumber is entered as : " + personNumTxt,
						Status.PASS);
			} else {
				report.updateTestLog("Trustly - PersonNumber", "PersonNumber Input Field is Not Displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - PersonNumber", "PersonNumber Input Field is Not Displayed", Status.FAIL);
		}
		Thread.sleep(3000);
		continueBtnClickTrustly();
		Thread.sleep(6000);

		try {
			if (trustlyOtp.isDisplayed()) {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is displayed", Status.PASS);
				String optTxt = trustlyOtp.getText();
				otpInputField.sendKeys(optTxt);
				report.updateTestLog("Trustly - OTP Input", "OTP is entered as : " + optTxt, Status.PASS);
			} else {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.FAIL);
		}
		Thread.sleep(3000);
		continueBtnClickTrustly();
		Thread.sleep(6000);
		try {
			if (trustlyOtp2.isDisplayed()) {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is displayed", Status.PASS);
				String optTxt = trustlyOtp2.getText();
				otpInputField.sendKeys(optTxt);
				report.updateTestLog("Trustly - OTP Input", "OTP is entered as : " + optTxt, Status.PASS);
			} else {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
		}
		Thread.sleep(3000);
		continueBtnClickTrustly();
		Thread.sleep(3000);
		try {
			if (trustlyOtp2.isDisplayed()) {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is displayed", Status.PASS);
				String optTxt = trustlyOtp2.getText();
				otpInputField.sendKeys(optTxt);
				report.updateTestLog("Trustly - OTP Input", "OTP is entered as : " + optTxt, Status.PASS);
			} else {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
		}
		continueBtnClickTrustly();

		try {
			if (trustlyOtp2.isDisplayed()) {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is displayed", Status.PASS);
				String optTxt = trustlyOtp2.getText();
				otpInputField.sendKeys(optTxt);
				report.updateTestLog("Trustly - OTP Input", "OTP is entered as : " + optTxt, Status.PASS);
			} else {
				report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - OTP", "Trustly OTP is not displayed", Status.PASS);
		}
		continueBtnClickTrustly();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : continueBtnClickTrustly()*
	 * @Description :To click on continue payment in the Trustly payment method*
	 * @Author : Mohan
	 ************************************************************************/
	public void continueBtnClickTrustly() throws InterruptedException {
		try {
			Thread.sleep(4000);
			if (continueBtnTrusly.isDisplayed()) {
				report.updateTestLog("Trustly - Continue Button", "The Continue Button is displayed", Status.PASS);
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].click();", continueBtnTrusly);
				report.updateTestLog("Trustly - Continue Button", "Clicked on The Continue Button", Status.PASS);
			} else {
				report.updateTestLog("Trustly - Continue Button", "The Continue Button is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Trustly - Continue Button", "The Continue Button is not displayed", Status.FAIL);
		}
	}


//****************************Gaurav Changes**********************************************//
	

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : paymentPageCheck()*
	 * @Description :To verify that credit card payment option is available in Payment Page*
	 * @Author : Gaurav
	 ************************************************************************/
public void paymentPageCheck(){
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
	try {
		  ex.executeScript("arguments[0].scrollIntoView();", creditCard);
			if(creditCard.isDisplayed()){
			report.updateTestLog("Credit card radio button", "Credit Card option is displayed in payment page", Status.PASS);
		} 
	}catch (Exception e) {
			report.updateTestLog("Credit card radio button","Credit Card option is not available for selection", Status.FAIL);
		}
}



/************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : navigateTobasketFromPayment()*
 * @Description :To verify that user is able to click on mini basket icon in payment page*
 * @Author : Gaurav
 ************************************************************************/
public void navigateTobasketFromPayment(){
JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
try {
	   ex.executeScript("arguments[0].scrollIntoView();", miniBasketicon);
	   ex.executeScript("arguments[0].click();", miniBasketicon);
	report.updateTestLog("Mini Basket icon", "Clicked on mini basket icon in payment page", Status.PASS);
}catch (Exception e) {
		report.updateTestLog("Mini Basket icon", "Mini basket icon is not available in payment page", Status.FAIL);
	}
}






/*************************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : VerifyVoucherRemovalPaymentPage()*
 * @Description :To verify the voucher ribbon message is not displayed in delivery Page*
 * @Author : Gaurav 
 **************************************************************************************/
public void VerifyVoucherRemovalPaymentPage() {
	try {
		if(addrspage.voucherribbonAddrsPage.isDisplayed()){
		report.updateTestLog("Voucher ribbon in payment page","Voucher ribbon is displayed in payment page",
				Status.FAIL);
	} 
	}catch (Exception e) {
		report.updateTestLog("Voucher ribbon in delivery page","Voucher ribbon is not displayed in payment page",
				Status.PASS);
	}
}



/********************************************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : navigateToDeliveryFromPayment()*
 * @Description :To verify that user is able to click on edit link under delivery section in payment Page*
 * @Author : Gaurav 
 ********************************************************************************************************/
public void navigateToDeliveryFromPayment() {
	JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
	try {
		ex.executeScript("arguments[0].scrollIntoView();", editLinkdeliverypage);
		if(editLinkdeliverypage.isDisplayed()){
		  editLinkdeliverypage.click();
		  report.updateTestLog("Edit link for delivery page","Clicked on edit link for delivery page",
				Status.PASS);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} 
	}catch (Exception e) {
		report.updateTestLog("Edit link for delivery page","Edit link for delivery page is not available",
				Status.FAIL);
	}
}





/************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : voucherNewVerifyInPaymentPage()*
 * @Description :This function is used to verify voucher details
 * @Author : Gaurav
 ************************************************************************/
public void voucherNewVerifyInPaymentPage() {
	try {
		WebDriverWait(driver.getWebDriver(), addrspage.vouchrCodeAddrssPage, 120);
		String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
		String voucherData = dataTable.getData("General_Data", "New Voucher code");
		if (vouchercode.equals(voucherData)) {
			report.updateTestLog("Voucher code applied",
					"Voucher code in payment page is displayed as expected: " + vouchercode, Status.PASS);
		} else {
			report.updateTestLog("Voucher code applied",
					"Voucher code in payment page is not displaying as expected", Status.FAIL);
		}
	} catch (Exception e) {
		report.updateTestLog("Voucher code applied", "Voucher code in payment page is not displaying as expected",
				Status.FAIL);
	}
	try {
		WebDriverWait(driver.getWebDriver(), addrspage.promoRibbonAddrsPage, 120);
		if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
			String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in payment page is displayed as : " + addrsspromoribbon,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in payment page is not displayed ", Status.FAIL);
		}
	} catch (Exception e) {
		report.updateTestLog("Promo ribbon message",
				"Voucher code promo ribbon message in payment page is not displayed ", Status.FAIL);
	}
}	





public void editButtondisplayVerify() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	try{
		waitUntilElementVisible(editButton,240);
	if (editButton.isDisplayed() && editButton.isEnabled()) {
		editButton.click();
		Thread.sleep(4000);
		report.updateTestLog("Edit Enable button", "Edit button on the delivery section is Active as expected",
				Status.PASS);
	} 
	}catch(Exception e) {
		report.updateTestLog("Edit Enable button", "Edit button on the delivery section is not Active", Status.FAIL);
	}

}




public void paymentPagePaymentMethodErrorVerify(){
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
	
	try{
		ex.executeScript("arguments[0].scrollIntoView();", creditCard);
		creditCard.click();
		report.updateTestLog("Credit card option", "Clicked on Credit Card option",Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", termsAndCondn);
		termsAndCondn.click();
		report.updateTestLog("Terms and Condition", "Clicked on terms and conditions checkbox",Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", confirmPaybtn);
		confirmPaybtn.click();
		report.updateTestLog("Confirm and Pay Button", "Clicked on Confirm and Pay button",Status.PASS);
		try{
		if(paymenterror.isDisplayed()){
		String paymenterrormsg=paymenterror.getText().trim();
		report.updateTestLog("Payment method error message", "Payment method error message is displayed as: "+paymenterrormsg,Status.PASS);
		termsAndCondn.click();		
	}
		}catch(Exception e){
		report.updateTestLog("Payment method error message", "Payment method error message is not displayed",Status.FAIL);
		
	}
}catch(Exception e){
	report.updateTestLog("Payment method", "Payment method is not available",Status.FAIL);
  }
}





/************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : paymentPageVATVerify()*
 * @Description :This function is used to verify VAT value in payment page
 * @Author : Gaurav
 ************************************************************************/
public void paymentPageVATVerify() {
	vatTextCaptureCheckoutPages();
}






/************************************************************************
*
* @Project Name : Electrolux*
* @Function Name : paymentPageCartTotalVerifyITAELX()*
* @Description : This function is used to verify the cart total prices for multiple products in payment Page*
* @Author : Gaurav
*
************************************************************************/
public void paymentPageCartTotalVerifyITAELX() throws InterruptedException {
	JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
	try {
			ex.executeScript("arguments[0].scrollIntoView();",addrspage.prod1price);
			String prod1Price=addrspage.prod1price.getText().trim();
			System.out.println(prod1Price);
			report.updateTestLog("Product 1 price","Product 1 price in payment page is displayed as :" +prod1Price, Status.PASS);
			String prod1Price1[]=prod1Price.split(" ");
			String prod1Price2=prod1Price1[1].replace(",", ".");
			System.out.println(prod1Price2);
			report.updateTestLog("Product 1 price","Product 1 price in payment page with decimal is displayed as :" +prod1Price2, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
			String prod2Price=addrspage.prod2price.getText().trim();
			System.out.println(prod2Price);
			report.updateTestLog("Product 2 price","Product 2 price in payment page is displayed as :" +prod2Price, Status.PASS);
			String prod2Price1[]=prod2Price.split(" ");
			String prod2Price2=prod2Price1[1].replace(",", ".");
			System.out.println(prod2Price2);
			report.updateTestLog("Product 2 price","Product 2 price in payment page with decimal is displayed as :" +prod2Price2, Status.PASS);
			Float prod1PriceinInt = Float.parseFloat(prod1Price2);
			Float prod2PriceinInt = Float.parseFloat(prod2Price2);
			String delpricecartsumm=delivrypage.totaldelprice.getText().trim();
			System.out.println(delpricecartsumm);
			String delpricecartsumm1[]=delpricecartsumm.split(" ");	
			String delpricecartsumm2=delpricecartsumm1[1];
			Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
			report.updateTestLog("Total delivery price","Total delivery price in cart summary of payment page is displayed as :" +delpricecartsumm, Status.PASS);
			String totServiceprice=delivrypage.totalserviceprice.getText().trim();
			  String totalserviceprice1[]=totServiceprice.split(" ");
			  String totalserviceprice2=totalserviceprice1[1];
			  System.out.println(totalserviceprice2);
			  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
			  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
			report.updateTestLog("Total price calculated in payment page","Total price calculated in payment page is :" +totalpriceCalculatedwithservice, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalprice);
			String totalPrice=addrspage.totalprice.getText().trim();
			System.out.println(totalPrice);
			report.updateTestLog("Total price","Total price in payment page is displayed as :" +totalPrice, Status.PASS);
			String totalprice1[]=totalPrice.split(" ");
			String totalprice2=totalprice1[1].replace(".", "");
			String totalprice3=totalprice2.replace(",", ".");
			System.out.println(totalprice3);
			Float totalpriceinUI = Float.parseFloat(totalprice3);
			report.updateTestLog("Total price","Total price in cart summary of payment page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
			if(totalpriceCalculatedwithservice==totalpriceinUI){
				report.updateTestLog("Total price","Total price in payment page is displaying as expected: " +totalpriceinUI, Status.PASS);
			}
			else{
				report.updateTestLog("Total price","Total price in payment page is not displaying as expected", Status.FAIL);
		 }
} 	catch(Exception e){
	report.updateTestLog("Products in payment page","Products are not displaying in payment page", Status.FAIL);
  }
}








/************************************************************************
 *
 * @Project Name : Electrolux*
 * @Function Name : paymentPageCartTotalVerifyWith1ServicesITAELX()*
 * @Description : This function is used to verify the cart total prices for multiple products in payment page*
 * @Author : Gaurav
 *
 ************************************************************************/
public void paymentPageCartTotalVerifyWith1ServicesITAELX() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
	JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
	try {
		ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod1price);
		String prod1Price=addrspage.prod1price.getText().trim();
		System.out.println(prod1Price);
		report.updateTestLog("Product 1 price","Product 1 price in payment page is displayed as :" +prod1Price, Status.PASS);
		String prod1Price1[]=prod1Price.split(" ");
		String prod1Price2=prod1Price1[1].replace(",", ".");
		System.out.println(prod1Price2);
		report.updateTestLog("Product 1 price","Product 1 price in payment page with decimal is displayed as :" +prod1Price2, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
		String prod2Price=addrspage.prod2price.getText().trim();
		System.out.println(prod2Price);
		report.updateTestLog("Product 2 price","Product 2 price in payment page is displayed as :" +prod2Price, Status.PASS);
		String prod2Price1[]=prod2Price.split(" ");
		String prod2Price2=prod2Price1[1].replace(",", ".");
		System.out.println(prod2Price2);
		report.updateTestLog("Product 2 price","Product 2 price in payment page with decimal is displayed as :" +prod2Price2, Status.PASS);
		Float prod1PriceinInt = Float.parseFloat(prod1Price2);
		Float prod2PriceinInt = Float.parseFloat(prod2Price2);
		ex.executeScript("arguments[0].scrollIntoView();", addrspage.subtotalprice);
		String subtotalPrice=addrspage.subtotalprice.getText().trim();
		System.out.println(subtotalPrice);
		report.updateTestLog("Subtotal price","Subtotal price in payment page is displayed as :" +subtotalPrice, Status.PASS);
		String subtotalprice1[]=subtotalPrice.split(" ");
		String subtotalprice2=subtotalprice1[1].replace(".", "");
		String subtotalprice3=subtotalprice2.replace(",", ".");
		System.out.println(subtotalprice3);
		Float subtotalpriceinUI = Float.parseFloat(subtotalprice3);
		try{
		if(addrspage.servicetotalprice.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();",addrspage.servicetotalprice);
			String basketpageserviceprice=addrspage.servicetotalprice.getText().trim();
			report.updateTestLog("Service total price","Service price in payment page is displayed as :" +basketpageserviceprice, Status.PASS);
			String servicetotprice1[]=basketpageserviceprice.split(" ");
			String servicetotprice2=servicetotprice1[1].replace(".", "");
			String servicetotprice3=servicetotprice2.replace(",", ".");
			Float servicetotpriceinUI = Float.parseFloat(servicetotprice3);
			if(delivrypage.totaldelprice.isDisplayed()){
				ex.executeScript("arguments[0].scrollIntoView();",delivrypage.totaldelprice);
				String totaldelivryprice=delivrypage.totaldelprice.getText().trim();
				String delpricecartsumm1[]=totaldelivryprice.split(" ");	
				String delpricecartsumm2=delpricecartsumm1[1];
				Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
				report.updateTestLog("Total delivery price","Total delivery price in cart summary of payment page is displayed as :" +delpricecartsumm3, Status.PASS);
			float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+servicetotpriceinUI+delpricecartsumm3;
			ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalamount);
			String totalamt=addrspage.totalamount.getText().trim();
			report.updateTestLog("Total price","Total price in payment page is displayed as :" +totalamt, Status.PASS);
			String totalprice1[]=totalamt.split(" ");
			String totalprice2=totalprice1[1].replace(".", "");
			String totalprice3=totalprice2.replace(",", ".");
			System.out.println(totalprice3);
			Float totalpriceinUI = Float.parseFloat(totalprice3);
			if(totalpriceCalculated==totalpriceinUI){
				report.updateTestLog("Total amount","Total amount with calculation in payment page is matching with total amount displayed  :" +totalpriceinUI, Status.PASS);
			}
		  }
		 }
		}catch(Exception e){
			if(delivrypage.totaldelprice.isDisplayed()){
				ex.executeScript("arguments[0].scrollIntoView();",delivrypage.totaldelprice);
				String totaldelivryprice=delivrypage.totaldelprice.getText().trim();
				String delpricecartsumm1[]=totaldelivryprice.split(" ");	
				String delpricecartsumm2=delpricecartsumm1[1];
				Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
				report.updateTestLog("Total delivery price","Total delivery price in cart summary of payment page is displayed as :" +delpricecartsumm3, Status.PASS);
		float subtotalpriceCalculated=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3;
		report.updateTestLog("Subtotal price calculated","Subtotal price calculated in payment page is :" +subtotalPrice, Status.PASS);
		report.updateTestLog("Subtotal price","Subtotal price in payment page in decimals is displayed as :" +subtotalprice3, Status.PASS);
		if(subtotalpriceCalculated==subtotalpriceinUI){
			report.updateTestLog("Subtotal price","Subtotal price in payment page is displaying as expected: "+subtotalpriceCalculated, Status.PASS);
		}
	
		else{
			report.updateTestLog("Subtotal price","Subtotal price in payment page is not displaying as expected", Status.FAIL);
	}
		try{
			ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalamount);
		String totalamt=addrspage.totalamount.getText().trim();
		report.updateTestLog("Total price","Total price in payment page is displayed as :" +totalamt, Status.PASS);
		String totalprice1[]=totalamt.split(" ");
		String totalprice2=totalprice1[1].replace(".", "");
		String totalprice3=totalprice2.replace(",", ".");
		System.out.println(totalprice3);
		Float totalpriceinUI = Float.parseFloat(totalprice3);
		if(subtotalpriceCalculated==totalpriceinUI){
			report.updateTestLog("Total amount","Total amount in payment page is matching with subtotal amount :" +totalpriceinUI, Status.PASS);
		}
		else{
			report.updateTestLog("Total amount","Total amount in payment page is not matching with subtotal amount", Status.FAIL);
		}
		
		}catch(Exception e1){
			report.updateTestLog("Total price","Total price in payment page is not displayed", Status.FAIL);
		}
			}
	}
	}catch(Exception e){
		report.updateTestLog("Products in delivery page","Products are not available in payment page", Status.FAIL);
	}

 }














/************************************************************************
 * @Project Name : Electrolux*
 * @Function Name : paypalPayment()*
 * @Description :This function is used to verify the paypal payment
 * @Author : Mamatha
 ************************************************************************/
public void paypalPaymentNew() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver.getWebDriver(),120);
	paypalRadioBtn.click();
	report.updateTestLog("Paypal radio button", "Clicked on Paypal Radio button", Status.PASS);
	termsAndConditions();
	confirmAndPay();
	//wait.until(ExpectedConditions.elementToBeClickable(paypalcontainer));
	Thread.sleep(5000);
	try {
		driver.switchTo().frame(3);
		String parentwindow=driver.getWebDriver().getWindowHandle();
		paypalcontainer.click();
		report.updateTestLog("Paypal dropin", "Clicked on Paypal dropin component", Status.PASS);
		for (String handle: driver.getWindowHandles()) {
			   System.out.println(handle);
			   driver.switchTo().window(handle);

			  }
		wait.until(ExpectedConditions.visibilityOf(paypalUserName));
		String paypalemailData = dataTable.getData("General_Data", "PaypalEmailid");
		paypalUserName.clear();
		paypalUserName.sendKeys(paypalemailData);
		report.updateTestLog("Paypal email id", "Paypal email id is entered as :" + paypalemailData, Status.PASS);
		String paypalpwdData = dataTable.getData("General_Data", "Paypalpassword");
		paypalPwd.sendKeys(paypalpwdData);
		report.updateTestLog("Paypal password", "Paypal password is entered as :" + paypalpwdData, Status.PASS);
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		paypalLoginBtn.click();
		report.updateTestLog("Paypal login button", "Clicked on Login button", Status.PASS);
		try {
			wait.until(ExpectedConditions.visibilityOf(paypalCookieBtn));
			paypalCookieBtn.click();
			report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
		}

		try {
			WebDriverWait(driver.getWebDriver(), paypalConfirmBtn, 120);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", paypalConfirmBtn);
			report.updateTestLog("Paypal payment Confirm button", "Clicked on Confirm button", Status.PASS);
		} catch (Exception ex) {
			WebDriverWait(driver.getWebDriver(), paypalConfirmBtn, 120);
			JavascriptExecutor ex1 = (JavascriptExecutor) driver.getWebDriver();
			ex1.executeScript("arguments[0].click();", paypalConfirmBtn);
			report.updateTestLog("Paypal payment Confirm button", "Clicked on Confirm button", Status.PASS);
		}
		driver.switchTo().window(parentwindow);
		
	} catch (Exception e) {
		report.updateTestLog("Paypal dropin", "Paypal dropin component is not available", Status.FAIL);
	}



/*		try {
		paypalCookieBtn.click();
		report.updateTestLog("Paypal cookie", "Clicked on Paypal cookie", Status.PASS);
	} catch (Exception e) {
		report.updateTestLog("Paypal cookie", "Paypal cookie is not available", Status.PASS);
	}*/
	//paypalConfirmBtn1.click();
	
}


































}












