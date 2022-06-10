package myntraClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
			@FindBy (xpath = "//div[@data-reactid='179']")
			private WebElement womenSection ; 
	
			@FindBy (xpath = "(//a[text()='Dresses'])[1]")
			private WebElement selectDress ; 
	
			
			
			WebDriver driver;
			public HomePage (WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver ;
			}
			
			public void SelectionOfDress () {
				Actions act = new Actions (driver);
				act.moveToElement(womenSection).moveToElement(selectDress).click().build().perform();
			}
			
			
			
			
			
			
}
