package TMSite.project;
import org.openqa.selenium.*;


public class HomePage extends BaseClass{
	
	 By emailField = By.name("your-email");
	 By subscribeButton = By.xpath("//input[@value='Subscribe']");
	 By confirmSubscribeMessage = By.id(null);
	 By searchIcon = By.xpath("//span[@class='icon ion-android-search']");
	 By searchField = By.name("s");
	 By submitSearch = By.xpath("//button[@class='search search-submit']");
	 By searchResultsHeader = By.linkText("Search Results for: QA");
	 By confirmationMessage = By.linkText("One or more fields have an error. Please check and try again.");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void subscribe(String email){
		if(isDisplayed(emailField))
		{
			writeText(email, emailField);
			click(subscribeButton);
		}
		else
		{
			System.out.println("Email element was not found");
		}
	}
	
	public Boolean isNotSubscribed() {
		return isDisplayed(confirmationMessage);
	}
	
	public void search(String searchCriteria){
		if(isDisplayed(searchIcon))
		{
			click(searchIcon);
			if(isDisplayed(searchField))
			{
				writeText("QA",searchField);
			}
		}
	}
	
	public Boolean isSearched() {
		return isDisplayed(searchResultsHeader);
	}
}
