package amazonPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amazonClass.AboutUs;
import amazonClass.AddToCart;
import amazonClass.HomePage;
import amazonClass.Mellora;
import amazonClass.SelectJewellery;
import browser.Base;

public class AmazonTC {
	
	ChromeOptions options;
	WebDriver driver;
	HomePage homePage;
	Mellora mellora;
	SelectJewellery selectJewellery;
	AddToCart addToCart ;
	AboutUs aboutUs ;
	

	@BeforeClass
	public void lauchtheApplication() {
		options = new ChromeOptions().addArguments("disable-notifications");

		driver = Base.openChromeBrowser();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");

}
	
	@Test (priority = 1)
	public void verifyAboutUsPage() {
		aboutUs = new AboutUs (driver);
		aboutUs.clickaboutUsLink();
	}
	
	@Test
	
		public void verifyOrderAndAddToCart() {
			homePage = new HomePage(driver);
			homePage.sendKeysSearchTab();
			homePage.clickSearchIcon();
			
			mellora = new Mellora(driver);
			mellora.clickJewellery();
			
			selectJewellery= new SelectJewellery(driver);
			selectJewellery.clickTargetJewellery();
			
			addToCart = new AddToCart(driver);
			addToCart.clickAddToCart();
			addToCart.clickHomeIcon();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
}
