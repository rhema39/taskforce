package flipkart.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import excel_Utility.Read_Test_Data;
import flipkart.pages.CheckoutPage;
import flipkart.pages.HomePage;
import flipkart.pages.ProductListingPage;
import flipkart.pages.ProductPage;

public class TC_001 extends BaseTestClass {

	@Test()
	public void simpleTest() throws InterruptedException, IOException
	{
	HomePage homepage = 
	PageFactory.initElements(driver, HomePage.class);

	        HashMap<String , String> testData = Read_Test_Data.getTestData("TC_001");
			homepage.close_popup();
			homepage.select_category(driver,testData);
			ProductListingPage productListingPage = PageFactory.initElements(driver, ProductListingPage.class);
			productListingPage.select_item(driver);
			ProductPage productPage  = PageFactory.initElements(driver, ProductPage.class);
			productPage.buyNow(driver);
			CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
			checkoutPage.enterDetails();
	}
	
	
}
