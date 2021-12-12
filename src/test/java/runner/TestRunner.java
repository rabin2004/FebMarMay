package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\FebMarMay\\src\\test\\java\\features",
				glue = "stepDefinition"
		)

public class TestRunner {

}
