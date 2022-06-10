package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessage {

	
		@FindBy (xpath = "//button[text()='Send Message']")
		private WebElement sendMessage ;
		
		
		public SendMessage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void clickSendMessage() {
			sendMessage.click();
		}
}
