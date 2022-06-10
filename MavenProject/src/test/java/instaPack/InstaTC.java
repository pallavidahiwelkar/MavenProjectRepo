package instaPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import instaClass.HomePage;
import instaClass.LogOut;
import instaClass.LoginMainPage;
import instaClass.LoginPage;
import instaClass.MessageWindow;
import instaClass.PopupWindowToSearchUser;
import instaClass.SendMessage;

public class InstaTC {
	
	ChromeOptions options;
	WebDriver driver;LoginMainPage loginMainPage;
	LoginPage loginPage;
	HomePage homePage;
	SendMessage sendMessage;
	PopupWindowToSearchUser popupWindowToSearchUser;
	MessageWindow messageWindow;
	LogOut logOut;
	
	@BeforeClass
	public void lauchBrowser () {
		options = new ChromeOptions().addArguments("disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
	}
	
	@BeforeMethod
	public void loginToApplication() {
		loginMainPage = new LoginMainPage (driver);
		loginMainPage.clickLoginWithFb();
		
		loginPage = new LoginPage (driver);
		loginPage.loginToApplication();
		
		homePage = new HomePage (driver);
	}
	
	@Test
	public void sendMessage() {
		homePage.clickMessenger();
		
		sendMessage = new SendMessage (driver);
		sendMessage.clickSendMessage();
		
		popupWindowToSearchUser = new PopupWindowToSearchUser(driver);
		popupWindowToSearchUser.toSelectUser();
		
		messageWindow = new MessageWindow (driver);
		messageWindow.sendTypeMessage();
		messageWindow.clickSendButton();
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		logOut = new LogOut (driver);
		logOut.clickProfileIcon();
		logOut.clicklogout();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
