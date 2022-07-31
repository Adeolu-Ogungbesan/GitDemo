package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporters {

	
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("Test on signin");
		
		SigninPageTest pageTest = new SigninPageTest();
		pageTest.setUp();
		test1.pass("Broswer seteup");
		pageTest.signin();
		test1.fail("Test failed");
		
		extent.flush();
	}
}
	