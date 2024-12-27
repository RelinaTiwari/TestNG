package ExtentReport;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class TestBaseClass {
	
	public ExtentReports report;
	public ExtentTest Test; 
	
	@BeforeMethod
	public void init(ITestResult res)
	{
		report = ExtentReportManager.getReport();
		Test = report.createTest(res.getMethod().getMethodName().toUpperCase());
	}
	
	@AfterMethod
	public void quit()
	{
		report.flush();
	}
	
	public void log(String msg)
	{
		System.out.println(msg);
		Test.info(msg);
	}

}
