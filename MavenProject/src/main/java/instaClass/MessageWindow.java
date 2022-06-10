package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageWindow {
	
	
		@FindBy (xpath= "//textarea[@placeholder='Message...']")
		private WebElement typeMessage ;
		
		@FindBy (xpath= "//button[text()='Send']")
		private WebElement sendButton ;
		
		
		public MessageWindow (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void sendTypeMessage() {
			typeMessage.sendKeys("Hi");
		}
		
		public void clickSendButton() {
			sendButton.click();
		}

}
