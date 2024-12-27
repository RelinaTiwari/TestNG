package SuiteC;

import org.testng.annotations.Test;

import ExtentReport.TestBaseClass;

public class TestClassC extends TestBaseClass{
	
	@Test
	public void testMethodC() throws InterruptedException
	{
		log("Test method C Starts");
		Thread.sleep(3000);
		log("Test method C ends");
	}
}
