package pageObjects_automationpractice;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GenericHelper;
import utility.LoggerHelper;
import utility.WaitHelper;



public class LoginPage_AutomationPractice 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage_AutomationPractice.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement SignIn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement submitLogin;
	
	@FindBy(xpath="//span[text()='Swapnil Porwa']")
	WebElement successMsgObject;
	
	@FindBy(xpath="//span[text()=' Home']")
	WebElement homeButton;
	
	
	public LoginPage_AutomationPractice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, emailAddress,20);
	}
	
	public void clickOnSignInLink(){
		log.info("clicked on sign in link...");
		SignIn.click();
	}
	
	public void enterEmailAddress(String emailAddress){
		log.info("entering email address...."+emailAddress);
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		this.password.sendKeys(password);
	}
	
	public void clickOnSubmitButton(){
		log.info("clicking on submit button...");
		submitLogin.click();

	}
	
	public boolean verifySuccessLoginMsg() throws IOException{
		return new GenericHelper().isDisplayed(successMsgObject);
	}
	
	public HomePage_AutomationPractice clickOnHome() 
	{
		homeButton.click();
		return new HomePage_AutomationPractice(driver);
	}
}
