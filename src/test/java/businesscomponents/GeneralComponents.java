package businesscomponents;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

import pages.AddressPage;

import pages.BasketPage;
import pages.DeliveryPage;
import pages.OrderConfirmationPage;
import pages.PDPPage;
import pages.PLPPage;
import pages.PaymentPage;

/********************************************************
 * Class for storing general purpose business components
 * 
 * @author Cognizant
 ********************************************************/
public class GeneralComponents extends ReusableLibrary {
	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 ****************************************************/
	public GeneralComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	public void invokeApplication() {
		report.updateTestLog("Invoke Application",
				"Invoke the application under test @ " + properties.getProperty("ApplicationUrl"), Status.PASS);
		driver.get(properties.getProperty("ApplicationUrl"));
	}

	public void invokeApplication1() {
		String applicationUrlData = dataTable.getData("General_Data", "ApplicationUrl");
		report.updateTestLog("Invoke Application", "Invoke the application under test @: " + applicationUrlData,
				Status.PASS);
		driver.get(applicationUrlData);
		report.consolidateScreenshotsInWordDoc();
	}

	public void invokeApplication2() {
		String applicationUrlData = dataTable.getData("General_Data", "ApplicationUrl");
		report.updateTestLog("Invoke Application", "Invoke the application under test @: " + applicationUrlData,
				Status.PASS);
		driver.get(applicationUrlData);
	}
	
	
	public void plpPageSingleProductselection() {
		PLPPage plppage = new PLPPage(scriptHelper);
		plppage.singleProductGlobalSearch();
	}

