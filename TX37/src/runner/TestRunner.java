package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\SeleniumEcom\\TX37\\src\\Features\\home.feature",
                  glue={"stepsdefination"},
                  monochrome=true)
public class TestRunner  {

}
