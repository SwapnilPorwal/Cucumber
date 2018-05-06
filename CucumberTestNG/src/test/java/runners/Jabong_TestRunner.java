package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "C:\\Users\\DELL\\git\\Cucumber\\CucumberTestNG\\src\\test\\resources\\FeatureFiles\\Jabong\\JabongLogin.feature",
					glue= {"stepDefinitions\\Jabong","stepDefinitions\\Hooks"},
					dryRun = true,
					monochrome=true,
					strict =true)
public class Jabong_TestRunner extends AbstractTestNGCucumberTests{

}