	public void pdpPageSingleProductselectionbyURL() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasketSingleProduct();
	}

	
	
	public void pdpPageSingleProductNewly() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasketSingleProductNew();
	}
	
	
	
	
	public void multipleProductsSelectionPLPPage() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		PDPPage pdppage = new PDPPage(scriptHelper);
		plppage.singleProductGlobalSearch();
		pdppage.addToBasketSingleProduct();
		plppage.multipleProductSelection();
		plppage.plpPageMultipleProductSelection();
		pdppage.addToBasketProduct2();
	}

	public void pdpPageaddtobasketMultiProds() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasketMultiProducts();
	}

	public void multipleproductselectPLPpage() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		PDPPage pdppage = new PDPPage(scriptHelper);
		plppage.plpPageSelectProduct();
		pdppage.addToBasketSingleProduct();
		plppage.multipleProductSelection();
		plppage.plpPageMultipleProductSelection();
		pdppage.addToBasketProduct2();
		pdppage.viewBasket();
	}

	public void multipleproductselectPLPpageGlobalsearch() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		PDPPage pdppage = new PDPPage(scriptHelper);
		plppage.plpPageSelectProduct1();
		pdppage.addToBasketSingleProduct();
		plppage.secondProductSelectionGlobalSearch();
		pdppage.addToBasketProduct2();
	}

	public void selectAdditionalProduct() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		plppage.multipleProductSelection();
		plppage.plpPageMultipleProductSelection();
	}

	public void pdpPageaddtobasket() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasketSingleProduct();
	}
	
	
	public void pdpPageaddtobasketwithoutcookie() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasketSingleProductNew();
	}
	
	

	public void pdpViewbasket() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.viewBasket();
	}

	public void plpPageproductselection() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		plppage.plpPageSelectProduct();
	}

	public void plpPageproductselection1() throws InterruptedException {
		PLPPage plppage = new PLPPage(scriptHelper);
		plppage.plpPageSelectProduct1();
	}

	public void pDPPageBuyXGetYValidation() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.buyXGetYProduct();
	}

	public void addToCart() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.addToBasket();
	}

	// public void basketPageBuyXGetYValidation() throws InterruptedException {
	// BasketPage basketpage = new BasketPage(scriptHelper);
	// basketpage.basketPageAllServicesUAT();
	// basketpage.buyXGetYProductValidationBasketPage();
	// basketpage.basketCheckout();
	// }

	public void basketpageCheckout() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketCheckout();
	}

	public void addresspageBuyXGetYValidation() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.buyXGetYProductValidationAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspageUSPBannerValidation() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.uspPromotionHeaderBannerValidationAddressPage();
		addrspage.navigateToDeliveryPage();
	}



	public void addresspageITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		//addrspage.navigateToDeliveryPage();
	}

	public void addresspagewithBillingAddress() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.billingAddress();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagewithBillingAddressAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.billingAddressAeg();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspageverifyAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.navigateToDeliveryPage();
	}

	
	public void addresspageverifyITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.navigateToDeliveryPage();
	}
	

	public void addresspageCartSummaryverify() {
		AddressPage addrspage = new AddressPage(scriptHelper);
		// addrspage.verifyOfferPriceForPercentagePromotionProduct1AddressPage();
		addrspage.addressPageCartSummaryValidation();
	}

	public void addresspageverifywithvoucher() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.voucherVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspageverifywithvoucherITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.voucherVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	
	public void addresspageverifywithvoucherAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.voucherVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}
	

	public void addresspagepromoverify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.promoVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagepromoverifyITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.promoVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagepromoproduct2verify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.promoVerifyInAddressPage();
		addrspage.promoVerifyInAddress2Products();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagepromoproduct2verifyITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.promoVerifyInAddressPage();
		addrspage.promoVerifyInAddress2Products();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagepromoverifyAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.promoVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspageproduct2verifyAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.promoVerifyInAddressPage();
		addrspage.promoVerifyInAddress2Products();
		addrspage.navigateToDeliveryPage();
	}

	public void deliveryPageverify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageUSPBannerValidation() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.uspPromotionHeaderBannerValidationDeliveryPage();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageBuyXGetYValidation() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.buyXGetYProductValidationDeliveryPage();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageverifywithvoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
	}

	public void deliverypagepromoverify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.deliveryToPayment();
	}

	public void deliverypagepromoproduct2verify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.promoVerifyInDeliveryPage2Products();
		delvrypage.deliveryToPayment();
	}

	public void orderConfirmationPageCheck() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
	}

	public void orderconfirmationpageBuyXGetYvalidation() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.buyXGetYProductValidationOrderConfirmationPage();
	}

	public void orderconfirmationpagecheckAEG() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
	}

	public void orderconfirmationpageUSPBannerValidation() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
		orderconfrmtnpage.USPPromotionHeaderBannerValidationOrderConfirmationPage();
	}

	public void orderconfirmationpageHomeDelcheck() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageHomeDelOptionCheck();
	}
                            
	public void orderconfirmationpageSunDelcheck() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageSundayDelOptionCheck();
	}

	public void orderconfirmationpageverifywithvoucher() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.voucherVerifyInOrderConfirmationPage();
	}

	public void orderconfirmationpageverifywithvoucherAEG() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
		orderconfrmtnpage.voucherVerifyInOrderConfirmationPage();
	}

	public void orderconfirmationpagepromocheck() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
	}

	public void orderconfirmationpagepromoproduct2check() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPageProduct2();
	}

	public void orderconfirmationpagepromocheckAEG() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
	}

	public void orderconfirmationpageContentverifyUATELX() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.contentVerifyOrderConfirmationPage_ELX();
	}

	public void orderconfirmationpageContentverify() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		// orderconfrmtnpage.verifyOfferPriceForPercentagePromotionProduct1OCPage();
		orderconfrmtnpage.contentVerifyOrderConfirmationPage();
	}

	public void orderconfirmationpageContentverifyUATAEG() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
		orderconfrmtnpage.contentVerifyOrderConfirmationPage_AEG();
	}

	public void orderconfirmationpagepromoproduct2checkAEG() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPageAEG();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPageProduct2();
	}

	public void checkoutDeliverypage_HomeDelivery_SundayDelivery() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryPageWithSundayDeliveryVerify();
		delvrypage.deliveryInstructions();
		delvrypage.deliveryToPayment();
	}

	public void checkoutDeliverypage_HomeDelivery() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryInstructions();
		delvrypage.deliveryToPayment();
	}

	public void checkoutDeliverypage_StandardParceldelivery() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.standardParcelDeliveryVerify();
	}

	public void validations_Checkout_PaymentPage_Creditcard_Paymentmethod() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.validationOfPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void validations_Checkout_PaymentPage_Paypal_Paymentmethod() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paypalPayment();
	}

	public void _Delivery_Billing_Address_Same() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.mailingAddressPageValidations();
	}

	public void addressPage_Delivery_Billing_Address_Same_AEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.mailingAddressPageValidationsAEG();
	}

	public void addressPage_Delivery_Billing_Address_Different() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.myBillingAddressDifferentValidations();
	}

	public void addressPage_Delivery_Billing_Address_DifferentITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.myBillingAddressDifferentValidations();
	}

	public void addressPage_Delivery_Billing_Address_DifferentAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.myBillingAddressDifferentValidationsAEG();
	}

	public void deliverypageCartSummaryVerify() {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.contentVerifyDeliveryPageCartSummary();
	}

	public void deliverypageCartSummaryverify() {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		// delvrypage.verifyOfferPriceForPercentagePromotionProduct1DeliveryPage();
		delvrypage.deliveryPageCartSummaryValidation();
	}

	public void deliverypageCartSummaryVerifyAEG() {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.contentVerifyDeliveryPageCartSummaryAEG();
	}

	public void paymentpageCartSummaryVerify() {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageCartSummaryValidations();
	}

	public void paymentpageCartSummaryverify() {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		// paymntpage.verifyOfferPriceforPercentagePromotionProduct1PaymentPage();
		paymntpage.paymentPageCartSummaryValidation();
	}

	public void paymentpageCartSummaryVerifyAEG() {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageCartSummaryValidationsAEG();
	}

	public void addresspageUspDetailsverify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageUspVerify();
		addrspage.addressPageVerify();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspageUspDetailsverifyITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.addressPageUspVerify();
		addrspage.navigateToDeliveryPage();
	}

	public void deliverPageUspDetailsDisplay() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageUspVerify();
		// delvrypage.deliveryToPayment();
	}

	public void orderconfirmationpageUspDetailsDisplay() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.oderConfirmationPageUspVerify();
	}

	public void pdpPage_withPromo_Verification1() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.cookieAccept();
		pdppage.promotionAppliedProductVerification();
		pdppage.promotionSelectionCheckboxVerification();
	}

	public void basketPage_withPromo_Verification() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketVerifyWithPromotion();
		basketpage.basketPagePromoVerify2ndProduct();
	}

	public void adressPage_withPromo_Verification() {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.addressPageVerifyWithPromotionProduct2();
	}

	public void deliveryPage_withPromo_Verification() throws InterruptedException {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.deliveryPageVeriyWithPromotionProduct();
	}

	public void paymentPage_withPromo_Verification() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.paymentPageVeriyWithPromotionProduct();
	}

	public void orderconfirmationPage_withPromo_Verification() {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.ocPage_VeriyWithPromotionProduct();
	}

	public void addresspagewith2subscriptions() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.addressPageVerifyBothSubscriptionsDisplayed();
		addrspage.addressPageSelectBothSubscriptions();
		addrspage.navigateToDeliveryPage();
	}

	public void addresspagewith2subscriptionsITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.addressPageVerifyBothSubscriptionsDisplayed();
		addrspage.addressPageSelectBothSubscriptions();
		addrspage.navigateToDeliveryPage();
	}

		
	
	public void basketPage_verifyOfferPrice_perPromo_Product1() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyOfferPriceForPercentagePromotionProduct1BasketPage();
	}

	public void basketPage_verifyOfferPrice_perPromo_Product2() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyOfferPriceForPercentagePromotionProduct2BasketPage();
	}

	public void addressPage_verifyOfferPrice_perPromo_Product1() {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.verifyOfferPriceForPercentagePromotionProduct1AddressPage();
	}

	public void addressPage_verifyOfferPrice_perPromo_Product2() {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.verifyOfferPriceForPercentagePromotionProduct2AddressPage();
	}

	public void deliveryPage_verifyOfferPrice_perPromo_Product1() {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.verifyOfferPriceForPercentagePromotionProduct1DeliveryPage();
	}

	public void deliveryPage_verifyOfferPrice_perPromo_Product2() {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.verifyOfferPriceForPercentagePromotionProduct2DeliveryPage();
	}

	public void paymentPage_verifyOfferPrice_perPromo_Product1() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.verifyOfferPriceforPercentagePromotionProduct1PaymentPage();
	}

	public void paymentPage_verifyOfferPrice_perPromo_Product2() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.verifyOfferPriceforPercentagePromotionProduct2PaymentPage();
	}

	public void OCPage_verifyOfferPrice_perPromo_Product1() {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.verifyOfferPriceForPercentagePromotionProduct1OCPage();
	}

	public void ocPage_verifyOfferPrice_perPromo_Product2() {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.verifyOfferPriceForPercentagePromotionProduct2OCPage();
	}

	public void basketPage_verifyOfferPrice_flatDiscount_Product1() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyOfferPriceForFlatDiscountPromotionProduct1BasketPage();
	}

	public void basketPage_verifyOfferPrice_flatDiscount_Product2() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyOfferPriceFlatDiscountPromotionProduct2BasketPage();
	}

	public void addressPage_verifyOfferPrice_flatDiscountPromo_Product1() {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.verifyOfferPriceForFlatDiscountPromotionProduct1AddressPage();
	}

	public void addressPage_verifyOfferPrice_flatDiscountPromo_Product2() {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.verifyOfferPriceForFlatDiscountPromotionProduct2AddressPage();
	}

	public void deliveryPage_verifyOfferPrice_flatDiscountPromo_Product1() {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.verifyOfferPriceForFlatDiscountPromotionProduct1DeliveryPage();
	}

	public void deliveryPage_verifyOfferPrice_flatDiscountPromo_Product2() {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.verifyOfferPriceForFlatDiscountPromotionProduct2DeliveryPage();
	}

	public void paymentPage_verifyOfferPrice_flatDiscountPromo_Product1() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.verifyOfferPriceForFlatDiscountPromotionProduct1PaymentPage();
	}

	public void paymentPage_verifyOfferPrice_flatDiscountPromo_Product2() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.verifyOfferPriceForFlatDiscountPromotionProduct2PaymentPage();
	}

	public void OCPage_verifyOfferPrice_flatDiscountPromo_Product1() {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.verifyOfferPriceForFlatDiscountPromotionProduct1_OCPage();
	}

	public void klarnaPayLaterVerify() throws InterruptedException {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.klarnaPayLaterSelection();
		paymentpage.klarnaPaylaterEnterDetails();
	}

	public void klarnaSliceitVerify() throws InterruptedException {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.klarnaSliceItSelection();
		paymentpage.klarnaSliceitEnterDetails();
	}

	/************** @Author : Mohan ********************************/

	public void klarnaWithExtendedWarrenty() throws InterruptedException {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		paymentpage.klarnaPayLaterSelection();
		paymentpage.klarnaPaylaterEnterDetails();
		ocpage.klarnaWithExtendedWarrantyServices();
	}

	public void basketpageWithIconOverlayVerify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basket_i_icon_OverLay_verify();
		basketpage.basketCheckout();
	}

	public void productModelID_Hyperlink_Verify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.productModelIdHyperLinkVerify();
	}

	public void orderConfirmationPageVerify() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		// orderconfrmtnpage.contentVerifyOrderConfirmationPage();
	}

	public void deliveryOptionVerifyWithDescription() throws InterruptedException {
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.deliveryOptionVerifyWithDescription();
	}

	public void editPreviousStepsVerifyPayPage() throws InterruptedException {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.editPreviousStepsVerifyPayPage();
	}

	public void weeeTotalVerifyCartSummary() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.weeeTotalVerifyCartSummary();
	}

	public void addressPageErrorMsgValidations() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageErrorMsgValidations();
	}

	public void addressPageErrorMsgValidationBilling_Address() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.myBillingAddressDifferentErrorMsgValidations();
	}

	public void pdpPagePostiServiceSingleProductselectionbyURL() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.AddtoBasketSingleProductPostiService();
	}

	public void basketpage() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketCheckout();
	}

	public void orderconfirmationpagePostiDelcheck() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.OrderConfirmationpagePostiDeloptioncheck();
	}

	public void pdpPagePostNordServiceSingleProductselectionbyURL() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.AddtoBasketSingleProductPostNordService();
	}

	public void ocPagePostNordDelcheck() {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.OCpagePostNordDeloptioncheck();
	}

	public void addressPage_Delivery_Billing_AddressSame() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.MailingAddressPageValidation();
		addrspage.MybillingAddressDifferentValidation();
	}

	public void deliveryPageverifyAllService() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.deliveryPageServiceInformationValidations();
		delvrypage.deliveryToPayment();
	}

	public void ocpageVerifyAllServiceValidation() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.OCPageServiceInformationValidations();
	}

	// ***************NEW*******************************************************************

	
	public void addressPageExcluedZipVerify() throws InterruptedException {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.addressPageExcluedZipVerify();
	}

	public void addressPageExcluedZipVerifyITAELX() throws InterruptedException {
		AddressPage addresspage = new AddressPage(scriptHelper);
		addresspage.addressPageExcluedZipVerifyITAELX();
	}
	
	public void deliveryPageverifyEWPromo() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.EWServicePromoVerifyDeliveryPage();
		delvrypage.deliveryToPayment();
	}

	public void orderconfirmationpageEWPromoVerify() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.EWServicePromoVerifyOCPage();
	}

	/****************************************************
	 * Keywords for Credit Card Payment method - START
	 ***************************************************/
	public void paymentPage() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageVerify();
		//paymntpage.paypalPaymentNew();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageUSPBannerValidation() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.uspPromotionHeaderBannerValidationPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageBuyXGetYValidation() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.buyXGetYProductValidationPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageverifywithvoucher() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentpagepromoverify() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.promoVerifyInPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentpagepromoproduct2verify() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.promoVerifyInPaymentPage();
		paymntpage.promoVerifyInPaymentPage2Products();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageVerifyEWPromo() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.EWServicePromoVerifyPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageUspDetailsDisplay() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageUspVerify();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageVerifyAllService() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageServiceInformationValidations();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	/****************************************************
	 * Keywords for Credit Card Payment method - END
	 ***************************************************/

	/****************************************************
	 * Keywords for PayPal Payment method - START
	 ***************************************************/
	// public void paymentPage() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageUSPBannerValidation() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.uspPromotionHeaderBannerValidationPaymentPage();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageBuyXGetYValidation() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.buyXGetYProductValidationPaymentPage();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageverifywithvoucher() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.voucherVerifyInPaymentPage();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentpagepromoverify() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.promoVerifyInPaymentPage();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentpagepromoproduct2verify() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.promoVerifyInPaymentPage();
	// paymntpage.promoVerifyInPaymentPage2Products();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageVerifyEWPromo() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.EWServicePromoVerifyPaymentPage();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageUspDetailsDisplay() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.paymentPageUspVerify();
	// paymntpage.paypalPayment();
	// }
	//
	// public void paymentPageVerifyAllService() throws InterruptedException {
	// PaymentPage paymntpage = new PaymentPage(scriptHelper);
	// paymntpage.paymentPageServiceInformationValidations();
	// paymntpage.paypalPayment();
	// }

	/****************************************************
	 * Keywords for PayPal Payment method - END
	 ***************************************************/

	// *************SF Track ***************//

	public void basketpageQty1Checkout() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketCheckout();
	}

	public void deliveryPageAllServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryPageAllServices();

	}

	public void deliveryPageCheck() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
	}

	public void deliveryToPayment() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryToPayment();
	}
	
	
	public void deliveryToPayment1() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryToPayment();
	}


	public void basketpagemultipleProductQty1() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.basketCheckout();
	}

	public void deliveryPageTwoProdcutAllServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryPageProd1AllServices();
		deliveryPage.deliveryPageProd2AllServices();
	}

	public void basketpagemorethan1Qty() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.basketCheckout();
	}

	public void basketpageQty1promoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketVerifyWithPromotion();
		basketpage.basketCheckout();
	}

	public void basketpagemorethan1Qtypromoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.basketVerifyWithPromotion();
		basketpage.basketCheckout();
	}

	public void basketpageQty1withvoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void basketpagemorethan1QtyWithVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void basketpageMultipleproductmorethan1Qty() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.basketCheckout();
	}

	public void basketpagemultipleProductQty1withVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void basketpageMultProdmorethan1QtywithVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void basketpageMultProductMoreThan1QtyVerifyVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void deliveryPageMultProdAllServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryPageCheck();
		deliveryPage.deliveryPagemultprod1AllServices();
		deliveryPage.deliveryPagemultprod2AllServices();
		deliveryPage.deliveryToPayment();
	}

	public void basketpageMultipleProductQty1promoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketVerifyWithPromotion();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.basketCheckout();
	}

	public void basketpageMultProductQty1promoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketVerifyWithPromotion();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.basketCheckout();
	}

	public void deliverypageMultprodAllServicespromoverify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.promoVerifyInDeliveryPage2Products();
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.deliveryToPayment();
	}

	public void basketpageMultipleProductmorethan1Qtypromoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.basketVerifyWithPromotion();
		basketpage.multipleProductsQty2();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.basketCheckout();
	}

	public void basketpageMultProductQty1() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.basketCheckout();
	}

	public void basketpageMultProdmorethan1Qtypromoverify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.basketVerifyWithPromotion();
		basketpage.multipleProductsQty2();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.basketCheckout();
	}

	public void deliveryPageMultProdFewServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryTitleVerify();
		deliveryPage.deliveryPagemultProd1FewServices();
		deliveryPage.deliveryPagemultprod2FewServices();
	}

	public void deliverypageMultprodFewServicespromoverify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageCheck();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.promoVerifyInDeliveryPage2Products();
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryToPayment();
	}

	public void basketpagemultProdQty1withVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageQty1();
		basketpage.basketPageMultipleProductsQty1();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void deliveryPageMultProdFewServicesVerifyVoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryPagemultprod2FewServices();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
	}

	public void deliverypageDHLService() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageDHLOption();
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryToPayment();
	}

	public void ocPageDHLServiceDelcheck() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.OCpageDHLServiceDeloptioncheck();
	}

	public void deliverypagePostiService() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagePostiMethod();
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryToPayment();
	}

	public void deliverypagePostNordService() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagePostNord();
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageMultProdAllServicesVerifyVoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageFewServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.deliveryPageFewServices();
	}

	public void basketpageMultproductmorethan1Qty() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.basketCheckout();
	}

	public void deliveryPageProd1AllServices() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.homeDelOptionVerify();
		deliveryPage.deliveryPagemultprod1AllServices();
		deliveryPage.deliveryToPayment();
	}

	/////// CICD/////////////////

	public void deliveryPageServiceReadMoreOrLess() throws InterruptedException {
		DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
		deliveryPage.serviceReadmoreReadlessVerification();
	}

	public void checkoutDeliverypage_Parceldelivery_readmore() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.standardParcelDeliveryVerify();
		delvrypage.deliveryReadmoreReadlessVerification();
	}

	public void deliverypageMultprodAllServicesNopromo() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryTitleVerify();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageSavingsTotalCheck();
		delvrypage.deliveryToPayment();
	}
	
	public void deliverypageMultprodAllServicesNosavings() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryTitleVerify();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageNoSavingsTotalCheck();
		delvrypage.deliveryToPayment();
	}
	
	

	public void deliverypageSingleprodAllServicesNopromo() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageAllServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryInstructions();
		delvrypage.deliveryPageSavingsTotalCheck();
	}

	
	public void deliverypageSingleprodAllServicesSundayDel() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageAllServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryPageWithSundayDeliveryVerify();
		delvrypage.deliveryInstructions();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageSavingsTotalCheck();
	}
	public void deliverypageSingleprodAllServicesNopromoFirstFloor() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageAllServices();
		//delvrypage.deliveryPagefirstFloorCheck();
		delvrypage.deliveryInstructionsVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageSavingsTotalCheck();
		delvrypage.deliveryToPayment();
	}

	public void deliverypageMultprodFewServicesNoSavings() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryPagemultprod2FewServices();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageNoSavingsTotalCheck();
		delvrypage.deliveryToPayment();
	}

	public void deliverypageMultprodFewServicesVoucherVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultProd1FewServices();
		delvrypage.deliveryPagemultprod2FewServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
	}

	public void deliveryPageSummaryCheckNoSavings() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryOptionVerifyWithDescription();
		delvrypage.deliveryPageNoSavingsTotalCheck();
		delvrypage.deliveryToPayment();
	}

	public void addressPageBuyAsBusinessWithBillingAddress() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageBuyingAsBusiness();
		addrspage.buyAsBusinessBillingAddress();
	}

	public void basketPageSummaryVerify() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.totalSavingsCheck();
	}
	

	
	

	public void basketPageSummaryVerifyMultiProdWithVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyVoucherApply();
		basketpage.basketVerifyWithPromotion();
		basketpage.basketPagePromoVerify2ndProduct();
		basketpage.totalSavingsCheck();
	}

	public void basketPageSummaryNoSavingsVerify() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.totalNoSavingsCheck();
	}

	public void addressPageSummaryVerify() {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageTotalSavingsCheck();
	}

	

	
	
	public void addressPageSummaryVerifyMultProdWithVoucherITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.voucherVerifyInAddressPage();
		addrspage.addressPageVerifyWithPromotionProduct2();
		addrspage.navigateToDeliveryPage();
}
	
	
	
	public void addressPageSummaryVerifyMultProdWithVoucher() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.voucherVerifyInAddressPage();
		addrspage.addressPageVerifyWithPromotionProduct2();
		addrspage.navigateToDeliveryPage();
}

	public void addressPageSummaryNoSavingsVerify() {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageTotalNoSavingsCheck();

	}

	public void paymentPageSummaryVerify() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.paymentPageTotalSavingsCheck();
	}

	public void paymentPageverifymultiProdwithVoucher() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paymentPageVeriyWithPromotionProduct();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}

	public void paymentPageverifymultiProdwithVoucher_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paymentPageVeriyWithPromotionProduct();
		paymntpage.paypalPayment();
	}
	
	
	
	public void paymentPageSummaryNoSavingsVerify() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.paymentPageTotalNoSavingsCheck();
	}

	public void orderConfirmationPageSummarycheck() throws InterruptedException {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.ocpageSummaryVerify();
	}

	public void orderConfirmationPageMultProdWithVoucher() {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.ocPage_VeriyWithPromotionProduct();
		ocpage.voucherVerifyInOrderConfirmationPage();
	}

	public void orderConfirmationPageSummaryNoSavingscheck() throws InterruptedException {
		OrderConfirmationPage ocpage = new OrderConfirmationPage(scriptHelper);
		ocpage.ocpageSummaryNoSavingsVerify();
	}

	public void multipleProductQtyIncrement() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.multipleProductsQtyIncrement();
	}
	
	
	public void singleProductQtyIncrement() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.singleProductsQtyIncrement();
	}
	

	public void paymentPage_click_editaddressLink() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.click_EditAddress_FromPaymentPage();
	}

	public void paymentPage_click_editDeliveryLink() {
		PaymentPage paymentpage = new PaymentPage(scriptHelper);
		paymentpage.click_EditDelivery_FromPaymentPage();
	}

	public void deliverypageEditClickButton() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryTitleVerify();
		delvrypage.editButtondisplayVerify();
	}

	public void editPostCodeAddressPage() {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.postCodeEnter();
	}

	public void navigateToDelPage() {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.navigatetoDeliverypage();
	}

	public void addresspageITAWithBilling() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.myBillingAddressDifferentValidations();
		addrspage.navigateToDeliveryPage();
	}

	
	public void addresspageWithBilling() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.myBillingAddressDifferentValidations();
		addrspage.navigateToDeliveryPage();
	}
	
	// *******************CICD _DEV*******************************************//

	public void basketPageMultiProdMoreThan2QtyPromoVerify() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.product1QtyTo3();
		basketpage.basketVerifyWithPromotion();
		basketpage.secondProdQtyTo3();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}
	
	
	public void basketPageMultiProdMoreThan2QtySavingsDisabled() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.basketVerifyWithPromotionSavingsDisabled();
		basketpage.multipleProductsQty2();
		basketpage.basketPagePromoVerifyProduct2();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}
	
	
	
	
	
	
	

	public void delPageMultProdAllServPromoVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageProd1AllServices();
		delvrypage.deliveryPageProd2AllServices();
		delvrypage.deliveryPageCheck();
		delvrypage.deliveryTitleVerify();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.promoVerifyInDeliveryPage2Products();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryToPayment();
	}

	public void paymentPageMultiProductPromoVerifyWithTrustly() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.promoVerifyInPaymentPage();
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.promoVerifyInPaymentPage2Products();
		paymntpage.trustlyPaymentVerify();
	}

	public void addressPagePromoVoucherVerifyITAELX() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
		addrspage.voucherVerifyInAddressPage();
		addrspage.promoVerifyInAddressPage();
		addrspage.promoVerifyInAddress2Products();
		addrspage.navigateToDeliveryPage();
	}

	public void addressPagePromoVoucherVerify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyAeg();
		addrspage.voucherVerifyInAddressPage();
		addrspage.promoVerifyInAddressPage();
		addrspage.promoVerifyInAddress2Products();
		addrspage.navigateToDeliveryPage();
	}
	
	public void basketPageMoreThan2QtyWithVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.product1QtyTo3();
		basketpage.verifyVoucherApply();
		basketpage.basketCheckout();
	}

	public void delPageAllServVoucherVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryPageCheck();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryPageProd1AllServices();
		delvrypage.deliveryToPayment();
	}

	public void continueToDelBtnClickOCPage() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.continueToDelBtnClickOCPage();
	}

	public void voucherVerifyAddressPage() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.voucherVerifyInAddressPage();
		addrspage.promoVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}

	public void addressPageVerifyAEG() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerifyItaElx();
	}

	public void buyAsBusinessVerify() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.buyAsBusinessVerify();
	}

	public void readMoreLessInDelPage() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.readMoreLessInDelOption();
		delvrypage.serviceReadmoreReadlessVerification();
	}

	public void delPageVoucherPromoVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryPageCheck();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryPageProd1AllServices();
		delvrypage.deliveryToPayment();
	}
	
	public void delPagePromoVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryPageCheck();
		delvrypage.promoVerifyInDeliveryPage();
		delvrypage.deliveryPageProd1AllServices();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryToPayment();
	}
	
	
	public void delPageVerify() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPageProd1AllServices();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliveryPageCheck();
		delvrypage.serviceReadmoreReadlessVerification();
		delvrypage.deliveryToPayment();
	}

	public void paymentPagePromoVoucherVerify() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.promoVerifyInPaymentPage();
		paymntpage.voucherVerifyInPaymentPage();
	}
	
	public void paymentPagePromoVerify() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.promoVerifyInPaymentPage();
	}
	
	

	public void oCPagePromoVoucherVerify() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.voucherVerifyInOrderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
	}
	
	
	
	public void oCPagePromoVerify() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.orderConfirmationPage();
		orderconfrmtnpage.promoVerifyInOrderConfirmationPage();
	}
	
	
	

	public void klarnaPaymentVerifyInOCPage() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.klarnaPaymentVerifyInOCPage();
	}

	public void verifyVoucherPromoAddrPage() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.voucherVerifyInAddressPage();
		addrspage.promoVerifyInAddressPage();
	}

	public void paymentPage_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paypalPayment();
	}

	public void basketPageMoreThan2QtyVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.product1QtyTo3();
		basketpage.verifyVoucherApply();
	}
	
	
	public void basketPageMoreThan2Qty() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.product1QtyTo3();
	}
	
	

	public void paymentPageverifywithvoucher_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paypalPayment();
	}
	
