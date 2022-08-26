import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.reporter.ExtentReporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.Class)
@io.cucumber.testng.CucumberOptions(
	features = "src/test/resources/functionalTests",
	glue= {"stepDefinitions"},
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome = true
	)
 
public class BDDRunner_Test {
	

	@AfterClass
	public static void writeExtentReport() {
		ExtentReporter.loadXMLConfig(new File(FileReader.getInstance().getConfigReader().getReportConfigPath()));
	}
}
	

