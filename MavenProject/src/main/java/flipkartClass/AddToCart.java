package flipkartClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	
	
			@FindBy (xpath = "(//li[@class='col col-6-12'])[1]")
			private WebElement addToCart ;
	
			WebDriver driver ;
			
			public AddToCart (WebDriver driver) {
				PageFactory.initElements(driver, this);	
				this.driver = driver ;				
				}
	
			
	
	
			public void clickAddToCart ()
			{
				WebDriverWait wait = new WebDriverWait (driver, 20);
				wait.until(ExpectedConditions.visibilityOf(addToCart));
				addToCart.click();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