//************************************************Gaurav changes*************************************************//
	
	public void basketpageMultProdmorethan1QtyAllServiceSavingsEnabled() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.subTotalvalueVerify();
		basketpage.basketPageProd1AllServices();
		basketpage.basketPageprod2AllServices();
}
	
	
	public void basketpage1Prodmorethan1QtyAllServicesSavingsDisabled() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty3();
		basketpage.basketPageProd1AllServices();
		
	}
	
	
	public void basketPageMultProductAllservicess() throws InterruptedException{
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketPageProd1AllServices();
		basketpage.basketPageprod2AllServices();		
	}
	
	
	public void basketpageMultProd3QtyAllServiceSavingsEnabled() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty3();
		basketpage.multipleProductsQty3();
		basketpage.subTotalvalueVerify();
		basketpage.basketPageProd1AllServices();
		basketpage.basketPageprod2AllServices();
}
	
     public void removeProd2FromBasket(){
	 BasketPage basketpage = new BasketPage(scriptHelper);
	 basketpage.RemoveProd2fromBasket();
   }	
	
    public void deliverypageMultProductSavingsEnabled() throws InterruptedException{
	 DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	 deliveryPage.deliverymethodMultProductWithPercentagePromo();
	 deliveryPage.deliveryOptionLongDesc();
}
	
   
    public void deliverypageMultProductSavingsEnabled1() throws InterruptedException{
	 DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	 deliveryPage.deliverymethodMultProductWithPercentagePromo();
	 deliveryPage.deliveryOptionLongDesc();
	 deliveryPage.deliveryToPayment();
}
	
    
    public void deliverypageSingleProduct() throws InterruptedException{
	 DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	 deliveryPage.deliveryTitleVerify();
	 deliveryPage.deliverymethodSingleProductWithPercentagePromo();
	 deliveryPage.deliveryOptionLongDesc();
	 deliveryPage.deliveryToPayment();
	 }
    
    
    public void deliverypageSingleProductAllServices() throws InterruptedException{
	 DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	 deliveryPage.deliverymethodSingleProductWithPercentagePromo();
	 deliveryPage.deliveryPagemultprod1AllServices();
	 deliveryPage.deliveryToPayment();
}

    
	
    public void paymentPageSavingsEnabled() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageCheck();
	}
 
	
	 public void paymentPagetoBasketPage() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.navigateTobasketFromPayment();
	}	
	
	public void verifyServicesbasketPage() throws InterruptedException{
		BasketPage basketpage = new BasketPage(scriptHelper);
	    basketpage.verifybasketPageprod1AllServices();
}	
	
	public void removeProductFromBasket(){
		 BasketPage basketpage = new BasketPage(scriptHelper);
		 basketpage.RemoveProd1fromBasket();
	}
	
	
	public void verifyProductBasketPage() throws InterruptedException{
	 BasketPage basketpage = new BasketPage(scriptHelper);
	 basketpage.productVerifyBasketPage();
}
	
	
	public void basketpageMultProd3QtyWithVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		basketpage.multipleProductsQty2();
		basketpage.verifyVoucherApply();
		basketpage.reduceMultProductQuantity();
	}
	
	
	public void deliveryPageMultProdAllServicesSavingenabledVerifyVoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliverymethodMultProductWithPercentagePromo();
		delvrypage.deliveryOptionLongDesc();
		delvrypage.voucherVerifyInDeliverypage();
	}		
		

	
	
	public void deliveryPageMultProdAllServicesSavingenabled() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
		delvrypage.homeDelOptionVerify();
		delvrypage.deliveryToPayment();
}
	
	
	public void deliveryPageBuyXGetYAllServices() throws InterruptedException {
	    DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1AllServices();
		delvrypage.deliveryPagemultprod2AllServices();
	}
	
	
	
	
	

	public void deliveryPageMultProdFewServiceDelInstrcn() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliveryPagemultprod1FewServices();
		delvrypage.deliveryTitleVerify();
		delvrypage.deliverymethodSingleProductWithPercentagePromo();
		delvrypage.deliveryInstructions();
	}
	
	
	
	
	public void paymentPageverifywithvoucherSavingsEnabled() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}
	
	
	public void paymentPageverifywithvoucherSavingsEnabled_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
		paymntpage.paypalPayment();
	}
	
	public void paymentPageVerifywithvoucher() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherVerifyInPaymentPage();
	}
	
	
	
	public void removeVoucher() throws InterruptedException{
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.removeVoucherFromBasket();
}
	

	public void addresspagewithoutVoucher() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.addressPageVerify();
		addrspage.navigateToDeliveryPage();
	}
	
	
	
	public void removalVoucherVerify() throws InterruptedException{
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.verifyVoucherRemoval();
	}
	
	
	public void addresspageMultProdverifyVoucherremoval() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.verifyVoucherRemovalAddressPage();
		addrspage.navigateToDeliveryPage();
	}
	
	
	
	public void deliveryPageMultProdVerifyVoucherRemoval() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliverymethodMultProductWithPercentagePromo();
		delvrypage.VerifyVoucherRemovalDeliveryPage();
		delvrypage.deliveryToPayment();
}
	
	
	public void paymentPageMultProdverifyVoucherRemoval() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.VerifyVoucherRemovalPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}
	
	
	public void paymentPageMultProdverifyVoucherRemoval_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.VerifyVoucherRemovalPaymentPage();
		paymntpage.paypalPayment();
	}
	
	
	public void orderconfirmationpageMultProdVerifyVoucherRemoval() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.verifyVoucherRemovalOCPage();
	}
	
	
	public void basketpagemultipleProductQty3NewVoucher() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty3();
		basketpage.multipleProductsQty3();
		basketpage.verifyNewVoucherApply();
		//basketpage.basketCheckout();
	}
	
	
	public void basketpageReduceMultProductQuantity(){
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.reduceMultProductQuantity();
	}

	
   public void navigationToDeliveryPageFromPaymentPage(){
	   PaymentPage paymntpage = new PaymentPage(scriptHelper);
	   paymntpage.navigateToDeliveryFromPayment();
 }
	
	
   public void deliveryPageUpdate() throws InterruptedException{
	   DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
	   delvrypage.VerifydeliveryInstructionsRetain();
	   delvrypage.deliveryOptionLongDesc();
	   delvrypage.updateProd1Services();
	   delvrypage.deliveryToPayment();
 }
	
	
	
	public void basketpageMultProd3Qty() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty3();
		basketpage.multipleProductsQty3();
	}	
	
	public void basketpageSingleProd2QtyAllServiceSavingsEnabled() throws InterruptedException {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.productQty2();
		//basketpage.subTotalvalueVerify();
	}
	
	
 	
	public void orderconfirmationpageDeliveryInstruction() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.verifyDeliveryInstructionOCPage();
	}
	
	
	
	public void addresspageverifyvoucher() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.voucherVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}
	
	
	public void deliveryPageMultProdVerifyServicesVoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliverymethodMultProductWithPercentagePromo();
		delvrypage.verifyProd1Services();
		delvrypage.voucherVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
}
	
	
	public void pdpViewbasket1() throws InterruptedException {
		PDPPage pdppage = new PDPPage(scriptHelper);
		pdppage.viewBasket();
	}
	
	
	public void basketpageCheckout1() {
		BasketPage basketpage = new BasketPage(scriptHelper);
		basketpage.basketCheckout();
	}
	
	
	public void addresspage1() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.navigateToDeliveryPage();
	}
	
	
	public void paymentPage1() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}
	
	
	public void deliveryPageSummaryVerify(){ 
		DeliveryPage deliverypage = new DeliveryPage(scriptHelper);
		deliverypage.deliveryPageSavingsTotalCheck(); 
		} 
	

	public void orderconfirmationpageverifyNewvoucher() throws InterruptedException {
		OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
		orderconfrmtnpage.voucherNewVerifyInOrderConfirmationPage();
	}
	
	
	
	
	public void paymentPageverifyNewvoucherSavingsEnabled() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherNewVerifyInPaymentPage();
		paymntpage.paymentPageVerify();
		paymntpage.termsAndConditions();
		paymntpage.confirmAndPay();
	}
	
	
	public void paymentPageverifyNewvoucherSavingsEnabled_Paypal() throws InterruptedException {
		PaymentPage paymntpage = new PaymentPage(scriptHelper);
		paymntpage.voucherNewVerifyInPaymentPage();
		paymntpage.paypalPayment();
	}
	
	public void addressPageVerifyNewvoucher() throws InterruptedException {
		AddressPage addrspage = new AddressPage(scriptHelper);
		addrspage.voucherNewVerifyInAddressPage();
		addrspage.navigateToDeliveryPage();
	}
	
	
	public void deliveryPageMultProdVerifyServicesNewVoucher() throws InterruptedException {
		DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
		delvrypage.deliverymethodMultProductWithPercentagePromo();
		//delvrypage.verifyProd1Services();
		delvrypage.voucherNewVerifyInDeliverypage();
		delvrypage.deliveryToPayment();
}
	
	
  public void addressToDelivery(){
	AddressPage addrspage = new AddressPage(scriptHelper);
	addrspage.navigatetoDeliverypage();
	}
	
	
  public void delPageCheckWithVoucher() throws InterruptedException {
      DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
      delvrypage.deliveryTitleVerify();
      //delvrypage.serviceReadmoreReadlessVerification();
      delvrypage.voucherVerifyInDeliverypage();
      delvrypage.deliveryPageCheck();
      
}

