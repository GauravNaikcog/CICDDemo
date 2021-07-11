package pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class AddressPage extends MasterPage {
	
	

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement eMail;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@name='fiscalCode']")
	WebElement fiscalCode;

	@FindBy(xpath = "//input[@name='line1']")
	WebElement address;

	@FindBy(xpath = "//input[@name='townCity']")
	WebElement city;

	@FindBy(xpath = "//input[@name='postcode']")
	WebElement postCode;

	@FindBy(xpath = "//select[@name='province']")
	WebElement province;

	@FindBy(xpath = "//button[@id='addressSubmit']")
	WebElement continueDelivery;

	@FindBy(xpath = "//span[@class='stock instock']")
	WebElement stockStatus;

	@FindBy(xpath = "//div[@class='qty']")
	WebElement productQty;

	@FindBy(xpath = "//div[@class='qty']/div")
	WebElement productAmount;

	@FindBy(xpath = "(//input[@name='_billingAddress']/following::span)[1]")
	WebElement billingAddressCheckBox;

	@FindBy(xpath = "//div[@class='item-id']")
	WebElement addressPageModelID;

	@FindBy(xpath = "//div[@class='item-name']")
	WebElement addressPageProdName;

	/****** Billing Address Section *************/
	@FindBy(xpath = "//Select[@name='billingCountry']")
	WebElement billingCountry;

	@FindBy(xpath = "//input[@id='address.billing.firstName']")
	WebElement billingFirstName;

	@FindBy(xpath = "//input[@id='address.billing.surname']")
	WebElement billingLastName;

	@FindBy(xpath = "//input[@id='address.billing.fiscalCode']")
	WebElement billingFiscalcode;

	@FindBy(xpath = "//input[@id='address.billing.line1']")
	WebElement billingAddress1;

	@FindBy(xpath = "//input[@id='address.billing.townCity']")
	WebElement billingCity;

	@FindBy(xpath = "//input[@id='address.billing.postalcod']")
	WebElement billingPostcode;

	@FindBy(xpath = "//input[@id='address.billing.postalcod']/following::span[2]")
	WebElement billingZipErr;

	@FindBy(xpath = "//select[@id='address.billing.province']")
	WebElement billingProvince;

	@FindBy(xpath = "//span[@class='coupon-code']")
	WebElement vouchrCodeAddrssPage;

	@FindBy(xpath = "//i[@class='icon-star']/following::span")
	WebElement vouchrCodeMsgAddrssPage;

	@FindBy(xpath = "(//span[@class='promotion'])[1]")
	WebElement product1PromoRibbonAddrsPage;

	@FindBy(xpath = "(//i[@class='icon-star']/following::span[1])[1]")
	WebElement promoRibbonAddrsPage;

	@FindBy(xpath = "(//i[@class='icon-star']/following::span[1])[2]")
	WebElement promoRibbonAddrsPagePrduct2;

	@FindBy(xpath = "//span[@class='coupon-text']")
	WebElement couponTxt;

	@FindBy(xpath = "(//span[@class='promotion'])[2]")
	WebElement product2PromoRibbonAddrsPage;

	@FindBy(xpath = "(//img[contains(@src,'product')])[2]")
	WebElement product2PimgAddrsPage;

	@FindBy(xpath = "//span[contains(@class,'error_msg alert-danger error_show')]")
	WebElement errorMsgs;

	@FindBy(xpath = "(//input[contains(@id,'buyingAsBusiness')]/following::span)[1]")
	WebElement businessYesRadioBtn;

	@FindBy(xpath = "(//input[contains(@id,'buyingAsBusiness')]/following::span)[2]")
	WebElement businessNoRadioBtn;

	@FindBy(xpath = "(//input[contains(@name,'companyName')])[1]")
	WebElement companyName;

	@FindBy(xpath = "//input[@id='address.VATNumber']")
	WebElement vatName;

	@FindBy(xpath = "//input[@id='address.companyName']/following::span[1]")
	WebElement companyNameErr;

	@FindBy(xpath = "//span[contains(text(),'Firmen')]")
	WebElement companyNameAEGErr;

	@FindBy(xpath = "//span[contains(text(),'IVA')]")
	WebElement vatErr;

	@FindBy(xpath = "//span[contains(text(),'SDI')]")
	WebElement sdiErr;

	@FindBy(xpath = "//img[contains(@src,'product')]")
	WebElement cartSummaryProductImg;

	@FindBy(xpath = "//div[@class='item-id']")
	WebElement productModel;

	@FindBy(xpath = "//div[@class='item-name']")
	WebElement productModelName;

	@FindBy(xpath = "//div[@class='price']")
	WebElement productPrice;

	@FindBy(xpath = "(//span[@class='service-text'])[1]")
	WebElement installtnTxtCartSumm;

	@FindBy(xpath = "(//span[@class='service-text'])[2]")
	WebElement disposalTxtcartsumm;

	@FindBy(xpath = "(//span[@class='service-text'])[3]")
	WebElement protectionTxtCartSumm;

	@FindBy(xpath = "(//span[@class='service-text'])[4]")
	WebElement fourthServiceTxtCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[1]")
	WebElement installtnSerPriceCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[2]")
	WebElement disposalSerPriceCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[3]")
	WebElement protectionSerPriceCartSumm;

	@FindBy(xpath = "(//span[@class='serviceMainPrice'])[4]")
	WebElement fourthServicePriceCartSumm;

	@FindBy(xpath = "//select[@id='address.billing.country']")
	WebElement landDropDownAEG;

	@FindBy(xpath = "//input[@id='address.sdinumber']")
	WebElement sdi;

	@FindBy(xpath = "(//li[@class='checkout-order-summary-list-items'])[2]")
	WebElement productYCartSummAddrsPage;

	@FindBy(xpath = "(//div[@class='qty'])[2]")
	WebElement productYQty;

	@FindBy(xpath = "(//div[@class='price'])[2]")
	WebElement productYPriceCartSummaAdrsPage;

	@FindBy(xpath = "(//a[@href='#'])[1]")
	WebElement uspBanner1Title;

	@FindBy(xpath = "(//div[@class='content'])[1]/img")
	WebElement uspBanner1Icon;

	@FindBy(xpath = "(//a[@href='#'])[2]")
	WebElement uspBanner2Title;

	@FindBy(xpath = "(//div[@class='content'])[2]/img")
	WebElement uspBanner2Icon;

	@FindBy(xpath = "(//a[@href='#'])[3]")
	WebElement uspBanner3Title;

	@FindBy(xpath = "(//div[@class='content'])[3]/img")
	WebElement uspBanner3Icon;

	@FindBy(xpath = "(//a[@href='#'])[3]/following::a[1]")
	WebElement uspBanner4Title;

	@FindBy(xpath = "(//div[@class='content'])[4]/img")
	WebElement uspBanner4Icon;

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

	@FindBy(xpath = "//*[@id=\"newsLetterSubscription\"]/div/div[1]")
	WebElement newsLetterSubscription;

	@FindBy(xpath = "//*[@id=\"productRegistration\"]/div/div[1]")
	WebElement productLetterSubscription;

	@FindBy(xpath = "//*[@id=\"newsLetterSubscription\"]/div/div[1]/label/span")
	WebElement newsLetterSubscriptionChecked;

	@FindBy(xpath = "//*[@id=\"productRegistration\"]/div/div[1]/label/span")
	WebElement productLetterSubscriptionChecked;

	@FindBy(xpath = "//div[@class='edit']")
	WebElement editBtnForAddrSectnInDelPge;

	@FindBy(xpath = "//div[@class='thumb']/a[contains(@href,'eluxmkt')]")
	WebElement pdpHyperlinkOnProductImg;

	@FindBy(xpath = "(//button[contains(@class,'AddToBasket')])[1]")
	WebElement addToBasket;

	@FindBy(xpath = "(//input[@name='postcode']/following::span)[2]")
	WebElement zipErr;

	@FindBy(xpath = "//input[@id='address.billing.companyName']")
	WebElement billingCompanyName;

	@FindBy(xpath = "//input[@id='address.billing.VATNumber']")
	WebElement billingVAT;

	@FindBy(xpath = "//input[@id='address.billing.companyName']/following::div[1]")
	WebElement billingCompanyNameErr;

	@FindBy(xpath = "//input[@id='address.billing.VATNumber']/following::div[1]")
	WebElement billingVATErr;

	@FindBy(xpath = "//input[@id='address.billingsdinumber']")
	WebElement billingSDI;

	@FindBy(xpath = "//input[@id='address.billingsdinumber']/following::div[1]")
	WebElement billingSDIError;

	@FindBy(xpath = "//a[@class='content-weeetax']")
	WebElement weeLinkAddrPge;

	@FindBy(xpath = "//p[contains(@class,'content-weeetax')]/span")
	WebElement weePriceAddrPge;

	@FindBy(xpath = "//p[contains(@class,'content-weeetax')]")
	WebElement weeTotalBlockAddrPge;

	@FindBy(xpath = "//input[@id='address.billing.VATNumber']")
	WebElement billingVATName;

	@FindBy(xpath = "//a[@class='redirectEditLink']")
	WebElement editLinkDelPge;

	@FindBy(xpath = "(//div[contains(@class,'deliveryLabelCnt')])[1]")
	WebElement delivryModeTxtMain;

	@FindBy(xpath = "(//span[contains(text(),'Extended')])[2]")
	WebElement ewServiceText;

	// @FindBy(xpath = "//span[@class='service-text']")
	// WebElement ewServiceText;

	@FindBy(xpath = "(//span[contains(text(),'Extended')])[2]/following::span[1]")
	WebElement ewServiceprice;

	// @FindBy(xpath = "//span[@class='service-text']/following::span[1]")
	// WebElement ewServiceprice;

	// ******************CICD*****************************************//

	@FindBy(xpath = "//div[@class='checkout-steps ']//a[@class='step-head js-checkout-step active']")
	WebElement addressPgeCheckoutTitle;

	@FindBy(xpath = "//label[@class='control-label inline-radio-control']")
	WebElement addrPgeRuBuyngAsBusinessTxt;

	@FindBy(xpath = "//label[@class='radio-inline']/input[@id='buyingAsBusiness2']")
	WebElement buyAsBusinessNoBtn;

	@FindBy(xpath = "//label[@class='radio-inline']/input[@id='buyingAsBusiness1']")
	WebElement buyAsBusinessYesBtn;

	@FindBy(xpath = "//input[@id='address.companyName']")
	WebElement companyNameAddressPge;

	@FindBy(xpath = "//input[@id='address.VATNumber']")
	WebElement vatNumAddressPge;

	@FindBy(xpath = "(//input[@name='_billingAddress']/following::span)[1]")
	WebElement billingAddressCheckbox;

	@FindBy(xpath = "//input[@id='address.billing.fiscalCode']")
	WebElement billingFiscalCode;

	@FindBy(xpath = "//label[contains(@class,'control-label inline-radio-control')]")
	WebElement txtAreUBuyAsBusiness;

	@FindBy(xpath = "//*[@id='deliveryAddressForm']/div[2]/div[1]/div/label[1]")
	WebElement companyYesButtonVerify;

	@FindBy(xpath = "//*[@id='deliveryAddressForm']/div[2]/div[1]/div/label[2]")
	WebElement companyNoButtonVerify;

