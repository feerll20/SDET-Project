package TMSite.Tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TMSite.project.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.*;

public class SubscribeTest {
	
	WebDriver driver;
	HomePage homePage;
  

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/SeleniumProject/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.digitalonus.com/");
  }
  
  @Test
  public void test() throws InterruptedException  {
	  
	  homePage.subscribe(" ");
	  Thread.sleep(2000);
	  assertTrue(homePage.isNotSubscribed());
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
