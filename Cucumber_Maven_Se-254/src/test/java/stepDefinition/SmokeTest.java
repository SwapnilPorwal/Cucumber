package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest
{
	WebDriver driver;
	@Given("^Open Chrome and launch Facebook$")
	public void open_Chrome_and_launch_Facebook() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("^User Enter valid UserName and Password$")
	public void user_Enter_valid_UserName_and_Password() throws Throwable
	{
		driver.findElement(By.id("email")).sendKeys("Swapnil Porwal");
		driver.findElement(By.id("pass")).sendKeys("Password");
	}
	@When("^Click login button$")
	public void click_login_button() throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	@Then("^User should login successfully$")
	public void user_should_login_successfully() throws Throwable
	{
		System.out.println("Tisle of Page : " + driver.getTitle());
	}
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable
	{
		driver.close();
	}
	@When("^User Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_valid_and(String uname, String pass) throws Throwable
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
}
