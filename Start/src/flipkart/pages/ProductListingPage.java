package flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage {
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[3]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a")
	WebElement select_item;
	public void select_item(){
		select_item.click();
	}
}