public void serviceSelectorAvailabilityCheck() throws InterruptedException {
      DeliveryPage delivrypage = new DeliveryPage(scriptHelper);
      delivrypage.serviceSelectorAvailabilityCheck();
}

public void paymentPageMultiProductPromoVerifyWithPaypal() throws InterruptedException {
      PaymentPage paymntpage = new PaymentPage(scriptHelper);
      paymntpage.promoVerifyInPaymentPage();
      paymntpage.voucherVerifyInPaymentPage();
      paymntpage.promoVerifyInPaymentPage2Products();
      paymntpage.paypalPayment();
}

public void basketMultiProductAllServicesSelect() throws InterruptedException {
      BasketPage basketpage = new BasketPage(scriptHelper);
      basketpage.basketMultiProductAllServicesSelect();

}

public void invokeApplicationNewURL() {
	String applicationUrlData = dataTable.getData("General_Data", "ApplicationnewUrl");
	report.updateTestLog("Invoke Application", "Invoke the application under test @: " + applicationUrlData,Status.PASS);
	driver.get(applicationUrlData);
}
	
public void pdpPageaddtobasketMultiProds1() throws InterruptedException {
	PDPPage pdppage = new PDPPage(scriptHelper);
	pdppage.addToBasketMultiProducts();
}
	
	

