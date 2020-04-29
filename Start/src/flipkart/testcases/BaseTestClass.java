package flipkart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTestClass {
	public static WebDriver driver;

	
	  @BeforeMethod
	  public void beforeMethod() {

System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");  
driver= new ChromeDriver();
driver.navigate().to("https://www.flipkart.com/");
driver.manage().window().maximize();
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Execution completed");
	  }

	}


