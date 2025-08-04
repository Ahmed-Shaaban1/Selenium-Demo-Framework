package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.ProductsPage;

public class ClickItemTest extends TestBase {

	ProductsPage productsPageObject;

	@Test
	@Description("This test clicks bag item")
	public void clickBagItem() {
		productsPageObject = new ProductsPage(driver);
		productsPageObject.clickItem();
		logger.info("clicking item");
		Assert.assertTrue(productsPageObject.backToProductsBtn.getText().contains("Back to products"));
	}
	
}
