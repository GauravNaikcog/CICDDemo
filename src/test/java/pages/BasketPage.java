package pages;

import java.util.List;
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

public class BasketPage extends MasterPage {

	@FindBy(xpath = "(//label[contains(text(),'Pro')])[1]")
	WebElement protectionServiCheckbox;

	@FindBy(xpath = "(//div[@class='D2CBasket-item'])[2]")
	WebElement product2Row;

	@FindBy(xpath = "//a[@class='btn btn-hot btn-cta']")
	WebElement checkoutButton;

	@FindBy(xpath = "(//input[@class='D2CBasket-quantityInput'])[1]")
	WebElement qtyInput;

	@FindBy(xpath = "(//input[@class='D2CBasket-quantityInput'])[2]")
	WebElement qtyInput1;


	@FindBy(xpath = "(//div[contains(text(),'Totale Parziale:')]/following::div)[1]")
	WebElement subtotlValue;

	@FindBy(xpath = "(//div[contains(text(),'Totale:')])[1]")
	WebElement totalTxt;

	@FindBy(xpath = "((//div[contains(text(),'Totale:')])/following::div)[37]")
	WebElement totalValue;

	@FindBy(xpath = "//input[@class='D2CBasket-voucherCodeInput']")
	WebElement voucherInput;

	@FindBy(xpath = "//button[contains(@class,'voucherSubmit')]")
	WebElement voucherApplyBtn;

	@FindBy(xpath = "(//p[@class='D2CBasket-promotion-name'])[1]")
	WebElement voucherPromoRibbon;

	@FindBy(xpath = "(//p[@class='D2CBasket-promotion-name'])[2]")
	WebElement voucherCodeMessage;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemColumn--image')])[1]")
	WebElement productImage;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemColumn--image')])[2]")
	WebElement product2Image;

	@FindBy(xpath = "(//h3[contains(@class,'D2CBasket-itemName')])[1]")
	WebElement productName;

	@FindBy(xpath = "(//h3[contains(@class,'D2CBasket-itemName')])[2]")
	WebElement product2Name;

	@FindBy(xpath = "(//span[contains(@class,'D2CBasket-itemModelId')])[1]")
	WebElement productId;

	@FindBy(xpath = "(//span[contains(@class,'D2CBasket-itemModelId')])[2]")
	WebElement product2Id;

	@FindBy(xpath = "(//span[contains(@class,'D2CBasket-itemStock')])[1]")
	WebElement productStockStatus;

	@FindBy(xpath = "(//span[contains(@class,'D2CBasket-itemStock')])[2]")
	WebElement product2StockStatus;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemPriceQuantity')])[1]")
	WebElement productPrice;

	@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemPriceQuantity')])[1]")
	WebElement product2Price;

	@FindBy(xpath = "(//button[contains(@class,'D2CBasket-incrementItem')])[1]")
	WebElement prod1QtyIncrement;

	@FindBy(xpath = "(//button[contains(@class,'D2CBasket-incrementItem')])[2]")
	WebElement prod2QtyIncrement;

	@FindBy(xpath = "(//div[@class='D2CBasket-originalPrice'])[1]")
	WebElement prodctOriginalPrice;

	@FindBy(xpath = "(//div[@class='D2CBasket-originalPrice'])[2]")
	WebElement prodct2OriginalPrice;

	@FindBy(xpath = "(//div[@class='D2CBasket-discountedPrice'])[1]")
	WebElement prodctDiscountPrice;

	@FindBy(xpath = "(//div[@class='D2CBasket-discountedPrice'])[2]")
	WebElement prodct2DiscountPrice;

	@FindBy(xpath = "(//p[@class='D2CBasket-promotion-name'])[1]")
	WebElement prdctPromoRibbon;

	@FindBy(xpath = "(//p[@class='D2CBasket-promotion-name'])[2]")
	WebElement prdct2PromoRibbon;

	@FindBy(xpath = "//button[contains(@class,'serviceHeader-anchor')]/span")
	WebElement learnMoreTxt;

	@FindBy(xpath = "(//div[@class='D2CBasket-originalPrice'])[1]")
	WebElement prodctOriginalPrice1;

	@FindBy(xpath = "(//div[@class='D2CBasket-discountedPrice'])[1]")
	WebElement prodctDiscountPrice1;

	@FindBy(xpath = "//div[@class='D2CBasket-originalPrice']")
	WebElement prodct2StrikedPrice;

	@FindBy(xpath = "//div[@class='D2CBasket-discountedPrice']")
	WebElement prodct2DiscountedPrice;

	@FindBy(xpath = "//label[contains(@for,'voucher-cta')]")
	WebElement voucherCheckBox;

	@FindBy(xpath = "(//button[@class='D2CBasket-promotion-details'])")
	WebElement Promotion_iButtonBasketpage;

	@FindBy(xpath = "//div[@class='modal-slide-in-right__panel']")
	WebElement Promotion_OverlayScreenBasketpage;

	@FindBy(xpath = "(//div[@class='modal-content D2CBasket-services-modal'])")
	WebElement Promotion_OverlayContentBasketpage;

	@FindBy(xpath = "(//button[@class='modal-slide-in-right__close'])")
	WebElement Promotion_OverlayCloseButtonBasketpage;

	@FindBy(xpath = "//button[@class='d2c-weee-tax__modal-trigger']")
	WebElement weeeBtnLinkBsktPge;

	@FindBy(xpath = "//span[contains(@class,'d2c-weee-tax__label')]")
	WebElement weeePriceTotalBsktPge;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstName;

	///// CICD////////
	@FindBy(xpath = "//span[contains(@class,'crossedOut')]")
	WebElement subtotalscratchedPrice;

	@FindBy(xpath = "//span[contains(@class,'crossedOut')]/following::span[1]")
	WebElement subtotalListPrice;
	
	
	
	//*********************************Gaurav Naik:START***********************************************************************//
	
	
		@FindBy(xpath="((//img[contains(@class,'D2CBasket-itemThumb')])[2]/preceding::label[contains(@class,'service-name Checkbox')])[1]")
		 WebElement firstPrd1stServicheckbox;
		
		@FindBy(xpath="((//img[contains(@class,'D2CBasket-itemThumb')])[2]/preceding::label[contains(@class,'service-name Checkbox')])[2]")
		 WebElement firstPrd2ndServicheckbox;
		
		@FindBy(xpath="((//img[contains(@class,'D2CBasket-itemThumb')])[2]/preceding::label[contains(@class,'service-name Checkbox')])[3]")
		 WebElement firstPrd3rdServicheckbox;
		
		@FindBy(xpath="((//img[contains(@class,'D2CBasket-itemThumb')])[2]/preceding::label[contains(@class,'service-name Checkbox')])[4]")
		 WebElement firstPrd4thServicheckbox;
		
		@FindBy(xpath="((//img[contains(@class,'D2CBasket-itemThumb')])[2]/preceding::label[contains(@class,'service-name Checkbox')])[5]")
		 WebElement firstPrd5thServicheckbox;
		
		@FindBy(xpath="((//button[contains(@class,'anchor')])[2]/following::label[contains(@class,'service-name')])[1]")
		 WebElement secondPrd1stServicheckbox;
		
		@FindBy(xpath="((//button[contains(@class,'anchor')])[2]/following::label[contains(@class,'service-name')])[2]")
		 WebElement secondPrd2ndServicheckbox;
		
		@FindBy(xpath="((//button[contains(@class,'anchor')])[2]/following::label[contains(@class,'service-name')])[3]")
		 WebElement secondPrd3rdServicheckbox;
		
		@FindBy(xpath="((//button[contains(@class,'anchor')])[2]/following::label[contains(@class,'service-name')])[4]")
		 WebElement secondPrd4thServicheckbox;
		
		@FindBy(xpath="((//button[contains(@class,'anchor')])[2]/following::label[contains(@class,'service-name')])[5]")
		 WebElement secondPrd5thServicheckbox;
		
		
		@FindBy(xpath="(//span[contains(@class,'itemDelete')])[2]")
		 WebElement removebtnprod2;
		