public void addresspage() throws InterruptedException {
    AddressPage addrspage = new AddressPage(scriptHelper);
    addrspage.addressPageVerifyItaElx();
//    addrspage.navigateToDeliveryPage();
}
 

public void paymentpageEditClickButton() throws InterruptedException {
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.editButtondisplayVerify();
}



public void navigateToDeliveryPage() throws InterruptedException {
    AddressPage addrspage = new AddressPage(scriptHelper);
    addrspage.navigateToDeliveryPage();
}



public void deliveryPageToPaymentPage() throws InterruptedException {
	DeliveryPage delvrypage = new DeliveryPage(scriptHelper);
	delvrypage.deliveryToPayment();
}
	
	
public void paymentpageErrormessageVerify() throws InterruptedException {
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPagePaymentMethodErrorVerify();
}	



public void basketPage1Qty() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.productQty1();
	
}



public void basketPage1Productservices() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageProd1Service();
}


public void addresspage1Service() throws InterruptedException {
	AddressPage addrspage = new AddressPage(scriptHelper);
	addrspage.addressPageVerifyItaElx();
}


public void addressPagetoBasketPage() throws InterruptedException {
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.navigateTobasketFromPayment();
}


public void basketPage1ProductDeselectService() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageProd1DeselectService();
}



