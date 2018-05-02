package com.puma.tests;

import org.testng.annotations.Test;

import com.puma.generic.BaseTest;
import com.puma.pages.AddToCartPage;
import com.puma.pages.HomePage;

public class MenShoesTest extends BaseTest
{
	@Test
	public void testMenShoerunning() throws Exception
	{
			//Navigate to "https://in.puma.com from BaseTest"
			HomePage hp = new HomePage(driver);
			
			//Assert the page title
			hp.verfiyTheTitle();
			
			//Click on Men/Shoes/Running
			hp.naviGateToMenu("men", "Shoes", "Running");
			
			//Click on the second shoe from listing page
			hp.scrollToElementAndClick();
			
			//Add the shoe to cart from product detail page (for any size or quantity)
			AddToCartPage addCart = new AddToCartPage(driver);
			addCart.clickOnkAddToCartBtn();
			
			//Assert that the cart has the correct shoe selected in previous step (Based on name of product/quantity/price) 
			addCart.verifyTheProduct();
		}

		
		
	}


