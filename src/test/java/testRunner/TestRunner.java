package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Owner\\Desktop\\ankit-java_projects\\cucumberbasics\\Features\\tagss.feature",
		glue = "StepDefinitions",
		tags = "@Sanity and @DB"
		)
public class TestRunner {

}
