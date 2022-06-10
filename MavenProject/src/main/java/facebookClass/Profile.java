package facebookClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {

	
	@FindBy (xpath = "((//div[contains(@class,'s45kfl79')])[23]")
	private WebElement profilePicture ;

	
	public Profile (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkProfile() {
		profilePicture.click();
	}
}
