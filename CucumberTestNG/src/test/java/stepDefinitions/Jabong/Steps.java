package stepDefinitions.Jabong;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserFactory;
import utility.LoggerHelper;

public class Steps 
{
	//public WebDriver driver;
	public  WebDriver driver = BrowserFactory.getBrowser("IE");
	private  Logger oLog = LoggerHelper.getLogger(Steps.class);
	
	@Given("^User Navigated to Jabong$")
	public void user_Navigated_to_Jabong() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.jabong.com/");
	    oLog.info("User navigated to 'Jabong.com'");
	}

	@When("^Enter UserName as \"([^\"]*)\" and Password as \"([^\"]*)\" for login to Jabong$")
	public void enter_UserName_as_and_Password_as_for_login_to_Jabong(String UserName, String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
	    oLog.info("UserName enetered ...");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	    oLog.info("Password entered...");
	}

	@When("^Click on Login button for Jabong$")
	public void click_on_Login_button_for_Jabong() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should be able to Jabong$")
	public void user_should_be_able_to_Jabong() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
