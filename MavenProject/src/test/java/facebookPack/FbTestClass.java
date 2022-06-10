package facebookPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import facebookClass.HomePage;
import facebookClass.LoginPage;
import facebookClass.Profile;

public class FbTestClass {
	
	ChromeOptions options;
	WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	Profile profile;
	String url;
	
	@BeforeClass 
	public void  launchBrowser() {
		options = new ChromeOptions().addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
		
	@BeforeMethod
	public void lauchTheAppliction () {
	loginPage = new LoginPage (driver);
	loginPage.loginToApplication();
	homepage = new HomePage (driver);
	}
	
	@Test (priority = 1)
	public void VerifyingFriendRequest() {
		homepage.clickFriends();
		
		Assert.assertEquals("https://www.facebook.com/friends", "https://www.facebook.com/friends");
	
	}
	
	@Test (priority = 2)
	public void checkNotifications() {
		homepage.clickNotification();
	}
		
		@Test (priority = 3)
		public void checkMessages() {
			homepage.clickMessanger();
			
		}
		
		@Test (invocationCount = 2)
		public void checkProfile() {
			profile.checkProfile();
			SoftAssert soft = new SoftAssert ();
			soft.assertEquals("https://www.facebook.com/pallavi.dahiwelkar/", "https://www.facebook.com/pallavi.dahiwelkar/");
			soft.assertAll();
		}
		
		@AfterMethod
		public void logoutApplication() {
			homepage.clickprofileIcon();
			homepage.clickLogout();
		}
		
		@AfterClass
		public void closeBrowser() {
			driver.close();
		}
		
		
		
		
	
}
