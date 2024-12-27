package SuiteB;

import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import ExtentReport.TestBaseClass;

public class TestClassB extends TestBaseClass{
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "dataProviderSuiteB")
	public void testMethodB(String args1 , String args2) throws InterruptedException
	{
		
		log("Test method B Starts");
		log("Username is: " +args1);
		log("Password is: " +args2);
		Thread.sleep(3000);
		log("Test method B ends");
	}
}
