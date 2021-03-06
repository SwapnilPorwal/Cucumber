package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "C:\\Users\\DELL\\git\\Cucumber\\CucumberTestNG\\src\\test\\resources\\FeatureFiles\\Facebook\\FacebookLogin.feature",
					glue= {"stepDefinitions\\Facebook","stepDefinitions\\Hooks"},
					dryRun = false,
					monochrome=true,
					strict =true)
public class Facebook_TestRunner extends AbstractTestNGCucumberTests{

}