public void basketPage1Product2ndservice() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPage1Prod2ndService();
}



public void deliveryPage1ServiceSelection() throws InterruptedException {
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPage1prod1Service();

}


public void paymentPageVATCheckAndNavigateToDelivery(){
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageVATVerify();
	paymntpage.click_EditAddress_FromPaymentPage();
}


public void deliveryPageEditService() throws InterruptedException {
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPage1prodEditService();

}


public void paymentPageVATCheck(){
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageVATVerify();
}


public void basketPageCalculationsVerify() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageCartTotalVerifyITAELX();
}


public void basketPageCalculationswithServicesVerify() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageCartTotalVerifyITAELX();
}



public void addressPageCalculationsVerify() throws InterruptedException{
	AddressPage addrspage = new AddressPage(scriptHelper);
	addrspage.addressPageCartTotalVerifyITAELX();
}



public void deliveryPageCalculationsVerify() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.homeDelOptionVerify();
	deliveryPage.deliveryPageCartTotalVerifyITAELX();
}


public void deliveryPageCalculationsVerifyDEUAEG() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.homeDelOptionVerify();
	deliveryPage.deliveryPageCartTotalVerifyDEUAEG();
}


public void deliveryPageMultipleProdSelect1stService1by1() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageMultProdSelect1stService1by1();
	deliveryPage.deliveryPageCartTotalVerifyDEUAEG();

}




