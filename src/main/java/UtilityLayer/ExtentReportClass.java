package UtilityLayer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportClass extends BaseClass{
	

	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	
	public static ExtentReports setup(String reportname) {
		String path = System.getProperty("user.dir") + "\\ExtentReport\\" + reportname + date() + ".html";
		ExtentSparkReporter esr = new ExtentSparkReporter(path);
		ExtentReports ereports = new ExtentReports();
		ereports.attachReporter(esr);
		return ereports;
	}
	
	public static String screenshot(String foldername, String Screenshotname) throws IOException {
		return TakeNScreenshot.screenshot(foldername, Screenshotname);
	}
	

}
