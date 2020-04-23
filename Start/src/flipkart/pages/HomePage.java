package flipkart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
@FindBy(xpath="/html/body/div[2]/div/div/button")
WebElement close_btn;

@FindBy(xpath="//*[@id='container']/div/div[2]/div/ul/li[1]/span[text()= 'Electronics']")
WebElement electronics;

@FindBy(xpath="(//li/a[text()='Samsung'])[1]")
WebElement samsung;

public void close_popup(){
	close_btn.click();
	System.out.println("popu up closed");
}
public void select_category(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	Actions ac =new Actions(driver);
	WebDriverWait wait  = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(electronics));
	//electronics.isDisplayed();

	ac.moveToElement(electronics).build().perform();
	samsung.isDisplayed();
	samsung.click();
}
}
