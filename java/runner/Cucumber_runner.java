package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/loginpage_parameters.feature",
                 glue="stepdefinition",
                 monochrome=true,
                 publish=true)

public class Cucumber_runner extends AbstractTestNGCucumberTests {

}
