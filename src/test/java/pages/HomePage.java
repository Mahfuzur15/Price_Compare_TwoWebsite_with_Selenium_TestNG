package pages;

import org.openqa.selenium.WebDriver;

import model.Locators;

public class HomePage {
	

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String amazonPageUrl() {
		return Locators.amazonHomePageUrl;
	}
	
	public String flipkartPageUrl() {
		return Locators.flipkartHomePageUrl;
	}
	
}
