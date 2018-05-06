package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import stepDefinitions.Jabong.Steps;
import utility.BrowserFactory;
import utility.LoggerHelper;

public class Jabong_HomePage 
{
	public  WebDriver driver = BrowserFactory.getBrowser("IE");
	private  Logger oLog = LoggerHelper.getLogger(Jabong_HomePage.class);
	
}
