package amazonClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mellora {
	
	
	
	@FindBy (xpath = "(//span[@class='a-truncate-cut'])[3]")
	private WebElement jewellery ;
	
	
	WebDriver driver;
	
	public Mellora (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	
	public void clickJewellery() {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);",jewellery );
		jewellery.click();
	}

}
