package myntraPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import myntraClass.ChildPopUpWindow;
import myntraClass.DressPage;
import myntraClass.HomePage;


public class MyntraTestClass {
	
	
	
		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			
			driver.get("https://www.myntra.com");
			
			HomePage homepage = new HomePage (driver);
			homepage.SelectionOfDress();
			
			DressPage dressPage = new DressPage (driver);
			dressPage.clickDress();
			
			ChildPopUpWindow childPopUpWindow = new ChildPopUpWindow (driver);
			childPopUpWindow.selectionOfDress();
			
			
			}
			
			
		}

