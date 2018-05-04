package utility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserFactory 
{
	private static Map<String , WebDriver> drivers = new HashMap<String , WebDriver>();
	
	public static WebDriver getBrowser(String browserName)
	{
		WebDriver driver = null;
		
		switch(browserName)
		{
		case "IE":
			driver = drivers.get("IE");
			if(driver==null)
			{
				System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/IEDriverServer.exe");
				DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
				cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR,
						ElementScrollBehavior.BOTTOM);
				cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				cap.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				cap.setJavascriptEnabled(true);
				driver = new InternetExplorerDriver(cap);
				drivers.put("IE", driver);
			}
			break;
		case "chrome":
			driver = drivers.get("chrome");
			if(driver==null)
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeOptions option = new ChromeOptions();
				option.addArguments("start-maximized");
				DesiredCapabilities chrome = DesiredCapabilities.chrome();
				chrome.setJavascriptEnabled(true);
				chrome.setCapability(ChromeOptions.CAPABILITY, option);
				driver=new ChromeDriver(chrome);
				drivers.put("chrome", driver);
			}
			break;
		case "firefox":
			driver=drivers.get("firefox");
			if(driver==null)
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				DesiredCapabilities firefox = DesiredCapabilities.firefox();
				FirefoxProfile profile = new FirefoxProfile();
				profile.setAcceptUntrustedCertificates(true);
				profile.setAssumeUntrustedCertificateIssuer(true);
				firefox.setCapability(FirefoxDriver.PROFILE, profile);
				firefox.setCapability("marionette", true);
				driver=new FirefoxDriver(firefox);
				drivers.put("firefox", driver);
			}
			break;
		}
		return driver;
	}
	
	public static void closeAllDriver() 
	{
		for (String key : drivers.keySet()) 
		{
			drivers.get(key).close();
			drivers.get(key).quit();
			drivers.put("IE", null);
		}
	}
}
