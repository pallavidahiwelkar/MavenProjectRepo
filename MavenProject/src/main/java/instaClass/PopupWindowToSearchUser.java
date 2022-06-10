package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupWindowToSearchUser {
	
	
	@FindBy (xpath = "//input[@name='queryBox']")
	private WebElement searchUser ;
	
	@FindBy (xpath = "(//div[@class='QBdPU '])[4]")
	private WebElement selectUser ;
	
	@FindBy (xpath = "(//button[@type='button'])[6]")
	private WebElement nextButton ;
	
	
	
	public PopupWindowToSearchUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void toSelectUser() {
		searchUser.sendKeys("Akshay Punekar");
		selectUser.click();
		nextButton.click();
	}

}