public void deliveryPageCalculationsVerify1() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.homeDelOptionVerify();
	deliveryPage.deliveryPageCartTotalVerifyDEUAEG();
}


public void paymentPageCalculationsVerify() throws InterruptedException{
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageCartTotalVerifyITAELX();
}


public void paymentPageCalculationsVerify1() throws InterruptedException{
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageCartTotalVerifyITAELX();
}


public void deliveryPageEditSelectedServices() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageEditService();
}

public void deliveryPageLastServiceSelection() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPagemultprodLastServiceSelection();
	deliveryPage.deliveryPageCartTotalVerifyDEUAEG();
}



public void ocPageCalculationsVerify() throws InterruptedException{
	OrderConfirmationPage orderconfrmtnpage = new OrderConfirmationPage(scriptHelper);
	orderconfrmtnpage.orderConfirmationPageCartTotalVerifyITAELX();
}



public void basketPageCalculationswithoutServicesVerify() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageCartTotalVerifyWithoutServicesITAELX();
}


public void basketPageCalculationswithoutServicesVerify1() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageCartTotalVerifyWithoutServicesITAELX();
}

public void basketPageProd1SingleServiceSelect() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageProd1SingleServiceSelect();
	basketpage.basketPageCartTotalVerifyWithoutServicesITAELX();
}


