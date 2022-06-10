package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
		@FindBy (xpath = "//div[@class='EforU']//img")
		private WebElement profileIcon ;
		
		@FindBy (xpath = "//div[text()='Log Out']")
		private WebElement logout ;
		
		
		
		public LogOut (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void clickProfileIcon() {
			profileIcon.click();
		}
		
		public void clicklogout() {
			logout.click();
		}

}
