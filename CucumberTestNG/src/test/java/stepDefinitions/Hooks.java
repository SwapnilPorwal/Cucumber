package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BrowserFactory;

public class Hooks 
{
	//public static WebDriver driver;
	@Before
	public  void beforeMethod()
	{
		System.out.println("In beforeMethod");
		//driver = BrowserFactory.getBrowser("IE");
	}
	
	@After
	public void afterMethod()
	{
		System.out.println("In After Method");
		BrowserFactory.closeAllDriver();
	}

}
