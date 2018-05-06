package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "C:\\Users\\DELL\\git\\Cucumber\\CucumberTestNG\\src\\test\\resources\\FeatureFiles\\AutomationPractice\\AutomationPractice.feature",
					glue= {"stepDefinitions\\AutomationPractice","stepDefinitions\\Hooks"},
					dryRun = false,
					monochrome=true,
					strict =true)
public class AutomationPractice_TestRunner extends AbstractTestNGCucumberTests{

}
