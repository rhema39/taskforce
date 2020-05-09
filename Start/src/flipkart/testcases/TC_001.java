package flipkart.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.javafx.collections.MappingChange.Map;

import common_utility.Common;
import common_utility.ListenerClass;
import excel_Utility.Read_Test_Data;
import flipkart.pages.CheckoutPage;
import flipkart.pages.HomePage;
import flipkart.pages.ProductListingPage;
import flipkart.pages.ProductPage;
@Listeners(ListenerClass.class)
public class TC_001 extends BaseTestClass {

	@Test(dataProvider="searchCategory" )
	public void simpleTest(HashMap<Object,Object> datamap) throws InterruptedException, IOException
	{
	HomePage homepage = 
	PageFactory.initElements(driver, HomePage.class);

	       HashMap<Object,Object> testData = Read_Test_Data.getTestData("TC_001");
			homepage.close_popup(driver);
			homepage.select_category(driver,testData);
			ProductListingPage productListingPage = PageFactory.initElements(driver, ProductListingPage.class);
			productListingPage.select_item(driver);
			ProductPage productPage  = PageFactory.initElements(driver, ProductPage.class);
			productPage.buyNow(driver);
			CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
			checkoutPage.enterDetails(driver);
	}
	@DataProvider(name="searchCategory")
	public static Object[][] searchcategoryDataProvider() throws IOException{
	
		Object[][] Obj;
		Obj= new Object[1][1];
		HashMap<Object,Object> datamap= new HashMap<Object,Object>();
		datamap = Read_Test_Data.getTestData("TC_001");
		
		Obj[0][0]=datamap;
		return Obj;
	
		 };
		
	
	
}