public void basketPageProd2SingleServiceSelect() throws InterruptedException{
	BasketPage basketpage = new BasketPage(scriptHelper);
	basketpage.basketPageProd22ndService();
	basketpage.basketPageCartTotalVerifyWithoutServicesITAELX();
}



public void deliveryPageMultProdServiceSelect() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageProd1AllServices();
	deliveryPage.multProdMoveCursorToCartSummaryDeliverypage();
	deliveryPage.deliveryPageProd2AllServices();
	deliveryPage.multProdMoveCursorToCartSummaryDeliverypage();
}


public void deliveryPageSingleProdServiceDeselect() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageProd1DeselectAllServices();
	deliveryPage.multProdMoveCursorToCartSummaryDeliverypage();
}


public void deliveryPage2ndProdServiceDeselect() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageProd2DeselectAllServices();
	deliveryPage.multProdMoveCursorToCartSummaryDeliverypage();
}

public void addressPageCalculationsVerifyWith1Service() throws InterruptedException{
	AddressPage addrspage = new AddressPage(scriptHelper);
	addrspage.addressPageCartTotalVerifyWithoutServicesITAELX();
}


public void addressPageCalculationsVerifyWith1Service1() throws InterruptedException{
	AddressPage addrspage = new AddressPage(scriptHelper);
	addrspage.addressPageCartTotalVerifyWithoutServicesITAELX();
	addrspage.navigatetoDeliverypage();
}


public void deliveryPageCalculationsVerifyWith1Service() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageCartTotalVerifyWith1ServicesITAELX();
}


public void deliveryPageCalculationsVerifyWith1Service1() throws InterruptedException{
	DeliveryPage deliveryPage = new DeliveryPage(scriptHelper);
	deliveryPage.deliveryPageCartTotalVerifyWith1ServicesITAELX();
	deliveryPage.deliveryToPayment();
}


public void paymentPageCalculationsVerifyWith1Service() throws InterruptedException{
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageCartTotalVerifyWith1ServicesITAELX();
}



public void paymentPageCalculationsVerifyWith1Service1() throws InterruptedException{
	PaymentPage paymntpage = new PaymentPage(scriptHelper);
	paymntpage.paymentPageCartTotalVerifyWith1ServicesITAELX();
}









}