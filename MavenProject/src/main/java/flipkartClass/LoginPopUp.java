package flipkartClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPopUp {
	
	
			@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']")
			private WebElement crossButton ;
			
			WebDriver driver;
			
			public LoginPopUp (WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver ;
			}
	
			
			
			public void clickCrossButton () {
				WebDriverWait wait = new WebDriverWait (driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(crossButton));
				crossButton.click();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