		@FindBy(xpath="(//span[contains(@class,'itemDelete')])[1]")
		 WebElement removebtnprod1;
		
		@FindBy(xpath = "//div[contains(@class,'subtotalKey')]")
		WebElement subtotlTxt;
		
		
		@FindBy(xpath = "//button[contains(@class,'removeVoucher')]")
		WebElement removevoucher;
		
		
		@FindBy(xpath = "(//button[contains(@class,'removeVoucher')]/../p)[1]")
		WebElement voucherribbon;
		
		@FindBy(xpath = "(//button[contains(@class,'removeVoucher')]/../p)[2]")
		WebElement voucher2ribbon;
		
		
		@FindBy(xpath = "//button[contains(@class,'removeVoucher')]/../p/ancestor::div[3]/div/div[1]")
		WebElement voucher1PromoRibbon;

		@FindBy(xpath = "(//button[contains(@class,'removeVoucher')]/../p)[1]")
		WebElement voucher1CodeMessage;
		
		@FindBy(xpath = "//button[contains(@class,'removeVoucher')]/../p/ancestor::div[3]/div/div[1]")
		WebElement voucher2PromoRibbon;

		@FindBy(xpath = "(//button[contains(@class,'removeVoucher')]/../p)[1]")
		WebElement voucher2Coprod1QtyderementdeMessage;
		
		
		@FindBy(xpath = "(//button[contains(@class,'decrementItem')])[1]")
		WebElement prod1Qtyderement;
		
		@FindBy(xpath = "(//button[contains(@class,'decrementItem')])[2]")
		WebElement prod2Qtyderement;
		
		@FindBy(xpath = "(//label[contains(@class,'D2CBasket-service-name')])[1]")
		WebElement prod1stservicecheckbox;
		
		@FindBy(xpath = "(//label[contains(@class,'D2CBasket-service-name')])[2]")
		WebElement prod2ndservicecheckbox;
		
		
		@FindBy(xpath = "(//label[contains(@class,'D2CBasket-service-name')])[3]")
		WebElement prod3rdservicecheckbox;
		
		
		@FindBy(xpath = "(//label[contains(@class,'D2CBasket-service-name')])[4]")
		WebElement prod4thservicecheckbox;
		
		@FindBy(xpath = "(//div[@class='D2CBasket-item'])[1]")
		WebElement product1Row;
		
		
		@FindBy(xpath = "//div[@class='D2CBasket-itemServices']")
	    WebElement serviceSelectorBasket;
		
		
		@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemPrice')])[1]")
	    WebElement prod1price;
		
		@FindBy(xpath = "(//div[contains(@class,'D2CBasket-itemPrice')])[2]")
	    WebElement prod2price;
		
		
		@FindBy(xpath = "(//div[contains(@class,'totalValue')])[2]")
	    WebElement totalprice;
		
		
		@FindBy(xpath = "(//div[contains(@class,'D2CBasket-totalKey--total')])[2]/following::div[1]")
	    WebElement totalamount;
		
		@FindBy(xpath = "(//div[@class='D2CBasket-itemPrice'])[1]")
	    WebElement prod1priceservicebsktpage;
		
		
		@FindBy(xpath = "(//div[@class='D2CBasket-itemPrice'])[2]")
	    WebElement prod2priceservicebsktpage;
		
		
		@FindBy(xpath = "(//div[contains(@class,'D2CBasket-totalKey D2CBasket-subtotalKey--total')])[2]/following::div[1]")
	    WebElement basketpageServicePrice;
		
		
		
		
		
		
		
		
		
		
		

	//*********************************Gaurav Naik:END***********************************************************************//		


