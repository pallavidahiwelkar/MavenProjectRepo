package amazonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart ;
	
	@FindBy (xpath = "//a[@id='nav-logo-sprites']")
	private WebElement homeIcon ;
	
	
	public AddToCart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCart () {
		addToCart.click();
	}
	
	public void clickHomeIcon() {
		homeIcon.click();
	}
	

}
