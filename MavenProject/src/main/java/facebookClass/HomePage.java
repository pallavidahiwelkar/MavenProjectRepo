package facebookClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	
				@FindBy (xpath = "(//span[contains(@class,'tojvnm2t')])[9]")
				private WebElement messanger ;
	
				
				@FindBy (xpath = "//div[@aria-label='Your profile']")
				private WebElement profileIcon ;
			
				@FindBy (xpath = "(//span[contains(@class,'tojvnm2t')])[8]")
				private WebElement notification ;
	
				@FindBy (xpath = "(//span[@class='l9j0dhe7'])[2]")
				private WebElement friends ;
				
				@FindBy (xpath = "//span[text()='Log Out']")
				private WebElement logout ;
	
	
	
	
				public HomePage (WebDriver driver) {
					PageFactory.initElements(driver, this);
					
				
				}
	
	
				
				public void clickMessanger () {
					messanger.click();
				}
	
				
				public void clickNotification() {
					notification.click();
				}
				
				public void clickFriends () {
					friends.click();
				}
				
				
				public void clickprofileIcon() {
					profileIcon.click();
				}
				
				public void clickLogout() {
					logout.click();
				}
				
				
				
				
				
	

}
