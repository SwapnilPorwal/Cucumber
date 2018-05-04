package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "C:\\WorkSpace\\CucumberTestNG\\src\\test\\resources\\FeatureFiles\\FacebookLogin.feature",
					glue= {"stepDefinitions"},
					dryRun = false,
					tags= {"@Automation"},
					monochrome=true,
					strict =true)
public class Facebook_TestRunner extends AbstractTestNGCucumberTests{

}
