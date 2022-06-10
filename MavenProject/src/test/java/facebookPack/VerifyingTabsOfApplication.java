package facebookPack;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


import facebookClass.HomePage;
import facebookClass.LoginPage;
import facebookClass.Profile;


public class VerifyingTabsOfApplication {
	
			
		public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		String url;
		
		// 1. To verify if able to check the friend list
		
		LoginPage loginPage = new LoginPage (driver);
		loginPage.loginToApplication();
		
		Thread.sleep(5000);
		HomePage homepage = new HomePage (driver);
		homepage = new HomePage (driver);
		homepage.clickFriends();
		
		
		url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.facebook.com/friends)"))
				{
					System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
		
		
//		2. To verify if able to check notifications
		
		/*
		 * loginPage = new LoginPage (driver); loginPage.loginToApplication();
		 * 
		 * Thread.sleep(5000); homepage = new HomePage (driver);
		 */
		homepage.clickNotification();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.facebook.com/friends)"))
		{
			System.out.println("Pass");
		}
else
{
	System.out.println("Fail");
}
/*
 * homepage.clickprofileIcon(); homepage.clickLogout();
 */
		
		
		
		
//		3. To verify if able to check messages
		
/*
 * loginPage = new LoginPage (driver); loginPage.loginToApplication();
 */
		
		Thread.sleep(5000);
		/* homepage = new HomePage (driver); */
		homepage.clickMessanger();
		url= driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.facebook.com/friends)"))
		{
			System.out.println("Pass");
		}
else
{
	System.out.println("Fail");
}
/*
 * homepage.clickprofileIcon(); homepage.clickLogout();
 * 
 * System.out.println("PASS");
 */
		
//  `	4. To check profile
		
/*
 * loginPage = new LoginPage (driver); loginPage.loginToApplication();
 */
		
		Thread.sleep(5000);
		Profile profile = new Profile(driver);
		profile.checkProfile();
		homepage.clickprofileIcon();
		homepage.clickLogout();
	}
	
}
