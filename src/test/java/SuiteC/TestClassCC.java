package SuiteC;

import org.testng.annotations.Test;

import ExtentReport.TestBaseClass;

public class TestClassCC extends TestBaseClass{
	@Test
	public void testMehodCC() throws InterruptedException
	{
		{
			log("Test method CC Starts");
			Thread.sleep(3000);
			log("Test method CC ends");
		}
	}
}
