package Assignment1;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\Arti Harugade\\OneDrive\\Documents\\CucumberWorkspace\\org.Assignments.one\\src\\test\\java\\Assignment1\\Stepdefinition.java",
			glue="Stepdefinition"
			)

public class TestRunner {

	}

