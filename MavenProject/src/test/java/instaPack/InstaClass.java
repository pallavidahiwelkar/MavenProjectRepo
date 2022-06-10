package instaPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import instaClass.HomePage;
import instaClass.LogOut;
import instaClass.LoginMainPage;
import instaClass.LoginPage;
import instaClass.MessageWindow;
import instaClass.PopupWindowToSearchUser;
import instaClass.SendMessage;

public class InstaClass {
	
public static void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com");
	
	
	LoginMainPage loginMainPage = new LoginMainPage (driver);
	loginMainPage.clickLoginWithFb();
	
	LoginPage loginPage = new LoginPage (driver);
	loginPage.loginToApplication();
	
	HomePage homePage = new HomePage (driver);
	homePage.clickMessenger();
	
	SendMessage sendMessage = new SendMessage (driver);
	sendMessage.clickSendMessage();
	
	PopupWindowToSearchUser popupWindowToSearchUser = new PopupWindowToSearchUser(driver);
	popupWindowToSearchUser.toSelectUser();
	
	MessageWindow messageWindow = new MessageWindow (driver);
	messageWindow.sendTypeMessage();
	messageWindow.clickSendButton();
	
	LogOut logOut = new LogOut (driver);
	logOut.clickProfileIcon();
	logOut.clicklogout();
	
	
	
	
	
	
	
	
}

}
