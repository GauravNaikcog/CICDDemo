package pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class OrderConfirmationPage extends MasterPage {

	AddressPage addrspage = new AddressPage(scriptHelper);
	DeliveryPage delivrypage = new DeliveryPage(scriptHelper);

	@FindBy(xpath = "//div[@class='checkout-success__body__headline']")
	WebElement orderConfirmationMessage;

	@FindBy(xpath = "(//div[@class='checkout-success__body__headline']/following::p)[1]")
	WebElement orderConfirmationMessage1;

	@FindBy(xpath = "(//button[contains(@class,'continue-shopping-button')])[1]")
	WebElement contnueToShoppingBtn;

	@FindBy(xpath = "(//button[contains(@class,'continue-shopping-button')])[2]")
	WebElement contnueToShoppingbtnBottom;

	@FindBy(xpath = "(//span[@class='item-label'])[1]")
	WebElement orderNumberTxt;

	@FindBy(xpath = "(//span[@class='item-value'])[1]")
	WebElement orderNumber;

	@FindBy(xpath = "(//span[@class='item-label'])[3]")
	WebElement dateOfSubmsntxt;

	@FindBy(xpath = "(//span[@class='item-value'])[3]")
	WebElement dateOfSubmsn;

	@FindBy(xpath = "//div[contains(text(),'Delivery address')]")
	WebElement deliveryAddrsstxt;

	@FindBy(xpath = "(//div[contains(text(),'Delivery address')]/following::div)[1]")
	WebElement deliveryAddrssval;

	@FindBy(xpath = "//div[contains(text(),'Billing Address')]")
	WebElement billingAddresstxt;

	@FindBy(xpath = "(//div[contains(text(),'Billing Address')]/following::div)[1]")
	WebElement billingAddressval;

	@FindBy(xpath = "//div[contains(text(),'Phone number')]")
	WebElement phoneNumtxt;

	@FindBy(xpath = "(//div[contains(text(),'Phone number')]/following::div)[1]")
	WebElement phoneNumval;

	@FindBy(xpath = "//div[contains(text(),'Payment Method')]")
	WebElement paymentMethodtxt;

	@FindBy(xpath = "(//div[contains(text(),'Payment Method')]/following::div)[1]")
	WebElement paymentMethodval;

	@FindBy(xpath = "//div[contains(text(),'Total:')]")
	WebElement Totalstxt;

	@FindBy(xpath = "//div[contains(text(),'Total:')]/following::div/div[@class='totals']")
	WebElement totalAmount;

	@FindBy(xpath = "//div[contains(text(),'VAT')]")
	WebElement Totaltax;

	@FindBy(xpath = "//span[@class='coupon-code']")
	WebElement vouchrCodeConfirmatnPage;

	@FindBy(xpath = "//span[@class='coupon-code']")
	WebElement vouchrCodemsgConfirmatnPage;

	@FindBy(xpath = "(//i[contains(@class,'star')]/following::span[1])[1]")
	WebElement promoRibbonConfirmationPage;

	@FindBy(xpath = "(//i[contains(@class,'star')]/following::span[1])[2]")
	WebElement promoRibbonConfirmationPagePrdct2;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[1]")
	WebElement homeDeltxt;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[1]/following::span[1]")
	WebElement homeDelCharge;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[2]")
	WebElement sundayDelTxt;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[2]/following::span[1]")
	WebElement sundayDelCharge;

	@FindBy(xpath = "(//div[contains(@class,'well-headline')])[1]")
	WebElement orderSummText;

	@FindBy(xpath = "(//span[@class='item-label'])[1]")
	WebElement orderNumText;

	@FindBy(xpath = "(//span[@class='item-value'])[1]")
	WebElement orderNumValue;

	@FindBy(xpath = "(//span[@class='item-label'])[3]")
	WebElement dateSubmisnText;

	@FindBy(xpath = "(//span[@class='item-value'])[3]")
	WebElement dateSubmisnValue;

	@FindBy(xpath = "(//div[@class='label-order'])[1]")
	WebElement delveryAddrsTxt;

	@FindBy(xpath = "(//div[@class='value-order'])[1]")
	WebElement delveryAddrsDet;

	@FindBy(xpath = "(//div[@class='label-order'])[5]")
	WebElement billingAddrsTxt;

	@FindBy(xpath = "(//div[@class='value-order'])[5]")
	WebElement billingAddrsVal;

	@FindBy(xpath = "//div[contains(@class,'order-phone')]/div[1]")
	WebElement phoneNumTxt;

	@FindBy(xpath = "//div[contains(@class,'order-phone')]/div[2]")
	WebElement phoneNumVal;

	@FindBy(xpath = "//div[contains(@class,'payment-data')]/div[1]")
	WebElement modeOfPaymenTxt;

	@FindBy(xpath = "//div[contains(@class,'payment-data')]/div[2]")
	WebElement modeOfPaymentVal;

	@FindBy(xpath = "//div[contains(text(),'Codice')]")
	WebElement fiscalCodeTxt;

	@FindBy(xpath = "//div[contains(text(),'Codice')]/following::div[1]")
	WebElement fiscalCodeVal;

	@FindBy(xpath = "//div[@class='item__total']")
	WebElement productTotalPrice;

	@FindBy(xpath = "//div[@class='item__code']")
	WebElement ProductID;

	@FindBy(xpath = "//span[@class='item__name']")
	WebElement ProductName;

	@FindBy(xpath = "//span[@class='stock']")
	WebElement stockStatus;

	@FindBy(xpath = "//div[@class='item__price']")
	WebElement productItemPrice;

	@FindBy(xpath = "(//span[@class='delivery-charges'])[1]")
	WebElement homeDelPrice;

	@FindBy(xpath = "(//div[@class='promo'])[2]")
	WebElement ProductXpromoribbon;

	@FindBy(xpath = "(//div[@class='promo'])[4]")
	WebElement ProductYpromoribbon;

	@FindBy(xpath = "(//li[contains(@class,'list--item')])[2]")
	WebElement ProductYcartsummOCpage;

	@FindBy(xpath = "(//div[@class='item__total'])[2]")
	WebElement ProductYPriceOCpage;

	@FindBy(xpath = "(//div[@class='item__price'])[2]")
	WebElement ProductYQtyOCpage;

	@FindBy(xpath = "//div[@class='item__price']/span[@class='strikePrice']")
	WebElement strikedPrice;

	@FindBy(xpath = "(//div[@class='item__price'])[2]")
	WebElement discountPrice;

	@FindBy(xpath = "(//div[@class='item__price'])[1]")
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

	@FindBy(xpath = "(//div[@class='col-xs-6 cc-order-title'])[2]")
	WebElement servicesTxtOCpage;

	@FindBy(xpath = "(//div[@class='text-right'])[2]")
	WebElement servicesValOCpage;

	@FindBy(xpath = "(//div[contains(@class,'state-discount')])[1]")
	WebElement savingsTxtOCpage;

	@FindBy(xpath = "(//div[contains(@class,'text-right subtotals__item--state-discount amt')])[1]")
	WebElement savingsValOCpage;

	@FindBy(xpath = "(//div[contains(@class,'order-title')])[1]")
	WebElement subTotlTxt;

	@FindBy(xpath = "(//div[contains(@class,'order-title')])[1]/following::div[1]")
	WebElement subTotlValue;

	@FindBy(xpath = "(//div[contains(@class,'col-xs-6 cc-order-title')])[3]")
	WebElement deliveryTxtOCpage;

	@FindBy(xpath = "(//div[@class='text-right'])[3]")
	WebElement deliveryValOCpage;

	@FindBy(xpath = "(//div[@class='totals'])[2]")
	WebElement totalBtmValue;

	@FindBy(xpath = "(//div[@class='totals'])[1]")
	WebElement totalBtmTxt;

	@FindBy(xpath = "//span[@class='delivery-mode-desc deliveryModeMobBck']")
	WebElement postiDelTxt;

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

	@FindBy(xpath = "//div[@class='item__total']")
	WebElement productPrice;

	@FindBy(xpath = "//div[@class='col-xs-12 order-billing-address']//div[1]")
	WebElement billingAddresssTxt;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-primary btn-block btn--continue-shopping')])[1]")
	WebElement continueToShoppingOCP;

	@FindBy(xpath = "(//div[@class='klarnaDescriptionText'])")
	WebElement klarnaDescriptionOCpage;

	@FindBy(xpath = "//div[@class='order-payment-data']/div[1]")
	WebElement paymentMethodLabel;

	@FindBy(xpath = "//div[@class='order-payment-data']/div[2]")
	WebElement paymentMethodValue;

	@FindBy(xpath = "//div[@class='order-payment-data']/div[3]")
	WebElement paymentMethodDescription;
	
	
	
	
	//*********************************Gaurav Naik Changes**************************************************************************
	
		@FindBy(xpath = "//p[contains(@id,'delivery_instruction')]")
		WebElement deliveryinstructionocpage;
		
		
		@FindBy(xpath = "(//div[contains(@class,'item__total')])[1]")
		WebElement prod1price;
		
		
		@FindBy(xpath = "(//div[contains(@class,'item__total')])[2]")
		WebElement prod2price;
		
		
		@FindBy(xpath = "(//div[@class='text-right'])[2]")
		WebElement totalserviceprice;
		
		
		@FindBy(xpath = "(//div[contains(@class,'totals')])[3]/following::div[1]")
		WebElement totalprice;
		
		
		
		
		
	//***********************************************************************************************************		
	
	
	

	public OrderConfirmationPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderConfirmationPage()*
	 * @Description : This function is used to verify success message is displayed
	 *              in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void orderConfirmationPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try{
			WebDriverWait(driver.getWebDriver(), orderConfirmationMessage, 120);
		 ex.executeScript("arguments[0].scrollIntoView();", orderConfirmationMessage);
		if (orderConfirmationMessage.isDisplayed()) {
			report.updateTestLog("Order Confirmation message", "Order Confirmation success message is displayed",
					Status.PASS);
		} 
		}catch(Exception e){
			report.updateTestLog("Order Confirmation message", "Order Confirmation success message is not displayed",
					Status.FAIL);
		}
		vatTextCaptureOCPage();
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderConfirmationPageAEG()*
	 * @Description : This function is used to verify success message is displayed
	 *              in OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void orderConfirmationPageAEG() {
		WebDriverWait(driver.getWebDriver(), orderConfirmationMessage, 20);
		String actOrderconfirmationmessage = orderConfirmationMessage.getText().trim();
		System.out.println(actOrderconfirmationmessage);
		if (actOrderconfirmationmessage.equals(orderconfirmationmessageAEG)) {
			report.updateTestLog("Order Confirmation message in AEG",
					"Order Confirmation success message in AEG is as expected and is displayed as:"
							+ actOrderconfirmationmessage,
					Status.PASS);
		} else {
			report.updateTestLog("Order Confirmation message in AEG",
					"Order Confirmation success message is not displayed in AEG", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderSummaryDetailsVerify()*
	 * @Description : This function is used to verify order no and Delivery Address
	 *              in OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void orderSummaryDetailsVerify() {
		String orderNumbertxt = orderNumberTxt.getText();
		System.out.println(orderNumbertxt);
		String orderNumberval = orderNumber.getText();
		report.updateTestLog("Order number",
				"Order number is displayed in the format as: " + orderNumbertxt + " : " + orderNumberval, Status.PASS);
		String datefsubmsntxt = dateOfSubmsntxt.getText();
		String dateofSubmsnval = dateOfSubmsn.getText();
		report.updateTestLog("Date of Submission",
				"Date of Submission is displayed in the format as: " + datefsubmsntxt + " : " + dateofSubmsnval,
				Status.PASS);
		String deliveryaddrsstxt = deliveryAddrsstxt.getText();
		String deliveryaddrssval = deliveryAddrssval.getText();
		report.updateTestLog("Delivery address in Order confirmation page",
				"Delivery address in Order confirmation page in the format as: " + deliveryaddrsstxt + " : "
						+ deliveryaddrssval,
				Status.PASS);
		String billingaddresstxt = billingAddresstxt.getText();
		String billingaddressval = billingAddressval.getText();
		report.updateTestLog("Billing Address in Order confirmation page",
				"Billing Address in Order confirmation page in the format as: " + billingaddresstxt + " : "
						+ billingaddressval,
				Status.PASS);
		String phonenumtxt = phoneNumtxt.getText();
		String phonenumval = phoneNumval.getText();
		report.updateTestLog("Phone Number on Order confirmation page",
				"Phone Number on Order confirmation page in the format as: " + phonenumtxt + " : " + phonenumval,
				Status.PASS);
		String paymentmethodtxt = paymentMethodtxt.getText();
		String paymentmethodval = paymentMethodval.getText();
		report.updateTestLog("Payment Method on Order confirmation page",
				"Payment Method on Order confirmation page in the format as: " + paymentmethodtxt + " : "
						+ paymentmethodval,
				Status.PASS);
		String totalstxt = Totalstxt.getText();
		String totalsval = totalAmount.getText();
		report.updateTestLog("Total amount on Order confirmation page",
				"Total amount on Order confirmation page in the format as: " + totalstxt + " : " + totalsval,
				Status.PASS);
		String totaltaxtxt = Totaltax.getText();
		report.updateTestLog("Total tax on Order confirmation page",
				"Total tax on Order confirmation page in the format as: " + totaltaxtxt, Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : OrderconfirmationpageVerify()*
	 * @Description : This function is used to verify success message and Delivery
	 *              Address in OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void OrderconfirmationpageVerify() {
		WebDriverWait(driver.getWebDriver(), orderConfirmationMessage, 20);
		if (orderConfirmationMessage.isDisplayed()) {
			report.updateTestLog("Order Confirmation message", "Order Confirmation success message is displayed",
					Status.PASS);
		} else {
			report.updateTestLog("Order Confirmation message", "Order Confirmation success message is not displayed",
					Status.FAIL);
		}
		if (contnueToShoppingBtn.isDisplayed()) {
			report.updateTestLog("Contnue To Shopping buuton", "Contnue To Shopping button is displayed at top",
					Status.PASS);
		} else {
			report.updateTestLog("Order Confirmation message", "Contnue To Shopping button is not displayed at top",
					Status.FAIL);
		}
		if (contnueToShoppingbtnBottom.isDisplayed()) {
			report.updateTestLog("Contnue To Shopping buuton", "Contnue To Shopping button is displayed at bottom",
					Status.PASS);
		} else {
			report.updateTestLog("Order Confirmation message", "Contnue To Shopping button is not displayed at bottom",
					Status.FAIL);
		}
		orderSummaryDetailsVerify();
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInOrderConfirmationPage()*
	 * @Description : This function is used to verify Voucher code and promo message
	 *              in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void voucherVerifyInOrderConfirmationPage() {
		String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
		String voucherData = dataTable.getData("General_Data", "Voucher code");
		if (vouchercode.equals(voucherData)) {
			report.updateTestLog("Voucher code applied",
					"Voucher code in order confirmation page is displayed as expected: " + vouchercode, Status.PASS);
		} else {
			report.updateTestLog("Voucher code applied",
					"Voucher code in order confirmation page is not displaying as expected", Status.FAIL);
		}
		try {
			if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in order confirmation page is displayed as : "
								+ addrsspromoribbon,
						Status.PASS);
			} else {
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in order confirmation page is not displayed ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in order confirmation page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInOrderConfirmationPage()*
	 * @Description : This function is used to verify promo ribbon for product 1 in
	 *              OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void promoVerifyInOrderConfirmationPage() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();

		try {
			ex.executeScript("arguments[0].scrollIntoView();", promoRibbonConfirmationPage);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String ribbondetails = promoRibbonConfirmationPage.getText().trim();
			report.updateTestLog("Promo ribbon for product 1 in order confirmation page",
					"Promo ribbon for product 1 in order confirmation page is displayed as:" + ribbondetails,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 1 in order confirmation page",
					"Promo ribbon for product 1 is not displayed in order confirmation page", Status.FAIL);
		}
	}

	public void promoVerifyInOrderConfirmationPageProduct2() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();

		try {
			ex.executeScript("arguments[0].scrollIntoView();", promoRibbonConfirmationPagePrdct2);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String ribbondetails = promoRibbonConfirmationPagePrdct2.getText().trim();
			report.updateTestLog("Promo ribbon for product 2 in order confirmation page",
					"Promo ribbon for product 2 in order confirmation page is displayed as:" + ribbondetails,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 2 in order confirmation page",
					"Promo ribbon for product 2 is not displayed in order confirmation page", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderConfirmationPageHomeDelOptionCheck()*
	 * @Description : This function is used to verify home delivery charge and Text
	 *              in OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void orderConfirmationPageHomeDelOptionCheck() {
		String homedel = homeDeltxt.getText().trim();
		report.updateTestLog("Home delivery option text",
				"Home delivery option text in order confirmation page is displayed as:" + homedel, Status.PASS);

		if (homeDelCharge.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", homeDelCharge);
			String homedelchrg = homeDelCharge.getText().trim();
			report.updateTestLog("Home delivery option charge",
					"Home delivery option charge in order confirmation page is displayed as:" + homedelchrg,
					Status.PASS);
		} else {
			report.updateTestLog("Home delivery option charge",
					"Home delivery option charge in order confirmation page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderConfirmationPageSundayDelOptionCheck()*
	 * @Description : This function is used to verify Sunday delivery charge and
	 *              Text in OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void orderConfirmationPageSundayDelOptionCheck() {
		String sundeltxt = sundayDelTxt.getText().trim();
		report.updateTestLog("Sunday delivery option text",
				"Sunday delivery option text in order confirmation page is displayed as:" + sundeltxt, Status.PASS);
		if (sundayDelCharge.isDisplayed()) {
			String sundelchrg = sundayDelCharge.getText().trim();
			report.updateTestLog("Sunday delivery option charge",
					"Sunday delivery option charge in order confirmation page is displayed as:" + sundelchrg,
					Status.PASS);
		} else {
			report.updateTestLog("Sunday delivery option charge",
					"Sunday delivery option charge in order confirmation page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : orderNumDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify order no Text and Value in
	 *              OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void orderNumDetailsOrderConfirmationPage() {
		String ordrnumtxt = orderNumText.getText().trim();
		String ordrnumval = orderNumValue.getText().trim();
		if (orderNumText.isDisplayed()) {
			report.updateTestLog("Order Number text in Order summary in order confirmation page",
					"Order Number text in Order summary in order confirmation page is displayed as: " + ordrnumtxt,
					Status.PASS);
		} else {
			report.updateTestLog("Order Number text in Order summary in order confirmation page",
					"Order Number text in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		if (orderNumValue.isDisplayed()) {
			report.updateTestLog("Order Number value in Order summary in order confirmation page",
					"Order Number value in Order summary in order confirmation page is displayed as: " + ordrnumval,
					Status.PASS);
		} else {
			report.updateTestLog("Order Number text in Order summary in order confirmation page",
					"Order Number text in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		String OrderNumdet = ordrnumtxt + " " + ordrnumval;
		report.updateTestLog("Order Number details in Order summary in order confirmation page",
				"Order Number details in Order summary in order confirmation page is displayed as: " + OrderNumdet,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : dateOfSubMissionDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Date of Submission Text and
	 *              Value in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void dateOfSubMissionDetailsOrderConfirmationPage() {
		String datesubmsntxt = dateSubmisnText.getText().trim();
		String datesubmsnval = dateSubmisnValue.getText().trim();
		if (dateSubmisnText.isDisplayed()) {
			report.updateTestLog("Date of Submission text in Order summary in order confirmation page",
					"Date of Submission text in Order summary in order confirmation page is displayed as: "
							+ datesubmsntxt,
					Status.PASS);
		} else {
			report.updateTestLog("Date of Submission text in Order summary in order confirmation page",
					"Date of Submission text in Order summary in order confirmation page is not displayed",
					Status.FAIL);
		}
		if (dateSubmisnValue.isDisplayed()) {
			report.updateTestLog("Date of Submission value in Order summary in order confirmation page",
					"Date of Submission value in Order summary in order confirmation page is displayed as: "
							+ datesubmsnval,
					Status.PASS);
		} else {
			report.updateTestLog("Date of Submission value in Order summary in order confirmation page",
					"Date of Submission value in Order summary in order confirmation page is not displayed",
					Status.FAIL);
		}
		String datesubmsndet = datesubmsntxt + " " + datesubmsnval;
		report.updateTestLog("Date of Submission details in Order summary in order confirmation page",
				"Date of Submission details in Order summary in order confirmation page is displayed as: "
						+ datesubmsndet,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryAddressDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Delivery address Text and
	 *              Value in OCPage*
	 * @Author : Mamtha
	 *
	 ************************************************************************/
	public void deliveryAddressDetailsOrderConfirmationPage() {
		String delveryadrstxt = delveryAddrsTxt.getText().trim();
		String delveryadrsval = delveryAddrsDet.getText().trim();
		if (delveryAddrsTxt.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", delveryAddrsTxt);
			report.updateTestLog("Delivery address text in Order summary in order confirmation page",
					"Delivery address text in Order summary in order confirmation page is displayed as: "
							+ delveryadrstxt,
					Status.PASS);
		} else {
			report.updateTestLog("Delivery address text in Order summary in order confirmation page",
					"Delivery address text in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		if (delveryAddrsDet.isDisplayed()) {
			report.updateTestLog("Delivery address value in Order summary in order confirmation page",
					"Delivery address value in Order summary in order confirmation page is displayed as: "
							+ delveryadrsval,
					Status.PASS);
		} else {
			report.updateTestLog("Delivery address value in Order summary in order confirmation page",
					"Delivery address value in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		String deliveryaddrsdetails = delveryadrstxt + " " + delveryadrsval;
		report.updateTestLog("Delivery address details in Order summary in order confirmation page",
				"Delivery address details in Order summary in order confirmation page is displayed as: "
						+ deliveryaddrsdetails,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : billingAddressDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Billing address Text and Value
	 *              in OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void billingAddressDetailsOrderConfirmationPage() {
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", billingAddrsTxt);
			String billingadrstxt = billingAddrsTxt.getText().trim();
			String billingadrsval = billingAddrsVal.getText().trim();
			report.updateTestLog("Billing address text in Order summary in order confirmation page",
					"Billing address text in Order summary in order confirmation page is displayed as: "
							+ billingadrstxt,
					Status.PASS);
			report.updateTestLog("Billing address value in Order summary in order confirmation page",
					"Billing address value in Order summary in order confirmation page is displayed as: "
							+ billingadrsval,
					Status.PASS);
			String billingaddrsdetails = billingadrstxt + " " + billingadrsval;
			report.updateTestLog("Billing address details in Order summary in order confirmation page",
					"Billing address details in Order summary in order confirmation page is displayed as: "
							+ billingaddrsdetails,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Billing address details in Order summary in order confirmation page",
					"Billing address details is not entered by user for the product and it is not displayed on Order Confirmation page",
					Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : phoneNumberDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Phone Number Text and Value in
	 *              OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void phoneNumberDetailsOrderConfirmationPage() {
		String phonenumtxt = phoneNumTxt.getText().trim();
		String phonenumval = phoneNumVal.getText().trim();
		if (phoneNumTxt.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", phoneNumTxt);
			report.updateTestLog("Phone Number text in Order summary in order confirmation page",
					"Phone Number text in Order summary in order confirmation page is displayed as: " + phonenumtxt,
					Status.PASS);
		} else {
			report.updateTestLog("Phone Number text in Order summary in order confirmation page",
					"Phone Number text in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		if (phoneNumVal.isDisplayed()) {
			report.updateTestLog("Phone Number value in Order summary in order confirmation page",
					"Phone Number value in Order summary in order confirmation page is displayed as: " + phonenumval,
					Status.PASS);
		} else {
			report.updateTestLog("Phone Number value in Order summary in order confirmation page",
					"Phone Number value in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		String phonenumdetails = phonenumtxt + " " + phonenumval;
		report.updateTestLog("Phone Number details in Order summary in order confirmation page",
				"Phone Number details in Order summary in order confirmation page is displayed as: " + phonenumdetails,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : modeOfPaymentDetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Mode of payment Text and Value
	 *              in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void modeOfPaymentDetailsOrderConfirmationPage() {
		String modofPaymnttxt = modeOfPaymenTxt.getText().trim();
		String modofPaymntval = modeOfPaymentVal.getText().trim();
		if (modeOfPaymenTxt.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", modeOfPaymenTxt);
			report.updateTestLog("Mode of payment text in Order summary in order confirmation page",
					"Mode of payment text in Order summary in order confirmation page is displayed as: "
							+ modofPaymnttxt,
					Status.PASS);
		} else {
			report.updateTestLog("Mode of payment text in Order summary in order confirmation page",
					"Mode of payment text in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		if (modeOfPaymentVal.isDisplayed()) {
			report.updateTestLog("Mode of payment value in Order summary in order confirmation page",
					"Mode of payment value in Order summary in order confirmation page is displayed as: "
							+ modofPaymntval,
					Status.PASS);
		} else {
			report.updateTestLog("Mode of payment value in Order summary in order confirmation page",
					"Mode of payment value in Order summary in order confirmation page is not displayed", Status.FAIL);
		}
		String modeofpaymtdetails = modofPaymnttxt + " " + modofPaymntval;
		report.updateTestLog("Mode of payment details in Order summary in order confirmation page",
				"Mode of payment details in Order summary in order confirmation page is displayed as: "
						+ modeofpaymtdetails,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : fiscalCodedetailsOrderConfirmationPage()*
	 * @Description : This function is used to verify Fiscal code Text and Value in
	 *              OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void fiscalCodedetailsOrderConfirmationPage() {
		try {
			String fiscalcodetxt = fiscalCodeTxt.getText().trim();
			if (fiscalCodeTxt.isDisplayed()) {
				report.updateTestLog("Fiscal code text in Order summary in order confirmation page",
						"Fiscal code text in Order summary in order confirmation page is displayed as: "
								+ fiscalcodetxt,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Fiscal code value in Order summary in order confirmation page",
					"Fiscal code value in Order summary in order confirmation page is not available for the particular webshop",
					Status.PASS);
		}
		try {
			String fiscalcodeval = fiscalCodeVal.getText().trim();
			if (fiscalCodeVal.isDisplayed()) {
				report.updateTestLog("Fiscal code value in Order summary in order confirmation page",
						"Fiscal code value in Order summary in order confirmation page is displayed as: "
								+ fiscalcodeval,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Fiscal code value in Order summary in order confirmation page",
					"Fiscal code value in Order summary in order confirmation page is not available for the particular webshop",
					Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : contentVerifyOrderConfirmationPage_ELX()*
	 * @Description : This function is used to verifying All details in OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void contentVerifyOrderConfirmationPage_ELX() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		if (contnueToShoppingBtn.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", contnueToShoppingBtn);
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is displayed at top in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is not displayed at top in order confirmation page", Status.FAIL);
		}
		if (contnueToShoppingbtnBottom.isDisplayed()) {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is displayed at bottom in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is not displayed at bottom in order confirmation page", Status.FAIL);
		}
		String ordersummtxt = orderSummText.getText().trim();
		if (orderSummText.isDisplayed()) {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is displayed as: " + ordersummtxt, Status.PASS);
		} else {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is not displayed", Status.FAIL);
		}
		orderNumDetailsOrderConfirmationPage();
		dateOfSubMissionDetailsOrderConfirmationPage();
		deliveryAddressDetailsOrderConfirmationPage();
		billingAddressDetailsOrderConfirmationPage();
		phoneNumberDetailsOrderConfirmationPage();
		modeOfPaymentDetailsOrderConfirmationPage();
		fiscalCodedetailsOrderConfirmationPage();
		String modelID = ProductID.getText().trim();
		if (ProductID.isDisplayed()) {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is displayed as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is not displayed", Status.FAIL);
		}
		/*
		 * String modelname = ProductName.getText().trim(); if
		 * (ProductName.isDisplayed()) {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is displayed in order confirmation page as :" +
		 * modelname, Status.PASS); } else {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is not displayed in order confirmation page",
		 * Status.FAIL); }
		 */
		String actstockstatus = stockStatus.getText().trim();
		if (actstockstatus.equals(expstockstatus)) {
			report.updateTestLog("Stock status",
					"Stock status is displayed in order confirmation page as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status", "Stock status is not displayed in order confirmation page",
					Status.FAIL);
		}
		String prodprice = productTotalPrice.getText().trim();
		if (productTotalPrice.isDisplayed()) {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is displayed in order confirmation page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is not displayed in order confirmation page", Status.FAIL);
		}
		String prodctamtwithqty = productItemPrice.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x");
		String productprice = quantity[0].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity in order confirmation page",
				"Product amount with quantity in order confirmation page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of address page",
					"Product quantity is displayed as expected in order confirmation page and is displayed as: " + qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity in order confirmation page",
					"Product quantity is not displayed as expected in order confirmation page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in order confirmation page",
					"Product price below stock status is matching with main product price in order confirmation page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in order confirmation page",
					"Product price below stock status is not matching with main product price in order confirmation page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		if (addrspage.installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service text in order confirmation page",
					"Installation service text is displayed in order confirmation page as:" + installtiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service text in order confirmation pagee",
					"Installation service text is not displayed in order confirmation page", Status.FAIL);
		}
		if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service price in order confirmation page",
					"Installation service price is displayed in order confirmation page as:" + installatnprice,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service price in order confirmation page",
					"Installation service price is not displayed in order confirmation page", Status.FAIL);
		}
		String recycletxt = addrspage.disposalTxtcartsumm.getText().trim();
		String recycleprice = addrspage.disposalSerPriceCartSumm.getText().trim();
		if (addrspage.disposalTxtcartsumm.isDisplayed()) {
			report.updateTestLog("Recycle of old appliance and packaging service text in order confirmation page",
					"Recycle of old appliance and packaging service text is displayed in order confirmation page as:"
							+ recycletxt,
					Status.PASS);
		} else {
			report.updateTestLog("Recycle of old appliance and packaging service text in order confirmation page",
					"Recycle of old appliance and packaging service text is not displayed in order confirmation page",
					Status.FAIL);
		}
		if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Disposal service price in order confirmation page",
					"Disposal service price is displayed in order confirmation page as:" + recycleprice, Status.PASS);
		} else {
			report.updateTestLog("Disposal service price in order confirmation page",
					"Disposal service price is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String freereturntxt = addrspage.protectionTxtCartSumm.getText().trim();
			report.updateTestLog("Free Return service text in order confirmation page",
					"Free Return service text is displayed in order confirmation page as:" + freereturntxt,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Free Return service text in order confirmation page",
					"Free Return service text is not displayed in order confirmation page", Status.PASS);
		}
		try {
			String freereturnprice = addrspage.protectionSerPriceCartSumm.getText().trim();
			report.updateTestLog("Free Return service price in order confirmation page",
					"Free Return service price is displayed in order confirmation page as:" + freereturnprice,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Free Return service price in order confirmation page",
					"Free Return service price is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String homedeldesc = delivrypage.delivryModeTxtCartSumm.getText().trim();
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is displayed in order confirmation page as:" + homedeldesc, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String homedelcharg = homeDelPrice.getText().trim();
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is displayed in order confirmation page as:" + homedelcharg,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is not displayed in order confirmation page", Status.FAIL);
		}
		subTotalValueCheck();
		servicesValueCheck();
		deliveryDetailsOCPage();
		totalCartAmountBottomCartSummaryOCPage();
		savingsValueCheckOrderConfirmationPage();
		vatTextCaptureOCPage();
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : contentVerifyOrderConfirmationPage_AEG()*
	 * @Description : This function is used to verifying All details in OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void contentVerifyOrderConfirmationPage_AEG() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		if (contnueToShoppingBtn.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", contnueToShoppingBtn);
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is displayed at top in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is not displayed at top in order confirmation page", Status.FAIL);
		}
		if (contnueToShoppingbtnBottom.isDisplayed()) {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is displayed at bottom in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is not displayed at bottom in order confirmation page", Status.FAIL);
		}
		String ordersummtxt = orderSummText.getText().trim();
		if (orderSummText.isDisplayed()) {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is displayed as: " + ordersummtxt, Status.PASS);
		} else {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is not displayed", Status.FAIL);
		}
		orderNumDetailsOrderConfirmationPage();
		dateOfSubMissionDetailsOrderConfirmationPage();
		deliveryAddressDetailsOrderConfirmationPage();
		billingAddressDetailsOrderConfirmationPage();
		phoneNumberDetailsOrderConfirmationPage();
		modeOfPaymentDetailsOrderConfirmationPage();
		// if(CartsummaryproductImg.isDisplayed()){
		// report.updateTestLog("Product Image in Cart Summary of Address
		// page","Product
		// Image is displayed in Cart Summary of Address page", Status.PASS);
		// }else{
		// report.updateTestLog("Product Image in Cart Summary of Address
		// page","Product
		// Image is not displayed in Cart Summary of Address page",
		// Status.FAIL);
		// }
		String modelID = ProductID.getText().trim();
		if (ProductID.isDisplayed()) {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is displayed as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is not displayed", Status.FAIL);
		}
		/*
		 * String modelname = ProductName.getText().trim(); if
		 * (ProductName.isDisplayed()) {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is displayed in order confirmation page as :" +
		 * modelname, Status.PASS); } else {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is not displayed in order confirmation page",
		 * Status.FAIL); }
		 */
		String actstockstatus = stockStatus.getText().trim();
		if (actstockstatus.equals(expstockstatusaeg)) {
			report.updateTestLog("Stock status",
					"Stock status is displayed in order confirmation page as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status", "Stock status is not displayed in order confirmation page",
					Status.FAIL);
		}
		String prodprice = productTotalPrice.getText().trim();
		if (productTotalPrice.isDisplayed()) {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is displayed in order confirmation page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is not displayed in order confirmation page", Status.FAIL);
		}
		String prodctamtwithqty = productItemPrice.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x");
		String productprice = quantity[0].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity in order confirmation page",
				"Product amount with quantity in order confirmation page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of address page",
					"Product quantity is displayed as expected in order confirmation page and is displayed as: " + qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity in order confirmation page",
					"Product quantity is not displayed as expected in order confirmation page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in order confirmation page",
					"Product price below stock status is matching with main product price in order confirmation page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in order confirmation page",
					"Product price below stock status is not matching with main product price in order confirmation page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		if (addrspage.installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service text in order confirmation page",
					"Installation service text is displayed in order confirmation page as:" + installtiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service text in order confirmation pagee",
					"Installation service text is not displayed in order confirmation page", Status.FAIL);
		}
		if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service price in order confirmation page",
					"Installation service price is displayed in order confirmation page as:" + installatnprice,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service price in order confirmation page",
					"Installation service price is not displayed in order confirmation page", Status.FAIL);
		}
		String recycletxt = addrspage.disposalTxtcartsumm.getText().trim();
		String recycleprice = addrspage.disposalSerPriceCartSumm.getText().trim();
		if (addrspage.disposalTxtcartsumm.isDisplayed()) {
			report.updateTestLog("Recycle of old appliance and packaging service text in order confirmation page",
					"Recycle of old appliance and packaging service text is displayed in order confirmation page as:"
							+ recycletxt,
					Status.PASS);
		} else {
			report.updateTestLog("Recycle of old appliance and packaging service text in order confirmation page",
					"Recycle of old appliance and packaging service text is not displayed in order confirmation page",
					Status.FAIL);
		}
		if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Disposal service price in order confirmation page",
					"Disposal service price is displayed in order confirmation page as:" + recycleprice, Status.PASS);
		} else {
			report.updateTestLog("Disposal service price in order confirmation page",
					"Disposal service price is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String homedeldesc = delivrypage.delivryModeTxtCartSumm.getText().trim();
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is displayed in order confirmation page as:" + homedeldesc, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String homedelcharg = homeDelPrice.getText().trim();
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is displayed in order confirmation page as:" + homedelcharg,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is not displayed in order confirmation page", Status.FAIL);
		}
		subTotalValueCheck();
		servicesValueCheck();
		deliveryDetails();
		totalCartAmountBottomCartSummaryOCPageAEG();
		savingsValueCheckOrderConfirmationPage();
		vatTextCaptureOCPage();
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationOrderConfirmationPage()*
	 * @Description : This function is used to verify All details for Product X and
	 *              Y in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void buyXGetYProductValidationOrderConfirmationPage() {
		if (ProductXpromoribbon.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", ProductXpromoribbon);
			String promomsg = ProductXpromoribbon.getText().trim();
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the order confirmation page is displayed as : "
							+ promomsg,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the order confirmation page is not displayed",
					Status.FAIL);
		}
		if (ProductYpromoribbon.isDisplayed()) {
			String promomsgproducty = ProductYpromoribbon.getText().trim();
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the order confirmation page is displayed as : "
							+ promomsgproducty,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the order confirmation page is not displayed",
					Status.FAIL);
		}
		if (ProductYcartsummOCpage.isDisplayed()) {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the order confirmation page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the order confirmation page is not displayed", Status.FAIL);
		}
		String productyqty = ProductYQtyOCpage.getText().trim();
		report.updateTestLog("Product Y Quantity in cart summary of the address page",
				"Product Y quantity in cart summary of the order confirmation page is displayed as :" + productyqty,
				Status.PASS);
		if (ProductYPriceOCpage.isDisplayed()) {
			String productyprice = ProductYPriceOCpage.getText().trim();
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the order confirmation page is displayed as :" + productyprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the order confirmation page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : USPPromotionHeaderBannerValidationOrderConfirmationPage()*
	 * @Description : This function is used to verify USP Banner in OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void USPPromotionHeaderBannerValidationOrderConfirmationPage() {
		if (addrspage.uspBanner1Title.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", addrspage.uspBanner1Title);
			String uspbanner1 = addrspage.uspBanner1Title.getText().trim();
			report.updateTestLog("Title of USP Banner 1 in order confirmation page",
					"Title of USP Banner 1 in order confirmation page is displayed as :" + uspbanner1, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 1 in order confirmation page",
					"Title of USP Banner 1 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner1Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 1 in order confirmation page",
					"Icon of USP Banner 1 in order confirmation page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 1 in order confirmation page",
					"Icon of USP Banner 1 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Title.isDisplayed()) {
			String uspbanner2 = addrspage.uspBanner2Title.getText().trim();
			report.updateTestLog("Title of USP Banner 2 in order confirmation page",
					"Title of USP Banner 2 in order confirmation page is displayed as :" + uspbanner2, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 2 in order confirmation page",
					"Title of USP Banner 2 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 2 in order confirmation page",
					"Icon of USP Banner 2 in order confirmation page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 2 in order confirmation page",
					"Icon of USP Banner 2 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Title.isDisplayed()) {
			String uspbanner3 = addrspage.uspBanner3Title.getText().trim();
			report.updateTestLog("Title of USP Banner 3 in order confirmation page",
					"Title of USP Banner 3 in order confirmation page is displayed as :" + uspbanner3, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 3 in order confirmation page",
					"Title of USP Banner 3 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 3 in order confirmation page",
					"Icon of USP Banner 3 in order confirmation page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 3 in order confirmation page",
					"Icon of USP Banner 3 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Title.isDisplayed()) {
			String uspbanner4 = addrspage.uspBanner4Title.getText().trim();
			report.updateTestLog("Title of USP Banner 4 in order confirmation page",
					"Title of USP Banner 4 in order confirmation page is displayed as :" + uspbanner4, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 4 in order confirmation page",
					"Title of USP Banner 4 in order confirmation page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 4 in order confirmation page",
					"Icon of USP Banner 4 in order confirmation page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 4 in order confirmation page",
					"Icon of USP Banner 4 in order confirmation page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForPercentagePromotionProduct1OCPage()*
	 * @Description : This function is used to verify offer price for promotion in
	 *              OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct1OCPage() {
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
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForPercentagePromotionProduct2OCPage()*
	 * @Description : This function is used to verify offer and list price in
	 *              OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct2OCPage() {
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
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForFlatDiscountPromotionProduct1_OCPage()*
	 * @Description : This function is used to verify offer and list price in
	 *              OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct1_OCPage() {
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
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForFlatDiscountPromotionProduct2_OCPage()*
	 * @Description : This function is used to verifying Offer Price For Flat
	 *              Discount Promotion Product2 in OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct2_OCPage() {
		String flatDiscount = dataTable.getData("General_Data", "flatDiscount Product2");
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
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : contentVerifyOrderConfirmationPage()*
	 * @Description : This function is used to verifying All details in OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void contentVerifyOrderConfirmationPage() {
		if (contnueToShoppingBtn.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", contnueToShoppingBtn);
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is displayed at top in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at top in order confirmation page",
					"Continue to Shopping button is not displayed at top in order confirmation page", Status.FAIL);
		}
		if (contnueToShoppingbtnBottom.isDisplayed()) {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is displayed at bottom in order confirmation page", Status.PASS);
		} else {
			report.updateTestLog("Continue to Shopping button in Order summary at bottom in order confirmation page",
					"Continue to Shopping button is not displayed at bottom in order confirmation page", Status.FAIL);
		}
		String ordersummtxt = orderSummText.getText().trim();
		if (orderSummText.isDisplayed()) {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is displayed as: " + ordersummtxt, Status.PASS);
		} else {
			report.updateTestLog("Order summary text in order confirmation page",
					"Order summary text in order confirmation page is not displayed", Status.FAIL);
		}
		orderNumDetailsOrderConfirmationPage();
		dateOfSubMissionDetailsOrderConfirmationPage();
		deliveryAddressDetailsOrderConfirmationPage();
		billingAddressDetailsOrderConfirmationPage();
		phoneNumberDetailsOrderConfirmationPage();
		modeOfPaymentDetailsOrderConfirmationPage();
		fiscalCodedetailsOrderConfirmationPage();
		String modelID = ProductID.getText().trim();
		if (ProductID.isDisplayed()) {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is displayed as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in order confirmation page",
					"Product model id in order confirmation page is not displayed", Status.FAIL);
		}
		/*
		 * String modelname = ProductName.getText().trim(); if
		 * (ProductName.isDisplayed()) {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is displayed in order confirmation page as :" +
		 * modelname, Status.PASS); } else {
		 * report.updateTestLog("Product model name in order confirmation page",
		 * "Product model name is not displayed in order confirmation page",
		 * Status.FAIL); }
		 */
		String actstockstatus = stockStatus.getText().trim();
		if (stockStatus.isDisplayed()) {
			report.updateTestLog("Stock status",
					"Stock status is displayed in order confirmation page as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status", "Stock status is not displayed in order confirmation page",
					Status.FAIL);
		}
		String prodprice = stockStatus.getText().trim();
		if (productTotalPrice.isDisplayed()) {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is displayed in order confirmation page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in order confirmation page",
					"Product price is not displayed in order confirmation page", Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		try {
			if (addrspage.installtnTxtCartSumm.isDisplayed()) {
				report.updateTestLog("First Service text",
						"First Service text is displayed in order confirmation page as:" + installtiontxt, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service", "First Service is not selected for the product", Status.PASS);
		}
		try {
			if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("First Service price",
						"First Service price is displayed in order confirmation page as:" + installatnprice,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service text", "First Service is not selected for the product", Status.PASS);
		}
		try {
			String recycletxt = addrspage.disposalTxtcartsumm.getText().trim();
			String recycleprice = addrspage.disposalSerPriceCartSumm.getText().trim();
			if (addrspage.disposalTxtcartsumm.isDisplayed()) {
				report.updateTestLog("Second Service text",
						"Second Service text is displayed in order confirmation page as:" + recycletxt, Status.PASS);
			}
			if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("Second Service price",
						"Second Service price is displayed in order confirmation page as:" + recycleprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service", "Second Service is not selected for the product", Status.PASS);
		}
		try {
			String freereturntxt = addrspage.protectionTxtCartSumm.getText().trim();
			report.updateTestLog("Third Service text",
					"Third Service text is displayed in order confirmation page as:" + freereturntxt, Status.PASS);
			String freereturnprice = addrspage.protectionSerPriceCartSumm.getText().trim();
			report.updateTestLog("Third Service price",
					"Third Service price is displayed in order confirmation page as:" + freereturnprice, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Third Service", "Third Service is not selected for the product", Status.PASS);
		}
		try {
			String homedeldesc = delivrypage.delivryModeTxtCartSumm.getText().trim();
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is displayed in order confirmation page as:" + homedeldesc, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method text in order confirmation page",
					"Home delivery method text is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			String homedelcharg = homeDelPrice.getText().trim();
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is displayed in order confirmation page as:" + homedelcharg,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Home delivery method price in order confirmation page",
					"Home delivery method price is not displayed in order confirmation page", Status.FAIL);
		}
		subTotalValueCheckOCpage();
		servicesValueCheckOCPage();
		deliveryDetailsOCPage();
		totalCartAmountBottomCartSummaryOCPage();
		savingsValueCheckOCpage();
		vatTextCaptureOCPage();
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : oderConfirmationPageUspVerify()*
	 * @Description : This function is used to verifying Services in OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void oderConfirmationPageUspVerify() {
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", installazioneLink);
			installazioneLink.click();
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is displayed as Clickable Hyperlink in order confirmation page", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is not displayed as Clickable Hyperlink in order confirmation page", Status.FAIL);
		}
		try {
			if (installazioneImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Header Banner Img",
						"USP Promotion Header Banner Image is displayed in order confirmation page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Header Banner Img",
					"USP Promotion Header Banner Image is not displayed in order confirmation page", Status.FAIL);
		}
		try {
			if (spedizioneGratuitaImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
						"USP Promotion Spedizione gratuita Img Cart is displayed in order confirmation page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
					"USP Promotion Spedizione gratuita Img Cart is not displayed in order confirmation page",
					Status.FAIL);
		}
		try {
			if (giorniDiResoImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion days of free Return Img",
						"USP Promotion Spedizione Days of free Return is displayed in order confirmation page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion days of free Return Img",
					"USP Promotion Spedizione Days of free Return is not displayed in order confirmation page",
					Status.FAIL);
		}
		try {
			if (peaceOfMindImg.isDisplayed()) {
				report.updateTestLog(
						"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
						"USP Promotion Peace of mind and full assistance included is displayed in order confirmation page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog(
					"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
					"USP Promotion Peace of mind and full assistance included is not displayed in order confirmation page",
					Status.FAIL);
		}
	}

/*	public void servicesValueCheckOCpage() {
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", servicesTxtOCpage);
			String servicestxt = servicesTxtOCpage.getText();
			String servicesval = servicesValOCpage.getText();
			String servicesfo = servicestxt + " " + servicesval;
			report.updateTestLog("Services information in Order confirmation Page",
					"Services information in Order confirmation Page is displayed as: " + servicesfo, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Services information in cart summary of address page",
					"There are no services selected", Status.PASS);
		}
	}*/

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : savingsValueCheckOCpage()*
	 * @Description : This function is used to verifying Saving Text and Value in
	 *              OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void savingsValueCheckOCpage() {
		try {
			String savingstxt = savingsTxtOCpage.getText();
			String savingsval = savingsValOCpage.getText();
			String savingsinfo = savingstxt + " " + savingsval;
			report.updateTestLog("Savings information in Order confirmation Page",
					"Savings information in Order confirmation Page is displayed as: " + savingsinfo, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Savings information in Order confirmation Page",
					"There are no savings for the product ", Status.PASS);
		}
	}

	public void subTotalValueCheckOCpage() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", subTotlTxt);
			String subtotaltxt = subTotlTxt.getText().trim();
			String subtotalval = subTotlValue.getText();
			String subtotalinfo = subtotaltxt + subtotalval;
			report.updateTestLog("Subtotal information","Subtotal information in Cart Summary is displayed as: " + subtotalinfo, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Subtotal information", "Subtotal information in Cart Summary is not displayed as: ",
					Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryDetailsVerificationOCpage()*
	 * @Description : This function is used to verifying Delivery Text and Value in
	 *              OCPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public void deliveryDetailsVerificationOCpage() {
		try {
			if (delivryTxt.isDisplayed()) {
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", delivryTxt);
				String deltxt = deliveryTxtOCpage.getText().trim();
				String delval = deliveryValOCpage.getText().trim();
				String deldetails = deltxt + delval;
				report.updateTestLog("Total Delivery details", "Total Delivery details is displayed as: " + deldetails,
						Status.PASS);
			} else {
				report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Total Delivery details", "Total Delivery details is not displayed", Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : totalCartAmountBtmCartSummaryOCPage()*
	 * @Description : This function is used to verifying Total Amount in OCPage*
	 * @Author : Mohan
	 *
	 ************************************************************************/
	public void totalCartAmountBtmCartSummaryOCPage() {
		String totaltxt = totalBtmTxt.getText().trim();
		String totalval = totalBtmValue.getText().trim();
		String productotalamount = totaltxt + " " + totalval;
		report.updateTestLog("Total Amount",
				"Product total amount in Cart Summary of Order confirmation page is displayed as: " + productotalamount,
				Status.PASS);
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : ocPage_VeriyWithPromotionProduct()*
	 * @Description : This function is used to verifying All details in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void ocPage_VeriyWithPromotionProduct() {
		/*
		 * try { if (strikedPrice.isDisplayed()) { String product2strikedprice =
		 * strikedPrice.getText().trim();
		 * report.updateTestLog("Order confirmation page Product 2 Striked off price",
		 * "Product is applied with promotion and Product Striked off price is displayed as: "
		 * + product2strikedprice, Status.PASS); } else {
		 * report.updateTestLog("Order confirmation page Product 2 Striked off price",
		 * "Product is not applied with promotion and Product Striked off price is not displayed"
		 * , Status.FAIL); } } catch (Exception e) {
		 * report.updateTestLog("Order confirmation page Product 2 Striked off price",
		 * "Product  Striked off price is not displayed", Status.FAIL); } try { if
		 * (discountPrice.isDisplayed()) { String product2discprice =
		 * discountPrice.getText().trim();
		 * report.updateTestLog("Order confirmation page Product 2 discounted price",
		 * "Product  discounted price is displayed as: " + product2discprice,
		 * Status.PASS); } else {
		 * report.updateTestLog("Order confirmation page Product 2 discounted price",
		 * "Product  discounted price is not displayed", Status.FAIL); } } catch
		 * (Exception e) {
		 * report.updateTestLog("Order confirmation page Product 2 discounted price",
		 * "Product  discounted price is not displayed", Status.FAIL); }
		 */
		promoVerifyInOrderConfirmationPage();
		promoVerifyInOrderConfirmationPageProduct2();
		subTotalValueCheckOCpage();
		deliveryDetailsVerificationOCpage();
		totalCartAmountBtmCartSummaryOCPage();
		savingsValueCheckOCpage();
		vatTextCaptureOCPage();
	}

	public void klarnaWithExtendedWarrantyServices() {
		try {

			WebElement extendedWarranty = driver
					.findElement(By.xpath("//span[contains(text(),'Extended Warrenty Services Promo')]"));
			String ewservicespromo = extendedWarranty.getText();
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", ewservicespromo);
			report.updateTestLog("Extended Warranty Services Promo",
					"The Extended Warranty Services Promo is Displayed as : " + ewservicespromo, Status.PASS);

			List<WebElement> services = driver.findElements(By.xpath("//div[@class='services_entries']"));

			Iterator<WebElement> itr = services.iterator();
			while (itr.hasNext()) {
				WebElement service = itr.next();
				System.out.println(service.getText());
				report.updateTestLog("Services Titles in OC Page",
						"The Services showing in Order Confirmation Page as : " + service.getText(), Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Services Titles in OC Page",
					"The Services are not showing in Order Confirmation Page ", Status.FAIL);
		}
	}

	public void OrderConfirmationpagePostiDeloptioncheck() {

		String postidel = postiDelTxt.getText().trim();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", postidel);
		report.updateTestLog("Posti delivery option in OC Page",
				"Posti delivery option in OC page is displayed as:" + postidel, Status.PASS);
	}

	public void OCpagePostNordDeloptioncheck() {
		String postidel = postiDelTxt.getText().trim();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", postidel);
		report.updateTestLog("PostNord delivery option in OC Page",
				"PostNord delivery option in OC page is displayed as:" + postidel, Status.PASS);
	}

	public void OCPageServiceInformationValidations() {

		String installtiontxt = installtnTxtCartSumm.getText().trim();
		String installatnprice = installtnSerPriceCartSumm.getText().trim();
		if (installtnTxtCartSumm.isDisplayed()) {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", installtnTxtCartSumm);
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

		String address1 = delveryAddrsTxt.getText().trim();
		if (delveryAddrsTxt.isDisplayed()) {
			report.updateTestLog("Shipping Address is display", "Shipping Address is display as :" + address1,
					Status.PASS);
		} else {
			report.updateTestLog("Shipping Address is display", "Shipping Address is not display", Status.FAIL);
		}

		String address2 = billingAddresssTxt.getText().trim();
		if (billingAddresssTxt.isDisplayed()) {
			report.updateTestLog("Billing Address is display", "Billing Address is display as :" + address2,
					Status.PASS);
		} else {
			report.updateTestLog("Billing Address is display", "Billing Address is not display", Status.FAIL);
		}

	}

	public void EWServicePromoVerifyOCPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		try {

			String ewservicespromo = addrspage.ewServiceText.getText().trim();
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", ewservicespromo);

			report.updateTestLog("EW Services Promo",

					"The Extended Warranty Services Promo in oc page page is Displayed as : " + ewservicespromo,
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

			report.updateTestLog("EW service",

					"The EW service is not set up", Status.FAIL);

		}
	}

	public void OCpageDHLServiceDeloptioncheck() {
		try {
			String postidel = postiDelTxt.getText().trim();
			report.updateTestLog("DHL delivery option in OC Page",
					"DHL delivery option in OC page is displayed as:" + postidel, Status.PASS);
		} catch (Exception e) {

		}
	}

	//// CICD/////

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : savingsValueNotDisplayedCheckOCpage()*
	 * @Description : This function is used to verifying Saving Text and Value in
	 *              OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void savingsValueNotDisplayedCheckOCpage() {
		try {
			if (savingsTxtOCpage.isDisplayed()) {
				report.updateTestLog("Savings information in Order confirmation Page",
						"Savings information in Order confirmation Page is displayed as: ", Status.FAIL);
			} else {
				report.updateTestLog("Savings information in Order confirmation Page",
						"There are no savings for the product ", Status.PASS);
			}

		} catch (Exception e) {
			report.updateTestLog("Savings information in Order confirmation Page",
					"There are no savings for the product ", Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : ocpageSummaryVerify()*
	 * @Description : This function is used to verifying summary of order
	 *              confirmation page
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void ocpageSummaryVerify() throws InterruptedException {
		orderConfirmationPage();
		subTotalValueCheckOCpage();
		deliveryDetailsVerificationOCpage();
		totalCartAmountBtmCartSummaryOCPage();
		savingsValueCheckOCpage();
		vatTextCaptureOCPage();

	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : ocpageSummaryNoSavingsVerify()*
	 * @Description : This function is used to verifying Saving Text and Value not
	 *              present OCPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void ocpageSummaryNoSavingsVerify() throws InterruptedException {
		orderConfirmationPage();
		subTotalValueCheckOCpage();
		deliveryDetailsVerificationOCpage();
		totalCartAmountBtmCartSummaryOCPage();
		savingsValueNotDisplayedCheckOCpage();
		vatTextCaptureOCPage();

	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : continueToDelBtnClickOCPage()*
	 * @Description : To click on Continue Shopping in OCPage*
	 * @Author : Mohan
	 ************************************************************************/

	public void continueToDelBtnClickOCPage() {
		try {
			if (continueToShoppingOCP.isDisplayed()) {
				report.updateTestLog("Continue Shopping Button in OC Page",
						"Continue Shopping Button is Displayed in OC Page", Status.PASS);
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].click();", continueToShoppingOCP);
				report.updateTestLog("Continue Shopping Button in OC Page", "Clicked On Continue To Shopping Button",
						Status.PASS);
			} else {
				report.updateTestLog("Continue Shopping Button in OC Page",
						"Continue Shopping Button is Not Displayed in OC Page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Continue Shopping Button in OC Page",
					"Continue Shopping Button is Not Displayed in OC Page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : klarnaPaymentVerifyInOCPage()*
	 * @Description : To verify klarna payment description in OCPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void klarnaPaymentVerifyInOCPage() {
		try {
			String payLabelTxt = paymentMethodLabel.getText();
			String payValTxt = paymentMethodValue.getText();
			report.updateTestLog("Payment method in OC Page",
					"The Payment method is showing in OC Page as : " + payLabelTxt + " : " + payValTxt, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Payment method in OC Page", "The Payment method is not showing in OC Page",
					Status.FAIL);
		}
	}

	
	

	/*************************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : VerifyVoucherRemovalOCPage()*
	 * @Description :To verify the voucher ribbon message is not displayed in OC Page*
	 * @Author : Gaurav 
	 **************************************************************************************/
	public void verifyVoucherRemovalOCPage() {
		try {
			if(addrspage.voucherribbonAddrsPage.isDisplayed()){
			report.updateTestLog("Voucher ribbon in OC page","Voucher ribbon is displayed in OC page",
					Status.FAIL);
		} 
		}catch (Exception e) {
			report.updateTestLog("Voucher ribbon in delivery page","Voucher ribbon is not displayed in OC page",
					Status.PASS);
		}
	}



	/*************************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : VerifyDeliveryInstructionOCPage()*
	 * @Description :To verify that delivery instruction is displayed in OC Page*
	 * @Author : Gaurav 
	 **************************************************************************************/
	public void verifyDeliveryInstructionOCPage() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", deliveryinstructionocpage);
			if(deliveryinstructionocpage.isDisplayed()){
				String delinstrn=deliveryinstructionocpage.getText().trim();
			report.updateTestLog("Delivery Instrn in OC page","Delivery Instruction in OC page is displayed as: "+delinstrn,Status.PASS);
		} 
		}catch (Exception e) {
			report.updateTestLog("Delivery Instrn in OC page","Delivery Instruction in OC page is not displayed",Status.FAIL);
		}
	}
	






	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInOrderConfirmationPage()*
	 * @Description : This function is used to verify Voucher code and promo message
	 *              in OCPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void voucherNewVerifyInOrderConfirmationPage() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try{
			ex.executeScript("arguments[0].scrollIntoView();", addrspage.vouchrCodeAddrssPage);
   		String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
   		String voucherData = dataTable.getData("General_Data", "New Voucher code");
		if (vouchercode.equals(voucherData)) {
			report.updateTestLog("Voucher code applied",
					"Voucher code in order confirmation page is displayed as expected: " + vouchercode, Status.PASS);
		} else {
			report.updateTestLog("Voucher code applied",
					"Voucher code in order confirmation page is not displaying as expected", Status.FAIL);
		}
		try {
			if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in order confirmation page is displayed as : "
								+ addrsspromoribbon,
						Status.PASS);
			} else {
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in order confirmation page is not displayed ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in order confirmation page is not displayed ", Status.FAIL);
		}
		}catch(Exception e){
			report.updateTestLog("Voucher details","Voucher details in order confirmation page is not displayed ", Status.FAIL);
		}
	}	





	
	/************************************************************************
	*
	* @Project Name : Electrolux*
	* @Function Name : orderConfirmationPageCartTotalVerifyITAELX()*
	* @Description : This function is used to verify the cart total prices for multiple products in OC Page*
	* @Author : Gaurav
	*
	************************************************************************/
	public void orderConfirmationPageCartTotalVerifyITAELX() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
				ex.executeScript("arguments[0].scrollIntoView();",addrspage.prod1price);
				String prod1Price=prod1price.getText().trim();
				System.out.println(prod1Price);
				report.updateTestLog("Product 1 price","Product 1 price in OC page is displayed as :" +prod1Price, Status.PASS);
				String prod1Price1[]=prod1Price.split(" ");
				String prod1Price2=prod1Price1[1].replace(",", ".");
				System.out.println(prod1Price2);
				report.updateTestLog("Product 1 price","Product 1 price in OC page with decimal is displayed as :" +prod1Price2, Status.PASS);
				ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
				String prod2Price=prod2price.getText().trim();
				System.out.println(prod2Price);
				report.updateTestLog("Product 2 price","Product 2 price in OC page is displayed as :" +prod2Price, Status.PASS);
				String prod2Price1[]=prod2Price.split(" ");
				String prod2Price2=prod2Price1[1].replace(",", ".");
				System.out.println(prod2Price2);
				report.updateTestLog("Product 2 price","Product 2 price in OC page with decimal is displayed as :" +prod2Price2, Status.PASS);
				Float prod1PriceinInt = Float.parseFloat(prod1Price2);
				Float prod2PriceinInt = Float.parseFloat(prod2Price2);
				String delpricecartsumm=delivrypage.totaldelprice.getText().trim();
				System.out.println(delpricecartsumm);
				String delpricecartsumm1[]=delpricecartsumm.split(" ");	
				String delpricecartsumm2=delpricecartsumm1[1];
				Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
				report.updateTestLog("Total delivery price","Total delivery price in cart summary of OC page is displayed as :" +delpricecartsumm, Status.PASS);
				 String totServiceprice=totalserviceprice.getText().trim();
				  String totalserviceprice1[]=totServiceprice.split(" ");
				  String totalserviceprice2=totalserviceprice1[1];
				  System.out.println(totalserviceprice2);
				  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
				  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
				report.updateTestLog("Total price calculated in OC page","Total price calculated in OC page is :" +totalpriceCalculatedwithservice, Status.PASS);
				ex.executeScript("arguments[0].scrollIntoView();",totalprice);
				String totalPrice=totalprice.getText().trim();
				System.out.println(totalPrice);
				report.updateTestLog("Total price","Total price in OC page is displayed as :" +totalPrice, Status.PASS);
				String totalprice1[]=totalPrice.split(" ");
				String totalprice2=totalprice1[1].replace(".", "");
				String totalprice3=totalprice2.replace(",", ".");
				System.out.println(totalprice3);
				Float totalpriceinUI = Float.parseFloat(totalprice3);
				report.updateTestLog("Total price","Total price in cart summary of OC page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
				if(totalpriceCalculatedwithservice==totalpriceinUI){
					report.updateTestLog("Total price","Total price in OC page is displaying as expected: " +totalpriceinUI, Status.PASS);
				}
				else{
					report.updateTestLog("Total price","Total price in OC page is not displaying as expected", Status.FAIL);
			 }
		}catch(Exception e){
		report.updateTestLog("Products in OC page","Products are not displaying in OC page", Status.FAIL);
	  }
}
	


}