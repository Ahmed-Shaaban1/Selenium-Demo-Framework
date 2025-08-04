package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.OrderOverviewPage;
import pages.ThankYouPage;

public class OrderOverviewFinishTest extends TestBase {
	OrderOverviewPage orderOverviewPageObject;
	ThankYouPage thankYouPageObject;
	
	@Test
	@Description("This test clicking finish")

	public void clickingFinish() {
		orderOverviewPageObject = new OrderOverviewPage(driver);
		orderOverviewPageObject.clickFinish();
		logger.info("clicking finish");
		thankYouPageObject = new ThankYouPage(driver);
		Assert.assertTrue(thankYouPageObject.thankYouStatement.getText().contains("Thank you for your order!"));
	}
}
