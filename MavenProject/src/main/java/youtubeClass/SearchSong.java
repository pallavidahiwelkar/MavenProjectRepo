package youtubeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchSong {
	
	@FindBy (xpath = "//input[@id='search']")
	private WebElement search;
	
	@FindBy (xpath = "//button[@id='search-icon-legacy']")
	private WebElement searchButton;
	
	@FindBy (xpath = "(//yt-formatted-string[text()='Alan Walker - Sing Me To Sleep'])[1]")
	private WebElement select;
	
	@FindBy (xpath = "//div[text()='Skip Ads']")
	private WebElement skipAdd;
	
	
	public SearchSong (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void playSong() {
		search.sendKeys("Sing Me to Sleep");
		searchButton.click();
		select.click();
		skipAdd.click();
	}
}
