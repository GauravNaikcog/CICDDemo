package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Status;

public class AddToCartPage extends MasterPage {

	@FindBy(xpath = "//span[@class='D2CMiniBasket-itemCount']")
	WebElement basketIcon;

	@FindBy(xpath = "//button[contains(text(),'Do il consenso')]")
	WebElement cookieAccept;

	@FindBy(xpath = "(//span[contains(text(),'Add to basket')])[1]")
	WebElement addToBasket;

	@FindBy(xpath = "//a[contains(text(),'View basket')]")
	WebElement viewBasket;

	public AddToCartPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
		// TODO Auto-generated constructor stub
	}
	public void addToCartMultipleProduct() {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(addToBasket));
		addToBasket.click();
	}
	public void viewBasket() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(basketIcon));
		basketIcon.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(viewBasket));
		viewBasket.click();
		report.updateTestLog("View Basket", "Clicked on View Basket",
				Status.PASS);
	}
	public void addToCart() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(cookieAccept));
		cookieAccept.click();
		wait.until(ExpectedConditions.visibilityOf(addToBasket));
		addToBasket.click();
		report.updateTestLog("Add to basket", "Product is added to basket",
				Status.PASS);
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(basketIcon));
		basketIcon.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(viewBasket));
		viewBasket.click();
		report.updateTestLog("View Basket", "Clicked on View Basket",
				Status.PASS);
	}
}