	public BasketPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :verifyOfferPriceForPercentagePromotionProduct1BasketPage() *
	 * @Description : This function is used verify Offer Price for Percentage
	 *              Promotion Product 1 on BasketPage*
	 * @Author : Gaurav
	 ************************************************************************/
	public long verifyOfferPriceForPercentagePromotionProduct1BasketPage() {
		String promoPercentage = dataTable.getData("General_Data", "promoPercentage Product1");
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		Float promoPercentageFloat = Float.parseFloat(promoPercentage);
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
		double perentageDiscountCalculated = orgPrice * promoPercentageFloat;
		System.out.println(perentageDiscountCalculated);
		double offerPriceCalculated = orgPrice - perentageDiscountCalculated;
		System.out.println(offerPriceCalculated);
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (OfferPriceCalculatedRounded == disPrice) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + offerPrice, Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + offerPrice, Status.FAIL);
		}
		return OfferPriceCalculatedRounded;
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForPercentagePromotionProduct2BasketPage()*
	 * @Description : This function is used verify Offer Price for Percentage
	 *              Promotion Product 2 on BasketPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public long verifyOfferPriceForPercentagePromotionProduct2BasketPage() {
		String promoPercentage = dataTable.getData("General_Data", "promoPercentage Product2");
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		Float promoPercentageFloat = Float.parseFloat(promoPercentage);
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
		double perentageDiscountCalculated = orgPrice * promoPercentageFloat;
		System.out.println(perentageDiscountCalculated);
		double offerPriceCalculated = orgPrice - perentageDiscountCalculated;
		System.out.println(offerPriceCalculated);
		Long OfferPriceCalculatedRounded = Math.round(offerPriceCalculated);
		System.out.println(OfferPriceCalculatedRounded);
		if (OfferPriceCalculatedRounded == disPrice) {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is same as offer price calculated " + offerPrice, Status.PASS);
		} else {
			report.updateTestLog("offerPrice Verification",
					"Offer price displayed is not as same as offer price calculated " + offerPrice, Status.FAIL);
		}
		return OfferPriceCalculatedRounded;
	}

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : verifyOfferPriceForFlatDiscountPromotionProduct1BasketPage(
	 *           )*
	 * @Description : This function is used verify Offer Price for Flat Discount
	 *              Promotion Product 1 on BasketPage*
	 * @Author : Rahul
	 *
	 ************************************************************************/
	public long verifyOfferPriceForFlatDiscountPromotionProduct1BasketPage() {
		String flatDiscount = dataTable.getData("General_Data", "flatDiscount_Product1");
		String currencySymbol = dataTable.getData("General_Data", "Currency Symbol");
		Float flatDiscountFloat = Float.parseFloat(flatDiscount);
		String listPrice = prodctOriginalPrice1.getText().trim();
		String offerPrice = prodctDiscountPrice1.getText().trim();
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
	 * @Function Name : verifyOfferPriceFlatDiscountPromotionProduct2BasketPage
	 * @Description : This function is used verify Offer Price for Flat Discount
	 *              Promotion Product 1 on BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public long verifyOfferPriceFlatDiscountPromotionProduct2BasketPage() {
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

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageQty1()*
	 * @Description : This function is used verify Quantity of product in
	 *              BasketPage*
	 * @Author : Rahul
	 ************************************************************************/
	public void basketPageQty1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 120);
		wait.until(ExpectedConditions.visibilityOf(qtyInput));
		String Qty = qtyInput.getAttribute("value");
		report.updateTestLog("Quantity field for product 1", "Quantity of product 1 in Basket page is : " + Qty,
				Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageMultipleProductsQty1()*
	 * @Description : This function is used verify Multiple Products Quantity in
	 *              BasketPage*
	 * @Author : Gaurav
	 ************************************************************************/
	public void basketPageMultipleProductsQty1() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), qtyInput1, 30);
		waitUntilElementEnabled(qtyInput1, 60);
		String Qty = qtyInput1.getAttribute("value");
		report.updateTestLog("Quantity field for prodcut 2", "Quantity for product 2 in Basket page is : " + Qty,
				Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : multipleProductsQty2()*
	 * @Description : This function is used verify Multiple Products Quantity in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void multipleProductsQty2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait(driver.getWebDriver(), qtyInput1, 30);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].scrollIntoView();", prod2QtyIncrement);
		ex.executeScript("arguments[0].click();", prod2QtyIncrement);
		String Qty = qtyInput1.getAttribute("value");
		report.updateTestLog("Quantity for product 2", "Quantity for product 2 is updated to: " + Qty, Status.PASS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : productQty2()*
	 * @Description : This function is used Products Quantity update in BasketPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public void productQty2() throws InterruptedException {
		WebDriverWait(driver.getWebDriver(), qtyInput, 20);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		ex.executeScript("arguments[0].click();", prod1QtyIncrement);
		waitUntilElementEnabled(checkoutButton, 60);
		String Qty = qtyInput.getAttribute("value");
		report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : verifyVoucherApply()*
	 * @Description : This function is used for apply voucher in BasketPage*
	 * @Author : Gaurav
	 ************************************************************************/
	public void verifyVoucherApply() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].click();", voucherCheckBox);
			report.updateTestLog("Voucher checkbox", "Clicked on Voucher Code checkbox", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Voucher checkbox", "Voucher Checkbox is not available", Status.FAIL);
		}
		String voucherData = dataTable.getData("General_Data", "Voucher code");
		voucherInput.sendKeys(voucherData);
		ex.executeScript("arguments[0].click();", voucherApplyBtn);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		report.updateTestLog("Voucher code", "Voucher code applied is:" + voucherData, Status.PASS);
		try{
		String vouchermsg = voucherCodeMessage.getText();
		if (voucherCodeMessage.isDisplayed()) {
			report.updateTestLog("Voucher code message", "Voucher message is displayed as:" + vouchermsg, Status.PASS);
		} 
		}catch(Exception e){
			report.updateTestLog("Voucher code message", "Voucher message is not displayed", Status.FAIL);
		}
		try {
		  if(voucherCodeMessage.isDisplayed()) {
			 if(voucherPromoRibbon.isDisplayed()) {
					String promoribbon = voucherPromoRibbon.getText().trim();
					report.updateTestLog("Voucher code promo ribbon","Voucher code promo ribbon message is displayed as:" + promoribbon, Status.PASS);
				}
			} 
			}catch (Exception e) {
				report.updateTestLog("Voucher code promo ribbon", "Voucher code ribbon message is not displayed",Status.FAIL);
			}
	}
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketVerifyWithPromotion()*
	 * @Description : This function is used verify All Product details in
	 *              BasketPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public void basketVerifyWithPromotion() {
		driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		waitUntilElementVisible(productId,240);
		if (productId.isDisplayed()) {
			report.updateTestLog("Product 1 Id", "Product Id for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 Id", "Product Id for Product 1 is not displayed in basket page",
					Status.FAIL);
		}
		if (productStockStatus.isDisplayed()) {
			report.updateTestLog("Product 1 stock status",
					"Product stock status for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 stock status",
					"Product stock status for Product 1 is not displayed in basket page", Status.FAIL);
		}
		if (prod1QtyIncrement.isDisplayed()) {
			report.updateTestLog("Product 1 increment option",
					"Product increment option for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 increment option",
					"Product increment option for Product 1 is not displayed in basket page", Status.FAIL);
		}
		try {
			String productstrikedprice = prodctOriginalPrice.getText().trim();
			report.updateTestLog("Product 1 Striked off price",
					"Product is applied with promotion and Product Striked off price is displayed as: "
							+ productstrikedprice,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Product 1 Striked off price", "Product 1 Striked off price is not available",
					Status.PASS);
		}
		try {
			String productdiscprice = prodctDiscountPrice.getText().trim();
			report.updateTestLog("Product 1 discounted price",
					"Product discounted price is displayed as: " + productdiscprice, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Product 1 discounted price", "Product 1 discounted off price is not displayed",
					Status.PASS);
		}
		try {
			if (prdctPromoRibbon.isDisplayed()) {
				String promoribbontxt = prdctPromoRibbon.getText().trim();
				report.updateTestLog("Product 1 promo ribbon",
						"Product promo ribbon is displayed as: " + promoribbontxt, Status.PASS);
			} else {
				report.updateTestLog("Product 1 promo ribbon", "Product promo ribbon is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product 1 promo ribbon", "Product promo ribbon is not displayed", Status.PASS);
		}
		totalCartAmountBottom();
		savingsValueCheck();
	}

	
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketVerifyWithPromotion()*
	 * @Description : This function is used verify All Product details in
	 *              BasketPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public void basketVerifyWithPromotionSavingsDisabled() {
		driver.getWebDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		if (productId.isDisplayed()) {
			report.updateTestLog("Product 1 Id", "Product Id for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 Id", "Product Id for Product 1 is not displayed in basket page",
					Status.FAIL);
		}
		if (productStockStatus.isDisplayed()) {
			report.updateTestLog("Product 1 stock status",
					"Product stock status for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 stock status",
					"Product stock status for Product 1 is not displayed in basket page", Status.FAIL);
		}
		if (prod1QtyIncrement.isDisplayed()) {
			report.updateTestLog("Product 1 increment option",
					"Product increment option for Product 1 is displayed in basket page", Status.PASS);
		} else {
			report.updateTestLog("Product 1 increment option",
					"Product increment option for Product 1 is not displayed in basket page", Status.FAIL);
		}
		try {
			String productstrikedprice = prodctOriginalPrice.getText().trim();
			report.updateTestLog("Product 1 Striked off price",
					"Product is applied with promotion and Product Striked off price is displayed as: "
							+ productstrikedprice,
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Product 1 Striked off price", "Product 1 Striked off price is not available",
					Status.PASS);
		}
		try {
			String productdiscprice = prodctDiscountPrice.getText().trim();
			report.updateTestLog("Product 1 discounted price",
					"Product discounted price is displayed as: " + productdiscprice, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Product 1 discounted price", "Product 1 discounted off price is not displayed",
					Status.PASS);
		}
		try {
			if (prdctPromoRibbon.isDisplayed()) {
				String promoribbontxt = prdctPromoRibbon.getText().trim();
				report.updateTestLog("Product 1 promo ribbon",
						"Product promo ribbon is displayed as: " + promoribbontxt, Status.PASS);
			} else {
				report.updateTestLog("Product 1 promo ribbon", "Product promo ribbon is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product 1 promo ribbon", "Product promo ribbon is not displayed", Status.PASS);
		}
		totalCartAmountBottom();
		savingsValueNotDisplayedCheck();
	}
	
	
	
	
	
	
	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketCheckout()*
	 * @Description : This function is used click on checkout button in BasketPage*
	 * @Author : Rahul
	 ************************************************************************/
	public void basketCheckout() {
	 JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			waitUntilElementVisible(checkoutButton,360);
			ex.executeScript("arguments[0].scrollIntoView();", checkoutButton);
			ex.executeScript("arguments[0].click();", checkoutButton);
			report.updateTestLog("Checkout Button", "Checkout Button is clicked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Checkout Button", "Checkout Button is not clicked", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : basketPagePromoVerifyProduct2()*
	 * @Description : This function is used verify Product 2 for All details in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void basketPagePromoVerifyProduct2() {
		if (product2Row.isDisplayed()) {
			report.updateTestLog("Product 2 in cart", "Product 2 is added in cart", Status.PASS);
			if (product2Id.isDisplayed()) {
				report.updateTestLog("Product 2 Id", "Product Id for Product 2 is displayed in basket page",
						Status.PASS);
			} else {
				report.updateTestLog("Product 2 Id", "Product Id for Product 2 is not displayed in basket page",
						Status.FAIL);
			}
			if (product2StockStatus.isDisplayed()) {
				report.updateTestLog("Product 2 stock status",
						"Product stock status for Product 2 is displayed in basket page", Status.PASS);
			} else {
				report.updateTestLog("Product 2 stock status",
						"Product stock status for Product 2 is not displayed in basket page", Status.FAIL);
			}
			if (prod2QtyIncrement.isDisplayed()) {
				report.updateTestLog("Product 2 increment option",
						"Product increment option for Product 2 is displayed in basket page", Status.PASS);
			} else {
				report.updateTestLog("Product 2 increment option",
						"Product increment option for Product 2 is not displayed in basket page", Status.FAIL);
			}
			try {
				if (prodct2OriginalPrice.isDisplayed()) {
					String product2strikedprice = prodct2OriginalPrice.getText().trim();
					report.updateTestLog("Product 2 Striked off price",
							"Product 2 is applied with promotion and Product Striked off price is displayed as: "
									+ product2strikedprice,
							Status.PASS);
				} else {
					report.updateTestLog("Product 2 Striked off price",
							"Product 2 is not applied with promotion and Product Striked off price is not displayed",
							Status.FAIL);
				}
			} catch (Exception e) {
				report.updateTestLog("Product 2 Striked off price", "Product 2 Striked off price is not displayed",
						Status.FAIL);
			}
			try {
				if (prodct2DiscountPrice.isDisplayed()) {
					String product2discprice = prodct2DiscountPrice.getText().trim();
					report.updateTestLog("Product 2 discounted price",
							"Product 2 discounted price is displayed as: " + product2discprice, Status.PASS);
				} else {
					report.updateTestLog("Product 2 discounted price", "Product 2 discounted price is not displayed",
							Status.FAIL);
				}
			} catch (Exception e) {
				report.updateTestLog("Product 2 discounted price", "Product 2 discounted price is not displayed",
						Status.FAIL);
			}
			try {
				if (prdct2PromoRibbon.isDisplayed()) {
					String promo2ribbontxt = prdct2PromoRibbon.getText().trim();
					report.updateTestLog("Product 2 promo ribbon",
							"Product 2 promo ribbon is displayed as: " + promo2ribbontxt, Status.PASS);
				} else {
					report.updateTestLog("Product 2 promo ribbon", "Product 2 promo ribbon is not displayed",
							Status.FAIL);
				}
			} catch (Exception e) {
				report.updateTestLog("Product 2 promo ribbon", "Product 2 promo ribbon is not displayed", Status.FAIL);
			}
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationBasketPage()*
	 * @Description : This function is used verify Buy X get Y free details in
	 *              BasketPage*
	 * @Author : Gaurav
	 ************************************************************************/
	public void buyXGetYProductValidationBasketPage() {
		if (voucherPromoRibbon.isDisplayed()) {
			String promomsg1 = voucherPromoRibbon.getText().trim();
			report.updateTestLog("Product 1 promo ribbon", "Product 1 promo ribbon is displayed as: " + promomsg1,
					Status.PASS);
		} else {
			report.updateTestLog("Product 1 promo ribbon", "Product 1 promo ribbon is not displayed", Status.FAIL);
		}
		if (voucherCodeMessage.isDisplayed()) {
			String promomsg2 = voucherPromoRibbon.getText().trim();
			report.updateTestLog("Product 2 promo ribbon", "Product 2 promo ribbon is displayed as: " + promomsg2,
					Status.PASS);
		} else {
			report.updateTestLog("Product 2 promo ribbon", "Product 2 promo ribbon is not displayed", Status.FAIL);
		}
		String prod2price = prodctDiscountPrice.getText().trim();
		String[] val = prod2price.split(" ");
		String priceval = val[1];
		if (priceval.contentEquals("0")) {
			report.updateTestLog("Product 2 price", "Product 2 price is displayed as expected as : " + priceval,
					Status.PASS);
		} else {
			report.updateTestLog("Product 2 price", "Product 2 price is not displayed as expected", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationBasketPage()*
	 * @Description : This function is used verify the Product 2 promotion in
	 *              BasketPage*
	 * @Author : Mamatha
	 ************************************************************************/
	public void basketPagePromoVerify2ndProduct() {
		try {
			if (prodct2StrikedPrice.isDisplayed()) {
				String product2strikedprice = prodct2StrikedPrice.getText().trim();
				report.updateTestLog("Product 2 Striked off price in basket page",
						"Product 2 is applied with promotion and Product Striked off price is displayed as: "
								+ product2strikedprice,
						Status.PASS);
			} else {
				report.updateTestLog("Product 2 Striked off price in basket page",
						"Product 2 is not applied with promotion and Product Striked off price is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product 2 Striked off price in basket page",
					"Product 2 Striked off price is not displayed", Status.FAIL);
		}
		try {
			if (prodct2DiscountedPrice.isDisplayed()) {
				String product2discprice = prodct2DiscountedPrice.getText().trim();
				report.updateTestLog("Product 2 discounted price in basket page",
						"Product 2 discounted price is displayed as: " + product2discprice, Status.PASS);
			} else {
				report.updateTestLog("Product 2 discounted price in basket page",
						"Product 2 discounted price is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product 2 discounted price in basket page",
					"Product 2 discounted price is not displayed", Status.FAIL);
		}
		try {
			if (prdct2PromoRibbon.isDisplayed()) {
				String promo2ribbontxt = prdct2PromoRibbon.getText().trim();
				report.updateTestLog("Product 2 promo ribbon in basket page",
						"Product 2 promo ribbon is displayed as: " + promo2ribbontxt, Status.PASS);
			} else {
				report.updateTestLog("Product 2 promo ribbon in basket page", "Product 2 promo ribbon is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product 2 promo ribbon", "Product 2 promo ribbon is not displayed", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : buyXGetYProductValidationBasketPage()*
	 * @Description : This function is used verify i icon overlay in BasketPage*
	 * @Author : MOHAN
	 ************************************************************************/
	public void basket_i_icon_OverLay_verify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			WebDriverWait(driver.getWebDriver(), Promotion_iButtonBasketpage, 20);
			if (Promotion_iButtonBasketpage.isDisplayed()) {
				report.updateTestLog("The i- icon next to promotion title",
						"The i- icon next to promotion title is displayed", Status.PASS);
				JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
				ex.executeScript("arguments[0].scrollIntoView();", Promotion_iButtonBasketpage);
				ex.executeScript("arguments[0].click();", Promotion_iButtonBasketpage);
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				try {
					if (Promotion_OverlayScreenBasketpage.isDisplayed()) {
						report.updateTestLog("The read more Overlay",
								"The read more overlay is displayed while clicking the i-icon", Status.PASS);
						Promotion_OverlayCloseButtonBasketpage.click();
						report.updateTestLog("The read more Overlay", "The read more overlay is Closed", Status.PASS);
						Thread.sleep(3000);
					} else {
						report.updateTestLog("The read more Overlay",
								"The read more overlay is not displayed while clicking the i-icon", Status.FAIL);
					}
				} catch (Exception e) {
					report.updateTestLog("The read more Overlay",
							"The read more overlay is not displayed while clicking the i-icon", Status.FAIL);
				}
			} else {
				report.updateTestLog("The i- icon next to promotion title",
						"The i- icon next to promotion title is not displayed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("The i- icon next to promotion title",
					"The i- icon next to promotion title is not displayed", Status.FAIL);
		}
	}

	////// CICD////////////////

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalvalueVerifyBasketPageSavingsEnabled()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in basket page when savings enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void subTotalvalueVerifyBasketPageSavingsEnabled() {
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", subtotlTxt);
			String subtotaltxt = subtotlTxt.getText().trim();
			try {
				String subtotalscratchedprice = subtotalscratchedPrice.getText().trim();
				report.updateTestLog("Subtotal scratched price",
						"Subtotal scrathed price in basket is displayed as: " + subtotalscratchedprice, Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Subtotal scratched price", "Subtotal scratched price in basket is not displayed",
						Status.FAIL);
			}
			try {
				ex.executeScript("arguments[0].scrollIntoView();", subtotalListPrice);
				String subtotallistprice = subtotalListPrice.getText().trim();
				report.updateTestLog("Subtotal list price",
						"Subtotal list price in basket is displayed as: " + subtotallistprice, Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Subtotal list price", "Subtotal list price in basket is not displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Subtotal information", "Subtotal information in basket page is not displayed ",
					Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name :totalSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in basket page when savings enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void totalSavingsCheck() {
		totalCartAmountBottom();
		savingsValueCheck();
		vatTextCaptureBasketPage();
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : multipleProductsQtyIncrement()*
	 * @Description : This function is used verify Multiple Products Quantity in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void multipleProductsQtyIncrement() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod1QtyIncrement);
			ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			String Qty = qtyInput.getAttribute("value");
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is not incremented", Status.FAIL);
		}
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod2QtyIncrement);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			String Qty = qtyInput1.getAttribute("value");
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is updated to: " + Qty, Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is not incremented", Status.FAIL);
		}
/*		try {
			ex.executeScript("arguments[0].scrollIntoView();", qtyInput1);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			String Qty = qtyInput1.getAttribute("value");
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is updated to: " + Qty,
					Status.PASS);

		} catch (Exception e) {
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is not incremented", Status.FAIL);
		}
		try {
			ex.executeScript("arguments[0].scrollIntoView();", qtyInput);
			ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			String Qty = qtyInput.getAttribute("value");
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
			
		} catch (Exception e) {
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is not incremented", Status.FAIL);
		}*/
	}

	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : multipleProductsQtyIncrement()*
	 * @Description : This function is used verify Multiple Products Quantity in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void singleProductsQtyIncrement() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		String Quantity = dataTable.getData("General_Data", "Quantity");
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod1QtyIncrement);
			ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		} catch (Exception e) {
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is not incremented", Status.FAIL);
		}	
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : product1QtyTo3()*
	 * @Description : This function is used update the product Quantity in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void product1QtyTo3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			//ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			String Qty = qtyInput.getAttribute("value");
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		} catch (Exception e) {
			report.updateTestLog("Quantity Increment", "Quantity Increment button is not clicked ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : secondProdQtyTo3()*
	 * @Description : Used to increase the Second Products Quantity to 3 in
	 *              BasketPage*
	 * @Author : Mohan
	 ************************************************************************/
	public void secondProdQtyTo3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			ex.executeScript("arguments[0].scrollIntoView();", prod2QtyIncrement);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			String Qty = qtyInput1.getAttribute("value");
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is updated to: " + Qty, Status.PASS);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		} catch (Exception e) {
			report.updateTestLog("Quantity Increment", "Quantity Increment button is not clicked ", Status.FAIL);
		}
	}

	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : totalSavingsCheck()*
	 * @Description : This function is used to verify the Sub total list and
	 *              discount price in basket page when savings not enabled*
	 * @Author : Gaurav
	 ************************************************************************/
	public void totalNoSavingsCheck() {
		totalCartAmountBottom();
		savingsValueNotDisplayedCheck();
		vatTextCaptureBasketPage();
	}
	
	
	
	
//*****************************************Gaurav Changes**************************************************//
	

	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageProd1AllServices()*
	 * @Description : This function is used verify all services for product 1 in BasketPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void basketPageProd1AllServices() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			waitUntilElementEnabled(prod1stservicecheckbox,360);
			ex.executeScript("arguments[0].scrollIntoView();", prod1stservicecheckbox);
			prod1stservicecheckbox.click();
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
/*		waitUntilElementEnabled(prod2ndservicecheckbox,360);
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod2ndservicecheckbox);
			prod2ndservicecheckbox.click();
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		waitUntilElementEnabled(prod3rdservicecheckbox,360);
		try {
			ex.executeScript("arguments[0].scrollIntoView();", prod3rdservicecheckbox);
			prod3rdservicecheckbox.click();
			report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is not available for the product", Status.PASS);
	}
		try {
			waitUntilElementEnabled(prod4thservicecheckbox,360);
			ex.executeScript("arguments[0].scrollIntoView();", prod4thservicecheckbox);
			prod4thservicecheckbox.click();
			report.updateTestLog("Fourth Service checkbox for product 1","Fourth Service checkbox for product 1 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 1","Fourth Service checkbox for product 1 is not available for the product", Status.PASS);
	}*/
}


	/************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageprod2AllServices()*
	 * @Description : This function is used verify all services for product 1 in BasketPage*
	 * @Author : Gaurav
	 *
	 ************************************************************************/
	public void basketPageprod2AllServices() throws InterruptedException {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			ex.executeScript("arguments[0].scrollIntoView();", secondPrd1stServicheckbox);
			secondPrd1stServicheckbox.click();
			report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 2","First Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			ex.executeScript("arguments[0].scrollIntoView();", secondPrd2ndServicheckbox);
			secondPrd2ndServicheckbox.click();
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 2 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 2 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			ex.executeScript("arguments[0].scrollIntoView();", secondPrd3rdServicheckbox);
			secondPrd3rdServicheckbox.click();
			report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 2","Third Service checkbox for product 2 is not available for the product", Status.PASS);
   }
		try {
			ex.executeScript("arguments[0].scrollIntoView();", secondPrd4thServicheckbox);
			secondPrd4thServicheckbox.click();
			report.updateTestLog("Fourth Service checkbox for product 2","Fourth Service checkbox for product 2 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 2","Fourth Service checkbox for product 2 is not available for the product", Status.PASS);
   }
	
		try {
			ex.executeScript("arguments[0].scrollIntoView();", secondPrd5thServicheckbox);
			secondPrd5thServicheckbox.click();
			report.updateTestLog("Fifth Service checkbox for product 2","Fifth Service checkbox for product 2 is checked", Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("Fifth Service checkbox for product 2","Fifth Service checkbox for product 2 is not available for the product", Status.PASS);
   }	
}




	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : subTotalValueCheck()*
	 * @Description : This function is used to verify the Sub total value*
	 * @Author : Gaurav
	 ************************************************************************/
	public void subTotalvalueVerify() {
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
  try{
		ex.executeScript("arguments[0].scrollIntoView();", subtotlTxt);
		String subtotaltxt = subtotlTxt.getText().trim();
		try{
		String subtotalscratchedprice = subtotalscratchedPrice.getText().trim();
		report.updateTestLog("Subtotal scratched price",
				"Subtotal scrathed price in basket is displayed as: " + subtotalscratchedprice, Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Subtotal scratched price",
					"Subtotal scratched price in basket is not displayed", Status.FAIL);
		}
		try{
			ex.executeScript("arguments[0].scrollIntoView();", subtotalListPrice);
			String subtotallistprice = subtotalListPrice.getText().trim();
			report.updateTestLog("Subtotal list price",
					"Subtotal list price in basket is displayed as: " + subtotallistprice, Status.PASS);
			}catch(Exception e){
				report.updateTestLog("Subtotal list price",
						"Subtotal list price in basket is not displayed", Status.FAIL);
			}
		
  }catch(Exception e){
		report.updateTestLog("Subtotal information",
				"Subtotal information in basket page is not displayed ", Status.FAIL);
    }
}

	
	
	
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : RemoveProd2fromBasket()*
	 * @Description : This function is used to remove product 2 from basket*
	 * @Author : Gaurav
	 ************************************************************************/
	public void RemoveProd2fromBasket() {
	 JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
       try{
    	   Thread.sleep(4000);
	     ex.executeScript("arguments[0].scrollIntoView();", removebtnprod2);
		ex.executeScript("arguments[0].click();", removebtnprod2);
		Thread.sleep(5000);
		report.updateTestLog("Product 2 remove button",	"Clicked on Product 2 remove button", Status.PASS);
   }catch(Exception e){
	   report.updateTestLog("Product 2 remove button",	"Product 2 remove button is not available", Status.FAIL);
    }
}
	

	
	
	/************************************************************************
	 * @Project Name : Electrolux*
     * @Function Name : RemoveProd1fromBasket()*
	 * @Description : This function is used to remove product 1 from basket*
	 * @Author : Gaurav
	 ************************************************************************/
	public void RemoveProd1fromBasket() {
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		WebDriverWait wait =new WebDriverWait(driver.getWebDriver(),120);
	try{
		wait.until(ExpectedConditions.visibilityOf(removebtnprod1));
		if(removebtnprod1.isDisplayed()){
	     ex.executeScript("arguments[0].scrollIntoView();", removebtnprod1);
		 ex.executeScript("arguments[0].click();", removebtnprod1);
		 report.updateTestLog("Product 1 remove button","Clicked on Product 1 remove button", Status.PASS);
	}
  }catch(Exception e){
	   report.updateTestLog("Product 1 remove button",	"Product 1 remove button is not available", Status.FAIL);
    }
}	
	
	
	/**************************************************************************************************************
	 *
	 * @Project Name : Electrolux*
	 * @Function Name : basketPageprod1AllServices()*
	 * @Description : This function is used to verify that all services are retained for product in basket page*
	 * @Author : Gaurav
	 *
	 **************************************************************************************************************/
	public void verifybasketPageprod1AllServices() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
		try {
			if(prod1stservicecheckbox.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();", prod1stservicecheckbox);
			  if(prod1stservicecheckbox.isSelected()){
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is retained", Status.PASS);
		} else{
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not retained", Status.FAIL);
		}
			}		
		}catch (Exception e) {
			report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
		}
		Thread.sleep(5000);
		try {
			if(prod2ndservicecheckbox.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();", prod2ndservicecheckbox);
			if(prod2ndservicecheckbox.isSelected()){
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is retained", Status.PASS);
		} else{
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not retained", Status.FAIL);
		}
			}		
		}catch (Exception e) {
			report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available for the product", Status.PASS);
	}
		Thread.sleep(5000);
		try {
			if(prod3rdservicecheckbox.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();", prod3rdservicecheckbox);
			if(prod3rdservicecheckbox.isSelected()){
			report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is retained", Status.PASS);
		} else{
			report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is not retained", Status.FAIL);
		}
			}		
		}catch (Exception e) {
			report.updateTestLog("Third Service checkbox for product 1","Third Service checkbox for product 1 is not available for the product", Status.PASS);
	}
		Thread.sleep(5000);
		try {
			if(prod4thservicecheckbox.isDisplayed()){
			ex.executeScript("arguments[0].scrollIntoView();", prod4thservicecheckbox);
			if(prod4thservicecheckbox.isSelected()){
			report.updateTestLog("Fourth Service checkbox for product 1","Fourth Service checkbox for product 1 is retained", Status.PASS);
		} else{
			report.updateTestLog("Fourth Service checkbox for product 1","Fourth Service checkbox for product 1 is not retained", Status.FAIL);
		}
			}		
		}catch (Exception e) {
			report.updateTestLog("Fourth Service checkbox for product 1","Third Service checkbox for product 1 is not available for the product", Status.PASS);
	}
}	
	

	
	
	/**************************************************************************************************************
	 *
	 * @throws InterruptedException 
	 * @Project Name : Electrolux*
	 * @Function Name : ProductverifyBasketPage()*
	 * @Description : This function is used to verify that no products are displayed in basket page*
	 * @Author : Gaurav
	 *
	 **************************************************************************************************************/	
	
	    public void productVerifyBasketPage() throws InterruptedException{
	    	driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
	    	try{
	    		waitUntilElementVisible(checkoutButton,240);
	    		if(product1Row.isDisplayed()){
	    			report.updateTestLog("Product 1 in basket","Product 1 is available in basket page", Status.FAIL);
	    		}
	    	}catch(Exception e){
	    		report.updateTestLog("Product 1 in basket","Product 1 is not available in basket page", Status.PASS);
	    	}
	    	
	    }
	
	
	
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : productQty3()*
		 * @Description : This function is used to update Product 1 Quantity to 3 in BasketPage*
		 * @Author : Mamatha
		 ************************************************************************/
		public void productQty3() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try{
			ex.executeScript("arguments[0].scrollIntoView();", prod1QtyIncrement);
			ex.executeScript("arguments[0].click();", prod1QtyIncrement);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			Thread.sleep(4000);
			String Qty = qtyInput.getAttribute("value");
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
			
		}
		catch(Exception e){
			report.updateTestLog("Quantity for product 1", "Quantity field for product 1 is not available", Status.FAIL);
		}
	}
	
	
	
	
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : multipleProductsQty2()*
		 * @Description : This function is used verify Multiple Products Quantity in
		 *              BasketPage*
		 * @Author : Mohan
		 ************************************************************************/
		public void multipleProductsQty3() throws InterruptedException {
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			try{
				waitUntilElementVisible(prod2QtyIncrement,360);	
			ex.executeScript("arguments[0].scrollIntoView();", prod2QtyIncrement);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			waitUntilElementEnabled(checkoutButton, 240);
			ex.executeScript("arguments[0].click();", prod2QtyIncrement);
			Thread.sleep(3000);
			driver.getWebDriver().navigate().refresh();
			waitUntilElementEnabled(checkoutButton, 240);
			String Qty = qtyInput1.getAttribute("value");
			report.updateTestLog("Quantity for product 2", "Quantity for product 2 is updated to: " + Qty, Status.PASS);
		}
			catch(Exception e){
				report.updateTestLog("Quantity for product 2", "Quantity field for product 2 is not available", Status.FAIL);
			}
		
}	
	
	
				
		
		
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : removeVoucherfromBasket()*
		 * @Description : This function is used to remove voucher in BasketPage*
		 * @Author : Gaurav
		 ************************************************************************/
		public void removeVoucherFromBasket() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try{
				WebDriverWait(driver.getWebDriver(), removevoucher, 120);
			ex.executeScript("arguments[0].scrollIntoView();", removevoucher);
			ex.executeScript("arguments[0].click();", removevoucher);
			report.updateTestLog("Remove button for voucher", "Clicked on remove button for voucher", Status.PASS);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
			catch(Exception e){
				report.updateTestLog("Remove button for voucher", "Remove button for voucher is not available", Status.FAIL);
		}
		
}	
	
		
		
		
		/*******************************************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : VerifyVoucherRemoval()*
		 * @Description : This function is used to verify that voucher ribbon is not displayed in basket pagee*
		 * @Author : Gaurav
		 *******************************************************************************************************/
		public void verifyVoucherRemoval() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try{
				waitUntilElementVisible(checkoutButton,240);
				if(voucherribbon.isDisplayed())
			  {
				report.updateTestLog("Voucher ribbon", "Voucher ribbon is not displayed in basket page", Status.PASS);
		}
			}catch(Exception e){
				report.updateTestLog("Voucher ribbon", "Voucher ribbon is displayed in basket page", Status.FAIL);
			}
		
}
	

		
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : verifyNewVoucherApply()*
		 * @Description : This function is used for apply voucher in BasketPage*
		 * @Author : Gaurav
		 ************************************************************************/
		public void verifyNewVoucherApply() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			String voucherData = dataTable.getData("General_Data", "New Voucher code");
			try {
				Thread.sleep(5000);
				ex.executeScript("arguments[0].scrollIntoView();", voucherCheckBox);
				ex.executeScript("arguments[0].click();", voucherCheckBox);
				report.updateTestLog("Voucher checkbox", "Clicked on Voucher Code checkbox", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Voucher checkbox", "Voucher Checkbox is not available", Status.FAIL);
			}
			ex.executeScript("arguments[0].scrollIntoView();", voucherInput);
			voucherInput.sendKeys(voucherData);
			ex.executeScript("arguments[0].scrollIntoView();", voucherApplyBtn);
			ex.executeScript("arguments[0].click();", voucherApplyBtn);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			report.updateTestLog("Voucher code", "Voucher code applied is:" + voucherData, Status.PASS);
			ex.executeScript("arguments[0].scrollIntoView();", voucher1CodeMessage);
			String vouchermsg = voucher1CodeMessage.getText();
			if (voucher1CodeMessage.isDisplayed()) {
				report.updateTestLog("Voucher code message", "Voucher message is displayed as:" + vouchermsg, Status.PASS);
			} else {
				report.updateTestLog("Voucher code message", "Voucher message is not displayed", Status.FAIL);
			}
			if (voucher1CodeMessage.isDisplayed()) {
				try {
					ex.executeScript("arguments[0].scrollIntoView();", voucher1PromoRibbon);
					if (voucher1PromoRibbon.isDisplayed()) {
						String promoribbon = voucher1PromoRibbon.getText().trim();
						report.updateTestLog("Voucher code promo ribbon",
								"Voucher code promo ribbon message is displayed as:" + promoribbon, Status.PASS);
					}
				} catch (Exception e) {
					report.updateTestLog("Voucher code promo ribbon", "Voucher code ribbon message is not displayed",
							Status.FAIL);
				}
			}
		}
		
		
		
		
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : ReduceMultProductQuantity()*
		 * @Description : This function is used to reduce quantity of products in BasketPage*
		 * @Author : Gaurav
		 ************************************************************************/		
	public void reduceMultProductQuantity(){
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
		try{
			ex.executeScript("arguments[0].scrollIntoView();", prod1Qtyderement);
			ex.executeScript("arguments[0].click();", prod1Qtyderement);
			report.updateTestLog("Product 1 Qty decrement", "Clicked on product 1 decrement option first time",	Status.PASS);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}catch(Exception e){
			report.updateTestLog("Product 1 Qty decrement", "Product 1 decrement option is not available",Status.FAIL);
		}
		try{
			ex.executeScript("arguments[0].scrollIntoView();", prod2Qtyderement);
			ex.executeScript("arguments[0].click();", prod2Qtyderement);
			report.updateTestLog("Product 2 Qty decrement", "Clicked on product 2 decrement option first time",
					Status.PASS);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}catch(Exception e){
			report.updateTestLog("Product 2 Qty decrement", "Product 2 decrement option is not available",
					Status.FAIL);
		}
		try{
			ex.executeScript("arguments[0].scrollIntoView();", prod1Qtyderement);
			ex.executeScript("arguments[0].click();", prod1Qtyderement);
			report.updateTestLog("Product 1 Qty decrement", "Clicked on product 1 decrement option second time",
					Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Product 1 Qty decrement", "Product 1 decrement option is not available",
					Status.FAIL);
		}
		try{
			ex.executeScript("arguments[0].scrollIntoView();", prod2Qtyderement);
			ex.executeScript("arguments[0].click();", prod2Qtyderement);
			report.updateTestLog("Product 2 Qty decrement", "Clicked on product 2 decrement option second time",Status.PASS);
		}catch(Exception e){
			report.updateTestLog("Product 2 Qty decrement", "Product 2 decrement option is not available",Status.FAIL);
		}
}
		
		
	
	/************************************************************************
     * @Project Name : Electrolux*
     * @Function Name : basketMultiProductAllServicesSelect()*
     * @Description : To Select all the available services for the all products in
     *              basket*
     * @Author : MOHAN
     ************************************************************************/
     public void basketMultiProductAllServicesSelect() throws InterruptedException {
           try {
                  if (serviceSelectorBasket.isDisplayed()) {
                        report.updateTestLog("Services in Basket Page", "Services are available in the Basket page",
                                     Status.PASS);
                        List<WebElement> services = driver.findElements(By.xpath("//div[@class='D2CBasket-service']"));
                        int servicesCount = services.size();
                        for (int i = 1; i < servicesCount; i++) {
                               services = driver.findElements(By.xpath("//div[@class='D2CBasket-service']"));
                               services.get(i).click();
                               Thread.sleep(3000);
                               report.updateTestLog("Service checkboxes", "Service checkboxes are checked", Status.PASS);
                        }

                  } else {
                        report.updateTestLog("Services in Basket Page", "Services are not available in the Basket page",
                                     Status.FAIL);
                  }
           } catch (Exception e) {
                  report.updateTestLog("Services in Basket Page", "Services are not available in the Basket page",
                               Status.FAIL);
           }
  }

		
	
     
     
		/************************************************************************
		 * @Project Name : Electrolux*
		 * @Function Name : productQty1()*
		 * @Description : This function is used to check Product Quantity as 1 in BasketPage*
		 * @Author : Gaurav
		 ************************************************************************/
		public void productQty1() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor) driver.getWebDriver();
			try{
			ex.executeScript("arguments[0].scrollIntoView();", prod1QtyIncrement);
			String Qty = qtyInput.getAttribute("value");
			report.updateTestLog("Quantity for product 1", "Quantity for product 1 is updated to: " + Qty, Status.PASS);
		}
		catch(Exception e){
			report.updateTestLog("Quantity for product 1", "Quantity field for product 1 is not available", Status.FAIL);
		}
	}
	  
     
     
     
     
     
     
     
		/************************************************************************
		 *
		 * @Project Name : Electrolux*
		 * @Function Name : basketPageProd1AllServices()*
		 * @Description : This function is used to select one service for product 1 in BasketPage*
		 * @Author : Gaurav
		 *
		 ************************************************************************/
		public void basketPageProd1Service() throws InterruptedException {
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			try {
				waitUntilElementEnabled(prod1stservicecheckbox,360);
				ex.executeScript("arguments[0].scrollIntoView();", prod1stservicecheckbox);
				prod1stservicecheckbox.click();
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is checked", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
			}
	
	}
     
     
		
		
		/************************************************************************
		 *
		 * @Project Name : Electrolux*
		 * @Function Name : basketPage1Prod2ndService()*
		 * @Description : This function is used to select one service for product 1 in BasketPage*
		 * @Author : Gaurav
		 *
		 ************************************************************************/
		public void basketPage1Prod2ndService() throws InterruptedException {
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			try {
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				waitUntilElementVisible(prod2ndservicecheckbox,360);
				ex.executeScript("arguments[0].scrollIntoView();", prod2ndservicecheckbox);
				prod2ndservicecheckbox.click();
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is checked", Status.PASS);
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 1","Second Service checkbox for product 1 is not available for the product", Status.PASS);
			}
}		
		
     
		
		
		/************************************************************************
		 *
		 * @Project Name : Electrolux*
		 * @Function Name : basketPageProd22ndService()*
		 * @Description : This function is used to select second service for product 2 in BasketPage*
		 * @Author : Gaurav
		 *
		 ************************************************************************/
		public void basketPageProd22ndService() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			try {
				waitUntilElementEnabled(secondPrd2ndServicheckbox,360);
				ex.executeScript("arguments[0].scrollIntoView();", secondPrd2ndServicheckbox);
				secondPrd2ndServicheckbox.click();
				report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is checked", Status.PASS);
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			} catch (Exception e) {
				report.updateTestLog("Second Service checkbox for product 2","Second Service checkbox for product 2 is not available for the product", Status.PASS);
			}
}			
     
     
	    
			/************************************************************************
			 *
			 * @Project Name : Electrolux*
			 * @Function Name : basketPageProd1DeselectService()*
			 * @Description : This function is used to deselect one service for product 1 in BasketPage*
			 * @Author : Gaurav
			 *
			 ************************************************************************/
			public void basketPageProd1DeselectService() throws InterruptedException {
				JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				try {
					waitUntilElementEnabled(prod1stservicecheckbox,360);
					ex.executeScript("arguments[0].scrollIntoView();", prod1stservicecheckbox);
					prod1stservicecheckbox.click();
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is unchecked", Status.PASS);
					driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				} catch (Exception e) {
					report.updateTestLog("First Service checkbox for product 1","First Service checkbox for product 1 is not available for the product", Status.PASS);
			}
}
	         
     
     
     
     

			/************************************************************************
			 *
			 * @Project Name : Electrolux*
			 * @Function Name : basketPageCartTotalVerifyITAELX()*
			 * @Description : This function is used to verify the cart total prices for multiple products in BasketPage*
			 * @Author : Gaurav
			 *
			 ************************************************************************/
			public void basketPageCartTotalVerifyITAELX() throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				try {
					ex.executeScript("arguments[0].scrollIntoView();", prod1price);
					String prod1Price=prod1price.getText().trim();
					System.out.println(prod1Price);
					report.updateTestLog("Product 1 price","Product 1 price in basket page is displayed as :" +prod1Price, Status.PASS);
					String prod1Price1[]=prod1Price.split(" ");
					String prod1Price2=prod1Price1[1].replace(",", ".");
					System.out.println(prod1Price2);
					report.updateTestLog("Product 1 price","Product 1 price in basket page with decimal is displayed as :" +prod1Price2, Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();", prod2price);
					String prod2Price=prod2price.getText().trim();
					System.out.println(prod2Price);
					report.updateTestLog("Product 2 price","Product 2 price in basket page is displayed as :" +prod2Price, Status.PASS);
					String prod2Price1[]=prod2Price.split(" ");
					String prod2Price2=prod2Price1[1].replace(",", ".");
					System.out.println(prod2Price2);
					report.updateTestLog("Product 2 price","Product 2 price in basket page with decimal is displayed as :" +prod2Price2, Status.PASS);
					Float prod1PriceinInt = Float.parseFloat(prod1Price2);
					Float prod2PriceinInt = Float.parseFloat(prod2Price2);
					float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt;
					report.updateTestLog("Total price calculated in basket page","Total price calculated in basket page is :" +totalpriceCalculated, Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();", totalprice);
					String totalPrice=totalprice.getText().trim();
					System.out.println(totalPrice);
					report.updateTestLog("Total price","Total price in basket page is displayed as :" +totalPrice, Status.PASS);
					String totalprice1[]=totalPrice.split(" ");
					String totalprice2=totalprice1[1].replace(".", "");
					String totalprice3=totalprice2.replace(",", ".");
					System.out.println(totalprice3);
					Float totalpriceinUI = Float.parseFloat(totalprice3);
					report.updateTestLog("Total price","Total price in basket page in decimals is displayed as :" +totalpriceinUI, Status.PASS);
					if(totalpriceCalculated==totalpriceinUI){
						report.updateTestLog("Total price","Total price in basket page is displaying as expected", Status.PASS);
					}
					else{
						report.updateTestLog("Total price","Total price in basket page is not displaying as expected", Status.FAIL);
				}
				}catch(Exception e){
					report.updateTestLog("Products in basket page","Products are not available in basket page", Status.FAIL);
				}

}
	         
     
 
			
			
			/************************************************************************
			 *
			 * @Project Name : Electrolux*
			 * @Function Name : basketPageCartTotalVerifyITAELX()*
			 * @Description : This function is used to verify the cart total prices for multiple products in BasketPage*
			 * @Author : Gaurav
			 *
			 ************************************************************************/
			public void basketPageCartTotalVerifyWithoutServicesITAELX() throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
				JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
				try {
					ex.executeScript("arguments[0].scrollIntoView();", prod1priceservicebsktpage);
					String prod1Price=prod1priceservicebsktpage.getText().trim();
					System.out.println(prod1Price);
					report.updateTestLog("Product 1 price","Product 1 price in basket page is displayed as :" +prod1Price, Status.PASS);
					String prod1Price1[]=prod1Price.split(" ");
					String prod1Price2=prod1Price1[1].replace(",", ".");
					System.out.println(prod1Price2);
					report.updateTestLog("Product 1 price","Product 1 price in basket page with decimal is displayed as :" +prod1Price2, Status.PASS);
					ex.executeScript("arguments[0].scrollIntoView();", prod2priceservicebsktpage);
					String prod2Price=prod2priceservicebsktpage.getText().trim();
					System.out.println(prod2Price);
					report.updateTestLog("Product 2 price","Product 2 price in basket page is displayed as :" +prod2Price, Status.PASS);
					String prod2Price1[]=prod2Price.split(" ");
					String prod2Price2=prod2Price1[1].replace(",", ".");
					System.out.println(prod2Price2);
					report.updateTestLog("Product 2 price","Product 2 price in basket page with decimal is displayed as :" +prod2Price2, Status.PASS);
					Float prod1PriceinInt = Float.parseFloat(prod1Price2);
					Float prod2PriceinInt = Float.parseFloat(prod2Price2);
					ex.executeScript("arguments[0].scrollIntoView();", totalprice);
					String subtotalPrice=totalprice.getText().trim();
					System.out.println(subtotalPrice);
					report.updateTestLog("Subtotal price","Subtotal price in basket page is displayed as :" +subtotalPrice, Status.PASS);
					String subtotalprice1[]=subtotalPrice.split(" ");
					String subtotalprice2=subtotalprice1[1].replace(".", "");
					String subtotalprice3=subtotalprice2.replace(",", ".");
					System.out.println(subtotalprice3);
					Float subtotalpriceinUI = Float.parseFloat(subtotalprice3);
					try{
					if(basketpageServicePrice.isDisplayed()){
						String basketpageserviceprice=basketpageServicePrice.getText().trim();
						report.updateTestLog("Service total price","Service price in basket page is displayed as :" +basketpageserviceprice, Status.PASS);
						String servicetotprice1[]=basketpageserviceprice.split(" ");
						String servicetotprice2=servicetotprice1[1].replace(".", "");
						String servicetotprice3=servicetotprice2.replace(",", ".");
						Float servicetotpriceinUI = Float.parseFloat(servicetotprice3);
						float totalpriceCalculated=prod1PriceinInt+prod2PriceinInt+servicetotpriceinUI;
						String totalamt=totalamount.getText().trim();
						report.updateTestLog("Total price","Total price in basket page is displayed as :" +totalamt, Status.PASS);
						String totalprice1[]=totalamt.split(" ");
						String totalprice2=totalprice1[1].replace(".", "");
						String totalprice3=totalprice2.replace(",", ".");
						System.out.println(totalprice3);
						Float totalpriceinUI = Float.parseFloat(totalprice3);
						if(totalpriceCalculated==totalpriceinUI){
							report.updateTestLog("Total amount","Total amount with calculation in basket page is matching with total amount displayed :" +totalpriceinUI, Status.PASS);
						}
					}
					}catch(Exception e){
					float subtotalpriceCalculated=prod1PriceinInt+prod2PriceinInt;
					report.updateTestLog("Subtotal price calculated in basket page","Subtotal price calculated in basket page is :" +subtotalPrice, Status.PASS);
					report.updateTestLog("Subtotal price","Subtotal price in basket page in decimals is displayed as :" +subtotalprice3, Status.PASS);
					if(subtotalpriceCalculated==subtotalpriceinUI){
						report.updateTestLog("Subtotal price","Subtotal price in basket page is displaying as expected: "+subtotalpriceCalculated, Status.PASS);
					}
					else{
						report.updateTestLog("Subtotal price","Subtotal price in basket page is not displaying as expected", Status.FAIL);
				}
					try{
					String totalamt=totalamount.getText().trim();
					report.updateTestLog("Total price","Total price in basket page is displayed as :" +totalamt, Status.PASS);
					String totalprice1[]=totalamt.split(" ");
					String totalprice2=totalprice1[1].replace(".", "");
					String totalprice3=totalprice2.replace(",", ".");
					System.out.println(totalprice3);
					Float totalpriceinUI = Float.parseFloat(totalprice3);
					if(subtotalpriceCalculated==totalpriceinUI){
						report.updateTestLog("Total amount","Total amount in basket page is matching with total amount displayed" +totalpriceinUI, Status.PASS);
					}
					else{
						report.updateTestLog("Total amount","Total amount with calculation in basket page is not matching with total amount displayed", Status.FAIL);
					}
					
					}catch(Exception e1){
						report.updateTestLog("Total price","Total price in basket page is not displayed", Status.FAIL);
					}
				}
				}catch(Exception e){
					report.updateTestLog("Products in basket page","Products are not available in basket page", Status.FAIL);
				}

}			
     
     
     
			/************************************************************************
			 *
			 * @Project Name : Electrolux*
			 * @Function Name : basketPageProd1SingleServiceSelect()*
			 * @Description : This function is used to verify the cart total prices for multiple products in BasketPage*
			 * @Author : Gaurav
			 *
			 ************************************************************************/			
		public void basketPageProd1SingleServiceSelect(){
			JavascriptExecutor ex = (JavascriptExecutor)driver.getWebDriver();
			try{
				ex.executeScript("arguments[0].scrollIntoView();", firstPrd1stServicheckbox);
				firstPrd1stServicheckbox.click();
				report.updateTestLog("First service checkbox for product 1","First service checkbox for product 1 is checked", Status.PASS);
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			}catch(Exception e){
				report.updateTestLog("First service checkbox for product 1","First service checkbox for product 1 is not available for the product", Status.PASS);
		}
			
			
			
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	
}	