package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
					features="src/test/resources/OrangeHRM/MercuryRegister.feature",
					glue={"steps"},
					plugin= {"pretty","html:target/cucumber-report.html"},
					monochrome=true
		)
public class XYZRunnerTest {
	public static void main(String[] args) {


	}
}
// jenking POLL SCM test...
