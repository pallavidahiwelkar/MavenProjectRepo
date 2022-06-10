package youtubePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import youtubeClass.SearchSong;

public class YouTubeTestClass {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions().addArguments("disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		
		
		SearchSong searchSong = new SearchSong(driver);
		searchSong.playSong();
		
	}

}
