package SuiteB;

import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import ExtentReport.TestBaseClass;

public class TestClassBB extends TestBaseClass{
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "dataProviderSuiteB")
	public void testMethodBB(String args1 , String args2) throws InterruptedException
	{
		{
			log("Test method BB Starts");
			log("Username is: " +args1);
			log("Password is: " +args2);
			Thread.sleep(3000);
			log("Test method BB ends");
		}
	}
}
