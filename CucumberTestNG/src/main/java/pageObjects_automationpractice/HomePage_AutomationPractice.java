package pageObjects_automationpractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.LoggerHelper;
import utility.WaitHelper;



public class HomePage_AutomationPractice 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(HomePage_AutomationPractice.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement SignIn;
	
	public HomePage_AutomationPractice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, SignIn,20);
	}
	
	public LoginPage_AutomationPractice clickOnSignInLink()
	{
		log.info("Clicking on Sign In");
		SignIn.click();
		return new LoginPage_AutomationPractice(driver);
	}
}
