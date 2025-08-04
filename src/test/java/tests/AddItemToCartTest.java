package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.BagItemPage;

public class AddItemToCartTest extends TestBase {
	BagItemPage bagItemPageObject;

	@Description("This test adds an item to the cart")
	@Test
	public void addItemToCart() {
		bagItemPageObject = new BagItemPage(driver);
		bagItemPageObject.addToCart();
		logger.info("adding item to cart");
		Assert.assertTrue(bagItemPageObject.removeFromCart.getText().contains("Remove"));

	}
	
	
}
