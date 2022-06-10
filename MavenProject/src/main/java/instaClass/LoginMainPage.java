package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMainPage {
	
	
	@FindBy (xpath ="//button[@type='button']")
	private WebElement loginWithFb ;
	
	
	public LoginMainPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginWithFb() {
		loginWithFb.click();
	}

}
