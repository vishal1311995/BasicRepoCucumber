package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import BaseLayer.BaseClass;

public class RetryAnalyserClass extends BaseClass implements IRetryAnalyzer{

	// to import the IRetryAnalyser properly, we have to change the TestNG dependancy
	// from "test" to "compile"
	int counter  = 0 ;
	int MaxRetryNum = 5;
	public boolean retry(ITestResult result) {
		// it is used to Retry Run specific failed test cases by mentioning this class
		// in test annotation
		if (counter < MaxRetryNum) {
			counter++;
			return true;
		}
		return false;
	}
	
		
}
