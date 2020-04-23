package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkart.pages.CheckoutPage;
import flipkart.pages.HomePage;
import flipkart.pages.ProductListingPage;
import flipkart.pages.ProductPage;

public class TC_001 extends BaseTestClass {

	@Test()
	public void simpleTest() throws InterruptedException
	{
	HomePage homepage = 
	PageFactory.initElements(driver, HomePage.class);

			homepage.close_popup();
			homepage.select_category(driver);
			ProductListingPage productListingPage = PageFactory.initElements(driver, ProductListingPage.class);
			productListingPage.select_item(driver);
			ProductPage productPage  = PageFactory.initElements(driver, ProductPage.class);
			productPage.buyNow(driver);
			CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
			checkoutPage.enterDetails();
	}
	
	
}
