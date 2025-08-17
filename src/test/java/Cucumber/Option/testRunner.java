package Cucumber.Option;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/Feature",

		glue = { "Go_RestApi_stepDefination","Hooks"},

		plugin = { "pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failreRun.txt" },
		dryRun = false,
		tags = "@now"

)

public class testRunner {

}