//*********************************Gaurav Naik*************************************************************	
	
	@FindBy(xpath = "//span[contains(@class,'coupon-text')]")
	WebElement voucherribbonAddrsPage;
	
	@FindBy(xpath = "//input[@id='address.sdinumber']")
	WebElement sdiAddrPge;

	@FindBy(xpath = "//input[@id='address.billingsdinumber']")
	WebElement billSDI;
	
	
	@FindBy(xpath = "//div[contains(@class,'iti__selected-flag')]")
	WebElement phoneNumberDropdown;
	
	
	@FindBy(xpath = "//div[contains(@class,'addressContentBck')]/following::div[contains(@class,'delivery-details')][1]")
    WebElement delservicedisabled;
	
	
	@FindBy(xpath = "(//span[contains(@class,'error_msg alert-danger error_show')])[1]")
    WebElement delserviceerrormsg;
	
	
	@FindBy(xpath = "(//div[contains(@class,'price')])[1]")
    WebElement prod1price;
	
	
	@FindBy(xpath = "(//div[contains(@class,'price')])[2]")
    WebElement prod2price;
	
	
	@FindBy(xpath = "(//div[contains(@class,'totals')])[3]/div[2]")
    WebElement totalprice;
	
	
	@FindBy(xpath = "(//div[contains(@class,'total-title')])[1]/following::div[1]")
    WebElement subtotalprice;
	
	
	@FindBy(xpath = "(//div[contains(@class,'total-title')])[2]/following::div[1]")
    WebElement servicetotalprice;
	
	
	@FindBy(xpath = "(//div[contains(@class,'total-price')])[4]")
    WebElement totalamount;
	
	
	
	
	

