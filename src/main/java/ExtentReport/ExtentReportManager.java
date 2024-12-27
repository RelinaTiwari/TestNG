package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports report;
	
	public static ExtentReports getReport()
	{
		if(report == null)
		{
			report = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("Report.html");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setReportName("Piolet Report");
			spark.config().setDocumentTitle("Piolet Project Report");
			report.attachReporter(spark);
		}
		
		return report;
	}

}
