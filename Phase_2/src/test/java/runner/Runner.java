package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

 
	 
  @RunWith(Cucumber.class)

	@CucumberOptions(features = {"src/test/resources/Feature"},
			glue= {"stepdefinitions"},
			monochrome = true,
			plugin = {"pretty", "html:target/cucumberRpt.html"}
			//plugin = {"pretty", "jason:target/jasonRpt.jason"}
			)
	public class Runner{
	/*public class TestRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios(){
			return super.scenarios();
		}*/
	    }



