package Frameworkcheck;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentSparkReporter reporter=new ExtentSparkReporter("./Report/Demoreport.html");
		reporter.config().setTheme(Theme.STANDARD);//Dark theme
		reporter.config().setDocumentTitle("this is a sample report");
		reporter.config().setReportName("ganapathy");
		ExtentReports report=new ExtentReports();

		report.attachReporter(reporter);

		ExtentTest logger = report.createTest("test1");

		logger.log(Status.FAIL,"this is fail");

		logger.log(Status.PASS,"this is pass");
		logger.log(Status.SKIP,"this is Skipped");

		logger.log(Status.INFO,"this is Information");

		logger.log(Status.WARNING,"this is Warning");
		ExtentTest logger1 = report.createTest("test2");

		logger1.log(Status.FAIL,"this is fail");

		logger1.log(Status.PASS,"this is pass");
		logger1.log(Status.SKIP,"this is Skipped");

		logger1.log(Status.INFO,"this is Information");

		logger1.log(Status.WARNING,"this is Warning");
		logger.addScreenCaptureFromPath("D:\\Basics\\AdvSelenium./target/Errorshots/DemewebShop 2023-10-26T13-31-46.639022500.png");
		logger1.addScreenCaptureFromPath("C:\\Users\\tkgan\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-09-06 201723.png");
		logger1.addScreenCaptureFromPath("C:\\Users\\tkgan\\OneDrive\\Pictures\\20171206_09010.jpg");
		report.flush();
		System.out.println("done");
	}

}
