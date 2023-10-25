package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\ajha3\\eclipse-workspace\\PhaseEndProject-Cucumber\\src\\test\\java\\feature\\Starthealth.feature",
	glue = {"Steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/myreport2.html",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"	
			
	
	}, 
	
	monochrome = true, // console output will be in more readable format
	tags = "@all"
		
		)

public class Testrunner4 {

}