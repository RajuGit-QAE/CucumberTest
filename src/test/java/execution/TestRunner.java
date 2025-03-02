package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/featurefiles", glue = "stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{

}
