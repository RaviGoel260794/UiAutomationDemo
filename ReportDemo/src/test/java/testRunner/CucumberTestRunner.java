package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features"},
glue= {"stepdefinitions"},
plugin= {"pretty", "html:target/htmlreport.html","json:target/cucumber/Report.json"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests{
}