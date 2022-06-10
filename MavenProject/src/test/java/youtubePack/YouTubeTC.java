package youtubePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import youtubeClass.SearchSong;

public class YouTubeTC {
	
	WebDriver driver;
	
	@BeforeClass
	public void lauchBrowser() {
	ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.youtube.com");
	}
	
	
	@Test
	public void playASong() {
		SearchSong searchSong = new SearchSong(driver);
		searchSong.playSong();
	}
	
	

}
