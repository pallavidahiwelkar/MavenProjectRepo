package instaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy (xpath = "//a[contains(@aria-label,'Direct')]")
	private WebElement messenger ;
	
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickMessenger () {
		messenger.click();
	}

}
