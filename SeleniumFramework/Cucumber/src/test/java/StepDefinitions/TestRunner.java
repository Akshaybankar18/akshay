package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\features",glue= {"StepDefinitions"},

monochrome = true,
plugin={"pretty","junit:target/JUNITReports/reports.xml",
		"pretty","html:target/HtmlReports/reports.Html",
		"pretty","json:target/JsonReports/reports.json"}
		)
public class TestRunner {

}
