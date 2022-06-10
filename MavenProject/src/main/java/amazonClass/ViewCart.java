package amazonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {
	
	@FindBy (xpath = "//span[@class='nav-cart-icon nav-sprite']")
	private WebElement itemsInCart ;
	
	
	public ViewCart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void clickItemsInCart() {
		itemsInCart.click();
	}
}
