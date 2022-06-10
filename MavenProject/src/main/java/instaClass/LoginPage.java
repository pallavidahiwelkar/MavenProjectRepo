package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pass']")
	private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginButton ;
	
	
	
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	public void loginToApplication () {
		userName.sendKeys("07304808894");
		password.sendKeys("Facebook@01");
		loginButton.click();
	}
}
