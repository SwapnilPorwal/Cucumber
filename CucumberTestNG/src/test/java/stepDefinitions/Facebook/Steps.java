package stepDefinitions.Facebook;

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
	
	@Given("^User Navigated to Facebook$")
	public void user_Navigated_to_Facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/IEDriverServer.exe");
	    //driver=new InternetExplorerDriver();
		//driver = BrowserFactory.getBrowser("IE");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    oLog.info("User navigated to 'facebook.com'");
	}

	@When("^User enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enter_Username_as_and_Password_as(String UserName, String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
	    oLog.info("UserName enetered ...");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	    oLog.info("Password entered...");
	    
	}

	@When("^Clcik on Login button$")
	public void clcik_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    oLog.info("Login button clicked");
	}

	@Then("^User should be not ne logged In$")
	public void user_should_be_not_ne_logged_In() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[text()='Recover Your Account']"));
	    oLog.info("User not Logged in Successfully");
	}

}
