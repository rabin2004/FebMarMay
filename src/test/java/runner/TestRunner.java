package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\FebMarMay\\src\\test\\java\\features",
				glue = "stepDefinition",
				monochrome = true,
				plugin = {"pretty", "html:target/Html report/cucumberReport.html", "json:target/Json report/jsonReport"},
//				tags = "@1.0"
//				tags = "@Smoke"
//				tags = "@GetSnippet"
				tags = "@Regression"
		)

// features = specify the feature file, if only that needs to be executed
public class TestRunner {

}

// TDD & BDD POM concept => any application ???
