package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\Features",
		glue = {"DifinitionSteps"},
		format = {"pretty", "html: test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		tags= {"@tag3"},
		dryRun = false,
		monochrome = true,
		strict = true
)

public class ExpediaRunner {

}
