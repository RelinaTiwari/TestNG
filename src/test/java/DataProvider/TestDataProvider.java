package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public static Object[][] dataProviderSuiteA(Method method) {
		System.out.println("Providin data to method--- " + method.getName());
		Object[][] data = null;
		if (method.getName().equalsIgnoreCase("testMethodA")) {
			data = new Object[2][2];
			data[0][0] = "Username 1";
			data[0][1] = "Password 1";

			data[1][0] = "Username 2";
			data[1][1] = "Password 2";
		}
		else if (method.getName().equalsIgnoreCase("testMethodAA"))
		{
			data = new Object[2][2];
			data[0][0] = "Username 3";
			data[0][1] = "Password 3";

			data[1][0] = "Username 4";
			data[1][1] = "Password 4";
		}
		
		

		return data;
	}
	
	@DataProvider
	public static Object[][] dataProviderSuiteB(Method method) {
		System.out.println("Providin data to method--- " + method.getName());
		Object[][] data = null;
		if (method.getName().equalsIgnoreCase("testMethodB")) {
			data = new Object[2][2];
			data[0][0] = "Username 11";
			data[0][1] = "Password 11";

			data[1][0] = "Username 22";
			data[1][1] = "Password 22";
		}
		else if (method.getName().equalsIgnoreCase("testMethodBB"))
		{
			data = new Object[2][2];
			data[0][0] = "Username 12";
			data[0][1] = "Password 12";

			data[1][0] = "Username 22";
			data[1][1] = "Password 22";
		}
		
		

		return data;
	}
	

}
