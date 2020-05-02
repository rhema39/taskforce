package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkart.pages.LoginPage;
import flipkart.pages.MyAccountPage;

public class TC_002_Validate_name extends BaseTestClass {
@Test
	public static void validateAccountDetails() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
		loginPage.navigatetoMyAccount(driver);
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);

		myAccountPage.validateName(driver);
	}

}
