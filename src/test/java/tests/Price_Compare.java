package tests;


import org.testng.annotations.Test;


public class Price_Compare {

	@Test
	public void comparePrice() {
			
		// Amazon object create
		Amazon amazon = new Amazon();
		
		// Price Get 
	
		amazon.start();
		
		amazon.loginTest();
		String amazonPrice = amazon.priceAmazon();
		
		
	// Flipkart object create
		Flipkart flipkart = new Flipkart();
		
		// Flipkart Price Get
		flipkart.start();
		flipkart.loginTest();
		String flipkartPrice = flipkart.priceFlipkart();
		
		flipkartPrice = flipkartPrice.substring(1); //ello World

		System.out.println("Amazon price We get : " + amazonPrice);
		amazonPrice = amazonPrice.replace(",", "");
		flipkartPrice = flipkartPrice.replace(",", "");

		int amazonPricee = Integer.parseInt(amazonPrice);
		int flipkartPricee = Integer.parseInt(flipkartPrice);
		System.out.println("After Convert Amazon price integer number : " +amazonPricee);
		System.out.println("After Convert Flipkart price integer number : " +flipkartPricee);
		
		if ( amazonPricee < flipkartPricee ) {
			System.out.println("[iPhone XR (64GB) - Yellow] Price is Cheap in Amazon, Price is only = " + amazonPricee);
		}

		else if ( amazonPricee < flipkartPricee ) {
			System.out.println("[iPhone XR (64GB) - Yellow] Price is Cheap in FlipKart, Price is = " + flipkartPrice);
		}
		else {
			System.out.println("Price is Same");
		}
		
	}

	
}
