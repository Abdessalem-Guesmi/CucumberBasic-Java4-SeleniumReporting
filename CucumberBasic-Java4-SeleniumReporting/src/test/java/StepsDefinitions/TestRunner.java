package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepsDefinitions" }, monochrome = true, plugin = {
		"json:target/cucumber.json" }, tags = "@E2E")
public class TestRunner {

	/*
	 * cucumber reports generate 1- project clean 2- maven test using command: mvn
	 * verify -DskipTests
	 * 
	 */

}