//**********************************************************************************************************	
	
	public AddressPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageVerify()*
	 * @Description : This function is used to verify the shipping address section*
	 * @Author : Mohan
	 ************************************************************************/
	public void addressPageVerify() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		waitUntilElementVisible(firstName, 120);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		waitUntilElementVisible(lastName, 120);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		waitUntilElementVisible(eMail, 120);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		waitUntilElementVisible(eMail, 20);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		waitUntilElementVisible(address, 20);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		waitUntilElementVisible(city, 20);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageVerifyItaElx()*
	 * @Description : This function is used to verify the shipping address
	 *              section-ITAELX*
	 * @Author : Rahul
	 ************************************************************************/
	public void addressPageVerifyItaElx() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String FiscalCodeData = dataTable.getData("General_Data", "FiscalCode");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		waitUntilElementVisible(firstName,360);	
		ex.executeScript("arguments[0].scrollIntoView();", firstName);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", lastName);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", eMail);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", phoneNumber);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		try {
			if (fiscalCode.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", fiscalCode);
				fiscalCode.sendKeys(FiscalCodeData);
				report.updateTestLog("Fiscal Code", "Fiscal code is entered as : " + FiscalCodeData, Status.PASS);
			} else {
				report.updateTestLog("Fiscal Code", "Fiscal code field is not available for the country", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code", "Fiscal code field is not available for the webshop", Status.PASS);
		}
		ex.executeScript("arguments[0].scrollIntoView();", address);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", city);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", postCode);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageVerifyAeg()*
	 * @Description : This function is used to verify the shipping address section*
	 * @Author : Mamatha
	 ************************************************************************/
	public void addressPageVerifyAeg() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(firstName));
		ex.executeScript("arguments[0].scrollIntoView();", firstName);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", lastName);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", eMail);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", phoneNumber);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", address);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", city);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();", postCode);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : billingAddress()*
	 * @Description : This function is used to verify the billing address section*
	 * @Author : Mohan
	 ************************************************************************/
	public void billingAddress() {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 60);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 20);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String billingprovinceData = dataTable.getData("General_Data", "Billing Province");
		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
		if (billingFiscalcode.isDisplayed()) {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
			billingProvince.sendKeys(billingprovinceData);
			report.updateTestLog("Province dropdown field",
					"Province dropdown field in Billing address is displayed and is entered as :" + billingprovinceData,
					Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : billingAddressAeg()*
	 * @Description :To verify the billing address section in AEG*
	 * @Author : Rahul
	 ************************************************************************/
	public void billingAddressAeg() {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 30);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 30);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
		try {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code in Billing address", "Fiscal code in Billing address is not displayed",
					Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageFieldsErrorMessageValidation()*
	 * @Description : To verify all the error messages in address page*
	 * @Author : Mohan
	 ************************************************************************/
	public void addressPageFieldsErrorMessageValidation() {
		try {
			List<WebElement> errlist = driver
					.findElements(By.xpath("//span[contains(@class,'error_msg alert-danger error_show')]"));
			Iterator<WebElement> itr = errlist.iterator();
			while (itr.hasNext()) {
				WebElement errRow = itr.next();
				System.out.println(errRow.getText());
				report.updateTestLog("Mandatory fields in Address page",
						"Respective Field is highlighted with repective error as: " + errRow.getText(), Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Mandatory fields in Address page",
					"All fields are not highlighted with repective error", Status.FAIL);
		}
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : mailingAddressPageValidations()*
	 * @Description : To verify mailing address with error messages*
	 * @Author : Gaurav
	 ************************************************************************/
	public void mailingAddressPageValidations() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String ProvinceData = dataTable.getData("General_Data", "Province");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		String VATNumData = dataTable.getData("General_Data", "VAT Number");
		String PECAddData = dataTable.getData("General_Data", "SDI Number");
		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();
		businessYesRadioBtn.click();
		report.updateTestLog("Yes Radio button in Are you Buying as Business",
				"Yes Option is selected for Are you Buying as Business", Status.PASS);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
		try {
			selectDropDownValue(driver.getWebDriver(), province, ProvinceData);
			report.updateTestLog("Province", "Province dropdown value is selected as: " + ProvinceData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Province", "Province dropdown value is not available for the current market",
					Status.PASS);
		}
		navigateToDeliveryPage();
		try {
			if (companyName.isDisplayed()) {
				report.updateTestLog("Company Name textbox field", "Company Name textbox field is displayed",
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field", "Company Name textbox " + "field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatName.isDisplayed()) {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is displayed", Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not mandatory field for the current market", Status.PASS);
		}
		try {
			if (companyNameErr.isDisplayed()) {
				String compnameErr = errorMsgs.getText().trim();
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is highlighted with error and is displayed as: " + compnameErr,
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatErr.isDisplayed()) {
				String vatnbrErr = vatErr.getText().trim();
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is highlighted with error and is displayed as: " + vatnbrErr,
						Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not Mandatory field for the current market", Status.PASS);
		}
		try {
			if (sdiErr.isDisplayed()) {
				String sdierr = sdiErr.getText().trim();
				report.updateTestLog("SDI textbox field",
						"SDI textbox field is highlighted with error and is displayed as: " + sdierr, Status.PASS);
			} else {
				report.updateTestLog("SDI  textbox field", "SDI textbox field is not highlighted with error",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI textbox field", "SDI textbox field is not available for the current market",
					Status.PASS);
		}
		try {
			sdi.sendKeys(PECAddData);
			report.updateTestLog("SDI textbox field", "SDI is entered as: " + PECAddData, Status.PASS);
			companyName.sendKeys(CompanyNameData);
			report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,
					Status.PASS);
			vatName.sendKeys(VATNumData);
			report.updateTestLog("VAT Number textbox field", "VAT Number is entered as: " + VATNumData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("SDI,Company Name,VAT Number",
					"SDI,Company Name,VAT Number fields are not available for the market", Status.PASS);
		}
		try {
			navigateToDeliveryPage();
			report.updateTestLog("Continue to Delivery button", "Clicked on Continue to Delivery button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Delivery Page", "User is already on Delivery page", Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageCartSummary()*
	 * @Description : This function is used to verify cart summary*
	 * @Author : Rahul
	 ************************************************************************/
	public void addressPageCartSummary() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		WebDriverWait(driver.getWebDriver(), firstName, 10);
		String actstockstatus = stockStatus.getText();
		if (actstockstatus.equals(expstockstatus)) {
			report.updateTestLog("Stock status", "Stock status is displayed as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status", "Stock status is not displayed", Status.FAIL);
		}
		String prodctamtwithqty = productQty.getText();
		report.updateTestLog("Product amount with quantity on cart summary of address page",
				"Product amount with quantity on cart summary of address page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (prodctamtwithqty.endsWith(QtyData)) {
			report.updateTestLog("Product amount with quantity on cart summary of address page",
					"Product quantity is displayed as expected on cart summary of address page and is displayed as: "
							+ prodctamtwithqty,
					Status.PASS);
		} else {
			report.updateTestLog("Product amount with quantity on cart summary of address page",
					"Product quantity is not displayed as expected on cart summary of address page and is displayed as: "
							+ prodctamtwithqty,
					Status.FAIL);
		}
		report.updateTestLog("Product amount with quantity on cart summary of address page",
				"Product amount with quantity on cart summary of address page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		String prodctamtaddrsspage = productAmount.getText().trim();
		report.updateTestLog("Product amount on cart summary of address page",
				"Product amount with quantity on cart summary of address page is displayed as: " + prodctamtaddrsspage,
				Status.PASS);
		String modelid = addressPageModelID.getText().trim();
		if (addressPageModelID.isDisplayed()) {
			report.updateTestLog("Product model id", "Product model ID in the address page is displayed as: " + modelid,
					Status.PASS);
		} else {
			report.updateTestLog("Product model id", "Product model ID in the address page is not displayed",
					Status.FAIL);
		}
		String prodctnameaddrsspage = addressPageProdName.getText().trim();
		if (addressPageProdName.isDisplayed()) {
			report.updateTestLog("Product name",
					"Product name in the address page is displayed as: " + prodctnameaddrsspage, Status.PASS);
		} else {
			report.updateTestLog("Product name", "Product name in the address page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : myBillingAddressDifferentValidations()*
	 * @Description : This function is used to verify the Billing Address section*
	 * @Author : Rahul
	 ************************************************************************/
	public void myBillingAddressDifferentValidations() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 60);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 30);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String billingprovinceData = dataTable.getData("General_Data", "Billing Province");
		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();
		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
		try {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code field for country selected in billing section is not available for the market",
					Status.PASS);
		}
		try {
			billingProvince.sendKeys(billingprovinceData);
			report.updateTestLog("Province dropdown field",
					"Province dropdown field in Billing address is displayed and is entered as :" + billingprovinceData,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Province field in Billing address",
					"Province field for country selected in billing section is not available for the market",
					Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInAddressPage()*
	 * @Description :To verify the Voucher ribbon in Address Page*
	 * @Author : Mohan
	 ************************************************************************/
	public void voucherVerifyInAddressPage() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			String vouchercode = vouchrCodeAddrssPage.getText();
			String voucherData = dataTable.getData("General_Data", "Voucher code");
			ex.executeScript("arguments[0].scrollIntoView();", vouchrCodeAddrssPage);
			if (vouchercode.equals(voucherData)) {
				report.updateTestLog("Voucher code applied",
						"Voucher code in address page is displayed as expected: " + vouchercode, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Voucher code applied", "Voucher code in address page is not displaying as expected",
					Status.FAIL);
		}
		try {
			if (promoRibbonAddrsPage.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", promoRibbonAddrsPage);
				String addrsspromoribbon = promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in address page is displayed as : " + addrsspromoribbon,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in address page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :promoVerifyInAddressPage() *
	 * @Description : Used to verify promo in address page
	 * @Author : Rahul
	 ************************************************************************/
	public void promoVerifyInAddressPage() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", promoRibbonAddrsPage);
			String ribbondetails = promoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for product 1 in address details page",
					"Promo ribbon for product 1 in address details page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon in address details page",
					"Promo ribbon for product 1 in address details page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInAddress2Products()*
	 * @Description :To verify the promotion ribbon of Product 2*
	 * @Author : Mohan
	 ************************************************************************/
	public void promoVerifyInAddress2Products() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", promoRibbonAddrsPagePrduct2);
			String ribbondetails = promoRibbonAddrsPagePrduct2.getText().trim();
			report.updateTestLog("Promo ribbon for product 2 in address details page",
					"Promo ribbon for product 2 in address details page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 2 in address details page",
					"Promo ribbon for product 2 in address details page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : mailingAddressPageValidationsAEG()*
	 * @Description :To validate Mailing address section with error messages*
	 * @Author : Gaurav
	 ************************************************************************/
	public void mailingAddressPageValidationsAEG() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String ProvinceData = dataTable.getData("General_Data", "Province");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();
		businessYesRadioBtn.click();
		report.updateTestLog("Yes Radio button in Are you Buying as Business",
				"Yes Option is selected for Are you Buying as Business", Status.PASS);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
		report.updateTestLog("Province", "Province dropdown value is selected as: " + ProvinceData, Status.PASS);
		navigateToDeliveryPage();
		if (companyName.isDisplayed()) {
			report.updateTestLog("Company Name textbox field", "Company Name textbox field is displayed", Status.PASS);
		} else {
			report.updateTestLog("Company Name textbox field", "Company Name textbox field is not displayed",
					Status.FAIL);
		}
		try {
			String compnameErr = companyNameAEGErr.getText().trim();
			if (companyNameAEGErr.isDisplayed()) {
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is highlighted with error and is displayed as: " + compnameErr,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.PASS);
		}
		companyName.sendKeys(CompanyNameData);
		report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,
				Status.PASS);
		navigateToDeliveryPage();
		report.updateTestLog("Continue to Delivery button", "Clicked on Continue to Delivery button", Status.PASS);
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : myBillingAddressDifferentValidationsAEG()*
	 * @Description :To validate Billing address section with error messages*
	 * @Author : Gaurav
	 ************************************************************************/
	public void myBillingAddressDifferentValidationsAEG() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 60);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 30);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String billingprovinceData = dataTable.getData("General_Data", "Billing Province");
		String billingcountryAEGData = dataTable.getData("General_Data", "Billing Country");
		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();
		selectDropDownValue(driver.getWebDriver(), landDropDownAEG, billingcountryAEGData);
		report.updateTestLog("Country dropdown in AEG",
				"Country dropdown in the billing address in AEG is entered as: " + billingcountryAEGData, Status.PASS);
		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
		try {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code in Billing address", "Fiscal code in Billing address is not displayed",
					Status.PASS);
		}
		selectDropDownValue(driver.getWebDriver(), billingProvince, billingprovinceData);
		report.updateTestLog("Province dropdown field",
				"Province dropdown field in Billing address is displayed and is entered as :" + billingprovinceData,
				Status.PASS);
		navigateToDeliveryPage();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationAddressPage()*
	 * @Description : This function is used to validate the Buy X -Get Y promotion*
	 * @Author : Mamatha
	 ************************************************************************/
	public void buyXGetYProductValidationAddressPage() {
		if (product1PromoRibbonAddrsPage.isDisplayed()) {
			String promomsg = product1PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the address page is displayed as : " + promomsg,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the address page is not displayed", Status.FAIL);
		}
		if (product2PromoRibbonAddrsPage.isDisplayed()) {
			String promomsgproducty = product2PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the address page is displayed as : "
							+ promomsgproducty,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the address page is not displayed", Status.FAIL);
		}
		if (productYCartSummAddrsPage.isDisplayed()) {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the address page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the address page is not displayed", Status.FAIL);
		}
		String productyqty = productYQty.getText().trim();
		report.updateTestLog("Product Y Quantity in cart summary of the address page",
				"Product Y quantity in cart summary of the address page is displayed as :" + productyqty, Status.PASS);
		if (productYPriceCartSummaAdrsPage.isDisplayed()) {
			String productyprice = productYPriceCartSummaAdrsPage.getText().trim();
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the address page is displayed as :" + productyprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the address page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : uspPromotionHeaderBannerValidationAddressPage()*
	 * @Description : To validate the USP promotion header banner*
	 * @Author : Rahul
	 ************************************************************************/
	public void uspPromotionHeaderBannerValidationAddressPage() {
		if (uspBanner1Title.isDisplayed()) {
			String uspbanner1 = uspBanner1Title.getText().trim();
			report.updateTestLog("Title of USP Banner 1 in address page",
					"Title of USP Banner 1 in address page is displayed as :" + uspbanner1, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 1 in address page",
					"Title of USP Banner 1 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner1Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 1 in address page",
					"Icon of USP Banner 1 in address page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 1 in address page",
					"Icon of USP Banner 1 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner2Title.isDisplayed()) {
			String uspbanner2 = uspBanner2Title.getText().trim();
			report.updateTestLog("Title of USP Banner 2 in address page",
					"Title of USP Banner 2 in address page is displayed as :" + uspbanner2, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 2 in address page",
					"Title of USP Banner 2 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner2Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 2 in address page",
					"Icon of USP Banner 2 in address page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 2 in address page",
					"Icon of USP Banner 2 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner3Title.isDisplayed()) {
			String uspbanner3 = uspBanner3Title.getText().trim();
			report.updateTestLog("Title of USP Banner 3 in address page",
					"Title of USP Banner 3 in address page is displayed as :" + uspbanner3, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 3 in address page",
					"Title of USP Banner 3 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner3Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 3 in address page",
					"Icon of USP Banner 3 in address page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 3 in address page",
					"Icon of USP Banner 3 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner4Title.isDisplayed()) {
			String uspbanner4 = uspBanner4Title.getText().trim();
			report.updateTestLog("Title of USP Banner 4 in address page",
					"Title of USP Banner 4 in address page is displayed as :" + uspbanner4, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 4 in address page",
					"Title of USP Banner 4 in address page is not displayed", Status.FAIL);
		}
		if (uspBanner4Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 4 in address page",
					"Icon of USP Banner 4 in address page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 4 in address page",
					"Icon of USP Banner 4 in address page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageCartSummaryValidation()*
	 * @Description : This function is used to validate the cart summary*
	 * @Author : Mohan
	 ************************************************************************/
	public void addressPageCartSummaryValidation() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		String modelID = productModel.getText().trim();
		if (productModel.isDisplayed()) {
			report.updateTestLog("Product model id in Cart Summary of Address page",
					"Product model id is displayed in Cart Summary of Address page as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in Cart Summary of Address page",
					"Product model id is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		try {
			if (stockStatus.isDisplayed()) {
				String actstockstatus = stockStatus.getText();
				report.updateTestLog("Stock status", "Stock status in address page is displayed as : " + actstockstatus,
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Stock status", "Stock status is not displayed", Status.FAIL);
		}
		String prodprice = productPrice.getText().trim();
		try {
			if (productPrice.isDisplayed()) {
				report.updateTestLog("Product price in Cart Summary of Address page",
						"Product price is displayed in Cart Summary of Address page as :" + prodprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Product price in Cart Summary of Address page",
					"Product price is not displayed in Cart Summary of Address page", Status.FAIL);
		}
		String prodctamtwithqty = productQty.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x ");
		String productprice = qty[1].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity on cart summary of address page",
				"Product amount with quantity on cart summary of address page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of address page",
					"Product quantity is displayed as expected on cart summary of address page and is displayed as: "
							+ qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity on cart summary of address page",
					"Product quantity is not displayed as expected on cart summary of address page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in Cart Summary of Address page",
					"Product price below stock status is matching with main product price in Cart Summary of Address page as :"
							+ productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of Address page",
					"Product price below stock status is not matching with main product price in Cart Summary of Address page",
					Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : navigateToDeliveryPage()*
	 * @Description :To navigate from address page to delivery page*
	 * @Author : Mohan
	 ************************************************************************/
	public void navigateToDeliveryPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", continueDelivery);
			ex.executeScript("arguments[0].click();", continueDelivery);
			report.updateTestLog("Continue to Delivery button", "Clicked on Continue to Delivery button", Status.PASS);
			Thread.sleep(3000);
	} catch (Exception e) {
			report.updateTestLog("Continue to Delivery button", " Not clicked on Continue to Delivery button",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForPercentagePromotionProduct1AddressPage()*
	 * @Description :To validate the Percentage Discount promotion on Product 1*
	 * @Author : Mohan
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct1AddressPage() {
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
		System.out.println(" SPACE REMOVED LIST PRICE :" + spaceRemoveListPrice);
		long orgPrice = Long.parseLong(spaceRemoveListPrice);
		System.out.println(orgPrice);
		String symbolremoveOfferPrice = offerPrice.trim().replace(currencySymbol, "").trim();
		System.out.println(symbolremoveOfferPrice);
		String splCharRemoveOfferPrice = symbolremoveOfferPrice.trim().replaceAll("[.,x]", "");
		System.out.println(splCharRemoveOfferPrice);
		String spaceRemoveofferPrice = splCharRemoveOfferPrice.replaceAll("\\s+", "");
		System.out.println("SPACE REMOVED OFFER PRICE :" + spaceRemoveofferPrice);
		long disPrice = Long.parseLong(spaceRemoveofferPrice);
		System.out.println(disPrice);
		double perentageDiscountCalculated = orgPrice * promoPercentageFloat;
		System.out.println(perentageDiscountCalculated);
		double offerPriceCalculated = orgPrice - perentageDiscountCalculated;
		System.out.println(offerPriceCalculated);
		double OfferPriceCalculatedRounded1 = Math.round(offerPriceCalculated * 100) / 100;
		long OfferPriceCalculatedRounded = (long) OfferPriceCalculatedRounded1;
		System.out.println(OfferPriceCalculatedRounded);
		if (spaceRemoveofferPrice.contains(String.valueOf(OfferPriceCalculatedRounded))) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + offerPriceCalculated, Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + offerPriceCalculated,
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForPercentagePromotionProduct2AddressPage()*
	 * @Description : To validate the Percentage Discount promotion on Product 2 *
	 * @Author : Mohan
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct2AddressPage() {
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
	 * @Function Name
	 *           :verifyOfferPriceForFlatDiscountPromotionProduct1AddressPage()*
	 * @Description :To validate the Flat Discount promotion on Product 1*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct1AddressPage() {
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
	 * 
	 *           verifyOfferPriceForFlatDiscountPromotionProduct2AddressPage()*
	 * @Description : To validate the Flat Discount promotion on Product 2*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct2AddressPage() {
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
	 * @Function Name : addressPageUspVerify()*
	 * @Description : This function is used to verify the USP Promotion*
	 * @Author : Rahul
	 ************************************************************************/
	public void addressPageUspVerify() {
		try {
			installazioneLink.click();
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is displayed as Clickable Hyperlink in address page", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is not displayed as Clickable Hyperlink in address page", Status.FAIL);
		}
		try {
			if (installazioneImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Header Banner Img",
						"USP Promotion Header Banner Image is displayed in address page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Header Banner Img",
					"USP Promotion Header Banner Image is not displayed in adderess page", Status.FAIL);
		}
		try {
			if (spedizioneGratuitaImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
						"USP Promotion Spedizione gratuita Img Cart is displayed in address page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
					"USP Promotion Spedizione gratuita Img Cart is not displayed in address page", Status.FAIL);
		}
		try {
			if (giorniDiResoImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion days of free Return Img",
						"USP Promotion Spedizione Days of free Return is displayed in address page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion days of free Return Img",
					"USP Promotion Spedizione Days of free Return is not displayed in address page", Status.FAIL);
		}
		try {
			if (peaceOfMindImg.isDisplayed()) {
				report.updateTestLog(
						"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
						"USP Promotion Peace of mind and full assistance included is displayed in address page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog(
					"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
					"USP Promotion Peace of mind and full assistance included is not displayed in address page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageVerifyWithPromotionProduct2()*
	 * @Description :To verify the Promotion product-2 with scratch and list price*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addressPageVerifyWithPromotionProduct2() {
		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			if (strikedPrice.isDisplayed()) {
				String product2strikedprice = strikedPrice.getText().trim();
				report.updateTestLog("Address page Product 2 Striked off price",
						"Product is applied with promotion and Product Striked off price is displayed as: "
								+ product2strikedprice,
						Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Address page Product 2 Striked off price",
					"Product  Striked off price is not displayed", Status.FAIL);
		}
		try {
			if (discountPrice.isDisplayed()) {
				String product2discprice = discountPrice.getText().trim();
				report.updateTestLog("Address page Product 2 discounted price",
						"Product  discounted price is displayed as: " + product2discprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Address page Product 2 discounted price",
					"Product  discounted price is not displayed", Status.FAIL);
		}
		promoVerifyInAddressPage();
		promoVerifyInAddress2Products();
		subTotalValueDisplayedCheckCartSummaryAddressPage();
		savingsValueCheck();
		totalCartAmountDisplayedCartSummaryAddressPage();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageVerifyBothSubscriptionsDisplayed()*
	 * @Description :To verify the newsletter and product letter subscriptions*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addressPageVerifyBothSubscriptionsDisplayed() {
		if (newsLetterSubscription.isDisplayed()) {
			report.updateTestLog("News Letter Subscription", "News letter subscription is displayed as expected ",
					Status.PASS);
		} else {
			report.updateTestLog("News Letter Subscription", "News letter subscription is NOT displayed", Status.FAIL);
		}
		if (productLetterSubscription.isDisplayed()) {
			report.updateTestLog("Product Letter Subscription", "Product Letter Subscription is displayed as expected ",
					Status.PASS);
		} else {
			report.updateTestLog("Product Letter Subscription", "Product letter subscription is NOT displayed",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageSelectBothSubscriptions()*
	 * @Description : To select the newsletter and product letter subscription*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addressPageSelectBothSubscriptions() {
		try {
			WebDriverWait(driver.getWebDriver(), newsLetterSubscription, 120);
			newsLetterSubscription.click();
			if (newsLetterSubscriptionChecked.isEnabled()) {
				report.updateTestLog("News Letter Subscription", "News letter subscription is selected as expected ",
						Status.PASS);
			} else {
				report.updateTestLog("News Letter Subscription", "News letter subscription is NOT selected",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("News Letter Subscription", "News letter subscription is NOT selected", Status.FAIL);
		}
		try {
			WebDriverWait(driver.getWebDriver(), productLetterSubscriptionChecked, 120);
			productLetterSubscriptionChecked.click();
			if (productLetterSubscription.isEnabled()) {
				report.updateTestLog("Product Letter Subscription",
						"Product Letter Subscription is selected as expected ", Status.PASS);
			} else {
				report.updateTestLog("Product Letter Subscription", "Product letter subscription is NOT selected",
						Status.FAIL);
			}
		} catch (Exception ex) {
			report.updateTestLog("Product Letter Subscription", "Product letter subscription is NOT selected",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : clickAnyKey()*
	 * @Description : To send the KeySequence to particular webElement*
	 * @Author : MOHAN
	 ************************************************************************/
	public void clickAnyKey(CharSequence nameOfKey, WebElement elementName) {
		elementName.sendKeys(nameOfKey);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : productModelIdHyperLinkVerify()*
	 * @Description : This function is used verify PDP Hyper-link in Product
	 *              image/thumb*
	 * @Author : MOHAN
	 ************************************************************************/
	public void productModelIdHyperLinkVerify() throws InterruptedException {
		try {
			WebDriverWait(driver.getWebDriver(), productModel, 60);
			if (productModel.isDisplayed()) {
				String modelTxt = productModel.getText();
				report.updateTestLog("Product Model ID", "Product Model ID is displayed as : " + modelTxt, Status.PASS);
			} else {
				report.updateTestLog("Product Model ID", "Product Model ID is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product Model ID", "Product Model ID is not displayed", Status.FAIL);
		}
		try {
			WebDriverWait(driver.getWebDriver(), pdpHyperlinkOnProductImg, 60);
			if (pdpHyperlinkOnProductImg.isEnabled()) {
				report.updateTestLog("PDP Hyperlink",
						"PDP Hyperlink is enabled in product image/thumb at Summary section", Status.PASS);
			} else {
				report.updateTestLog("PDP Hyperlink",
						"PDP Hyperlink is not enabled in product image/thumb at Summary section", Status.FAIL);
			}
		} catch (Exception ex) {
			report.updateTestLog("PDP Hyperlink",
					"PDP Hyperlink is not enabled in product image/thumb at Summary section", Status.FAIL);
		}
	}

	/************************************************************************
	 * @throws InterruptedException
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageErrorMsgValidations()*
	 * @Description :To verify error messages in shipping address section*
	 * @Author : MOHAN
	 ************************************************************************/
	public void addressPageErrorMsgValidations() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String FiscalCodeData = dataTable.getData("General_Data", "FiscalCode");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String ProvinceData = dataTable.getData("General_Data", "Province");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		String VATNumData = dataTable.getData("General_Data", "VAT Number");
		String incorrectZIPData = dataTable.getData("General_Data", "IncorrectZIP");
		String PECAddData = dataTable.getData("General_Data", "SDI Number");

		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();

		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		try {
			if (fiscalCode.isDisplayed()) {
				fiscalCode.sendKeys(FiscalCodeData);
				report.updateTestLog("Fiscal Code", "Fiscal code is entered as : " + FiscalCodeData, Status.PASS);
			} else {
				report.updateTestLog("Fiscal Code", "Fiscal code field is not available for the country", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code", "Fiscal code field is not available for the webshop", Status.PASS);
		}
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);

		postCode.sendKeys(incorrectZIPData);
		clickAnyKey(Keys.TAB, postCode);
		report.updateTestLog("Incorrect Post Code", "Incorrect Post Code is entered as :" + incorrectZIPData,
				Status.PASS);
		try {
			String errorTxt = zipErr.getText().trim();
			report.updateTestLog("Error message -Incorrect ZIP",
					"The Error message for incorrect ZIP code is showing as :" + errorTxt, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Error message -Incorrect ZIP",
					"The Error message for incorrect ZIP code is not showing up", Status.FAIL);
		}
		postCode.clear();
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Correct Post Code is entered as: " + PostcodeData, Status.PASS);
		try {
			selectDropDownValue(driver.getWebDriver(), province, ProvinceData);
			report.updateTestLog("Province", "Province dropdown value is selected as: " + ProvinceData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Province", "Province dropdown value is not available for the current market",
					Status.PASS);
		}
		businessYesRadioBtn.click();
		report.updateTestLog("Yes Radio button in Are you Buying as Business",
				"Yes Option is selected for Are you Buying as Business", Status.PASS);
		navigateToDeliveryPage();
		try {
			if (companyName.isDisplayed()) {
				report.updateTestLog("Company Name textbox field", "Company Name textbox field is displayed",
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field", "Company Name textbox" + "field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatName.isDisplayed()) {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is displayed", Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not available for the current market", Status.PASS);
		}
		try {
			if (companyNameErr.isDisplayed()) {
				String compnameErr = errorMsgs.getText().trim();
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is highlighted with error and is displayed as: " + compnameErr,
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatErr.isDisplayed()) {
				String vatnbrErr = vatErr.getText().trim();
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is highlighted with error and is displayed as: " + vatnbrErr,
						Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not available for the current market", Status.PASS);
		}
		try {
			if (sdiErr.isDisplayed()) {
				String sdierr = sdiErr.getText().trim();
				report.updateTestLog("SDI textbox field",
						"SDI textbox field is highlighted with error and is displayed as: " + sdierr, Status.PASS);
			} else {
				report.updateTestLog("SDI  textbox field", "SDI textbox field is not highlighted with error",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI textbox field", "SDI textbox field is not available for the current market",
					Status.PASS);
		}
		try {
			sdi.sendKeys(PECAddData);
			report.updateTestLog("SDI textbox field", "SDI is entered as: " + PECAddData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("SDI textbox field", "SDI textbox field is not available for the current market",
					Status.PASS);
		}
	 try{
			companyName.sendKeys(CompanyNameData);
			report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,Status.PASS);
			vatName.sendKeys(VATNumData);
			report.updateTestLog("VAT Number textbox field", "VAT Number is entered as: " + VATNumData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("SDI,Company Name,VAT Number",
					"SDI,Company Name,VAT Number fields are not available for the market", Status.PASS);
		}
		try {
			navigateToDeliveryPage();
			Thread.sleep(3000);

			if (editBtnForAddrSectnInDelPge.isDisplayed()) {
				report.updateTestLog("Delivery page", "User navigated to the Delivery page", Status.PASS);
			} else {
				report.updateTestLog("Delivery page", "User is not navigated to the Delivery page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery Page", "User is not navigated to the Delivery page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : myBillingAddressDifferentErrorMsgValidations()*
	 * @Description : This function is used verify error messages in billing address
	 *              section*
	 * @Author : MOHAN
	 ************************************************************************/
	public void myBillingAddressDifferentErrorMsgValidations() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 30);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 20);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String billingprovinceData = dataTable.getData("General_Data", "Billing Province");
		String billingcountryData = dataTable.getData("General_Data", "Billing Country");
		String billingIncorrectZIPData = dataTable.getData("General_Data", "BillingIncorrectZip");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		String VATNumData = dataTable.getData("General_Data", "VAT Number");
		String BillingCompanyName = dataTable.getData("General_Data", "BillingCompanyName");
		String BillingVATNum = dataTable.getData("General_Data", "BillingVAT");
		String PECAddData = dataTable.getData("General_Data", "SDI Number");
		String billSDIData = dataTable.getData("General_Data", "BillingSDI");

		navigateToDeliveryPage();
		addressPageFieldsErrorMessageValidation();

		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingIncorrectZIPData);
		clickAnyKey(Keys.TAB, billingPostcode);
		report.updateTestLog("Incorrect Post Code", "Incorrect Post Code is entered as :" + billingIncorrectZIPData,
				Status.PASS);
		try {
			String errorTxt = billingZipErr.getText().trim();
			report.updateTestLog("Error message -Incorrect ZIP",
					"The Error message for incorrect ZIP code is showing as :" + errorTxt, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Error message -Incorrect ZIP",
					"The Error message for incorrect ZIP code is not showing up", Status.FAIL);
		}
		billingPostcode.clear();
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code", "Correct Post Code is entered as: " + billingpostcodeData, Status.PASS);
		clickAnyKey(Keys.TAB, postCode);
		try {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code field for country selected in billing section is not available for the market",
					Status.PASS);
		}
		try {
			billingProvince.sendKeys(billingprovinceData);
			report.updateTestLog("Province dropdown field",
					"Province dropdown field in Billing address is displayed and is entered as :" + billingprovinceData,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Province field in Billing address",
					"Province field for country selected in billing section is not available for the market",
					Status.PASS);
		}
		businessYesRadioBtn.click();
		report.updateTestLog("Yes Radio button in Are you Buying as Business",
				"Yes Option is selected for Are you Buying as Business", Status.PASS);
		navigateToDeliveryPage();
		try {
			if (companyName.isDisplayed()) {
				report.updateTestLog("Company Name textbox field", "Company Name textbox field is displayed",
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field", "Company Name textbox field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatName.isDisplayed()) {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is displayed", Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field", "VAT Number textbox field is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not mandatory field for the current market", Status.PASS);
		}
		try {
			if (companyNameErr.isDisplayed()) {
				String compnameErr = companyNameErr.getText().trim();
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is highlighted with error and is displayed as: " + compnameErr,
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field",
						"Company Name textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (vatErr.isDisplayed()) {
				String vatnbrErr = vatErr.getText().trim();
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is highlighted with error and is displayed as: " + vatnbrErr,
						Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not Mandatory field for the current market", Status.PASS);
		}
		try {
			if (sdiErr.isDisplayed()) {
				String sdierr = sdiErr.getText().trim();
				report.updateTestLog("SDI textbox field",
						"SDI textbox field is highlighted with error and is displayed as: " + sdierr, Status.PASS);
			} else {
				report.updateTestLog("SDI  textbox field", "SDI textbox field is not highlighted with error",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI textbox field", "SDI textbox field is not available for the current market",
					Status.PASS);
		}
		try {
			if (billingCompanyName.isDisplayed()) {
				report.updateTestLog("Company Name textbox field in Billing Address",
						"Company Name textbox field is displayed in Billing Address Section", Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field in Billing Address",
						"Company Name textbox field is not displayed in Billing Address", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field in Billing Address",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (billingVAT.isDisplayed()) {
				report.updateTestLog("VAT Number textbox field in Billing Address",
						"VAT Number textbox field is displayed in Billing Address", Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field in Billing Address",
						"VAT Number textbox field is not displayed in Billing Address", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field in Billing Address",
					"VAT Number textbox field is not mandatory field for the current market", Status.PASS);
		}
		try {
			if (billingSDI.isDisplayed()) {
				report.updateTestLog("SDI Number textbox field in Billing Address",
						"SDI Number textbox field is displayed in Billing Address", Status.PASS);
			} else {
				report.updateTestLog("SDI Number textbox field in Billing Address",
						"SDI Number textbox field is not displayed in Billing Address", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI Number textbox field in Billing Address",
					"SDI Number textbox field is not mandatory field for the current market", Status.PASS);
		}
		try {
			if (billingCompanyNameErr.isDisplayed()) {
				String compnameErr = billingCompanyNameErr.getText().trim();
				report.updateTestLog("Company Name textbox field in Billing Address",
						"Company Name textbox field is highlighted with error and is displayed as: " + compnameErr,
						Status.PASS);
			} else {
				report.updateTestLog("Company Name textbox field in Billing Address",
						"Company Name textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name textbox field in Billing Address",
					"Company Name textbox field is not available for the current market", Status.FAIL);
		}
		try {
			if (billingVATErr.isDisplayed()) {
				String vatnbrErr = billingVATErr.getText().trim();
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is highlighted with error and is displayed as: " + vatnbrErr,
						Status.PASS);
			} else {
				report.updateTestLog("VAT Number textbox field",
						"VAT Number textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field",
					"VAT Number textbox field is not Mandatory field for the current market", Status.PASS);
		}
		try {
			if (billingSDIError.isDisplayed()) {
				String vatnbrErr = billingSDIError.getText().trim();
				report.updateTestLog("SDI Number textbox field",
						"SDI Number textbox field is highlighted with error and is displayed as: " + vatnbrErr,
						Status.PASS);
			} else {
				report.updateTestLog("SDI Number textbox field",
						"SDI Number textbox field is not highlighted with error", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI Number textbox field",
					"SDI Number textbox field is not Mandatory field for the current market", Status.PASS);
		}
		try {
			companyName.sendKeys(CompanyNameData);
			report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,
					Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Company Name textbox field", "Company name is not available for the market",
					Status.PASS);	
		}
		 try{
			vatName.sendKeys(VATNumData);
			report.updateTestLog("VAT Number textbox field", "VAT Number is entered as: " + VATNumData, Status.PASS);
		 }catch(Exception e){
			 report.updateTestLog("VAT Number textbox field", "VAT Number is not available for the market", Status.PASS);
		 }
		   try{
			billingCompanyName.sendKeys(BillingCompanyName);
			report.updateTestLog("Company Name textbox field in Billing Address Section",
					"Company name in Billing Address Section is entered as: " + BillingCompanyName, Status.PASS);
		   }catch(Exception e){
			   report.updateTestLog("Company Name textbox field in Billing Address Section","Company name in Billing Address Section is not available for the current market", Status.PASS); 
		   }
		   try{
			billingVAT.sendKeys(BillingVATNum);
			report.updateTestLog("VAT Number textbox field in Billing Address Section",
					"VAT Number textbox in Billing Address Section is entered as: " + BillingVATNum, Status.PASS);

		} catch (Exception e) {
			report.updateTestLog("VAT Number textbox field in Billing Address Section","VAT Number textbox in Billing Address Section is not available ", Status.PASS);
		}
		try {
			sdi.sendKeys(PECAddData);
			report.updateTestLog("SDI textbox field", "SDI is entered as: " + PECAddData, Status.PASS);
			billingSDI.sendKeys(billSDIData);
			report.updateTestLog("SDI Number textbox field in Billing Address Section",
					"SDI Number textbox in Billing Address Section is entered as: " + billSDIData, Status.PASS);

		} catch (Exception e) {
			report.updateTestLog("SDI textbox field", "SDI is not available for the current webshop", Status.PASS);
		}
		try {
			navigateToDeliveryPage();
		if (editBtnForAddrSectnInDelPge.isDisplayed()) {
				report.updateTestLog("Delivery page", "User navigated to the Delivery page", Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Delivery Page", "User is not navigated to the Delivery page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : weeeTotalVerifyCartSummary()*
	 * @Description : This function is used verify the WEEE price in summary*
	 * @Author : MOHAN
	 ************************************************************************/
	public void weeeTotalVerifyCartSummary() {
		try {
			if (weeTotalBlockAddrPge.isDisplayed()) {
				String weeTotal = weeTotalBlockAddrPge.getText();
				report.updateTestLog("WEEE Price in Cart Summary",
						"WEEE Price is displayed in cart summary as : " + weeTotal, Status.PASS);
			} else {
				report.updateTestLog("WEEE Price in Cart Summary", "WEEE Price is not displayed in cart summary",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("WEEE Price in Cart Summary", "WEEE Price is not displayed in cart summary",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageServiceInformationValidations()*
	 * @Description :To verify the billing address section in Address Page with Buy
	 *              as Business*
	 * @Author : MOHAN
	 ************************************************************************/
	public void MailingAddressPageValidation() {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		String VATNumData = dataTable.getData("General_Data", "VAT Number");
		businessYesRadioBtn.click();
		report.updateTestLog("Yes Radio button in Are you Buying as Business",
				"Yes Option is selected for Are you Buying as Business", Status.PASS);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);

		if (companyName.isDisplayed()) {
			report.updateTestLog("Company Name textbox field", "Company Name textbox field is displayed", Status.PASS);
		} else {
			report.updateTestLog("Company Name textbox field", "Company Name textbox field is not displayed",
					Status.FAIL);
		}
		companyName.sendKeys(CompanyNameData);
		report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,
				Status.PASS);
		vatName.sendKeys(VATNumData);
		report.updateTestLog("Vat number textbox field", "Vat number is entered as: " + VATNumData, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageServiceInformationValidations()*
	 * @Description :To verify the billing address section in Address Page*
	 * @Author : MOHAN
	 ************************************************************************/
	public void MybillingAddressDifferentValidation() {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckBox, 20);
		billingAddressCheckBox.click();
		report.updateTestLog("Billing Address is Different checkbox",
				"Billing Address is Different checkbox is checked", Status.PASS);
		WebDriverWait(driver.getWebDriver(), billingCountry, 20);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String CompanyNameData = dataTable.getData("General_Data", "Company Name");
		String VATNumData = dataTable.getData("General_Data", "VAT Number");

		billingFirstName.sendKeys(billingfirstNameData);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		billingLastName.sendKeys(billinglastNameData);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		billingAddress1.sendKeys(billingaddressLine1Data);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		billingCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,
				Status.PASS);
		billingPostcode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
		try {
			billingFiscalcode.sendKeys(billingfiscalCodeData);
			report.updateTestLog("Fiscal Code in Billing address",
					"Fiscal code in Billing address is entered as : " + billingfiscalCodeData, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code in Billing address", "Fiscal code in Billing address is not displayed",
					Status.PASS);
		}
		billingCompanyName.sendKeys(CompanyNameData);
		report.updateTestLog("Company Name textbox field", "Company name is entered as: " + CompanyNameData,
				Status.PASS);
		billingVATName.sendKeys(VATNumData);
		report.updateTestLog("Vat number textbox field", "Vat number is entered as: " + VATNumData, Status.PASS);
	}
	
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageExcluedZipVerify()*
	 * @Description : This function is used verify the excluded ZIP for delivery *
	 * @Author : MOHAN
	 ************************************************************************/
	public void addressPageExcluedZipVerifyITAELX() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String excludedZipData = dataTable.getData("General_Data", "ExcludedZIP");
		String FiscalCodeData = dataTable.getData("General_Data", "FiscalCode");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		waitUntilElementVisible(eMail, 120);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		try {
			if (fiscalCode.isDisplayed()) {
				fiscalCode.sendKeys(FiscalCodeData);
				report.updateTestLog("Fiscal Code", "Fiscal code is entered as : " + FiscalCodeData, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Fiscal Code", "Fiscal code field is not available for the webshop", Status.PASS);
		}
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(excludedZipData);
		report.updateTestLog("Post Code", "Excluded Post Code is entered as :" + excludedZipData, Status.PASS);
		navigateToDeliveryPage();
		serviceNotAvailableForZipCodeInDeliveryPage();
		try {
			if (delservicedisabled.isDisplayed()) {
				report.updateTestLog("Delivery Mode", "Delivery Mode is not available for the Excluded ZIP code",
						Status.PASS);
				String delveryerrormsg=delserviceerrormsg.getText().trim();
				report.updateTestLog("Delivery Mode error msg", "Delivery error message for the Excluded ZIP code is displayed as :"+delveryerrormsg,
						Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Delivery Mode", "Delivery Mode is available for the Excluded ZIP code",
					Status.FAIL);
		}
		try {
			if (editLinkDelPge.isDisplayed()) {
				editLinkDelPge.click();
				report.updateTestLog("Edit Address Link", "Edit address section link was clicked on delivery page",
						Status.PASS);
			} else {
				report.updateTestLog("Edit Address Link",
						"Edit address section link was not available at delivery page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Edit Address Link", "Edit address section link was not available at delivery page",
					Status.FAIL);
		}
		postCode.clear();
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Correct Post Code is entered as :" + PostcodeData, Status.PASS);
		navigateToDeliveryPage();
	}	

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageExcluedZipVerify()*
	 * @Description : This function is used verify the excluded ZIP for delivery *
	 * @Author : MOHAN
	 ************************************************************************/
	public void addressPageExcluedZipVerify() throws InterruptedException {
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String excludedZipData = dataTable.getData("General_Data", "ExcludedZIP");
		String FiscalCodeData = dataTable.getData("General_Data", "FiscalCode");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		waitUntilElementVisible(eMail, 120);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(excludedZipData);
		report.updateTestLog("Post Code", "Excluded Post Code is entered as :" + excludedZipData, Status.PASS);
		navigateToDeliveryPage();
		try {
			if (delservicedisabled.isDisplayed()) {
				report.updateTestLog("Delivery Mode", "Delivery Mode is not available for the Excluded ZIP code",
						Status.PASS);
				String delveryerrormsg=delserviceerrormsg.getText().trim();
				report.updateTestLog("Delivery Mode error msg", "Delivery error message for the Excluded ZIP code is displayed as :"+delveryerrormsg,
						Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Delivery Mode", "Delivery Mode is available for the Excluded ZIP code",
					Status.FAIL);
		}
		serviceNotAvailableForZipCodeInDeliveryPage();
		try {
			if (editLinkDelPge.isDisplayed()) {
				editLinkDelPge.click();
				report.updateTestLog("Edit Address Link", "Edit address section link was clicked on delivery page",
						Status.PASS);
			} else {
				report.updateTestLog("Edit Address Link",
						"Edit address section link was not available at delivery page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Edit Address Link", "Edit address section link was not available at delivery page",
					Status.FAIL);
		}
		postCode.clear();
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Correct Post Code is entered as :" + PostcodeData, Status.PASS);
		navigateToDeliveryPage();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : EWServicePromoVerifyAddrsPage()*
	 * @Description :To verify the Extended Warranty Promo in Address Page*
	 * @Author : MOHAN
	 ************************************************************************/

	public void EWServicePromoVerifyAddrsPage() {
		try {
			String ewservicespromo = ewServiceText.getText().trim();
			report.updateTestLog("EW Services Promo",
					"The Extended Warranty Services Promo in address page page is Displayed as : " + ewservicespromo,
					Status.PASS);
			String ewservicepricepromo = ewServiceprice.getText().trim();
			if (ewservicepricepromo.equals("")) {
				report.updateTestLog("Extended Warranty Services Promo price",
						"The Extended Warranty Services Promo Price is Displayed as 0" + ewservicepricepromo,
						Status.PASS);
			} else {
				report.updateTestLog("Extended Warranty Services Promo price",
						"The Extended Warranty Services Promo Price is not displaying as 0", Status.FAIL);
			}
		} catch (Exception e) {

			report.updateTestLog("EW service", "The EW service is not set up", Status.FAIL);
		}
	}

	///// CICD///////
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :addressPageBuyingAsBusiness() *
	 * @Description : To verify the address page as Buying as Business*
	 * @Author : Harish*
	 ************************************************************************/
	public void addressPageBuyingAsBusiness() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			if (addressPgeCheckoutTitle.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", addressPgeCheckoutTitle);
				report.updateTestLog("Address Page - Checkout Section",
						"The Address Page Checkout Section is Displayed", Status.PASS);
			} else {
				report.updateTestLog("Address Page - Checkout Section",
						"The Address Page Checkout Section is Not-Displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Address Page - Checkout Section",
					"The Address Page Checkout Section is Not-Displayed", Status.FAIL);
		}
		try {
			if (addrPgeRuBuyngAsBusinessTxt.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", addrPgeRuBuyngAsBusinessTxt);
				String txtBuyAsBusiness = addrPgeRuBuyngAsBusinessTxt.getText();
				report.updateTestLog("Text-Buying as Business",
						"The Buying as business text is displayed as : " + txtBuyAsBusiness, Status.PASS);
			} else {
				report.updateTestLog("Text-Buying as Business", "The Buying as business text is Not - Displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Text-Buying as Business", "The Buying as business text is Not - Displayed",
					Status.FAIL);
		}
		try {
			if (buyAsBusinessNoBtn.isEnabled()) {
				ex.executeScript("arguments[0].scrollIntoView();", buyAsBusinessNoBtn);
				report.updateTestLog("Buy as Business- No", "Buy as business No - button is selected by default",
						Status.PASS);
			} else {
				report.updateTestLog("Buy as Business- No", "Buy as business No - button is not selected by default",
						Status.FAIL);
			}
		} catch (Exception exc) {
			report.updateTestLog("Buy as Business- No", "Buy as business No - button is not selected by default",
					Status.FAIL);
		}
		try {
			ex.executeScript("arguments[0].click();", buyAsBusinessYesBtn);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			report.updateTestLog("Buy as Business- Yes", "Buy as business Yes - button is selected", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Buy as Business- Yes", "Buy as business Yes - button is not selected", Status.FAIL);
		}
		String firstNameData = dataTable.getData("General_Data", "FirstName");
		String lastNameData = dataTable.getData("General_Data", "LastName");
		String eMailData = dataTable.getData("General_Data", "Email");
		String phoneNumberData = dataTable.getData("General_Data", "PhoneNumber");
		String addressLine1Data = dataTable.getData("General_Data", "Address Line 1");
		String cityData = dataTable.getData("General_Data", "City");
		String PostcodeData = dataTable.getData("General_Data", "Post Code");
		String CompanyNameData = dataTable.getData("General_Data", "CompanyName");
		String VatNumberData = dataTable.getData("General_Data", "VATNumber");
		String sdiData = dataTable.getData("General_Data", "SDI");

		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 120);
		wait.until(ExpectedConditions.visibilityOf(firstName));
		try {
			if (companyNameAddressPge.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", companyNameAddressPge);
				report.updateTestLog("Company Name Field", "Company Name field is displayed in Buying as Business",
						Status.PASS);
				companyNameAddressPge.sendKeys(CompanyNameData);
				report.updateTestLog("Company Name Field", "Company name field accepts 35 AlphaNeumeric characters",
						Status.PASS);
			} else {
				report.updateTestLog("Company Name Field", "Company Name field is Not displayed in Buying as Business",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Company Name Field", "Company Name field is Not displayed in Buying as Business",
					Status.FAIL);
		}
		try {
			if (vatNumAddressPge.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", vatNumAddressPge);
				report.updateTestLog("VAT Number Field", "VAT field is displayed in Buying as Business", Status.PASS);
				vatNumAddressPge.sendKeys(VatNumberData);
				report.updateTestLog("VAT Number Field", "VAT Number field accepts the Valid Format", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("VAT Number Field", "VAT field is Not available for current market", Status.PASS);
		}
		try {
			if (sdiAddrPge.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", sdiAddrPge);
				report.updateTestLog("SDI Field", "SDI field is displayed in Buying as Business", Status.PASS);
				sdiAddrPge.sendKeys(sdiData);
				report.updateTestLog("SDI Field", "SDI field accepts the Valid Format", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("SDI input Field", "SDI field is Not available for current market", Status.PASS);
		}
		firstName.sendKeys(firstNameData);
		report.updateTestLog("First Name", "First Name is entered as: " + firstNameData, Status.PASS);
		lastName.sendKeys(lastNameData);
		report.updateTestLog("Last Name", "Last Name is entered as: " + lastNameData, Status.PASS);
		eMail.sendKeys(eMailData);
		report.updateTestLog("Email", "Email is entered as : " + eMailData, Status.PASS);
		phoneNumber.sendKeys(phoneNumberData);
		report.updateTestLog("Phone Number", "PhoneNumber is entered as : " + phoneNumberData, Status.PASS);
		address.sendKeys(addressLine1Data);
		report.updateTestLog("Address Line 1 details", "Address Line 1 details is entered as: " + addressLine1Data,
				Status.PASS);
		city.sendKeys(cityData);
		report.updateTestLog("City", "City is entered as: " + cityData, Status.PASS);
		postCode.sendKeys(PostcodeData);
		report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
	}


	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :buyAsBusinessBillingAddress() *
	 * @Description : To verify the address page - Buying as Business in Billing
	 *              Address*
	 * @Author : Gaurav*
	 ************************************************************************/
	public void buyAsBusinessBillingAddress() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), billingAddressCheckbox, 60);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();

		billingAddressCheckbox.click();
		report.updateTestLog("Billing Address is Different checkbox","Billing Address is Different checkbox is checked", Status.PASS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String billingfirstNameData = dataTable.getData("General_Data", "BillingFirstName");
		String billinglastNameData = dataTable.getData("General_Data", "BillingLastName");
		String billingfiscalCodeData = dataTable.getData("General_Data", "BillingFiscalCode");
		String billingaddressLine1Data = dataTable.getData("General_Data", "Billing Address Line1");
		String billingcityData = dataTable.getData("General_Data", "Billing City");
		String billingpostcodeData = dataTable.getData("General_Data", "Billing Post Code");
		String billingCompanyData = dataTable.getData("General_Data", "billingCompanyName");
		String billingVATData = dataTable.getData("General_Data", "billingVATNumber");
		String billingSDIData = dataTable.getData("General_Data", "BillingSDI");
		WebDriverWait(driver.getWebDriver(), billingCountry, 90);
		try {
			WebElement CompName = driver.findElement(By.xpath("//input[@id='address.billing.companyName']"));
			if (CompName.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", CompName);
				report.updateTestLog("Billing Company Name Field",
						"Billing Company Name field is displayed in Buying as Business", Status.PASS);
				CompName.sendKeys(billingCompanyData);
				report.updateTestLog("Billing Company Name Field",
						"Billing Company name field accepts 35 AlphaNeumeric characters", Status.PASS);
			} else {
				report.updateTestLog("Billing Company Name Field",
						"Billing Company Name field is displayed in Buying as Business", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Billing Company Name Field",
					"Billing Company Name field is displayed in Buying as Business", Status.FAIL);
		}
		try {
			WebElement VATNum = driver.findElement(By.xpath("//input[@id='address.billing.VATNumber']"));
			if (VATNum.isDisplayed()) {
				report.updateTestLog("Billing VAT Number Field",
						"Billing VAT Number field is displayed in Buying as Business", Status.PASS);
				VATNum.sendKeys(billingVATData);
				report.updateTestLog("Billing Company Name Field", "VAT Number field accepts the Valid Format",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Billing VAT Number field Field",
					"Billing VAT Number field is not available for the current market", Status.PASS);
		}

		try {
			WebElement billSDI = driver.findElement(By.xpath("//input[@id='address.billingsdinumber']"));
			if (billSDI.isDisplayed()) {
				report.updateTestLog("Billing SDI Number Field",
						"Billing SDI Number field is displayed in Buying as Business", Status.PASS);
				billSDI.sendKeys(billingSDIData);
				report.updateTestLog("Billing SDI Field", "SDI field accepts the Valid Format", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Billing SDI Field",
					"Billing SDI Number field is not available for the current market", Status.PASS);
		}

		WebElement fname = driver.findElement(By.xpath("//input[@id='address.billing.firstName']"));
		fname.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fname.sendKeys(billingfirstNameData);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		report.updateTestLog("First Name in Billing address",
				"First Name in the billing address is entered as: " + billingfirstNameData, Status.PASS);
		WebElement lastname = driver.findElement(By.xpath("//input[@id='address.billing.surname']"));
		lastname.sendKeys(billinglastNameData);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		report.updateTestLog("Last Name in Billing address",
				"Last Name in Billing address is entered as: " + billinglastNameData, Status.PASS);
		try {
			if (billingFiscalCode.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", billingFiscalCode);
				billingFiscalCode.sendKeys(billingfiscalCodeData);
				report.updateTestLog("Billing Fiscal Code", "Fiscal Code is entered as : " + billingfiscalCodeData,
						Status.PASS);
			} else {
				report.updateTestLog("Billing Fiscal Code", "Fiscal Code Field is not available", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Billing Fiscal Code", "Fiscal Code Field is not available", Status.PASS);
		}
		WebElement addressLine = driver.findElement(By.xpath("//input[@id='address.billing.line1']"));
		addressLine.sendKeys(billingaddressLine1Data);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		report.updateTestLog("Address Line 1 details in Billing address",
				"Address Line 1 details in Billing address is entered as: " + billingaddressLine1Data, Status.PASS);
		WebElement billCity = driver.findElement(By.xpath("//input[@id='address.billing.townCity']"));
		billCity.sendKeys(billingcityData);
		report.updateTestLog("City in Billing address", "City in Billing address is entered as: " + billingcityData,Status.PASS);
		WebElement billPostCode = driver.findElement(By.xpath("//input[starts-with(@id,'address.billing.postalco')]"));
		billPostCode.sendKeys(billingpostcodeData);
		report.updateTestLog("Post Code in Billing address",
				"Post Code in Billing address is entered as :" + billingpostcodeData, Status.PASS);
	}

	/********
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageTotalSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in address page when savings enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addressPageTotalSavingsCheck() {
		//subTotalValueDisplayedCheckCartSummaryAddressPage();
		totalCartAmountDisplayedCartSummaryAddressPage();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageTotalNoSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in address page when savings not enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void addressPageTotalNoSavingsCheck() {
		subTotalValueDisplayedCheckCartSummaryAddressPage();
		totalCartAmountDisplayedCartSummaryAddressPage();
		savingsValueNotDisplayedCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : postCodeEnter()*
	 * @Description : enter postcode in addresspage
	 * @Author : Gaurav
	 ************************************************************************/
	public void postCodeEnter() {
		String PostcodeData = dataTable.getData("General_Data", "Post Code1");
		String CityData = dataTable.getData("General_Data", "Citynew");
		String ProvinceData = dataTable.getData("General_Data", "Province");
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", postCode);
			postCode.clear();
			postCode.sendKeys(PostcodeData);
			report.updateTestLog("Post Code", "Post Code is entered as :" + PostcodeData, Status.PASS);
			city.clear();
			city.sendKeys(CityData);
			report.updateTestLog("City", "City is updated to: " + CityData, Status.PASS);
			try{
			Select sel=new Select(province);
			sel.selectByVisibleText(ProvinceData);
			report.updateTestLog("Province", "Province field is selected as: "+ProvinceData, Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Province", "Province field is not available for the market", Status.PASS);
		} 
		}catch (Exception e) {
			report.updateTestLog("Post Code", "Post Code is  not entered", Status.FAIL);
		}
	}



	public void navigatetoDeliverypage() {
		try {
			Thread.sleep(3000);
			continueDelivery.click();
			report.updateTestLog("Continue to Delivery button", "Clicked on Continue to Delivery button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Continue to Delivery button", "Not clicked on Continue to Delivery button",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :buyAsBusinessVerify() *
	 * @Description : To verify buy as business radio button in Address Page*
	 * @Author : Mohan
	 ************************************************************************/
	public void buyAsBusinessVerify() {
		try {
			if (txtAreUBuyAsBusiness.isDisplayed()) {
				String txtBuyAsBusiness = txtAreUBuyAsBusiness.getText();
				report.updateTestLog("Text in Address page",
						"Are you buying as business text is displayed as : " + txtBuyAsBusiness, Status.PASS);
			} else {
				report.updateTestLog("Text in Address page", "Are you buying as business text is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Text in Address page", "Are you buying as business text is not displayed",
					Status.FAIL);
		}
		try {
			if (companyYesButtonVerify.isDisplayed()) {
				report.updateTestLog("Buy as Business Yes Button", "The YES button is Displayed", Status.PASS);
			} else {
				report.updateTestLog("Buy as Business Yes Button", "The YES button is Not Displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Buy as Business Yes Button", "The YES button is Not Displayed", Status.FAIL);
		}
		try {
			if (companyNoButtonVerify.isDisplayed()) {
				report.updateTestLog("Buy as Business NO Button", "The NO button is Displayed", Status.PASS);

			} else {
				report.updateTestLog("Buy as Business NO Button", "The NO button is Not Displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Buy as Business NO Button", "The NO button is Not Displayed", Status.FAIL);
		}
		try {
			if (companyNoButtonVerify.isEnabled()) {
				report.updateTestLog("Buy as Business NO Button", "The NO button is Selected By Default", Status.PASS);
			} else {
				report.updateTestLog("Buy as Business NO Button", "The NO button is Not Selected By Default",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Buy as Business NO Button", "The NO button is Not Selected By Default", Status.FAIL);
		}
	}





	
	
	/*************************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : VerifyVoucherRemovalAddressPage()*
	 * @Description :To verify the voucher ribbon message is not displayed in Address Page*
	 * @Author : Gaurav 
	 **************************************************************************************/
	public void verifyVoucherRemovalAddressPage() {
		try {
			if(voucherribbonAddrsPage.isDisplayed()){
			report.updateTestLog("Voucher ribbon in address page","Voucher ribbon is displayed in address page",
					Status.FAIL);
		} 
		}catch (Exception e) {
			report.updateTestLog("Voucher ribbon in address page","Voucher ribbon is not displayed in address page",
					Status.PASS);
		}
}
	
	
	

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInAddressPage()*
	 * @Description :To verify the Voucher ribbon in Address Page*
	 * @Author : Mohan
	 ************************************************************************/
	public void voucherNewVerifyInAddressPage() {
		try {
			WebDriverWait(driver.getWebDriver(), vouchrCodeAddrssPage, 120);
			String vouchercode = vouchrCodeAddrssPage.getText().trim();
			String voucherData = dataTable.getData("General_Data", "New Voucher code");
			if (vouchercode.equals(voucherData)) {
				report.updateTestLog("Voucher code applied",
						"Voucher code in address page is displayed as expected: " + vouchercode, Status.PASS);
			} else {
				report.updateTestLog("Voucher code applied",
						"Voucher code in address page is not displaying as expected", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Voucher code applied", "Voucher code in address page is not displaying as expected",
					Status.FAIL);
		}
		try {
			WebDriverWait(driver.getWebDriver(), promoRibbonAddrsPage, 120);
			if (promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in address page is displayed as : " + addrsspromoribbon,
						Status.PASS);
			} else {
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in address page is not displayed ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in address page is not displayed ", Status.FAIL);
		}
	}	
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInDeliverypage()*
	 * @Description :This function is used verify voucher details
	 * @Author : Mamatha
	 ************************************************************************/
	public void voucherNewVerifyInDeliverypage() {
		try {
			WebDriverWait(driver.getWebDriver(), vouchrCodeAddrssPage, 120);
			String vouchercode = vouchrCodeAddrssPage.getText();
			String voucherData = dataTable.getData("General_Data", "New Voucher code");
			if (vouchercode.equals(voucherData)) {
				report.updateTestLog("Voucher code applied",
						"Voucher code in delivery page is displayed as expected: " + vouchercode, Status.PASS);
			} else {
				report.updateTestLog("Voucher code applied",
						"Voucher code in delivery page is not displaying as expected", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Voucher code applied", "Voucher code in delivery page is not displaying as expected",
					Status.FAIL);
		}
		try {
			if (promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = promoRibbonAddrsPage.getText().trim();
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in delivery page is displayed as : " + addrsspromoribbon,
						Status.PASS);
			} else {
				report.updateTestLog("Promo ribbon message",
						"Voucher code promo ribbon message in delivery page is not displayed ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon message",
					"Voucher code promo ribbon message in delivery page is not displayed ", Status.FAIL);
		}
	}

	

	
	
	
	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageCartTotalVerifyITAELX()*
	 * @Description : This function is used to verify the cart total prices for multiple products in Address Page*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void addressPageCartTotalVerifyITAELX() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod1price);
			String prod1Price=prod1price.getText().trim();
			System.out.println(prod1Price);
			report.updateTestLog("Product 1 price","Product 1 price in address page is displayed as :" +prod1Price, Status.PASS);
			String prod1Price1[]=prod1Price.split(" ");
			String prod1Price2=prod1Price1[1].replace(",", ".");
			System.out.println(prod1Price2);
			report.updateTestLog("Product 1 price","Product 1 price in address page with decimal is displayed as :" +prod1Price2, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();",prod2price);
			String prod2Price=prod2price.getText().trim();
			System.out.println(prod2Price);
			report.updateTestLog("Product 2 price","Product 2 price in address page is displayed as :" +prod2Price, Status.PASS);
			String prod2Price1[]=prod2Price.split(" ");
			String prod2Price2=prod2Price1[1].replace(",", ".");
			System.out.println(prod2Price2);
			report.updateTestLog("Product 2 price","Product 2 price in address page with decimal is displayed as :" +prod2Price2, Status.PASS);
			Float prod1PriceinInt = Float.parseFloat(prod1Price2);
			Float prod2PriceinInt = Float.parseFloat(prod2Price2);
			float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt;
			report.updateTestLog("Total price calculated in basket page","Total price calculated in address page is :" +totalpriceCalculated, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", totalprice);
			String totalPrice=totalprice.getText().trim();
			System.out.println(totalPrice);
			report.updateTestLog("Total price","Total price in address page is displayed as :" +totalPrice, Status.PASS);
			String totalprice1[]=totalPrice.split(" ");
			String totalprice2=totalprice1[1].replace(".", "");
			String totalprice3=totalprice2.replace(",", ".");
			System.out.println(totalprice3);
			Float totalpriceinUI = Float.parseFloat(totalprice3);
			report.updateTestLog("Total price","Total price in address page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
			if(totalpriceCalculated==totalpriceinUI){
				report.updateTestLog("Total price","Total price in address page is displaying as expected", Status.PASS);
			}
			else{
				report.updateTestLog("Total price","Total price in address page is not displaying as expected", Status.FAIL);
		}
	} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not checked for the product", Status.FAIL);
      }
	}







	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : addressPageCartTotalVerifyWithoutServicesITAELX()*
	 * @Description : This function is used to verify the cart total prices for multiple products in address page*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void addressPageCartTotalVerifyWithoutServicesITAELX() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod1price);
			String prod1Price=prod1price.getText().trim();
			System.out.println(prod1Price);
			report.updateTestLog("Product 1 price","Product 1 price in address page is displayed as :" +prod1Price, Status.PASS);
			String prod1Price1[]=prod1Price.split(" ");
			String prod1Price2=prod1Price1[1].replace(",", ".");
			System.out.println(prod1Price2);
			report.updateTestLog("Product 1 price","Product 1 price in address page with decimal is displayed as :" +prod1Price2, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", prod2price);
			String prod2Price=prod2price.getText().trim();
			System.out.println(prod2Price);
			report.updateTestLog("Product 2 price","Product 2 price in address page is displayed as :" +prod2Price, Status.PASS);
			String prod2Price1[]=prod2Price.split(" ");
			String prod2Price2=prod2Price1[1].replace(",", ".");
			System.out.println(prod2Price2);
			report.updateTestLog("Product 2 price","Product 2 price in address page with decimal is displayed as :" +prod2Price2, Status.PASS);
			Float prod1PriceinInt = Float.parseFloat(prod1Price2);
			Float prod2PriceinInt = Float.parseFloat(prod2Price2);
			ex.executeScript("arguments[0].scrollIntoView();", subtotalprice);
			String subtotalPrice=subtotalprice.getText().trim();
			System.out.println(subtotalPrice);
			report.updateTestLog("Subtotal price","Subtotal price in address page is displayed as :" +subtotalPrice, Status.PASS);
			String subtotalprice1[]=subtotalPrice.split(" ");
			String subtotalprice2=subtotalprice1[1].replace(".", "");
			String subtotalprice3=subtotalprice2.replace(",", ".");
			System.out.println(subtotalprice3);
			Float subtotalpriceinUI = Float.parseFloat(subtotalprice3);
			try{
			if(servicetotalprice.isDisplayed()){
				String basketpageserviceprice=servicetotalprice.getText().trim();
				report.updateTestLog("Service total price","Service price in address page is displayed as :" +basketpageserviceprice, Status.PASS);
				String servicetotprice1[]=basketpageserviceprice.split(" ");
				String servicetotprice2=servicetotprice1[1].replace(".", "");
				String servicetotprice3=servicetotprice2.replace(",", ".");
				Float servicetotpriceinUI = Float.parseFloat(servicetotprice3);
				float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+servicetotpriceinUI;
				String totalamt=totalamount.getText().trim();
				report.updateTestLog("Total price","Total price in address page is displayed as :" +totalamt, Status.PASS);
				String totalprice1[]=totalamt.split(" ");
				String totalprice2=totalprice1[1].replace(".", "");
				String totalprice3=totalprice2.replace(",", ".");
				System.out.println(totalprice3);
				Float totalpriceinUI = Float.parseFloat(totalprice3);
				if(totalpriceCalculated==totalpriceinUI){
					report.updateTestLog("Total amount","Total amount with calculation in address page is matching with total amount displayed :" +totalpriceinUI, Status.PASS);
				}
			}
			}catch(Exception e){
			float subtotalpriceCalculated=prod1PriceinInt+prod2PriceinInt;
			report.updateTestLog("Subtotal price calculated","Subtotal price calculated in address page is :" +subtotalPrice, Status.PASS);
			report.updateTestLog("Subtotal price","Subtotal price in address page in decimals is displayed as :" +subtotalprice3, Status.PASS);
			if(subtotalpriceCalculated==subtotalpriceinUI){
				report.updateTestLog("Subtotal price","Subtotal price in address page is displaying as expected: "+subtotalpriceCalculated, Status.PASS);
			}
			else{
				report.updateTestLog("Subtotal price","Subtotal price in address page is not displaying as expected", Status.FAIL);
		}
			try{
			String totalamt=totalamount.getText().trim();
			report.updateTestLog("Total price","Total price in address page is displayed as :" +totalamt, Status.PASS);
			String totalprice1[]=totalamt.split(" ");
			String totalprice2=totalprice1[1].replace(".", "");
			String totalprice3=totalprice2.replace(",", ".");
			System.out.println(totalprice3);
			Float totalpriceinUI = Float.parseFloat(totalprice3);
			if(subtotalpriceCalculated==totalpriceinUI){
				report.updateTestLog("Total amount","Total amount in address page is matching with subtotal amount :" +totalpriceinUI, Status.PASS);
			}
			else{
				report.updateTestLog("Total amount","Total amount in address page is not matching with subtotal amount", Status.FAIL);
			}
			
			}catch(Exception e1){
				report.updateTestLog("Total price","Total price in address page is not displayed", Status.FAIL);
			}
		}
		}catch(Exception e){
			report.updateTestLog("Products in address page","Products are not available in address page", Status.FAIL);
		}

}			











}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	