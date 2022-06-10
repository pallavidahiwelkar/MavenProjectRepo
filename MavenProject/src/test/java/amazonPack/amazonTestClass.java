package amazonPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import amazonClass.AboutUs;
import amazonClass.AddToCart;
import amazonClass.HomePage;
import amazonClass.Mellora;
import amazonClass.SelectJewellery;
import amazonClass.ViewCart;

public class amazonTestClass {
	
		public static void main(String[] args) {
			
			ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in");
			
			// 1. To verify if we are able to order the item
			HomePage homePage = new HomePage(driver);
			homePage.sendKeysSearchTab();
			homePage.clickSearchIcon();
			
			Mellora mellora = new Mellora(driver);
			mellora.clickJewellery();
			
			SelectJewellery selectJewellery= new SelectJewellery(driver);
			selectJewellery.clickTargetJewellery();
			
			AddToCart addToCart = new AddToCart(driver);
			addToCart.clickAddToCart();
			addToCart.clickHomeIcon();
			
			
			// 2. To verify if we are able to check about us page 
			
			AboutUs aboutUs = new AboutUs (driver);
			aboutUs.clickaboutUsLink();
			
			driver.close();
			

}

}
