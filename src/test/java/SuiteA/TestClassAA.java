package SuiteA;

import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import ExtentReport.TestBaseClass;

public class TestClassAA extends TestBaseClass{
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "dataProviderSuiteA")
	public void testMethodAA(String args1 , String args2) throws InterruptedException
	{
		{
			log("Test method AA Starts");
			log("Username is: " +args1);
			log("Password is: " +args2);
			Thread.sleep(3000);
			log("Test method AA ends");
		}
	}
}
