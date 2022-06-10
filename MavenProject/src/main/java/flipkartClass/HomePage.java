package flipkartClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	
	
			@FindBy (xpath = "//div[text()='Beauty, Toys & More']")
			private WebElement beautyToysAndMore ;
			
			
			@FindBy (xpath = "//a[text()='Beauty & Personal Care']")
			private WebElement beautyAndPersonalCare ;
	
			@FindBy (xpath = "//a[text()='Lip Makeup']")
			private WebElement lipMakeup ;
	
	
			WebDriver driver;
			public HomePage (WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver ;
			}
	
	
		public void selectProduct () {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(beautyAndPersonalCare));
			Actions act = new Actions (driver);
			act.moveToElement(beautyToysAndMore).moveToElement(beautyAndPersonalCare).moveToElement(lipMakeup).click().build().perform();
			
		}
	
}
