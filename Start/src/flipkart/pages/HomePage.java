package flipkart.pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

String Sub_Category = "(//li/a[text()='$1$'])[1]";


public void close_popup(){
	close_btn.click();
	System.out.println("popu up closed");
}
public void select_category(WebDriver driver, HashMap<String, String> testData) throws InterruptedException{
	Thread.sleep(3000);
	Actions ac =new Actions(driver);
	WebDriverWait wait  = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(electronics));
	//electronics.isDisplayed();

	ac.moveToElement(electronics).build().perform();
	Sub_Category.replace("$1$",testData.get("Sub_Category"));
	driver.findElement(By.xpath(Sub_Category)).click();
}
}
