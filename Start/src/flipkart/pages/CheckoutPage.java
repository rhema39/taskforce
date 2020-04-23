package flipkart.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")
	WebElement enter_number;
	
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button/span")
	WebElement login_btn;
	
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span")
	WebElement login_btn2;
	
	public void enterDetails() throws InterruptedException{
		Thread.sleep(2000);
		enter_number.click();
		enter_number.sendKeys("9953718297");
		Thread.sleep(2000);
		
		login_btn.click();
		Thread.sleep(2000);
		password.sendKeys("bangari@34");
		Thread.sleep(2000);
		login_btn2.click();
	}

	}

