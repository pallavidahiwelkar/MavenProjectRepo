package amazonClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
		@FindBy (xpath = "//input[@type='text']")
		private WebElement searchtab ;
		
		@FindBy (xpath = "//input[@type='submit']")
		private WebElement searchIcon ;
		
		
		public HomePage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
		
		public void sendKeysSearchTab() {
			searchtab.sendKeys("Earrings");
		}
		
		public void clickSearchIcon () {
			searchIcon.click();
		}

}
