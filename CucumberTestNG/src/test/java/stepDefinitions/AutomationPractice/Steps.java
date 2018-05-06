package stepDefinitions.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import automationpractice.LoginPage_AutomationPractice;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserFactory;
import utility.LoggerHelper;

public class Steps 
{
	public  WebDriver driver = BrowserFactory.getBrowser("IE");
	private  Logger oLog = LoggerHelper.getLogger(Steps.class);
	
	LoginPage_AutomationPractice login ;
	
	@Given("^User navigated to AutomationPractice$")
	public void user_navigated_to_AutomationPractice() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // Write code here that turns the phrase above into concrete actions
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://automationpractice.com/index.php?");
	    oLog.info("User navigated to 'automationpractice.com'");
	}

	@Given("^User Click on Sign in link$")
	public void user_Click_on_Sign_in_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginPage_AutomationPractice(driver);
		login.clickOnSignInLink();
	}

	@When("^User Enter UserName as \"([^\"]*)\" and Password as \"([^\"]*)\" for login to AuomationPractice$")
	public void user_Enter_UserName_as_and_Password_as_for_login_to_AuomationPractice(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.enterEmailAddress(arg1);
	    login.enterPassword(arg2);
	}

	@When("^Click on Sign in Button$")
	public void click_on_Sign_in_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.clickOnSubmitButton();
	}

	@Then("^user should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(login.verifySuccessLoginMsg())
		{
			oLog.info("User Logged successfully");
		}
		else
		{
			oLog.error("User NotLogged successfully");
			
		}
	    
	}
}
