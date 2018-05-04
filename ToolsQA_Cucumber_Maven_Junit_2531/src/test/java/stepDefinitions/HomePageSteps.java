package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

public class HomePageSteps 
{
	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		homePage.navigateTo_HomePage();
	}
	
	@Given("^He search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//driver.navigate().to("http://shop.demoqa.com/?s="+arg1+"&post_type=product");
		homePage.perform_Search(arg1);
	}
}
