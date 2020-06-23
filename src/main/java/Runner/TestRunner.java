package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = ".\\src\\main\\java\\Features",
glue={"stepDefinition"},
format= {"pretty","html:test-outout"},
dryRun=false,
monochrome=true,
strict=true

		)

public class TestRunner {

}
