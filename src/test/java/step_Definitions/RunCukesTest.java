package step_Definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
				,glue={"src/test/java/step_Definitions"},
		plugin = {"pretty", "html:target/cucumber"}

		)
public class RunCukesTest{
	
}