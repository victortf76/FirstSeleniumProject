package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	// initialize the HtmlReporter
	static ExtentHtmlReporter htmlReporter;

	static ExtentReports extent;

	public static ExtentReports getReport(String browser, String test) {
		
		extent = new ExtentReports();
		
		String reportName = test+browser+"Extent.html";
		
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\Convidad01\\Documents\\FirstSeleniumProject\\TestProject\\Reports\\"+reportName);
		
		extent.attachReporter(htmlReporter);
		
		return extent;
		
	}
}