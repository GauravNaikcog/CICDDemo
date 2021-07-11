package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class PLPPage extends MasterPage {

	@FindBy(xpath = "(//a[@href='/it-it/kitchen/cooking/hobs/'])[2]")
	WebElement productCat;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary D2cPLPProductGridItem-ctaLink')])[1]")
	WebElement product1ViewDetailBtn;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary D2cPLPProductGridItem-ctaLink')])[2]")
	WebElement product2ViewDetailBtn;

	@FindBy(xpath = "//a[contains(@class,'ProductLanding-backLink')]")
	WebElement back2CategoryBtn;

	@FindBy(xpath = "//span[@class='D2CMiniBasket-itemCount']")
	WebElement basketIcon;

	@FindBy(xpath = "(//button[contains(@class,'CookieConsent')])[2]")
	WebElement cookieAccept;

	@FindBy(xpath = "//button[@class='NavSite-searchButton']")
	WebElement searchBtn;

	@FindBy(xpath = "//input[@class='NavSearch-form-input']")
	WebElement mainSearchField;

	@FindBy(xpath = "(//a[contains(@class,'SearchResultNav-link')])[1]")
	WebElement plpSearchViewProduct;

	public PLPPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : plpPageMultipleProductSelection()*
	 * @Description : This function is used to select second product*
	 * @Author : Mohan
	 ************************************************************************/
	public void plpPageMultipleProductSelection() throws InterruptedException {
		String productid2Data = dataTable.getData("General_Data", "Product2ID");
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(product1ViewDetailBtn));
		driver.findElement(By.xpath("//a[contains(text(),'" + productid2Data
				+ "')]/following::a[2]")).click();
		report.updateTestLog("View Product detail button of product 2",
				"Clicked on View Product detail button of product 2",
				Status.PASS);
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : plpPageSelectProduct()*
	 * @Description : This function is used to select the single product with
	 *              cookie accept*
	 * @Author : Gaurav
	 ************************************************************************/
	public void plpPageSelectProduct() throws InterruptedException {
		try {
			String productidData = dataTable.getData("General_Data",
					"ProductID");
			WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
			try {
				wait.until(ExpectedConditions.visibilityOf(cookieAccept));
				if (cookieAccept.isDisplayed()) {
					cookieAccept.click();
					report.updateTestLog("Cookie accept button",
							"Clicked on Cookie accept button", Status.PASS);
				} else {
					report.updateTestLog("Cookie accept button",
							"Cookie accept button is not present", Status.PASS);
				}
			} catch (Exception e) {
				report.updateTestLog("Cookie accept button",
						"Cookie accept button is not present", Status.PASS);
			}
			wait.until(ExpectedConditions.visibilityOf(product1ViewDetailBtn));
			driver.findElement(By.xpath("//a[contains(text(),'" + productidData
					+ "')]/following::a[2]")).click();
			report.updateTestLog("View Product detail button",
					"Clicked on View Product detail button of product 1",
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("View Product detail button",
					"Products are not loaded in PLP page", Status.FAIL);
		}
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : plpPageSelectProduct1()*
	 * @Description : This function is used to select the single product in
	 *              global search*
	 * @Author : Gaurav
	 ************************************************************************/
	public void plpPageSelectProduct1() throws InterruptedException {
		try {
			String productidData = dataTable.getData("General_Data",
					"ProductID");
			WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
			wait.until(ExpectedConditions.visibilityOf(cookieAccept));
			try {
				cookieAccept.click();
			} catch (Exception e) {
				report.updateTestLog("Cookie accept button",
						"Cookie accept button is not present", Status.PASS);
			}
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			Thread.sleep(4000);
			searchBtn.click();
			mainSearchField.sendKeys(productidData);
			mainSearchField.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("(//a[contains(text(),'" + productidData
					+ "')]/following::a[1])[1]")).click();
			report.updateTestLog("View Product detail button",
					"Clicked on View Product detail button of product",
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("View Product detail button",
					"Products are not loaded in PLP page", Status.FAIL);
		}
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : singleProductGlobalSearch()*
	 * @Description : This function is used to select the multiple product in
	 *              global search*
	 * @Author : Gaurav
	 ************************************************************************/
	public void multipleProductSelection() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(back2CategoryBtn));
		back2CategoryBtn.click();
		report.updateTestLog("Back button",
				"Clicked on the back button on the PDP page", Status.PASS);
		Thread.sleep(8000);
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : singleProductGlobalSearch()*
	 * @Description : This function is used to select the single product in
	 *              global search*
	 * @Author : Gaurav
	 ************************************************************************/
	public void singleProductGlobalSearch() {
		try {
			String productidData = dataTable.getData("General_Data",
					"ProductID");
			try {
				cookieAccept.click();
				report.updateTestLog("Cookie accept button",
						"Clicked on cookie accept button", Status.PASS);
			} catch (Exception e) {
				report.updateTestLog("Cookie accept button",
						"Cookie accept button is not present", Status.PASS);
			}
			Thread.sleep(6000);
			searchBtn.click();
			mainSearchField.sendKeys(productidData);
			mainSearchField.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("(//a[contains(text(),'" + productidData
					+ "')]/following::a[1])[1]")).click();
			report.updateTestLog("View Product detail button",
					"Clicked on View Product detail button of product",
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("View Product detail button",
					"View Product button is not available", Status.FAIL);
		}
	}
	/************************************************************************
	 * @Project Name : Electrolux*
	 * @Function Name : secondProductSelectionGlobalSearch()*
	 * @Description : This function is used to select the second product in
	 *              global search*
	 * @Author : Mohan
	 ************************************************************************/
	public void secondProductSelectionGlobalSearch()
			throws InterruptedException {
		try {
			String product2idData = dataTable.getData("General_Data",
					"Product2ID");
			Thread.sleep(6000);
			searchBtn.click();
			mainSearchField.sendKeys(product2idData);
			mainSearchField.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("(//a[contains(text(),'"
					+ product2idData + "')]/following::a[1])[1]")).click();
			report.updateTestLog("View Product detail button for product 2",
					"Clicked on View Product detail button of product 2",
					Status.PASS);
		} catch (Exception e) {
			report.updateTestLog("View Product detail button for product 2",
					"View Product button is not available for product 2",
					Status.FAIL);
		}
	}
}