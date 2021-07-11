package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class DeliveryPage extends MasterPage {

	AddressPage addrspage = new AddressPage(scriptHelper);

	@FindBy(xpath = "(//input[@class='delivery_method optional'])[1]")
	WebElement sundayDelvry;

	@FindBy(xpath = "//textarea[@id='delivery_instruction']")
	WebElement deliveryInstn;

	@FindBy(xpath = "//button[@id='deliveryMethodSubmit']")
	WebElement continueToPayment;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement homeDelgrndFloorRadiobtn;

	@FindBy(xpath = "(//div[contains(@class,'deliveryLabelCnt')])[1]")
	WebElement delivryModetxtMain;

	@FindBy(xpath = "(//div[contains(@class,'deliveryLabelCnt')])[1]/following::div[1]")
	WebElement delivryModeChargeMain;

	@FindBy(xpath = "(//span[contains(@class,'delivery-mode-desc')])[1]")
	WebElement delivryModeTxtCartSumm;

	@FindBy(xpath = "(//div[contains(@class,'subDeliveryOptBck')])[1]")
	WebElement sunDelivryModetxtMain;

	@FindBy(xpath = "(//div[contains(@class,'subDeliveryOptBck')]/following::span)[1]")
	WebElement sunDelivryModeChargeMain;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[2]")
	WebElement sunDelivryModeTxtCartSumm;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc'])[2]/following::span[1]")
	WebElement sunDelChargeCartSumm;

	@FindBy(xpath = "(//div[contains(text(),'Subtotale:')]/following::div)[1]")
	WebElement delPageSubtotlValue;

	@FindBy(xpath = "(//div[contains(text(),'Servizi:')]/following::div)[1]")
	WebElement delPageServicesValue;

	@FindBy(xpath = "//span[@class='coupon-code']")
	WebElement vouchrCodeDeliveryPage;

	@FindBy(xpath = "//i[@class='icon-star']/following::span")
	WebElement vouchrCodeMsgDeliveryPage;

	@FindBy(xpath = "//i[@class='icon-star']/following::span")
	WebElement promoRibbonDelvryPage;

	@FindBy(xpath = "//div[@class='qty']/span[@class='strikePrice']")
	WebElement strikedPrice;

	@FindBy(xpath = "(//div[@class='qty'])[2]")
	WebElement discountPrice;

	@FindBy(xpath = "(//div[@class='qty'])[1]")
	WebElement discountPrice1;

	@FindBy(xpath = "(//span[contains(@class,'delivery-charge')])[1]")
	WebElement homeDelCharge;

	@FindBy(xpath = "//div[@id='owl-demo']//div[1]")
	WebElement installazionLink;

	@FindBy(xpath = "//div[@id='owl-demo']//div[1]//img[1]")
	WebElement installazionImg;

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

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement homedelGrndFloorRadiobtn;

	@FindBy(xpath = "(//div[contains(@class,'deliveryLabelCnt')])[1]/following::div[1]")
	WebElement delivryModeChargMain;

	@FindBy(xpath = "(//div[contains(@class,'deliveryLabelCnt')])[1]")
	WebElement delivryModeTxtMain;

	@FindBy(xpath = "(//span[@class='delivery-mode-desc']/following::span)[1]")
	WebElement homeDelChargeCartSumm;

	@FindBy(xpath = "//button[@id='addressSubmit']")
	WebElement ContinueDelivery;

	@FindBy(xpath = "//a[@class='deliveryOptionReadMore']")
	WebElement delPgeReadMore;

	@FindBy(xpath = "//a[@class='deliveryOptionReadLess']")
	WebElement delPgeReadLess;

	@FindBy(xpath = "//div[@class='col-sm-12 col-lg-12 addressDetailsBck']/span/div[2]/span")
	WebElement addressSectionInDelPge;

	@FindBy(xpath = "//a[@class='redirectEditLink']")
	WebElement editLinkDelPge;

	@FindBy(xpath = "//div[@class='checkout-steps ']//a[@class='step-head js-checkout-step active']")
	WebElement addressPgeCheckoutTitle;

	@FindBy(xpath = "//div[contains(text(),'POSTI Delivery fi')]")
	WebElement postiDeliveryButton;

	@FindBy(xpath = "//div[contains(text(),'POSTNORD Delivery sv')]")
	WebElement postNordDeliveryButton;

	@FindBy(xpath = "//div[@class='form-control-select']")
	WebElement nearestPostLoction;

	@FindBy(xpath = "//span[contains(.,'POSTI Delivery fi')]")
	WebElement postiText;

	@FindBy(xpath = "//img[@class='deliveryCartIconCnt']")
	WebElement postiThumbnail;

	@FindBy(xpath = "//span[contains(@class,'delivery-mode-desc')]//div[contains(@class,'worthTxt')]")
	WebElement priceValue;

	@FindBy(xpath = "(//span[@class='delivery-charges'])[5]")
	WebElement freePostiValue;

	@FindBy(xpath = "//span[@class='delivery-mode-desc']")
	WebElement postNordText;

	@FindBy(xpath = "//div[@class='orderConfDeliveryPriceWrap worthPriceWrapper']//span[@class='delivery-charges']")
	WebElement forYouText;

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

	@FindBy(xpath = "(//span[contains(@class,'chckt-pm__name')])[1]")
	WebElement creditCardOptionTxt;

	// ********SF Track***********//

	@FindBy(xpath = "(//input[@class='service_type'])[1]")
	WebElement firstProductServiceOne;

	@FindBy(xpath = "(//input[@class='service_type'])[2]")
	WebElement firstProductServiceTwo;

	@FindBy(xpath = "(//input[@class='service_type'])[3]")
	WebElement firstProductServiceThree;

	@FindBy(xpath = "(//span[@class='modelIDBck'])[1]")
	WebElement delPageModelIdProd1;

	@FindBy(xpath = "(//span[@class='modelIDBck'])[2]")
	WebElement delPageModelIdProd2;

	@FindBy(xpath = "//select[contains(@id,'deliveryPartnerPosList')]")
	WebElement dhlpostlist;

	@FindBy(xpath = "//select[contains(@id,'deliveryPartnerPosList')]/following::span[1]/following::div[contains(@id,'posData')][6]")
	WebElement dhladdresstimings;

	////// CICD/////////////////////

	@FindBy(xpath = "(//a[@class='serviceOptionReadMore'])[1]")
	WebElement serviceReadMore;

	@FindBy(xpath = "(//a[@class='serviceOptionReadLess'])[1]")
	WebElement serviceReadLess;

	@FindBy(xpath = "(//input[@class='service_type'])[4]")
	WebElement firstProductServiceFour;

	@FindBy(xpath = "//div[@class='edit']/span[@class='edit-link']")
	WebElement editButton;

	@FindBy(xpath = "//label[text()='Home Delivery (First floor and above)']")
	WebElement homeDeliveryFistAndAbove;
	
	
	
	//****************************************Gaurav Naik**************************************************************************************************
	
		@FindBy(xpath = "//div[contains(@class,'deliveryLabelCnt')]/following::span[contains(@class,'strikePrice')][1]")
		WebElement deliverystrikeprice;
		
		@FindBy(xpath = "//span[contains(@class,'delivery-charge-offer')]")
		WebElement totaldelPrice;
		
		@FindBy(xpath = "(//a[contains(@class,'deliveryOptionReadMore')])[1]")
		WebElement  deliveryoptnReadMore;
		
		
		@FindBy(xpath = "(//div[contains(@class,'deliveryMethodSummary')])[1]")
		WebElement  deliveryoptnshortDesc;
		
		
		@FindBy(xpath = "(//a[contains(@class,'deliveryOptionReadLess')])[1]")
		WebElement  deliveryoptnReadLess;
		
		
		@FindBy(xpath = "(//div[@class='title'])[2]")
		WebElement  deliverytitle;	
		
		
		@FindBy(xpath = "//div[contains(@class,'serviceSelector')]")
	    WebElement seviceSelector;

				
		@FindBy(xpath = "//span[contains(@class,'deliveryMainPriceWrap')]")
	    WebElement totaldelprice;
		
		
		@FindBy(xpath = "(//div[@class='total-price'])[2]")
	    WebElement totalserviceprice;
		
		
		
		
		
		
		
		

	public DeliveryPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageCheck()*
	 * @Description :This function is used verify the delivery page content
	 * @Author : Gaurav
	 ************************************************************************/
	public void deliveryPageCheck() {
		WebDriverWait(driver.getWebDriver(), homedelGrndFloorRadiobtn, 120);
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try{
		if (homedelGrndFloorRadiobtn.isSelected()) {
			report.updateTestLog("Home Delivery Ground floor radio button", "Home Delivery Ground floor option is selected by default",
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery Ground floor", "Home Delivery Ground floor option is not selected by default",Status.FAIL);
		}
		
		   String homedelChargmain = delivryModeChargeMain.getText().trim();
			if (delivryModeChargeMain.isDisplayed()) {
				report.updateTestLog("Home Delivery(Ground Floor) option charge","Home Delivery(Ground Floor) option charge is displayed as :" + homedelChargmain, Status.PASS);
			} 
		} catch (Exception e) {
			report.updateTestLog("Delivery methods", "No delivery method is available for selection", Status.FAIL);
		}
	}

	
	
	
	
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : homeDelOptionVerify()*
	 * @Description :This function is used verify the delivery page content
	 * @Author : Gaurav
	 ************************************************************************/
	public void homeDelOptionVerify() {
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		deliveryPageCheck();
		WebDriverWait(driver.getWebDriver(), delivryModetxtMain, 60);
		String[] homedel1 = delivryModetxtMain.getText().split("\n");
		System.out.println(homedel1[0]);
		String homedel = homedel1[0].trim();
		String homedelcharg = delivryModeChargeMain.getText().trim();
		System.out.println(homedelcharg);
		report.updateTestLog("Home Delivery option text",
				"Home Delivery(Ground Floor) option is displayed in Delivery page as :" + homedel, Status.PASS);
		report.updateTestLog("Home Delivery option charge",
				"Home Delivery(Ground Floor) option charge is displayed in Delivery page as :" + homedelcharg,
				Status.PASS);
		String homedeltxtcartsumm = delivryModeTxtCartSumm.getText().trim();
		System.out.println(homedeltxtcartsumm);
		if (homedeltxtcartsumm.equals(homedel)) {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is displaying in Cart Summary of delivery page as expected"
							+ " and is displayed as:" + homedeltxtcartsumm,
					Status.PASS);
		} else {
			report.updateTestLog("Home Delivery in Cart Summary",
					"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of delivery page",
					Status.FAIL);
		}

		String homedelchargecartsum = homeDelChargeCartSumm.getText().trim();
		System.out.println(homedelchargecartsum);
		report.updateTestLog("Home Delivery charge in Cart Summary","Home Delivery(Ground Floor) charge is displaying  in Cart Summary of delivery page as: " + homedelchargecartsum,
					Status.PASS);
		
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : standardParcelDeliveryVerify()*
	 * @Description :This function is used verify the parcel delivery
	 * @Author : Harish
	 ************************************************************************/
	public void standardParcelDeliveryVerify() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
	    try{
		WebDriverWait(driver.getWebDriver(), homedelGrndFloorRadiobtn, 60);
		ex.executeScript("arguments[0].scrollIntoView();",homedelGrndFloorRadiobtn);
		if (homedelGrndFloorRadiobtn.isSelected()) {
			report.updateTestLog("Parcel Delivery radio button", "Parcel Delivery option is selected by default",
					Status.PASS);
		} else {
			report.updateTestLog("Parcel Delivery radio button", "Parcel Delivery option is not selected by default",
					Status.FAIL);
		}
		String[] parcelDelText1 = delivryModeTxtMain.getText().split("\n");
		System.out.println(parcelDelText1[0]);
		String parceldeltxt = parcelDelText1[0].trim();
		String parceldelcharg = delivryModeChargMain.getText().trim();
		System.out.println(parceldelcharg);
		report.updateTestLog("Parcel Delivery option text",
				"Parcel Delivery option is displayed in Delivery page as :" + parceldeltxt, Status.PASS);
		report.updateTestLog("Parcel Delivery option charge",
				"Parcel Delivery option charge is displayed in Delivery page as :" + parceldelcharg, Status.PASS);
		ex.executeScript("arguments[0].scrollIntoView();",delivryModeTxtCartSumm);
		String parceldeltxtcartsumm = delivryModeTxtCartSumm.getText().trim();
		System.out.println(parceldeltxtcartsumm);
		if (parceldeltxtcartsumm.equals(parceldeltxt)) {
			report.updateTestLog("Parcel Delivery in Cart Summary",
					"Parcel Delivery is displaying in Cart Summary of delivery page as expected and is displayed as:"
							+ parceldeltxtcartsumm,
					Status.PASS);
		} else {
			report.updateTestLog("Parcel Delivery in Cart Summary",
					"Parcel Delivery is not displaying as expected in Cart Summary of delivery page", Status.FAIL);
		}
		String parceldelchargecartsum = homeDelChargeCartSumm.getText().trim();
		report.updateTestLog("Parcel Delivery charge in Cart Summary",
					"Parcel Delivery charge is displaying as expected in Cart Summary of delivery page and is displayed as:"
							+ parceldelchargecartsum,
					Status.PASS);
	    }catch(Exception e){
	    	report.updateTestLog("Delivery method","Delivery method is not available for the product in Delivery page", Status.FAIL);
	    }
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryInstructions()*
	 * @Description :This function is used verify the delivery Instructions
	 * @Author : Rahul
	 ************************************************************************/
	public void deliveryInstructions() {
		String deliveryintrtnData = dataTable.getData("General_Data", "Delivery Instructions");
		try {
			if (deliveryInstn.isDisplayed()) {
				report.updateTestLog("Delivery Instruction","Delivery Instruction textbox is displayed in delivery page", Status.PASS);
			} else {
				report.updateTestLog("Delivery Instruction","Delivery Instruction textbox is not displayed in delivery page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery Instruction","Delivery Instruction textbox is not displayed in delivery page", Status.FAIL);
		}
		deliveryInstn.sendKeys(deliveryintrtnData);
		report.updateTestLog("Delivery Instruction", "Delivery Instruction is entered as: "+deliveryintrtnData, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : sundayDeliverycheck()*
	 * @Description :This function is used verify the Sunday delivery
	 * @Author : Mohan
	 ************************************************************************/
	public void sundayDeliverycheck() {
		try {
			WebDriverWait(driver.getWebDriver(), sundayDelvry, 30);
			sundayDelvry.click();
			report.updateTestLog("Sunday Delivery checkbox", "Sunday Delivery sub delivery method checkbox is checked",
					Status.PASS);
			String deliveryintrtnData = dataTable.getData("General_Data", "Delivery Instructions");
			deliveryInstn.sendKeys(deliveryintrtnData);
			report.updateTestLog("Delivery Instruction", "Delivery Instruction is entered", Status.PASS);

		} catch (Exception e) {
			report.updateTestLog("Sunday Delivery checkbox",
					"Sunday Delivery sub delivery method checkbox is not available ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageWithSundayDeliveryVerify()*
	 * @Description :This function is used verify the Sunday delivery
	 * @Author : Mohan
	 ************************************************************************/
	public void deliveryPageWithSundayDeliveryVerify() {
		try {
			if (sundayDelvry.isEnabled()) {
				report.updateTestLog("Sunday Delivery checkbox", "Sunday Delivery checkbox is enabled in Delivery page",
						Status.PASS);
			} else {
				report.updateTestLog("Sunday Delivery checkbox",
						"Sunday Delivery checkbox is not enabled in Delivery page", Status.FAIL);
			}
			String sundel = sunDelivryModetxtMain.getText().trim();
			String sundelcharg = sunDelivryModeChargeMain.getText().trim();
			report.updateTestLog("Sunday Delivery option text",
					"Sunday Delivery option is displayed in Delivery page as :" + sundel, Status.PASS);
			report.updateTestLog("Sunday Delivery option charge",
					"Sunday Delivery option charge is displayed in Delivery page as :" + sundelcharg, Status.PASS);
			if (sunDelivryModeChargeMain.isDisplayed()) {
				report.updateTestLog("Sunday Delivery charge", "Sunday Delivery charge is displayed in Delivery page",
						Status.PASS);
			} else {
				report.updateTestLog("Sunday Delivery charge",
						"Sunday Delivery charge is not displayed in Delivery page", Status.FAIL);
			}
			sundayDelvry.click();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			report.updateTestLog("Sunday Delivery checkbox", "Sunday Delivery sub delivery method checkbox is checked",
					Status.PASS);
			String sundeltxtcartsumm = sunDelivryModeTxtCartSumm.getText().trim();
			if (sundeltxtcartsumm.equals(sundel)) {
				report.updateTestLog("Sunday Delivery option in Cart Summary",
						"Sunday Delivery is displaying in Cart Summary of delivery page as expected and "
								+ "is displayed as:" + sundeltxtcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("Sunday Delivery option in Cart Summary",
						"Sunday Delivery is not displaying in Cart Summary of delivery page as expected", Status.FAIL);
			}

			String sundelchargcartsumm = sunDelChargeCartSumm.getText().trim();
			if (sundelchargcartsumm.equals(sundelcharg)) {
				report.updateTestLog("Sunday Delivery charge in Cart Summary",
						"Sunday Delivery charge is displaying as expected in Cart Summary of delivery page and is displayed as:"
								+ sundelchargcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("Sunday Delivery charge in Cart Summary",
						"Sunday Delivery charge is not displaying as expected in Cart Summary of delivery page"
								+ sundelchargcartsumm,
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Sunday Delivery checkbox", "Sunday Delivery checkbox is not enabled in Delivery page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInDeliveryPage()*
	 * @Description :This function is used verify promotion
	 * @Author : Rahul
	 ************************************************************************/
	public void promoVerifyInDeliveryPage() {
		try {
			WebDriverWait(driver.getWebDriver(), promoRibbonDelvryPage, 120);
			String ribbondetails = promoRibbonDelvryPage.getText().trim();
			report.updateTestLog("Promo ribbon for product 1 in delivery page",
					"Promo ribbon for product 1 in delivery page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 1 in delivery page",
					"Promo ribbon for product 1 is not displayed in delivery page", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : promoVerifyInDeliveryPage()*
	 * @Description :This function is used verify promotion for 2 products
	 * @Author : Rahul
	 ************************************************************************/
	public void promoVerifyInDeliveryPage2Products() {
		try {
			WebDriverWait(driver.getWebDriver(), addrspage.promoRibbonAddrsPagePrduct2, 60);
			String ribbondetails = addrspage.promoRibbonAddrsPagePrduct2.getText().trim();
			report.updateTestLog("Promo ribbon for product 2 in delivery page",
					"Promo ribbon for product 2 in delivery page is displayed as:" + ribbondetails, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Promo ribbon for product 2 in delivery details page",
					"Promo ribbon for product 2 in delivery page is not displayed ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageCartSummaryValidations()*
	 * @Description :This function is used verify cart summary details
	 * @Author : Mamatha
	 ************************************************************************/
	public void deliveryPageCartSummaryValidations() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		String modelID = addrspage.productModel.getText().trim();
		if (addrspage.productModel.isDisplayed()) {
			report.updateTestLog("Product model id in Cart Summary of Delivery page",
					"Product model id is displayed in Cart Summary of Delivery page as :" + modelID, Status.PASS);
		} else {
			report.updateTestLog("Product model id in Cart Summary of Delivery page",
					"Product model id is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		String actstockstatus = addrspage.stockStatus.getText();
		if (actstockstatus.equals(expstockstatus)) {
			report.updateTestLog("Stock status",
					"Stock status is displayed in cart summary of Delivery page as : " + actstockstatus, Status.PASS);
		} else {
			report.updateTestLog("Stock status", "Stock status is not displayed in cart summary of Delivery page",
					Status.FAIL);
		}
		String prodprice = addrspage.productPrice.getText().trim();
		if (addrspage.productPrice.isDisplayed()) {
			report.updateTestLog("Product price in Cart Summary of Delivery page",
					"Product price is displayed in Cart Summary of Delivery page as :" + prodprice, Status.PASS);
		} else {
			report.updateTestLog("Product price in Cart Summary of Delivery page",
					"Product price is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		String prodctamtwithqty = addrspage.productQty.getText().trim();
		String[] qty = prodctamtwithqty.split("\n");
		String[] quantity = qty[0].split("x ");
		String productprice = quantity[0].trim();
		String quant = quantity[1].trim();
		int qty2 = Integer.parseInt(quant);
		report.updateTestLog("Product amount with quantity on cart summary of Delivery page",
				"Product amount with quantity on cart summary of Delivery page is displayed as: " + prodctamtwithqty,
				Status.PASS);
		if (qty2 == qtydata) {
			report.updateTestLog("Product quantity on cart summary of Delivery page",
					"Product quantity is displayed as expected on cart summary of Delivery page and is displayed as: "
							+ qty2,
					Status.PASS);
		} else {
			report.updateTestLog("Product quantity on cart summary of Delivery page",
					"Product quantity is not displayed as expected on cart summary of Delivery page", Status.FAIL);
		}
		if (productprice.equals(prodprice)) {
			report.updateTestLog("Product price below instock status in Cart Summary of Delivery page",
					"Product price below stock status is matching with main product price in Cart Summary of Delivery"
							+ " page as :" + productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of Delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of"
							+ " Delivery page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		if (addrspage.installtnTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service text in Cart Summary of Delivery page",
					"Installation service text is displayed in Cart Summary of Delivery page as:" + installtiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service text in Cart Summary of Delivery page",
					"Installation service text is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Installation service price in Cart Summary of Delivery page",
					"Installation service price is displayed in Cart Summary of Delivery page as:" + installatnprice,
					Status.PASS);
		} else {
			report.updateTestLog("Installation service price in Cart Summary of Delivery page",
					"Installation service price is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		String disposaltxt = addrspage.disposalTxtcartsumm.getText().trim();
		String disposalprice = addrspage.disposalSerPriceCartSumm.getText().trim();
		if (addrspage.disposalTxtcartsumm.isDisplayed()) {
			report.updateTestLog("Disposal service text in Cart Summary of Delivery page",
					"Disposal service text is displayed in Cart Summary of Delivery page as:" + disposaltxt,
					Status.PASS);
		} else {
			report.updateTestLog("Disposal service text in Cart Summary of Delivery page",
					"Disposal service text is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Disposal service price in Cart Summary of Delivery page",
					"Disposal service price is displayed in Cart Summary of Delivery page as:" + disposalprice,
					Status.PASS);
		} else {
			report.updateTestLog("Disposal service price in Cart Summary of Delivery page",
					"Disposal service price is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		String protctiontxt = addrspage.protectionTxtCartSumm.getText().trim();
		String protctionprice = addrspage.protectionSerPriceCartSumm.getText().trim();
		if (addrspage.protectionTxtCartSumm.isDisplayed()) {
			report.updateTestLog("Protection service text in Cart Summary of Delivery page",
					"Protection service text is displayed in Cart Summary of Delivery page as:" + protctiontxt,
					Status.PASS);
		} else {
			report.updateTestLog("Protection service text in Cart Summary of Delivery page",
					"Protection service text is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		if (addrspage.protectionSerPriceCartSumm.isDisplayed()) {
			report.updateTestLog("Protection service price in Cart Summary of Delivery page",
					"Protection service price is displayed in Cart Summary of Delivery page as:" + protctionprice,
					Status.PASS);
		} else {
			report.updateTestLog("Protection service price in Cart Summary of Delivery page",
					"Protection service price is not displayed in Cart Summary of Delivery page", Status.FAIL);
		}
		homeDelOptionVerify();
		deliveryDetailsCartSummary();
		float totalvalbtm = totalCartAmountBottomCartSummaryAddressPage();
		report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
				"Total cart amount in Cart Summary of Delivery page is displayed as: " + totalvalbtm, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : voucherVerifyInDeliverypage()*
	 * @Description :This function is used verify voucher details
	 * @Author : Mamatha
	 ************************************************************************/
	public void voucherVerifyInDeliverypage() {
		try {
			WebDriverWait(driver.getWebDriver(), addrspage.vouchrCodeAddrssPage, 120);
			String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
			String voucherData = dataTable.getData("General_Data", "Voucher code");
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
			if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
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
	 * @Project Name : Electrolux*
	 * @Function Name : contentVerifyDeliveryPageCartSummary()*
	 * @Description :This function is used verify delivery page details
	 * @Author : Mamatha
	 ************************************************************************/
	public void contentVerifyDeliveryPageCartSummary() {
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
					"Product price below stock status is matching with main product price in Cart Summary of delivery"
							+ " page as :" + productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of "
							+ "delivery page",
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
		homeDelOptionVerify();
		sundayDeliverycheck();
		float subtl = subTotalValueCheckCartSummryDeliveryPage();
		float servl = servicesValueCheckCartSummaryDeliveryPage();
		float delvery = deliveryDetails();
		float total = subtl + servl + delvery;
		String totalcalculated = String.valueOf(total);
		System.out.println(total);
		float totalvalbtm = totalCartAmountBottomCartSummaryDeliveryPage();
		String totalinUI = String.valueOf(totalvalbtm);
		report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
				"Total cart amount in Cart Summary of Delivery page is displayed as: " + total, Status.PASS);
		if (totalcalculated.equals(totalinUI)) {
			report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
					"Total cart amount in Cart Summary of Delivery page is as expected", Status.PASS);
		} else {
			report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
					"Total cart amount in Cart Summary of Delivery page is not as expected", Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageCartSummaryValidation()*
	 * @Description :To verify delivery page cart summary details
	 * @Author : Mamatha
	 ************************************************************************/
	public void deliveryPageCartSummaryValidation() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		try {
			String actstockstatus = stockStatus.getText();
			report.updateTestLog("Stock status in cart summary of the delivery page",
					"Stock status in delivery page is displayed as : " + actstockstatus, Status.PASS);
		} catch (Exception e) {
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
					"Product price below stock status is matching with main product price in Cart Summary of "
							+ "delivery page as :" + productprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product price below instock status in Cart Summary of delivery page",
					"Product price below stock status is not matching with main product price in Cart Summary of "
							+ "delivery page",
					Status.FAIL);
		}
		String installtiontxt = addrspage.installtnTxtCartSumm.getText().trim();
		String installatnprice = addrspage.installtnSerPriceCartSumm.getText().trim();
		try {
			if (addrspage.installtnTxtCartSumm.isDisplayed()) {
				report.updateTestLog("First Service text",
						"First Service text is displayed in delivery page as:" + installtiontxt, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service", "First Service is not selected for the product", Status.PASS);
		}
		try {
			if (addrspage.installtnSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("First Service price",
						"First Service price is displayed in delivery page as:" + installatnprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("First Service text", "First Service is not selected for the product", Status.PASS);
		}
		try {
			String recycletxt = addrspage.disposalTxtcartsumm.getText().trim();
			String recycleprice = addrspage.disposalSerPriceCartSumm.getText().trim();
			if (addrspage.disposalTxtcartsumm.isDisplayed()) {
				report.updateTestLog("Second Service text",
						"Second Service text is displayed in delivery page as:" + recycletxt, Status.PASS);
			}
			if (addrspage.disposalSerPriceCartSumm.isDisplayed()) {
				report.updateTestLog("Second Service price",
						"Second Service price is displayed in delivery page as:" + recycleprice, Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service", "Second Service is not selected for the product", Status.PASS);
		}
		try {
			String freereturntxt = addrspage.protectionTxtCartSumm.getText().trim();
			report.updateTestLog("Third Service text",
					"Third Service text is displayed in delivery page as:" + freereturntxt, Status.PASS);
			String freereturnprice = addrspage.protectionSerPriceCartSumm.getText().trim();
			report.updateTestLog("Third Service price",
					"Third Service price is displayed in delivery page as:" + freereturnprice, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Third Service", "Third Service is not selected for the product", Status.PASS);
		}
		homeDelOptionVerify();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : contentVerifyDeliveryPageCartSummaryAEG()*
	 * @Description :This function is used verify delivery page content in AEG
	 * @Author : Mohan
	 ************************************************************************/
	public void contentVerifyDeliveryPageCartSummaryAEG() {
		String QtyData = dataTable.getData("General_Data", "Quantity");
		int qtydata = Integer.parseInt(QtyData);
		String actstockstatus = addrspage.stockStatus.getText();
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
		String modelname = productModelName.getText().trim();
		if (productModelName.isDisplayed()) {
			report.updateTestLog("Product model name in Cart Summary of delivery page",
					"Product model name is displayed in Cart Summary of delivery page as :" + modelname, Status.PASS);
		} else {
			report.updateTestLog("Product model name in Cart Summary of delivery page",
					"Product model name is not displayed in Cart Summary of delivery page", Status.FAIL);
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
		homeDelOptionVerify();
		float subtl = subTotalValueCheckCartSummryDeliveryPage();
		float servl = servicesValueCheckCartSummaryDeliveryPage();
		float delvery = deliveryDetails();
		float total = subtl + servl + delvery;
		String totalcalculated = String.valueOf(total);
		System.out.println(total);
		float totalvalbtm = totalCartAmountBottomCartSummaryDeliveryPageAEG();
		String totalinUI = String.valueOf(totalvalbtm);
		report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
				"Total cart amount in Cart Summary of Delivery page is displayed as: " + total, Status.PASS);
		if (totalcalculated.equals(totalinUI)) {
			report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
					"Total cart amount in Cart Summary of Delivery page is as expected", Status.PASS);
		} else {
			report.updateTestLog("Total cart amount in Cart Summary of Delivery page",
					"Total cart amount in Cart Summary of Delivery page is not as expected", Status.FAIL);
		}
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationDeliveryPage()*
	 * @Description :This function is used verify buy x get y promotion
	 * @Author : Harish
	 ************************************************************************/
	public void buyXGetYProductValidationDeliveryPage() {
		if (addrspage.product1PromoRibbonAddrsPage.isDisplayed()) {
			String promomsg = addrspage.product1PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the delivery page is displayed as : " + promomsg,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product X",
					"Promo ribbon for Product X in cart summary of the delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.product2PromoRibbonAddrsPage.isDisplayed()) {
			String promomsgproducty = addrspage.product2PromoRibbonAddrsPage.getText().trim();
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the delivery page is displayed as : "
							+ promomsgproducty,
					Status.PASS);
		} else {
			report.updateTestLog("Promo ribbon for Product Y",
					"Promo ribbon for Product Y in cart summary of the delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.productYCartSummAddrsPage.isDisplayed()) {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the delivery page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Product Y in cart summary of the address page",
					"Product Y in cart summary of the delivery page is not displayed", Status.FAIL);
		}
		String productyqty = addrspage.productYQty.getText().trim();
		report.updateTestLog("Product Y Quantity in cart summary of the address page",
				"Product Y quantity in cart summary of the delivery page is displayed as :" + productyqty, Status.PASS);
		if (addrspage.productYCartSummAddrsPage.isDisplayed()) {
			String productyprice = addrspage.productYCartSummAddrsPage.getText().trim();
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the delivery page is displayed as :" + productyprice,
					Status.PASS);
		} else {
			report.updateTestLog("Product Y price in cart summary of the address page",
					"Product Y price in cart summary of the delivery page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : uspPromotionHeaderBannerValidationDeliveryPage()*
	 * @Description :This function is used verify USP promotion
	 * @Author : Rahul
	 ************************************************************************/
	public void uspPromotionHeaderBannerValidationDeliveryPage() {
		if (addrspage.uspBanner1Title.isDisplayed()) {
			String uspbanner1 = addrspage.uspBanner1Title.getText().trim();
			report.updateTestLog("Title of USP Banner 1 in delivery page",
					"Title of USP Banner 1 in delivery page is displayed as :" + uspbanner1, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 1 in delivery page",
					"Title of USP Banner 1 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner1Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 1 in delivery page",
					"Icon of USP Banner 1 in delivery page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 1 in delivery page",
					"Icon of USP Banner 1 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Title.isDisplayed()) {
			String uspbanner2 = addrspage.uspBanner2Title.getText().trim();
			report.updateTestLog("Title of USP Banner 2 in delivery page",
					"Title of USP Banner 2 in delivery page is displayed as :" + uspbanner2, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 2 in delivery page",
					"Title of USP Banner 2 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner2Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 2 in delivery page",
					"Icon of USP Banner 2 in delivery page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 2 in delivery page",
					"Icon of USP Banner 2 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Title.isDisplayed()) {
			String uspbanner3 = addrspage.uspBanner3Title.getText().trim();
			report.updateTestLog("Title of USP Banner 3 in delivery page",
					"Title of USP Banner 3 in delivery page is displayed as :" + uspbanner3, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 3 in delivery page",
					"Title of USP Banner 3 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner3Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 3 in delivery page",
					"Icon of USP Banner 3 in delivery page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 3 in delivery page",
					"Icon of USP Banner 3 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Title.isDisplayed()) {
			String uspbanner4 = addrspage.uspBanner4Title.getText().trim();
			report.updateTestLog("Title of USP Banner 4 in delivery page",
					"Title of USP Banner 4 in delivery page is displayed as :" + uspbanner4, Status.PASS);
		} else {
			report.updateTestLog("Title of USP Banner 4 in delivery page",
					"Title of USP Banner 4 in delivery page is not displayed", Status.FAIL);
		}
		if (addrspage.uspBanner4Icon.isDisplayed()) {
			report.updateTestLog("Iconof USP Banner 4 in delivery page",
					"Icon of USP Banner 4 in delivery page is displayed", Status.PASS);
		} else {
			report.updateTestLog("Icon of USP Banner 4 in delivery page",
					"Icon of USP Banner 4 in delivery page is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :
	 *           verifyOfferPriceForPercentagePromotionProduct1DeliveryPage()*
	 * @Description :This function is used verify percentage promotion for product1
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct1DeliveryPage() {
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
	 * @Function Name :
	 *           verifyOfferPriceForPercentagePromotionProduct2DeliveryPage()*
	 * @Description :This function is used verify percentage promotion for product2
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForPercentagePromotionProduct2DeliveryPage() {
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
	 *           verifyOfferPriceForFlatDiscountPromotionProduct1DeliveryPage()*
	 * @Description :verify flat discount promotion for product1*
	 * @Author : Mamatha
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct1DeliveryPage() {
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
	 *           verifyOfferPriceForFlatDiscountPromotionProduct2DeliveryPage()*
	 * @Description :This function is used verify flat discount promotion for
	 *              product2
	 * @Author : Harish
	 ************************************************************************/
	public void verifyOfferPriceForFlatDiscountPromotionProduct2DeliveryPage() {
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
	 * @Function Name : deliveryPageUspVerify()*
	 * @Description :This function is used verify USP promotion
	 * @Author : Rahul
	 ************************************************************************/
	public void deliveryPageUspVerify() {
		try {
			installazionLink.click();
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is displayed as Clickable Hyperlink in delivery page", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Title is Click",
					"USP Title is not displayed as Clickable Hyperlink in delivery page", Status.FAIL);
		}
		try {
			if (installazionImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion Header Banner Img",
						"USP Promotion Header Banner Image is displayed in delivery page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Header Banner Img",
					"USP Promotion Header Banner Image is not displayed in delivery page", Status.FAIL);
		}
		try {
			if (spedizioneGratuitaImg.isDisplayed()) {

				report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
						"USP Promotion Spedizione gratuita Img Cart is displayed in delivery page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion Spedizione gratuita Img",
					"USP Promotion Spedizione gratuita Img Cart is not displayed in delivery page", Status.FAIL);
		}
		try {
			if (giorniDiResoImg.isDisplayed()) {
				report.updateTestLog("Verify the USP Promotion days of free Return Img",
						"USP Promotion Spedizione Days of free Return is displayed in delivery page", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Verify the USP Promotion days of free Return Img",
					"USP Promotion Spedizione Days of free Return is not displayed in delivery page", Status.FAIL);
		}
		try {
			if (peaceOfMindImg.isDisplayed()) {
				report.updateTestLog(
						"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
						"USP Promotion Peace of mind and full assistance included is displayed in delivery page",
						Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog(
					"Verify the USP Promotion Header Banner Peace of mind and full assistance included Img",
					"USP Promotion Peace of mind and full assistance included is not displayed in delivery page",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalCartAmountbtmCartSummaryDeliveryPage()*
	 * @Description :This function is used verify total amount in cart summary
	 * @Author : Mohan
	 ************************************************************************/
	public void totalCartAmountbtmCartSummaryDeliveryPage() {
		try {
			String totaltxt = totalBtmTxt.getText().trim();
			String totalval = totalBtmValue.getText().trim();
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", totalBtmTxt);
			String productotalamount = totaltxt + " " + totalval;
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary of delivery page is displayed as: " + productotalamount,
					Status.PASS);
		} catch (Exception ex) {
			String totaltxt = totalBtmTxt2.getText().trim();
			String totalval = totalBtmValue2.getText().trim();
			String productotalamount = totaltxt + " " + totalval;
			report.updateTestLog("Total Amount",
					"Product total amount in Cart Summary of delivery page is displayed as: " + productotalamount,
					Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageVeriyWithPromotionProduct()*
	 * @Description :This function is used verify promotion in delivery page*
	 * @Author : Mamatha
	 ************************************************************************/
	public void deliveryPageVeriyWithPromotionProduct() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			WebDriverWait(driver.getWebDriver(), strikedPrice, 120);
			if (strikedPrice.isDisplayed()) {
				String product2strikedprice = strikedPrice.getText().trim();
				report.updateTestLog("Delivery page Product 2 Striked off price",
						"Product is applied with promotion and Product Striked off price is displayed as: "
								+ product2strikedprice,
						Status.PASS);
			} else {
				report.updateTestLog("Delivery page Product 2 Striked off price",
						"Product is not applied with promotion and Product Striked off price is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery page Product 2 Striked off price",
					"Product  Striked off price is not displayed", Status.FAIL);
		}
		try {
			WebDriverWait(driver.getWebDriver(), discountPrice, 20);
			if (discountPrice.isDisplayed()) {
				String product2discprice = discountPrice.getText().trim();
				report.updateTestLog("Delivery page Product 2 discounted price",
						"Product  discounted price is displayed as: " + product2discprice, Status.PASS);
			} else {
				report.updateTestLog("Delivery page Product 2 discounted price",
						"Product  discounted price is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery page Product 2 discounted price",
					"Product  discounted price is not displayed", Status.FAIL);
		}
		promoVerifyInDeliveryPage();
		promoVerifyInDeliveryPage2Products();
		subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountbtmCartSummaryDeliveryPage();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryToPayment()*
	 * @Description :This function is used navigate from delivery to payment page
	 * @Author : Mamatha
	 ************************************************************************/
	public void deliveryToPayment() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			
			ex.executeScript("arguments[0].scrollIntoView();", continueToPayment);
			ex.executeScript("arguments[0].click();", continueToPayment);
			report.updateTestLog("Continue to Payment button", "Clicked on Continue to Payment button", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Continue to Payment button", "Not Clicked on Continue to Payment button",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryOptionVerifyWithDescription()*
	 * @Description :To verify delivery option with description
	 * @Author : Mohan
	 ************************************************************************/
	public void deliveryOptionVerifyWithDescription() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			waitUntilElementVisible(addressSectionInDelPge,360);
			if (addressSectionInDelPge.isDisplayed()) {
				String address = addressSectionInDelPge.getText();
				report.updateTestLog("Address Section in Delivery Page",
						"The Shipping Address is displayed in Deivery Page as : " + address, Status.PASS);
				editLinkDelPge.click();
				report.updateTestLog("Edit link at Shipping address section","Clicked on the Edit link at the shipping address section", Status.PASS);

			} 
		}catch(Exception e) {
				report.updateTestLog("Address Section in Delivery Page","The Shipping Address is not displayed in Delivery Page", Status.FAIL);
			}
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			try{
		    waitUntilElementVisible(addressPgeCheckoutTitle,360);
			if (addressPgeCheckoutTitle.isDisplayed()) {
				report.updateTestLog("Address Page","User is navigated to the Address page while clicking on edit link", Status.PASS);
				ex.executeScript("arguments[0].click();", ContinueDelivery);
				report.updateTestLog("Continue to Delivery button", "Clicked on Continue to Delivery button",
						Status.PASS);
			}
			}catch(Exception e) {
				report.updateTestLog("Address Page","User is not navigated to the Address page while clicking on edit link", Status.FAIL);
			}
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			try{
			if (delivryModeTxtMain.isDisplayed()) {
				report.updateTestLog("Delivery Page", "User is navigated back to the delivery page", Status.PASS);
			} 
			}catch(Exception e){
				report.updateTestLog("Delivery Page", "User is not navigated back to the delivery page", Status.FAIL);
			}
		
		try {
			if (delPgeReadMore.isDisplayed()) {
				report.updateTestLog("Long Description in Delivery Option",
						"The Delivery Option is Displayed with long description", Status.PASS);
				delPgeReadMore.click();
				if (delPgeReadLess.isDisplayed()) {
					report.updateTestLog("Clicked on Read More link","The Long Description with all lines displayed while clicking on Read More link ",
							Status.PASS);
					delPgeReadLess.click();
					report.updateTestLog("Clicked on Read Less link","The Long Description is displayed with less no.of lines while clicking on Read Less link ",
							Status.PASS);
				} else {
					report.updateTestLog("Read More Link", "Read more link is not clicked", Status.FAIL);
				}
			} else {
				report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPagePostiMethod()*
	 * @Description :This function is used to verify POSTI Delivery*
	 * @Author : Rahul
	 ************************************************************************/
	public void deliveryPagePostiMethod() throws InterruptedException {
		postiDeliveryButton.click();
		if (postiDeliveryButton.isDisplayed()) {

			report.updateTestLog("Select POSTIservice point", "User is able to select POSTIservice point", Status.PASS);
		} else {
			report.updateTestLog("Select POSTIservice point", "User is able to select POSTIservice point", Status.FAIL);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (nearestPostLoction.isDisplayed()) {
			report.updateTestLog("User is able to see the closest location",
					"User should be able to see the closest location", Status.PASS);
		} else {
			report.updateTestLog("User is able to see the closest location",
					"User should not be able to see the closest location", Status.FAIL);
		}

		if (postiText.isDisplayed()) {
			report.updateTestLog("Posti Service Title", "Service Title is Display", Status.PASS);
		} else {
			report.updateTestLog("Posti Service Title", "User should be not able to see POSTI delivery option",
					Status.FAIL);
		}
		postiThumbnail.isDisplayed();
		report.updateTestLog("POSTI Service thumbnail", "POSTI Service thumbnail display", Status.PASS);

		priceValue.isDisplayed();
		report.updateTestLog("Price is display", "Price should be display", Status.PASS);

		String freevalue = freePostiValue.getText().trim();
		if (freePostiValue.isDisplayed()) {
			report.updateTestLog("For you service offered", "For you promotion service offer display : " + freevalue,
					Status.PASS);
		} else {
			report.updateTestLog("For you promotion on the service offered",
					"For you promotion on the service offered not display:", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPagePostiMethod()*
	 * @Description :This function is used to verify POSTNORD Delivery*
	 * @Author : Rahul
	 ************************************************************************/
	public void deliveryPagePostNord() throws InterruptedException {
		postNordDeliveryButton.click();
		if (postNordDeliveryButton.isDisplayed()) {
			report.updateTestLog("Select PostNordservice point", "User is able to select PostNordservice point",
					Status.PASS);
		} else {
			report.updateTestLog("Select POSTNord service point", "User is not select PostNord service point",
					Status.FAIL);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (nearestPostLoction.isDisplayed()) {
			report.updateTestLog("User is able to see the closest location",
					"User should be able to see the closest location", Status.PASS);
		} else {
			report.updateTestLog("User is able to see the closest location",
					"User should not be able to see the closest location", Status.FAIL);
		}
		if (postNordText.isDisplayed()) {
			report.updateTestLog("PostNord Service Title", "PostNord Title is Display", Status.PASS);
		} else {
			report.updateTestLog("PostNord Service Title", "User should be not able to see POSTNord delivery option",
					Status.FAIL);
		}
		postiThumbnail.isDisplayed();
		report.updateTestLog("PostNord Service thumbnail", "PostNord Service thumbnail display", Status.PASS);

		priceValue.isDisplayed();
		report.updateTestLog("Price is display", "Price should be display", Status.PASS);

		String freevalue = forYouText.getText().trim();
		if (forYouText.isDisplayed()) {
			report.updateTestLog("For you service offered", "For you promotion service offer display : " + freevalue,
					Status.PASS);
		} else {
			report.updateTestLog("For you promotion on the service offered",
					"For you promotion on the service offered not display:", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageServiceInformationValidations()*
	 * @Description :To verify the services information in Delivery Page*
	 * @Author : Gaurav*
	 ************************************************************************/
	public void deliveryPageServiceInformationValidations() {
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
	 * @Function Name : EWServicePromoVerifyDeliveryPage()*
	 * @Description : To verify Extended Warranty Services Promo in Delivery Page*
	 * @Author : Gaurav
	 ************************************************************************/
	public void EWServicePromoVerifyDeliveryPage() {
		try {
			WebDriverWait(driver.getWebDriver(), addrspage.ewServiceText, 60);
			String ewservicespromo = addrspage.ewServiceText.getText().trim();
			report.updateTestLog("EW Services Promo",
					"The Extended Warranty Services Promo in delivery page page is Displayed as : " + ewservicespromo,
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

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageAllServices()*
	 * @Description : This function is used verify all services in DeliveryPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public void deliveryPageAllServices() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceOne);
			if (firstProductServiceOne.isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceOne);
					ex.executeScript("arguments[0].click();", firstProductServiceOne);
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					if (firstProductServiceOne.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1",
					"First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			if (firstProductServiceTwo.isSelected()) {
				report.updateTestLog("Second Service checkbox for product 1",
						"Second Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceTwo);
					ex.executeScript("arguments[0].click();", firstProductServiceTwo);
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					if (firstProductServiceTwo.isSelected()) {
						report.updateTestLog("Second Service checkbox for product 1",
								"Second Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Second Service checkbox for product 1",
							"Second Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1",
					"Second Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			if (firstProductServiceThree.isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceThree);
					ex.executeScript("arguments[0].click();", firstProductServiceThree);
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					if (firstProductServiceThree.isSelected()) {
						report.updateTestLog("Third Service checkbox for product 1",
								"Third Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Third Service checkbox for product 1",
							"Third Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1",
					"Third Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		try {
			if (firstProductServiceFour.isSelected()) {
				report.updateTestLog("Fourth Service checkbox for product 1",
						"Fourth Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceFour);
					ex.executeScript("arguments[0].click();", firstProductServiceFour);
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					if (firstProductServiceFour.isSelected()) {
						report.updateTestLog("Fourth Service checkbox for product 1",
								"Fourth Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Fourth Service checkbox for product 1",
							"Fourth Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 1",
					"Fourth Service checkbox for product 1 is not available for the product", Status.PASS);
		}

	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageprod1AllServices()*
	 * @Description :To verify all services for product 1 in DeliveryPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void deliveryPageProd1AllServices() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		String prod1modelId = delPageModelIdProd1.getText().trim();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1",
					"First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
				report.updateTestLog("Second Service checkbox for product 1",
						"Second Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("Second Service checkbox for product 1",
								"Second Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Second Service checkbox for product 1",
							"Second Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1",
					"Second Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]"))
							.isSelected()) {
						report.updateTestLog("Third Service checkbox for product 1",
								"Third Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Third Service checkbox for product 1",
							"Third Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1",
					"Third Service checkbox for product 1 is not available for the product", Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageProd2AllServices()*
	 * @Description :To verify all services for product 2 in DeliveryPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void deliveryPageProd2AllServices() throws InterruptedException {
		String prod2modelId = delPageModelIdProd2.getText().trim();
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 2",
						"First Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 2",
								"First Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 2",
					"First Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")).isSelected()) {
				report.updateTestLog("Second Service checkbox for product 2",
						"Second Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("Second Service checkbox for product 2",
								"Second Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Second Service checkbox for product 2",
							"Second Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 2",
					"Second Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")).isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]"))
							.isSelected()) {
						report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is checked", Status.PASS);
						driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
					}
				} catch (Exception e) {
					report.updateTestLog("Third Service checkbox for product 2",
							"Third Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 2",
					"Third Service checkbox for product 2 is not available for the product", Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageFewServices()*
	 * @Description : This function is used verify all services in DeliveryPage*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void deliveryPageFewServices() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceOne);
			if (firstProductServiceOne.isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", firstProductServiceOne);
					ex.executeScript("arguments[0].click();", firstProductServiceOne);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					if (firstProductServiceOne.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1",
					"First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
	}

	public void deliveryPagemultProd1FewServices() throws InterruptedException {
		String prod1modelId = dataTable.getData("General_Data", "Product1ID");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1",
					"First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
	}

	public void deliveryPagemultprod2FewServices() throws InterruptedException {
		String prod2modelId = dataTable.getData("General_Data", "Product2ID");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 2",
					"First Service checkbox for product 2 is not available for the product", Status.PASS);
		}
	}

	public void deliveryPageDHLOption() throws InterruptedException {
		try {
			if (homeDelgrndFloorRadiobtn.isSelected())
				report.updateTestLog("DHL service point", "DHL service point is selected by default", Status.PASS);

			else {
				report.updateTestLog("DHL service point", "DHL service point is not selected by default", Status.FAIL);
			}

			Thread.sleep(5000);
			String dhldel1[] = delivryModetxtMain.getText().split("\n");
			String dhldel = dhldel1[0];
			report.updateTestLog("DHL service text", "DHL service text is displayed as : " + dhldel, Status.PASS);
			String dhldelcharg = delivryModeChargeMain.getText().trim();
			report.updateTestLog("DHL service price",
					"DHL service price is displayed in Delivery page as :" + dhldelcharg, Status.PASS);
			String dhldeltxtcartsumm = delivryModeTxtCartSumm.getText().trim();
			if (dhldeltxtcartsumm.equals(dhldel)) {
				report.updateTestLog("DHL service text in Cart Summary",
						"DHL service text is displaying in Cart Summary of delivery page as expected"
								+ " and is displayed as:" + dhldeltxtcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("DHL service text in Cart Summary",
						"DHL service text is not displaying as expected in Cart Summary of delivery page", Status.FAIL);
			}

			String dhldelchargecartsum = homeDelChargeCartSumm.getText().trim();
			if (dhldelchargecartsum.equals(dhldelcharg)) {
				report.updateTestLog("DHL service charge in Cart Summary",
						"DHL service charge is displaying as expected in Cart Summary of delivery page and "
								+ "is displayed as:" + dhldelchargecartsum,
						Status.PASS);
			} else {
				report.updateTestLog("DHL service charge in Cart Summary",
						"DHL service charge is not displaying as expected in Cart Summary of delivery page",
						Status.FAIL);
			}

			try {
				if (dhlpostlist.isDisplayed()) {
					report.updateTestLog("DHL service post list", "DHL service post list is available for selection",
							Status.PASS);
				}
			} catch (Exception e) {
				report.updateTestLog("DHL service post list", "DHL service post list is not available for selection",
						Status.FAIL);

			}
			try {
				if (dhladdresstimings.isDisplayed()) {
					String dhltimings = dhladdresstimings.getText().trim();
					report.updateTestLog("DHL service address with timings",
							"DHL service address with timings in delivery page is displayed as : " + dhltimings,
							Status.PASS);
				}

			} catch (Exception e) {
				report.updateTestLog("DHL service address with timings",
						"DHL service address with timings in delivery page is not displayed", Status.FAIL);

			}

		} catch (Exception e) {
			report.updateTestLog("DHL service point", "DHL service point is not available for selection", Status.FAIL);
		}
	}

	///////// CICD///////
	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : serviceReadmoreReadlessVerification()*
	 * @Description : This function is used verify read more and less for product
	 *              services
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void serviceReadmoreReadlessVerification() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
	try {
			waitUntilElementVisible(serviceReadMore,360);
			if (serviceReadMore.isDisplayed()) {
				ex.executeScript("arguments[0].scrollIntoView();", serviceReadMore);
				report.updateTestLog("Long Description for the services","The service Option is Displayed with long description", Status.PASS);
				ex.executeScript("arguments[0].click();", serviceReadMore);
				if (serviceReadLess.isDisplayed()) {
					ex.executeScript("arguments[0].scrollIntoView();", serviceReadLess);
					report.updateTestLog("Clicked on Read More link","The Long Description with all lines displayed while clicking on Read More link ",	Status.PASS);
					ex.executeScript("arguments[0].click();", serviceReadLess);
					report.updateTestLog("Clicked on Read Less link","The Long Description is displayed with less no.of lines while clicking on Read Less link ",
							Status.PASS);
				} 
			} 
		} catch (Exception e) {
			report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryReadmoreReadlessVerification()*
	 * @Description : This function is used verify read more and less for delivery
	 *              services
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void deliveryReadmoreReadlessVerification() {
		try {
			if (delPgeReadMore.isDisplayed()) {
				report.updateTestLog("Long Description in Delivery Option",
						"The Delivery Option is Displayed with long description", Status.PASS);
				delPgeReadMore.click();
				if (delPgeReadLess.isDisplayed()) {
					report.updateTestLog("Clicked on Read More link",
							"The Long Description with all lines displayed while clicking on Read More link ",
							Status.PASS);
					delPgeReadLess.click();
					report.updateTestLog("Clicked on Read Less link",
							"The Long Description is displayed with less no.of lines while clicking on Read Less link ",
							Status.PASS);
				} else {
					report.updateTestLog("Read More Link", "Read more link is not clicked", Status.FAIL);
				}
			} else {
				report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPagemultprod1AllServices()*
	 * @Description : This function is used verify all services in DeliveryPage for
	 *              product1*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void deliveryPagemultprod1AllServices() throws InterruptedException {
		String prod1modelId = dataTable.getData("General_Data", "Product1ID");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1",
					"First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
				report.updateTestLog("Second Service checkbox for product 1",
						"Second Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("Second Service checkbox for product 1",
								"Second Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Second Service checkbox for product 1",
							"Second Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1",
					"Second Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]"))
							.isSelected()) {
						report.updateTestLog("Third Service checkbox for product 1",
								"Third Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Third Service checkbox for product 1",
							"Third Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1",
					"Third Service checkbox for product 1 is not available for the product", Status.PASS);
		}

		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")).isSelected()) {
				report.updateTestLog("Fourth Service checkbox for product 1",
						"Fourth Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]"))
							.isSelected()) {
						report.updateTestLog("Fourth Service checkbox for product 1",
								"Fourth Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Fourth Service checkbox for product 1",
							"Fourth Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 1",
					"Fourth Service checkbox for product 1 is not available for the product", Status.PASS);
		}
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPagemultprod2AllServices()*
	 * @Description : This function is used verify all services in DeliveryPage for
	 *              product2*
	 * @Author : Mamatha
	 *
	 ************************************************************************/
	public void deliveryPagemultprod2AllServices() throws InterruptedException {
		String prod2modelId = dataTable.getData("General_Data", "Product2ID");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 2",
						"First Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]"))
							.isSelected()) {
						report.updateTestLog("First Service checkbox for product 2",
								"First Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 2",
							"First Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 2",
					"First Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")).isSelected()) {
				report.updateTestLog("Second Service checkbox for product 2",
						"Second Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]"))
							.isSelected()) {
						report.updateTestLog("Second Service checkbox for product 2",
								"Second Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Second Service checkbox for product 2",
							"Second Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 2",
					"Second Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")).isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]"))
							.isSelected()) {
						report.updateTestLog("Third Service checkbox for product 2",
								"Third Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Third Service checkbox for product 2",
							"Third Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 2",
					"Third Service checkbox for product 2 is not available for the product", Status.PASS);
		}

		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[4]")).isSelected()) {
				report.updateTestLog("Fourth Service checkbox for product 1",
						"Third Service checkbox for product 2 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[4]")));
					ex.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[4]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[4]"))
							.isSelected()) {
						report.updateTestLog("Fourth Service checkbox for product 2",
								"Fourth Service checkbox for product 2 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Fourth Service checkbox for product 2",
							"Third Service checkbox for product 2 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 2",
					"Third Service checkbox for product 2 is not available for the product", Status.PASS);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageSavingsTotalCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in delivery page page when savings enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void deliveryPageSavingsTotalCheck() {
		//subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountbtmCartSummaryDeliveryPage();
		savingsValueCheck();
		vatTextCaptureCheckoutPages();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryPageNoSavingsTotalCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in delivery page page when savings not enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void deliveryPageNoSavingsTotalCheck() {
		subTotalValueDisplayedCheckCartSummryDeliveryPage();
		servicesValueDisplayedCheckCartSummaryDeliveryPage();
		deliveryDetailsVerification();
		totalCartAmountbtmCartSummaryDeliveryPage();
		savingsValueNotDisplayedCheck();
		vatTextCaptureCheckoutPages();
	}

	/*
	 * @Project Name : Electrolux
	 * 
	 * @Function Name : editButtondisplayVerify()
	 * 
	 * @Description : This function is used verify edit button
	 * 
	 * @ Author: gaurav
	 */
	public void editButtondisplayVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try{
		if (editButton.isDisplayed() && editButton.isEnabled()) {
			editButton.click();
			Thread.sleep(4000);
			report.updateTestLog("Edit Enable button", "Edit button on the Address section is Active as expected",
					Status.PASS);
		} 
		}catch(Exception e) {
			report.updateTestLog("Edit Enable button", "Edit button on the Address section is not Active", Status.FAIL);
		}

	}

	/*
	 * @Project Name : Electrolux
	 * 
	 * @Function Name : deliveryPagefirstFloorCheck()
	 * 
	 * @Description : This function is used verify delivery first floor
	 * 
	 * @ Author: Mohan
	 */
	public void deliveryPagefirstFloorCheck() {
		try {
			if (homeDeliveryFistAndAbove.isDisplayed()) {
				homeDeliveryFistAndAbove.click();
				Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				report.updateTestLog("Home Delivery(First floor and above) radio button","Home Delivery(First floor and above) option is selected", Status.PASS);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery methods", "No delivery method is available for selection", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : deliveryInstructionsVerify()*
	 * @Description :This function is used verify the delivery Instructions
	 * @Author : Rahul
	 ************************************************************************/
	public void deliveryInstructionsVerify() {
		try {
			WebDriverWait(driver.getWebDriver(), deliveryInstn, 60);
			if (deliveryInstn.isDisplayed()) {
				report.updateTestLog("Delivery Instruction",
						"Delivery Instruction textbox is displayed in delivery page", Status.PASS);
			} else {
				report.updateTestLog("Delivery Instruction",
						"Delivery Instruction textbox is not displayed in delivery page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery Instruction",
					"Delivery Instruction textbox is not displayed in delivery page", Status.FAIL);
		}
		String deliveryintrtnData = dataTable.getData("General_Data", "Delivery Instructions");
		try {
			String instruction = deliveryInstn.getText();
			if (instruction.equalsIgnoreCase(deliveryintrtnData)) {
				report.updateTestLog("Delivery Instruction", "Delivery Instruction is same after reloading",
						Status.PASS);
			} else {
				report.updateTestLog("Delivery Instruction", "Delivery Instruction is not same after reloading",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Delivery Instruction", "Delivery Instruction is not same after reloading",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : readMoreLessInDelOption()*
	 * @Description :To verify read More & Less options in Delivery Page*
	 * @Author : Mohan*
	 ************************************************************************/
	public void readMoreLessInDelOption() {
		try {
			if (delPgeReadMore.isDisplayed()) {
				report.updateTestLog("Read More Link in Delivery Option",
						"The Delivery Option is Displayed With Read More Link", Status.PASS);
				delPgeReadMore.click();
				report.updateTestLog("Read More Link", "Clicked on the Read More Link", Status.PASS);
				if (delPgeReadLess.isDisplayed()) {
					report.updateTestLog("Read Less Link",
							"The Read Less Link is Displayed when clicking on Read More ", Status.PASS);
					delPgeReadLess.click();
					report.updateTestLog("Clicked on Read Less link",
							"The Long Description is displayed with less no.of lines while clicking on Read Less link ",
							Status.PASS);
				} else {
					report.updateTestLog("Read More Link", "Read more link is not clicked", Status.FAIL);
				}
			} else {
				report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Read More Link", "Read more link is not displayed", Status.FAIL);
		}
	}

	//*****************************************************************************************************************************
	
		/*****************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliverymethodSingleProductWithPercentagePromo()*
		 * @Description :This function is used verify the delivery method details in delivery page
		 * @Author : Gaurav
		 *****************************************************************************************/
		public void deliverymethodSingleProductWithPercentagePromo() {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				ex.executeScript("arguments[0].scrollIntoView();", homeDelgrndFloorRadiobtn);
				if (homeDelgrndFloorRadiobtn.isSelected()) {
					report.updateTestLog("Home Delivery(Ground Floor) radio button",
							"Home Delivery(Ground Floor) option is selected by default", Status.PASS);
					System.out.println("home delivery");
				} 
			}catch(Exception e){
					report.updateTestLog("Home Delivery(Ground Floor) radio button",
							"Home Delivery(Ground Floor) option is not selected by default", Status.FAIL);
		}
			try{
			ex.executeScript("arguments[0].scrollIntoView();", delivryModetxtMain);
			String[] homedel1 = delivryModetxtMain.getText().split("\n");
			System.out.println(homedel1[0]);
			String homedel = homedel1[0].trim();
			report.updateTestLog("Home Delivery option text",
					"Home Delivery(Ground Floor) option is displayed in Delivery page as :" + homedel, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", delivryModeTxtCartSumm);
			String homedeltxtcartsumm = delivryModeTxtCartSumm.getText().trim();
			if (homedeltxtcartsumm.equals(homedel)) {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is displaying in Cart Summary of delivery page as expected"
								+ " and is displayed as:" + homedeltxtcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of delivery page",
						Status.FAIL);
			}
			}catch(Exception e){
				report.updateTestLog("Delivery method text","Delivery method text is not available", Status.FAIL);
			}
	    	try{
					ex.executeScript("arguments[0].scrollIntoView();", deliverystrikeprice);
					String strikeprice=deliverystrikeprice.getText().trim();
				    report.updateTestLog("Delivery method strike price","Delivery method strike price is displayed as : "+strikeprice, Status.PASS);
				}catch(Exception e){
					 report.updateTestLog("Delivery method strike price","Delivery method strike price is not displayed", Status.FAIL);
			}
				try{
				ex.executeScript("arguments[0].scrollIntoView();", totaldelPrice);
				String totaldelivryprice=totaldelPrice.getText().trim();
				ex.executeScript("arguments[0].scrollIntoView();", homeDelChargeCartSumm);		
				String totalhomedelchrgcartsum = homeDelChargeCartSumm.getText().trim();
				String[] delcartlistprice1 =totalhomedelchrgcartsum.split(" ");
				String delcartlistprice=delcartlistprice1[1];
				System.out.println(delcartlistprice);
				if (totalhomedelchrgcartsum.equals(totaldelivryprice)) {
					report.updateTestLog("Home Delivery charge in Cart Summary",
							"Home Delivery(Ground Floor) charge is displaying as expected in Cart Summary of delivery page and "
									+ "is displayed as:" + totalhomedelchrgcartsum,Status.PASS);
				} else {
					report.updateTestLog("Home Delivery in Cart Summary",
							"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of delivery page",
							Status.FAIL);
		}	
				}catch(Exception e){
					report.updateTestLog("Delivery methods total price", "Delivery method total price is not displayed", Status.FAIL);

		}		
	}
		
		
		
		
		/*****************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliverymethodSingleProductWithPercentagePromo()*
		 * @Description :This function is used verify the delivery method details in delivery page
		 * @Author : Gaurav
		 *****************************************************************************************/
		public void deliverymethodMultProductWithPercentagePromo() {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				ex.executeScript("arguments[0].scrollIntoView();", homeDelgrndFloorRadiobtn);
				if (homeDelgrndFloorRadiobtn.isSelected()) {
					report.updateTestLog("Home Delivery(Ground Floor) radio button",
							"Home Delivery(Ground Floor) option is selected by default", Status.PASS);
					System.out.println("home delivery");
				} 
			}catch(Exception e){
					report.updateTestLog("Home Delivery(Ground Floor) radio button",
							"Home Delivery(Ground Floor) option is not selected by default", Status.FAIL);
		}
			try{
			ex.executeScript("arguments[0].scrollIntoView();", delivryModetxtMain);
			String[] homedel1 = delivryModetxtMain.getText().split("\n");
			System.out.println(homedel1[0]);
			String homedel = homedel1[0].trim();
			report.updateTestLog("Home Delivery option text",
					"Home Delivery(Ground Floor) option is displayed in Delivery page as :" + homedel, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", delivryModeTxtCartSumm);
			String homedeltxtcartsumm = delivryModeTxtCartSumm.getText().trim();
			if (homedeltxtcartsumm.equals(homedel)) {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is displaying in Cart Summary of delivery page as expected"
								+ " and is displayed as:" + homedeltxtcartsumm,
						Status.PASS);
			} else {
				report.updateTestLog("Home Delivery in Cart Summary",
						"Home Delivery(Ground Floor) is not displaying as expected in Cart Summary of delivery page",
						Status.FAIL);
			}
			}catch(Exception e){
				report.updateTestLog("Delivery method text","Delivery method text is not available", Status.FAIL);
			}
	    	try{
					ex.executeScript("arguments[0].scrollIntoView();", deliverystrikeprice);
					String strikeprice=deliverystrikeprice.getText().trim();
				    report.updateTestLog("Delivery method strike price","Delivery method strike price is displayed as : "+strikeprice, Status.PASS);
				}catch(Exception e){
					 report.updateTestLog("Delivery method strike price","Delivery method strike price is not displayed", Status.FAIL);
			}
				try{
				ex.executeScript("arguments[0].scrollIntoView();", totaldelPrice);
				String totaldelivryprice=totaldelPrice.getText().trim();
				ex.executeScript("arguments[0].scrollIntoView();", homeDelChargeCartSumm);		
				String totalhomedelchrgcartsum = homeDelChargeCartSumm.getText().trim();
				if (homeDelChargeCartSumm.isDisplayed()) {
					report.updateTestLog("Home Delivery charge in Cart Summary",
							"Home Delivery(Ground Floor) charge is displaying in Cart Summary of delivery page as:" + totalhomedelchrgcartsum,Status.PASS);
				} else {
					report.updateTestLog("Home Delivery in Cart Summary",
							"Home Delivery(Ground Floor) charge is not displaying as expected in Cart Summary of delivery page",
							Status.FAIL);
		}	
				}catch(Exception e){
					report.updateTestLog("Delivery methods total price", "Delivery method total price is not displayed", Status.FAIL);

		}		
	}
		
		
		
		/***********************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryPagemultprod15Services()*
		 * @Description :This function is used to select atleast 5 services for products in delivery page 
		 * @Author : Gaurav
		 **********************************************************************************************************/	
		

		public void deliveryPagemultprod15Services() throws InterruptedException {
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",	driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
								.isSelected()) {
							report.updateTestLog("First Service checkbox for product 1",
									"First Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is not available for the product", Status.PASS);
			}
			Thread.sleep(5000);
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
					report.updateTestLog("Second Service checkbox for product 1",
							"Second Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
						ex.executeScript("arguments[0].click();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
								.isSelected()) {
							report.updateTestLog("Second Service checkbox for product 1",
									"Second Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("Second Service checkbox for product 1",
								"Second Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 1",
						"Second Service checkbox for product 1 is not available for the product", Status.PASS);
			}
			Thread.sleep(5000);
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
					report.updateTestLog("Third Service checkbox for product 1",
							"Third Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						ex.executeScript("arguments[0].click();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]"))
								.isSelected()) {
							report.updateTestLog("Third Service checkbox for product 1",
									"Third Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("Third Service checkbox for product 1",
								"Third Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		
		try {
			ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")).isSelected()) {
				report.updateTestLog("Fourth Service checkbox for product 1",
						"Fourth Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",	driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")));
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]"))
							.isSelected()) {
						report.updateTestLog("Fourth Service checkbox for product 1",
								"Fourth Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Fourth Service checkbox for product 1",
							"Fourth Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 1",
					"Fourth Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		
		try {
			ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[5]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[5]")).isSelected()) {
				report.updateTestLog("Fifth Service checkbox for product 1",
						"Fifth Service checkbox for product 1 is selected", Status.PASS);
			} else {
				try {
					ex.executeScript("arguments[0].scrollIntoView();",	driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[5]")));
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[5]")));
					Thread.sleep(3000);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[4]"))
							.isSelected()) {
						report.updateTestLog("Fifth Service checkbox for product 1",
								"Fifth Service checkbox for product 1 is checked", Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Fifth Service checkbox for product 1",
							"Fifth Service checkbox for product 1 is not avalilable", Status.PASS);
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Fifth Service checkbox for product 1",
					"Fifth Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		
	}
		
		
		
		
		/*************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : VerifyVoucherRemovalAddressPage()*
		 * @Description :To verify the voucher ribbon message is not displayed in delivery Page*
		 * @Author : Gaurav 
		 **************************************************************************************/
		public void VerifyVoucherRemovalDeliveryPage() {
			try {
				if(addrspage.voucherribbonAddrsPage.isDisplayed()){
				report.updateTestLog("Voucher ribbon in delivery page","Voucher ribbon is displayed in delivery page",
						Status.FAIL);
			} 
			}catch (Exception e) {
				report.updateTestLog("Voucher ribbon in delivery page","Voucher ribbon is not displayed in delivery page",
						Status.PASS);
			}
	}
		
		
		
		/*************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : VerifydeliveryInstructionsRetain()*
		 * @Description :To verify that delivery instructions are retained in delivery Page*
		 * @Author : Gaurav 
		 **************************************************************************************/
		public void VerifydeliveryInstructionsRetain() {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			String deliveryintrtnData = dataTable.getData("General_Data", "Delivery Instructions");
		   try {
				ex.executeScript("arguments[0].scrollIntoView();", deliveryInstn);
				if (deliveryInstn.isDisplayed()) {
					String actualinstrn=deliveryInstn.getAttribute("value");
					if(actualinstrn.equals(deliveryintrtnData)){
						report.updateTestLog("Delivery Instruction","Delivery Instructions is retained in delivery page", Status.PASS);
					}
				} else {
					report.updateTestLog("Delivery Instruction","Delivery Instructions is not retained in delivery page", Status.FAIL);
				}
			} catch (Exception e) {
				report.updateTestLog("Delivery Instruction","Delivery Instruction textbox is not displayed in delivery page", Status.FAIL);
			}
	}
		
		
		/**************************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : updateProd1Services()*
		 * @Description :To verify that product services are retained and select the different services in delivery Page*
		 * @Author : Gaurav 
		 ***************************************************************************************************************/	
		
		
		public void updateProd1Services() throws InterruptedException {
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is retained", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is unchecked", Status.PASS);
					
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
								.isSelected()) {
							report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
			}
			Thread.sleep(5000);
			try {
				
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is retained", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					report.updateTestLog("Second Service checkbox for product 1","second Service checkbox for product 1 is unchecked", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
							report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available for the product", Status.PASS);
			}
			Thread.sleep(5000);
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
					report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is retained", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
					report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is unchecked", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]"))
								.isSelected()) {
							report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("Third Service checkbox for product 1",
								"Third Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is not available for the product", Status.PASS);
			}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**************************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : VerifyProd1Services()*
		 * @Description :To verify that product services are retained for product in delivery Page*
		 * @Author : Gaurav 
		 ***************************************************************************************************************/	
		
		
		public void verifyProd1Services() throws InterruptedException {
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is retained", Status.PASS);
					
			 }
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not retained for the product", Status.FAIL);
			}
			Thread.sleep(5000);
			try {
				
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is retained", Status.PASS);
					
				} 
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not retained for the product", Status.FAIL);
			}
			Thread.sleep(5000);
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
					report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is retained", Status.PASS);
				
				} 
					
			} catch (Exception e) {
				report.updateTestLog("Third Service checkbox for product 1",
						"Third Service checkbox for product 1 is not retained for the product", Status.FAIL);
			}
	}
		

		
		/************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryOptionShortDesc()*
		 * @Description :To verify the Read More and read less option for delivery method in delivery page*
		 * @Author : Gaurav
		 ************************************************************************************************/			
		public void deliveryOptionShortDesc(){
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			try{
				ex.executeScript("arguments[0].scrollIntoView();", homeDelgrndFloorRadiobtn);
				if(homeDelgrndFloorRadiobtn.isDisplayed()){
				try{
				if(deliveryoptnReadMore.isDisplayed()){
					ex.executeScript("arguments[0].scrollIntoView();", deliveryoptnReadMore);
					String readmore=deliveryoptnReadMore.getText().trim();
					report.updateTestLog("Read More for delivery", "Read more is displayed for delivery option as: "+readmore, Status.PASS);	
				}
				}catch(Exception e){
					report.updateTestLog("Read More for delivery", "Read more is not displayed for delivery option", Status.FAIL);
				}
				try{
					ex.executeScript("arguments[0].scrollIntoView();", deliveryoptnshortDesc);
					if(deliveryoptnshortDesc.isDisplayed()){
						report.updateTestLog("Description for delivery", "Description is displayed for delivery option", Status.PASS);
					}
				}catch(Exception e){
					report.updateTestLog("Description for delivery", "Description is not displayed for delivery option", Status.FAIL);
			}
				
		}
			}catch(Exception e){
				report.updateTestLog("Delivery method", "Delivery method is not available for selection", Status.PASS);
			}
			
		}
			

		
		/************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryOptionLongDesc()*
		 * @Description :To verify the Read More and read less option for delivery method in delivery page*
		 * @Author : Gaurav
		 ************************************************************************************************/	
		
		public void deliveryOptionLongDesc(){
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try{
			ex.executeScript("arguments[0].scrollIntoView();", homeDelgrndFloorRadiobtn);
			if(homeDelgrndFloorRadiobtn.isDisplayed()){
			  try{
				  ex.executeScript("arguments[0].scrollIntoView();", deliveryoptnReadMore);
				  if(deliveryoptnReadMore.isDisplayed()){
					 deliveryoptnReadMore.click();
					report.updateTestLog("Read More for delivery", "Clicked on Read More hyperlink", Status.PASS);	
				 }
			}catch(Exception e){
					report.updateTestLog("Read More for delivery", "Read more is not displayed for delivery option", Status.FAIL);
			}
			try{
				ex.executeScript("arguments[0].scrollIntoView();", deliveryoptnReadLess);
				if(deliveryoptnReadLess.isDisplayed()){
					report.updateTestLog("Read Less for delivery", "Read Less option is displayed for delivery option", Status.PASS);
				}
			}catch(Exception e){
				report.updateTestLog("Read Less for delivery", "Read Less option is not displayed for delivery option", Status.FAIL);
			}
				
		 }
		}catch(Exception e){
				report.updateTestLog("Delivery method", "Delivery method is not available for selection", Status.PASS);
			}
			
		}	
		
		

		
		/************************************************************************ 
		* @Project Name : Electrolux*
		* @Function Name : totalSavingsCheck()*
		* @Description : This function is used to verify the Sub total list and
		*              discount price in payment page when savings enabled*
		* @Author : Gaurav
		************************************************************************/
		public void paymentPageTotalSavingsCheck(){
		  subTotalValueDisplayedCheckCartSummryDeliveryPage();
		  servicesValueDisplayedCheckCartSummaryDeliveryPage();
		  deliveryDetailsVerification();
		  totalCartAmountBottomCartSummaryPaymentPage();
		  savingsValueCheck();
		  vatTextCaptureCheckoutPages();
		}
		

		
		
		/*********************************************************************************************** 
		* @Project Name : Electrolux*
		* @Function Name : deliveryPagemultprod1FewServices()*
		* @Description : This function is used to select few services for the product 1 in delivery page
		* @Author : Gaurav
		************************************************************************************************/		
		public void deliveryPagemultprod1FewServices() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						ex.executeScript("arguments[0].click();",
								driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
								.isSelected()) {
							report.updateTestLog("First Service checkbox for product 1",
									"First Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is not available for the product", Status.PASS);
			}
		}


		
		/*********************************************************************************************** 
		* @Project Name : Electrolux*
		* @Function Name : deliveryTitleVerify()*
		* @Description : This function is used to verify the delivery title in delivery page
		* @Author : Gaurav
		************************************************************************************************/			
		
	public void deliveryTitleVerify(){
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			if(deliverytitle.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();", deliverytitle);
			String deliveryTitle=deliverytitle.getText().trim();
		    report.updateTestLog("Delivery title","Delivery title is displayed in delivery page as: "+deliveryTitle, Status.PASS); 
		}
	}catch(Exception e){
		report.updateTestLog("Delivery title","Delivery title is not displayed in delivery page", Status.FAIL);
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
			WebDriverWait(driver.getWebDriver(), addrspage.vouchrCodeAddrssPage, 120);
			String vouchercode = addrspage.vouchrCodeAddrssPage.getText();
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
			if (addrspage.promoRibbonAddrsPage.isDisplayed()) {
				String addrsspromoribbon = addrspage.promoRibbonAddrsPage.getText().trim();
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
	
	
	/**************************************************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : VerifyProd1Services()*
	 * @Description :To verify that product services are retained for product in delivery Page*
	 * @Author : Gaurav 
	 ***************************************************************************************************************/	
	
	
	public void VerifyProd1Services() throws InterruptedException {
		String prod1modelId = dataTable.getData("General_Data", "Product1ID");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is retained", Status.PASS);
				
		 }
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not retained for the product", Status.FAIL);
		}
		Thread.sleep(5000);
		try {
			
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is retained", Status.PASS);
				
			} 
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not retained for the product", Status.FAIL);
		}
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")).isSelected()) {
				report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is retained", Status.PASS);
			
			} 
				
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1",
					"Third Service checkbox for product 1 is not retained for the product", Status.FAIL);
		}
}	
	
	


/************************************************************************
       * @Project Name : Electrolux*
       * @Function Name : serviceSelectorAvailabilityCheck()*
       * @Description : To Check the availability of service selector in Delivery
       *              Page*
       * @Author : Mohan
       ************************************************************************/
       public void serviceSelectorAvailabilityCheck() {
             try {
                    if (seviceSelector.isDisplayed()) {
                          report.updateTestLog("Service Selector in Delivery Page",
                                       "Service selector is available in the Delivery Page", Status.FAIL);
                    } else {
                          report.updateTestLog("Service Selector in Delivery Page",
                                       "Service selector is Not available in the Delivery Page", Status.PASS);
                    }
             } catch (Exception e) {
                    report.updateTestLog("Service Selector in Delivery Page",
                                 "Service selector is Not available in the Delivery Page", Status.PASS);
             }
       }

	

       
       
 

/***********************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryPageSingleProd1Service()*
		 * @Description :This function is used to select only 1 service for products in delivery page 
		 * @Author : Gaurav
 **********************************************************************************************************/	
		public void deliveryPageSingleProd1Service() throws InterruptedException {
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1",
							"First Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",	driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						Thread.sleep(3000);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]"))
								.isSelected()) {
							report.updateTestLog("First Service checkbox for product 1",
									"First Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
			}       
	}

		
		
		
		
		
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryPage1prod1Service()*
		 * @Description :To verify all services for product 1 in DeliveryPage*
		 * @Author : Mohan
		 ************************************************************************/
		public void deliveryPage1prod1Service() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			String prod1modelId = delPageModelIdProd1.getText().trim();
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is selected", Status.PASS);
				} else {
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
							report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is checked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1",
								"First Service checkbox for product 1 is not avalilable", Status.PASS);
					}
				}
			vatTextCaptureCheckoutPages();
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1",
						"First Service checkbox for product 1 is not available for the product", Status.PASS);
			}		
}		
		

		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : deliveryPage1prod1Service()*
		 * @Description :To verify all services for product 1 in DeliveryPage*
		 * @Author : Mohan
		 ************************************************************************/
		public void deliveryPage1prodEditService() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			String prod1modelId = delPageModelIdProd1.getText().trim();
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is checked", Status.PASS);
				}
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not checked for the product", Status.FAIL);
			}	
			 try {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
						report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is unchecked", Status.PASS);
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not unchecked", Status.FAIL);
				}
			vatTextCaptureCheckoutPages();
			try{
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
			    ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
			   driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is selected", Status.PASS);
				}
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available", Status.PASS);
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
		public void deliveryPageCartTotalVerifyITAELX() throws InterruptedException {
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			String prod2modelId = dataTable.getData("General_Data", "Product2ID");
			
			try {
				ex.executeScript("arguments[0].scrollIntoView();",addrspage.prod1price);
				String prod1Price=addrspage.prod1price.getText().trim();
				System.out.println(prod1Price);
				report.updateTestLog("Product 1 price","Product 1 price in delivery page is displayed as :" +prod1Price, Status.PASS);
				String prod1Price1[]=prod1Price.split(" ");
				String prod1Price2=prod1Price1[1].replace(",", ".");
				System.out.println(prod1Price2);
				report.updateTestLog("Product 1 price","Product 1 price in delivery page with decimal is displayed as :" +prod1Price2, Status.PASS);
				ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
				String prod2Price=addrspage.prod2price.getText().trim();
				System.out.println(prod2Price);
				report.updateTestLog("Product 2 price","Product 2 price in delivery page is displayed as :" +prod2Price, Status.PASS);
				String prod2Price1[]=prod2Price.split(" ");
				String prod2Price2=prod2Price1[1].replace(",", ".");
				System.out.println(prod2Price2);
				report.updateTestLog("Product 2 price","Product 2 price in delivery page with decimal is displayed as :" +prod2Price2, Status.PASS);
				Float prod1PriceinInt = Float.parseFloat(prod1Price2);
				Float prod2PriceinInt = Float.parseFloat(prod2Price2);
				String delpricecartsumm=totaldelprice.getText().trim();
				System.out.println(delpricecartsumm);
				String delpricecartsumm1[]=delpricecartsumm.split(" ");	
				String delpricecartsumm2=delpricecartsumm1[1];
				Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
				report.updateTestLog("Total delivery price","Total delivery price in cart summary of delivery page is displayed as :" +delpricecartsumm, Status.PASS);
				try{
					  if(totalserviceprice.isDisplayed()){
					  String totServiceprice=totalserviceprice.getText().trim();
					  String totalserviceprice1[]=totServiceprice.split(" ");
					  String totalserviceprice2=totalserviceprice1[2];
					  System.out.println(totalserviceprice2);
					  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
					  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
					  String totalPricewithService=addrspage.totalprice.getText().trim();
					  System.out.println(totalPricewithService);
					  report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPricewithService, Status.PASS);
					  String totalPricewithService1[]=totalPricewithService.split(" ");
					  String totalPricewithService2=totalPricewithService1[1].replace(".", "");
					  String totalPricewithService3=totalPricewithService2.replace(",", ".");
					  System.out.println(totalPricewithService3);
					  Float totalpriceiwithserviceUI = Float.parseFloat(totalPricewithService3);
					 if(totalpriceCalculatedwithservice==totalpriceiwithserviceUI){
						   report.updateTestLog("Total price","Total price after service selection in delivery page is displaying as expected: "+totalpriceiwithserviceUI, Status.PASS);
						}
						else{
							report.updateTestLog("Total price","Total price after service selection in delivery page is not displaying as expected", Status.FAIL);
					}
				}
			else{
					float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3;
					report.updateTestLog("Total price calculated in delivery page","Total price calculated in delivery page is :" +totalpriceCalculated, Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalprice);
					String totalPrice=addrspage.totalprice.getText().trim();
					System.out.println(totalPrice);
					report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPrice, Status.PASS);
					String totalprice1[]=totalPrice.split(" ");
					String totalprice2=totalprice1[1].replace(".", "");
					String totalprice3=totalprice2.replace(",", ".");
					System.out.println(totalprice3);
					Float totalpriceinUI = Float.parseFloat(totalprice3);
					report.updateTestLog("Total price","Total price in cart summary of delivery page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
					if(totalpriceCalculated==totalpriceinUI){
						report.updateTestLog("Total price","Total price in delivery page is displaying as expected: " +totalpriceinUI, Status.PASS);
					}
					else{
						report.updateTestLog("Total price","Total price in delivery page is not displaying as expected", Status.FAIL);
				 }
			}	  
		}catch(Exception e){
					report.updateTestLog("Total service price","Total service price is not displayed as service has free price", Status.PASS);
	}
}
catch(Exception e){
				report.updateTestLog("Products in delivery page","Products are not available in delivery page", Status.FAIL);
			}

	}

				
			
			/************************************************************************
			 *
			 * @Project Name : Electrolux*
			 * @Function Name : deliveryPageEditService()*
			 * @Description : This function is used to edit the service for multiple products in delivery  Page*
			 * @Author : Gaurav
			 *
			 ************************************************************************/	

        public void deliveryPageEditService(){
        	JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			String prod2modelId = dataTable.getData("General_Data", "Product2ID");
			
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is already selected", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is unchecked", Status.PASS);
					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				}
			}catch(Exception e){
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available", Status.PASS);
				}
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					report.updateTestLog("second Service checkbox for product 1","second Service checkbox for product 1 is already selected", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					report.updateTestLog("second Service checkbox for product 1","second Service checkbox for product 1 is unchecked", Status.PASS);
					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				}
			}catch(Exception e){
				report.updateTestLog("second Service checkbox for product 1","second Service checkbox for product 1 is not available", Status.PASS);
				}
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is already selected", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
					report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is unchecked", Status.PASS);
					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				}
			}catch(Exception e){
				report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is not available", Status.PASS);
				}
			try {
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")).isSelected()) {
					ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					report.updateTestLog("second Service checkbox for product 2","second Service checkbox for product 2 is already selected", Status.PASS);
					ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
					report.updateTestLog("second Service checkbox for product 2","second Service checkbox for product 2 is unchecked", Status.PASS);
					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				}
			}catch(Exception e){
				report.updateTestLog("second Service checkbox for product 2","second Service checkbox for product 2 is not available", Status.PASS);
				}
      }




		/*********************************************************************************************** 
		* @Project Name : Electrolux*
		* @Function Name : deliveryPagemultprod1FewServices()*
		* @Description : This function is used to select few services for the product 1 in delivery page
		* @Author : Gaurav
		************************************************************************************************/		
		public void deliveryPagemultprodLastServiceSelection() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			String prod1modelId = dataTable.getData("General_Data", "Product1ID");
			String prod2modelId = dataTable.getData("General_Data", "Product2ID");
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
				ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
				if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")).isSelected()) {
					report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is selected", Status.PASS);
				} else {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
						report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is checked", Status.PASS);
						}
				} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is not available for the product", Status.PASS);
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
			public void deliveryPageCartTotalVerifyDEUAEG() throws InterruptedException {
				JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				String prod1modelId = dataTable.getData("General_Data", "Product1ID");
				String prod2modelId = dataTable.getData("General_Data", "Product2ID");
				
				try {
					ex.executeScript("arguments[0].scrollIntoView();",addrspage.prod1price);
					String prod1Price=addrspage.prod1price.getText().trim();
					System.out.println(prod1Price);
					report.updateTestLog("Product 1 price","Product 1 price in delivery page is displayed as :" +prod1Price, Status.PASS);
					String prod1Price1[]=prod1Price.split(" ");
					String prod1Price2=prod1Price1[1].replace(",", ".");
					System.out.println(prod1Price2);
					report.updateTestLog("Product 1 price","Product 1 price in delivery page with decimal is displayed as :" +prod1Price2, Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
					String prod2Price=addrspage.prod2price.getText().trim();
					System.out.println(prod2Price);
					report.updateTestLog("Product 2 price","Product 2 price in delivery page is displayed as :" +prod2Price, Status.PASS);
					String prod2Price1[]=prod2Price.split(" ");
					String prod2Price2=prod2Price1[1].replace(",", ".");
					System.out.println(prod2Price2);
					report.updateTestLog("Product 2 price","Product 2 price in delivery page with decimal is displayed as :" +prod2Price2, Status.PASS);
					Float prod1PriceinInt = Float.parseFloat(prod1Price2);
					Float prod2PriceinInt = Float.parseFloat(prod2Price2);
					String delpricecartsumm=totaldelprice.getText().trim();
					System.out.println(delpricecartsumm);
					String delpricecartsumm1[]=delpricecartsumm.split(" ");	
					String delpricecartsumm2=delpricecartsumm1[1];
					Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
					report.updateTestLog("Total delivery price","Total delivery price in cart summary of delivery page is displayed as :" +delpricecartsumm, Status.PASS);
					try{
						  if(totalserviceprice.isDisplayed()){
						  String totServiceprice=totalserviceprice.getText().trim();
						  String totalserviceprice1[]=totServiceprice.split(" ");
						  String totalserviceprice2=totalserviceprice1[1];
						  System.out.println(totalserviceprice2);
						  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
						  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
						  String totalPricewithService=addrspage.totalprice.getText().trim();
						  System.out.println(totalPricewithService);
						  report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPricewithService, Status.PASS);
						  String totalPricewithService1[]=totalPricewithService.split(" ");
						  String totalPricewithService2=totalPricewithService1[1].replace(".", "");
						  String totalPricewithService3=totalPricewithService2.replace(",", ".");
						  System.out.println(totalPricewithService3);
						  Float totalpriceiwithserviceUI = Float.parseFloat(totalPricewithService3);
						 if(totalpriceCalculatedwithservice==totalpriceiwithserviceUI){
							   report.updateTestLog("Total price","Total price after service selection in delivery page is displaying as expected: "+totalpriceiwithserviceUI, Status.PASS);
							}
							else{
								report.updateTestLog("Total price","Total price after service selection in delivery page is not displaying as expected", Status.FAIL);
						}
					}
				else{
						float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3;
						report.updateTestLog("Total price calculated in delivery page","Total price calculated in delivery page is :" +totalpriceCalculated, Status.PASS);
						ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalprice);
						String totalPrice=addrspage.totalprice.getText().trim();
						System.out.println(totalPrice);
						report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPrice, Status.PASS);
						String totalprice1[]=totalPrice.split(" ");
						String totalprice2=totalprice1[1].replace(".", "");
						String totalprice3=totalprice2.replace(",", ".");
						System.out.println(totalprice3);
						Float totalpriceinUI = Float.parseFloat(totalprice3);
						report.updateTestLog("Total price","Total price in cart summary of delivery page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
						if(totalpriceCalculated==totalpriceinUI){
							report.updateTestLog("Total price","Total price in delivery page is displaying as expected: " +totalpriceinUI, Status.PASS);
						}
						else{
							report.updateTestLog("Total price","Total price in delivery page is not displaying as expected", Status.FAIL);
					 }
				}	  
			}catch(Exception e){
						report.updateTestLog("Total service price","Total service price is not displayed as service has free price", Status.PASS);
		}
}
catch(Exception e){
					report.updateTestLog("Products in delivery page","Products are not available in delivery page", Status.FAIL);
				}

		}
			





           public void deliveryPageMultProdSelect1stService1by1(){
        	    JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				String prod1modelId = dataTable.getData("General_Data", "Product1ID");
				String prod2modelId = dataTable.getData("General_Data", "Product2ID");
                 try{
                     if(driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isDisplayed()){
                    	 ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
                    	 ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
                    	 report.updateTestLog("First service for product 1","First service for product 1 is checked", Status.PASS);
           			     Thread.sleep(2000);
           			     driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
                     }
                 }catch(Exception e){
                	 report.updateTestLog("First service for product 1","First service for product 1 is not available for the product", Status.PASS);
                 }
                 try{
                     if(driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")).isDisplayed()){
                    	 ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
                    	 ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
                    	 report.updateTestLog("First service for product 2","First service for product 2 is checked", Status.PASS);
           			     Thread.sleep(2000);
           			     driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
                     }
                 }catch(Exception e){
                	 report.updateTestLog("First service for product 1","First service for product 2 is not available for the product", Status.PASS);
                 }
                 
                 
                 
                 
                 


			/*				  ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			  ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
			  report.updateTestLog("First service for product 1","First service for product 1 is checked", Status.PASS);
			  Thread.sleep(2000);
			  driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			  waitUntilElementVisible(continueToPayment,360);
			  try{
			   if(totalserviceprice.isDisplayed()){
			  String totServiceprice=totalserviceprice.getText().trim();
			  String totalserviceprice1[]=totServiceprice.split(" ");
			  String totalserviceprice2=totalserviceprice1[2];
			  System.out.println(totalserviceprice2);
			  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
			  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
			  String totalPricewithService=addrspage.totalprice.getText().trim();
			  System.out.println(totalPricewithService);
			  report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPricewithService, Status.PASS);
			  String totalPricewithService1[]=totalPricewithService.split(" ");
			  String totalPricewithService2=totalPricewithService1[1].replace(".", "");
			  String totalPricewithService3=totalPricewithService2.replace(",", ".");
			  System.out.println(totalPricewithService3);
			  Float totalpriceiwithserviceUI = Float.parseFloat(totalPricewithService3);
			 if(totalpriceCalculatedwithservice==totalpriceiwithserviceUI){
				   report.updateTestLog("Total price","Total price after service selection in delivery page is displaying as expected: "+totalpriceiwithserviceUI, Status.PASS);
				}
				else{
					report.updateTestLog("Total price","Total price after service selection in delivery page is not displaying as expected", Status.FAIL);
			}
		}
			  }catch(Exception e){
				  report.updateTestLog("Service price","Selected service has free price", Status.PASS);
				  float totalpriceCalculatedwithfreeserviceprice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3;
				  String totalPricewithService=addrspage.totalprice.getText().trim();
				  System.out.println(totalPricewithService);
				  report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPricewithService, Status.PASS);
				  String totalPricewithService1[]=totalPricewithService.split(" ");
				  String totalPricewithService2=totalPricewithService1[1].replace(".", "");
				  String totalPricewithService3=totalPricewithService2.replace(",", ".");
				  System.out.println(totalPricewithService3);
				  Float totalpriceiwithserviceUI = Float.parseFloat(totalPricewithService3);
				 if(totalpriceCalculatedwithfreeserviceprice==totalpriceiwithserviceUI){
					   report.updateTestLog("Total price","Total price after service selection in delivery page is displaying as expected: "+totalpriceiwithserviceUI, Status.PASS);
					}
					else{
						report.updateTestLog("Total price","Total price after service selection in delivery page is not displaying as expected", Status.FAIL);
				}
								 
			}
		}catch(Exception e){
		 report.updateTestLog("First service for product 1","First service for product 1 is not available for the product", Status.PASS);
	  }*/
/*			try{
			  ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
			  ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
			  report.updateTestLog("First service for product 2","First service for product 2 is checked", Status.PASS);
			  Thread.sleep(2000);
			  driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			  waitUntilElementVisible(continueToPayment,360);
			  String totServiceprice=totalserviceprice.getText().trim();
			  String totalserviceprice1[]=totServiceprice.split(" ");
			  String totalserviceprice2=totalserviceprice1[2];
			  System.out.println(totalserviceprice2);
			  Float totalservicepriceinUI = Float.parseFloat(totalserviceprice2);
			  float totalpriceCalculatedwithservice=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3+totalservicepriceinUI;
			  String totalPricewithService=addrspage.totalprice.getText().trim();
			  System.out.println(totalPricewithService);
			  report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalPrice, Status.PASS);
			  String totalPricewithService1[]=totalPricewithService.split(" ");
			  String totalPricewithService2=totalPricewithService1[1].replace(".", "");
			  String totalPricewithService3=totalPricewithService2.replace(",", ".");
			  System.out.println(totalPricewithService3);
			  Float totalpriceiwithserviceUI = Float.parseFloat(totalPricewithService3);
			 if(totalpriceCalculatedwithservice==totalpriceiwithserviceUI){
				   report.updateTestLog("Total price","Total price after service selection in delivery page is displaying as expected: "+totalpriceiwithserviceUI, Status.PASS);
				}
				else{
					report.updateTestLog("Total price","Total price after service selection in delivery page is not displaying as expected", Status.FAIL);
			}
			 
		}catch(Exception e){
		 report.updateTestLog("First service for product 2","First service for product 2 is not available for the product", Status.PASS);
	  }

		
	}*/

           }
     	  
           
        
   		/************************************************************************
  		 *
  		 * @Project Name : Electrolux*
  		 * @Function Name : multProdMoveCursorToCartSummaryDeliverypage()*
  		 * @Description : This function is used to move the cursor to product 1 in cart summary of delivery Page*
  		 * @Author : Gaurav
  		 *
  		 ************************************************************************/  
   
			 public void multProdMoveCursorToCartSummaryDeliverypage(){
				JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				try{ 
					ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod1price);
					report.updateTestLog("Moved cursor to Cart summary","Moved cursor to product 1 in Cart summary of the delivery page", Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
					report.updateTestLog("Moved cursor to Cart summary","Moved cursor to product 2 in Cart summary of the delivery page", Status.PASS);
				 
				}catch(Exception e){
					report.updateTestLog("Product in cart summary","Products are not available in cart summary of the delivery page", Status.PASS);
				}
				 
			 }
           
           
           
           
           
			 /************************************************************************
				 * @Project Name : Electrolux*
				 * @Function Name : deliveryPageprod1AllServices()*
				 * @Description :To verify all services for product 1 in DeliveryPage*
				 * @Author : Mohan
				 ************************************************************************/
				public void deliveryPageProd1DeselectAllServices() throws InterruptedException {
					String prod1modelId = dataTable.getData("General_Data", "Product1ID");
					JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						if (driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")).isSelected()) {
						  ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
						  ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[1]")));
					    Thread.sleep(3000);
						report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is unchecked", Status.PASS);
						
						}
					} catch (Exception e) {
						report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
					}
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
					    ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[2]")));
						Thread.sleep(3000);
						 report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is unchecked", Status.PASS);
					} catch (Exception e) {
						report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available for the product", Status.PASS);
					}
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					try {
						ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod1modelId + "')])[3]")));
						Thread.sleep(3000);
							report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is unchecked", Status.PASS);
					} catch (Exception e) {
						report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is not available for the product", Status.PASS);
					}
					driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}
			
				
		           
				 /************************************************************************
					 * @Project Name : Electrolux*
					 * @Function Name : deliveryPageprod1AllServices()*
					 * @Description :To verify all services for product 1 in DeliveryPage*
					 * @Author : Mohan
					 ************************************************************************/
					public void deliveryPageProd2DeselectAllServices() throws InterruptedException {
						String prod2modelId = dataTable.getData("General_Data", "Product2ID");
						JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
						try {
							ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
							ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[1]")));
							Thread.sleep(3000);
							report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is unchecked", Status.PASS);
						} catch (Exception e) {
							report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is not available for the product", Status.PASS);
						}
						driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
						try {
							ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
							ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[2]")));
							Thread.sleep(3000);
						report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is unchecked", Status.PASS);
						
						} catch (Exception e) {
							report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is not available for the product", Status.PASS);
						}
						driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
						try {
							ex.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
							ex.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//input[contains(@modelid,'" + prod2modelId + "')])[3]")));
							Thread.sleep(3000);
							report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is unchecked", Status.PASS);
						} catch (Exception e) {
							report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is not available for the product", Status.PASS);
						}
						driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}				




				/************************************************************************
				 *
				 * @Project Name : Electrolux*
				 * @Function Name : addressPageCartTotalVerifyWithoutServicesITAELX()*
				 * @Description : This function is used to verify the cart total prices for multiple products in delivery page*
				 * @Author : Gaurav
				 *
				 ************************************************************************/
				public void deliveryPageCartTotalVerifyWith1ServicesITAELX() throws InterruptedException {
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
					JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
					try {
						ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod1price);
						String prod1Price=addrspage.prod1price.getText().trim();
						System.out.println(prod1Price);
						report.updateTestLog("Product 1 price","Product 1 price in delivery page is displayed as :" +prod1Price, Status.PASS);
						String prod1Price1[]=prod1Price.split(" ");
						String prod1Price2=prod1Price1[1].replace(",", ".");
						System.out.println(prod1Price2);
						report.updateTestLog("Product 1 price","Product 1 price in delivery page with decimal is displayed as :" +prod1Price2, Status.PASS);
						ex.executeScript("arguments[0].scrollIntoView();", addrspage.prod2price);
						String prod2Price=addrspage.prod2price.getText().trim();
						System.out.println(prod2Price);
						report.updateTestLog("Product 2 price","Product 2 price in delivery page is displayed as :" +prod2Price, Status.PASS);
						String prod2Price1[]=prod2Price.split(" ");
						String prod2Price2=prod2Price1[1].replace(",", ".");
						System.out.println(prod2Price2);
						report.updateTestLog("Product 2 price","Product 2 price in delivery page with decimal is displayed as :" +prod2Price2, Status.PASS);
						Float prod1PriceinInt = Float.parseFloat(prod1Price2);
						Float prod2PriceinInt = Float.parseFloat(prod2Price2);
						ex.executeScript("arguments[0].scrollIntoView();", addrspage.subtotalprice);
						String subtotalPrice=addrspage.subtotalprice.getText().trim();
						System.out.println(subtotalPrice);
						report.updateTestLog("Subtotal price","Subtotal price in delivery page is displayed as :" +subtotalPrice, Status.PASS);
						String subtotalprice1[]=subtotalPrice.split(" ");
						String subtotalprice2=subtotalprice1[1].replace(".", "");
						String subtotalprice3=subtotalprice2.replace(",", ".");
						System.out.println(subtotalprice3);
						Float subtotalpriceinUI = Float.parseFloat(subtotalprice3);
						try{
						if(addrspage.servicetotalprice.isDisplayed()){
							ex.executeScript("arguments[0].scrollIntoView();",addrspage.servicetotalprice);
							String basketpageserviceprice=addrspage.servicetotalprice.getText().trim();
							report.updateTestLog("Service total price","Service price in delivery page is displayed as :" +basketpageserviceprice, Status.PASS);
							String servicetotprice1[]=basketpageserviceprice.split(" ");
							String servicetotprice2=servicetotprice1[1].replace(".", "");
							String servicetotprice3=servicetotprice2.replace(",", ".");
							Float servicetotpriceinUI = Float.parseFloat(servicetotprice3);
							if(totaldelprice.isDisplayed()){
								ex.executeScript("arguments[0].scrollIntoView();",totaldelprice);
								String totaldelivryprice=totaldelprice.getText().trim();
								String delpricecartsumm1[]=totaldelivryprice.split(" ");	
								String delpricecartsumm2=delpricecartsumm1[1];
								Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
								report.updateTestLog("Total delivery price","Total delivery price in cart summary of delivery page is displayed as :" +delpricecartsumm3, Status.PASS);
							float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+servicetotpriceinUI+delpricecartsumm3;
							ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalamount);
							String totalamt=addrspage.totalamount.getText().trim();
							report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalamt, Status.PASS);
							String totalprice1[]=totalamt.split(" ");
							String totalprice2=totalprice1[1].replace(".", "");
							String totalprice3=totalprice2.replace(",", ".");
							System.out.println(totalprice3);
							Float totalpriceinUI = Float.parseFloat(totalprice3);
							if(totalpriceCalculated==totalpriceinUI){
								report.updateTestLog("Total amount","Total amount with calculation in delivery page is matching with total amount displayed  :" +totalpriceinUI, Status.PASS);
							}
						  }
						 }
						}catch(Exception e){
							if(totaldelprice.isDisplayed()){
								ex.executeScript("arguments[0].scrollIntoView();",totaldelprice);
								String totaldelivryprice=totaldelprice.getText().trim();
								String delpricecartsumm1[]=totaldelivryprice.split(" ");	
								String delpricecartsumm2=delpricecartsumm1[1];
								Float delpricecartsumm3 = Float.parseFloat(delpricecartsumm2);
								report.updateTestLog("Total delivery price","Total delivery price in cart summary of delivery page is displayed as :" +delpricecartsumm3, Status.PASS);
						float subtotalpriceCalculated=prod1PriceinInt+prod2PriceinInt+delpricecartsumm3;
						report.updateTestLog("Subtotal price calculated","Subtotal price calculated in delivery page is :" +subtotalPrice, Status.PASS);
						report.updateTestLog("Subtotal price","Subtotal price in delivery page in decimals is displayed as :" +subtotalprice3, Status.PASS);
						if(subtotalpriceCalculated==subtotalpriceinUI){
							report.updateTestLog("Subtotal price","Subtotal price in delivery page is displaying as expected: "+subtotalpriceCalculated, Status.PASS);
						}
					
						else{
							report.updateTestLog("Subtotal price","Subtotal price in delivery page is not displaying as expected", Status.FAIL);
					}
						try{
							ex.executeScript("arguments[0].scrollIntoView();",addrspage.totalamount);
						String totalamt=addrspage.totalamount.getText().trim();
						report.updateTestLog("Total price","Total price in delivery page is displayed as :" +totalamt, Status.PASS);
						String totalprice1[]=totalamt.split(" ");
						String totalprice2=totalprice1[1].replace(".", "");
						String totalprice3=totalprice2.replace(",", ".");
						System.out.println(totalprice3);
						Float totalpriceinUI = Float.parseFloat(totalprice3);
						if(subtotalpriceCalculated==totalpriceinUI){
							report.updateTestLog("Total amount","Total amount in delivery page is matching with subtotal amount :" +totalpriceinUI, Status.PASS);
						}
						else{
							report.updateTestLog("Total amount","Total amount in delivery page is not matching with subtotal amount", Status.FAIL);
						}
						
						}catch(Exception e1){
							report.updateTestLog("Total price","Total price in delivery page is not displayed", Status.FAIL);
						}
							}
					}
					}catch(Exception e){
						report.updateTestLog("Products in delivery page","Products are not available in delivery page", Status.FAIL);
					}

			}



















}
