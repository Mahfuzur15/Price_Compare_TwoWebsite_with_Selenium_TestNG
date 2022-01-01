package tests;


import org.openqa.selenium.WebDriver;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class Amazon {

	
		Base base = new Base();
	
		WebDriver driver = base.setup();
		CommonMethods commonMethods = new CommonMethods(driver);
		HomePage homePage = new HomePage(driver);
		Timeout time = new Timeout();
		
		public void start() {
			driver.get(homePage.amazonPageUrl());
		}
		
	
		public void loginTest() {
		
			commonMethods.amazonSendText(Locators.amazonSearch, "iPhone XR (64GB) - Yellow");

			commonMethods.amazonClickButton(Locators.amazonBtnClick);
			time.timeout();
			
//			base.tearDown();
		}
		
		public String priceAmazon() {
			
			String value = commonMethods.amazonGetText(Locators.amazonPriceGet);
			base.tearDown();
			return value;
		}

	
}
