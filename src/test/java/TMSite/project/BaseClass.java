package TMSite.project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private WebDriver driver;
	

	public BaseClass(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "/SeleniumProject/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		return driver;
		
	}
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void goToURL(String siteURL) {
		driver.navigate().to("https://www.digitalonus.com/");;
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void writeText(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public Boolean isDisplayed(By locator) {
		try{
		return driver.findElement(locator).isDisplayed();
		 
		}
		catch (org.openqa.selenium.NoSuchElementException exception){
			return false;
		}
	}
}
