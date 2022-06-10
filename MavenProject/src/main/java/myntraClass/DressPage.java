package myntraClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	
	
			@FindBy (xpath = "//img[contains(@alt,'Harpa Pink')]")
			private WebElement dress ; 
			
			
			
			public DressPage (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
	
			public void clickDress () {
				
				dress.click();
			}

}
