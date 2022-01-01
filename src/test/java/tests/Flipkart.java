package tests;


import org.openqa.selenium.WebDriver;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class Flipkart {

	public String value;

		Base base = new Base();

		WebDriver driver = base.setup();
		CommonMethods commonMethods = new CommonMethods(driver);
		HomePage homePage = new HomePage(driver);
		Timeout time = new Timeout();
		

		public void start() {
			driver.get(homePage.flipkartPageUrl());
		}
		
		public void loginTest() {
		
			
			// Window Cancel
			commonMethods.flipkartWindowCancel(Locators.flipkartWindowCancel);
			
			time.timeout();
			// then Search text send
			commonMethods.flipkartSendText(Locators.flipkartSearch, "iPhone XR (64GB) - Yellow");
			time.timeout();
			commonMethods.flipkartClickButton(Locators.flipkartBtnClick);
			time.timeout();
			
			value = commonMethods.flipkartGetText(Locators.flipkartPriceGet);
			System.out.println("Flipkart value We get : " + value);
			
			
			time.timeout();
			
			base.tearDown();
		}
		
		public String priceFlipkart() {
			return value;
					
		}
	
	
}
