package SuiteA;

import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import ExtentReport.TestBaseClass;

public class TestClassA extends TestBaseClass{
	
	
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "dataProviderSuiteA")
	public void testMethodA(String args1 , String args2) throws InterruptedException
	{
		log("Test method A Starts");
		log("Username is: " +args1);
		log("Password is: " +args2);
		Thread.sleep(3000);
		log("Test method A ends");
	}
}
