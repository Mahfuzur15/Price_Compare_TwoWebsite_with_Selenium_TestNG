package model;

import org.openqa.selenium.By;

public class Locators {

	public static String amazonHomePageUrl = "https://www.amazon.in/";
	public static String flipkartHomePageUrl = "https://www.flipkart.com/";
	public static By amazonSearch = By.id("twotabsearchtextbox");
	public static By flipkartSearch = By.className("_3704LK");

	// Button Click
	public static By amazonBtnClick = By.id("nav-search-submit-button");
	public static By flipkartBtnClick = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
	

	// Price Get
	public static By amazonPriceGet = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]");
	public static By flipkartPriceGet = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div");
	

	//Flikart Login Cancel 
	public static By flipkartWindowCancel = By.xpath("/html/body/div[2]/div/div/button");
	
	
}
