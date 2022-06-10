package myntraPack;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myntraClass.Bag;
import myntraClass.ChildPopUpWindow;
import myntraClass.DressPage;
import myntraClass.HomePage;

public class MyntraTC {
	
	ChromeOptions options;
	WebDriver driver ;
	HomePage homepage;
	DressPage dressPage;
	ChildPopUpWindow childPopUpWindow;
	Bag bag ;
	
	@BeforeClass
	public void launchBrowser() {
		options = new ChromeOptions().addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.myntra.com");
	}
		
		@BeforeMethod
		public void homePageOfApplication () {
		homepage = new HomePage (driver);
	}
		
		@Test
		public void orderDress() {
		homepage.SelectionOfDress();
		dressPage = new DressPage (driver);
		dressPage.clickDress();
		childPopUpWindow = new ChildPopUpWindow (driver);
		childPopUpWindow.selectionOfDress();
		}
		
		@Test
		public void checkBag() {
		bag = new Bag (driver);
		bag.clickItemsInBag();
		}


		@AfterMethod
		public void backwardOperation() {
			driver.navigate().back();
		}
		
		@AfterClass
		public void closeBrowser() {
			driver.close();
			driver.quit();
		}
		
		
		
		
		
}
