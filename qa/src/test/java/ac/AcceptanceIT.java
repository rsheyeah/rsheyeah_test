package ac;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber-report/html", "json:target/cucumber-report/Report.json"},
		features = {"classpath:component/feature/mendeley"},
		glue = {"co.uk.rsheyeah.qa/step/"},
		tags = {"@mendeley_e2e_tests"},
		strict = true)
public class AcceptanceIT {
}
