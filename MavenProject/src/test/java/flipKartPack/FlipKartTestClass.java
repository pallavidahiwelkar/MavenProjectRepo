package flipKartPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import flipkartClass.AddToCart;
import flipkartClass.HomePage;
import flipkartClass.LipstickPage;
import flipkartClass.LoginPopUp;

public class FlipKartTestClass {
	
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	
	
		Thread.sleep(1000);
	
		LoginPopUp loginPopUp = new LoginPopUp(driver);
		loginPopUp.clickCrossButton();
			
		HomePage homePage = new HomePage (driver);
		homePage.selectProduct();
		
		LipstickPage lipstickPage = new LipstickPage (driver);
		lipstickPage.clickLipsticktitle();
		
		AddToCart addCart= new AddToCart (driver);
		addCart.clickAddToCart();
}	
}
