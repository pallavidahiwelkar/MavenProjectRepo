package myntraClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bag {
	
	@FindBy (xpath="//span[text()='Bag']")
	private WebElement itemsInBag ;
	
	
	public Bag (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickItemsInBag() {
		itemsInBag.click();
	}
}