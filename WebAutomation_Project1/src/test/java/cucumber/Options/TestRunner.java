package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(features = "src/test/java/features/", glue = {"stepDefination"},
plugin = {"pretty", "html:target/htmlreports/cucumber.html", "junit:target/junitreports/cucumber.xml", "json:target/jsonreports/cucumber.json" },
tags = "@Reg")

public class TestRunner {

}
