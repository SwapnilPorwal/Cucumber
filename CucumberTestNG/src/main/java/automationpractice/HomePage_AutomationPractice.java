package automationpractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utility.LoggerHelper;
import utility.WaitHelper;



public class HomePage_AutomationPractice 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(HomePage_AutomationPractice.class);
	WaitHelper waitHelper;
	
	WebElement SignIn;
	
	public HomePage_AutomationPractice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, SignIn,20);
	}
}
