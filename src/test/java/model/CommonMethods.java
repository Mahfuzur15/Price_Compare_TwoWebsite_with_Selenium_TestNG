package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver ;
	}
	
	// Search data Send
	public void amazonSendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public void flipkartSendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	

//	Search Button Click
	public void amazonClickButton(By btn) {
		driver.findElement(btn).click();
	}
	
	public void flipkartClickButton(By btn) {
		driver.findElement(btn).click();
	}
	
	// Match value Get Price
	
	public String amazonGetText(By element) {
		return driver.findElement(element).getText();
	}
	

	public String flipkartGetText(By element) {
		return driver.findElement(element).getText();
	}
	
	
	// Flipkart Login Window cancel
	public void flipkartWindowCancel(By btn) {
		driver.findElement(btn).click();
	}
	
	
}
