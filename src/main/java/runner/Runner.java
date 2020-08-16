package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/main/java/features/calculator.feature"}, 
		glue="stepdefinitions")

public class Runner {
	/* Nothing to do here */
}