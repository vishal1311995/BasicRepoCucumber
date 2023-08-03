package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;




public class ListnerClass implements ITestListener{
	ExtentReports extentreports; // to generate extent report
	ExtentTest extenttest; // to give test log comments, and screenshot directions
	
	public void onStart(ITestContext context) {
		extentreports = ExtentReportClass.setup(context.getSuite().getName());
		// appear at the start of the report on suite start
	}

	public void onTestStart(ITestResult result) {
		extenttest = extentreports.createTest(result.getMethod().getMethodName());
		// appear at the start of every test case in the report
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName() + "Testcase passed");
		try {
			extenttest.addScreenCaptureFromPath(ExtentReportClass.screenshot("PassedTestScreenshots", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// appear on test case success with screenshot
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName() + "Testcase Failed");
		try {
			extenttest.addScreenCaptureFromPath(ExtentReportClass.screenshot("FailedTestScreenshots", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//appear on test case failure with screenshot
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName() + "Testcase Skipped");
		// appear when test case skipped
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onFinish(ITestContext context) {
		extentreports.flush();
		// MUST HAVE THIS AT THE END OF EXTENT REPORT TO CREATE THE REPORT AND SHOW ERRORS
	}

	
}
