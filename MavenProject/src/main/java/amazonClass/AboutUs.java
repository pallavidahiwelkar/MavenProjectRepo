package amazonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	
	
		@FindBy (xpath = "((//div[contains(@class,'navFooterLinkCol')])[1]//a)[1]")
		private WebElement aboutUsLink ;

		
		public AboutUs (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickaboutUsLink() {
			aboutUsLink.click();
		}
}
