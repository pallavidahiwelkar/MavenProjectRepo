package flipkartClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LipstickPage {
	
	
	
				@FindBy (xpath = "(//img[@class='_396cs4 _3exPp9'])[26]")
				private WebElement scrollTillDest ; 
				
				
				@FindBy (xpath = "(//a[contains(@title,'Renee Fab')])[1]")
				private WebElement lipsticktitle ; 
				
				
				
				public LipstickPage (WebDriver driver) {
					PageFactory.initElements(driver, this);
				
				
				}
	
					
				
				public void clickLipsticktitle () {
					
					lipsticktitle.click();
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
