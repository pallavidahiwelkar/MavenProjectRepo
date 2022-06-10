package amazonClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectJewellery {

	
	@FindBy (xpath = "(//a[contains(@class,'style')])[2]")
	private WebElement targetJewellery ;
	
	WebDriver driver;
	
	public SelectJewellery (WebDriver driver) {
		PageFactory.initElements(driver, this);
		 this.driver = driver;
	}
	
	public void clickTargetJewellery() {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);",targetJewellery );
		targetJewellery.click();
	}
	
	
}
