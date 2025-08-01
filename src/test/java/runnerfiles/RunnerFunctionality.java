package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\rekha\\New_Proj\\CucucumberBDDProject\\Allfeaturesfile\\Login.feature","C:\\Users\\rekha\\New_Proj\\CucucumberBDDProject\\Allfeaturesfile\\support.feature"},
glue = {"stepdefinitionfiles"},
plugin = {"pretty", "html:target/cucumber-reports"},
monochrome = true,
dryRun=false,
publish=true)

public class RunnerFunctionality extends AbstractTestNGCucumberTests{

}
