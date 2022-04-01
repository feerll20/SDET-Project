package TMSite.Tests;
import org.testng.annotations.Test;
import TMSite.project.HomePage;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SearchTest {
	
	WebDriver driver;
	HomePage homepage;
	
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/fernandolopez/eclipse-workspace/SeleniumProject/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.digitalonus.com/");
  }
  
  @Test
  public void runSearch() throws InterruptedException {
	  homepage.search("sda");
	  Thread.sleep(2000);
	  assertTrue(homepage.isSearched());
  }
  

  @AfterTest
  public void afterTest() {
  }

}
