package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("***Test is Successful");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("***Test is Failed");
	}

}
