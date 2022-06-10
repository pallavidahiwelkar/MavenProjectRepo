package myntraClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildPopUpWindow {
	
	
			@FindBy (xpath = "(//button[contains(@class,'size-buttons')])[2]")
			private WebElement selectSize ; 
			
			
			@FindBy (xpath = "//div[text()='ADD TO BAG']")
			private WebElement addToBag ;
			
			@FindBy (xpath = "(//span[contains(@class,'myntraweb-')])[3]")
			private WebElement goToBag ;
			
			
			WebDriver driver;
			public ChildPopUpWindow (WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver ;
			}
	
	
			
			public void selectionOfDress () {
				ArrayList<String> arr = new ArrayList<String> (driver.getWindowHandles());
				driver.switchTo().window(arr.get(1));
				
				selectSize.click();
				addToBag.click();
				goToBag.click();
				
				
			}
	
	
			
	
	

}
	
	
	
	
	
	
	
	
	


