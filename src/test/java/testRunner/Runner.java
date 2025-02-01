package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"src/test/java/features/login.feature" }, 
		dryRun = false, 
		snippets = CucumberOptions.SnippetType.CAMELCASE, 
		monochrome = true, 
		glue = {"stepDefinitions","utils"})
public class Runner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}
}
