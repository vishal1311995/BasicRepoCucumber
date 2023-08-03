package UtilityLayer;

import BaseLayer.BaseClass;

public class AlertClass extends BaseClass{

	public static void clickOK() 
	{getdriver().switchTo().alert().accept();}
	public static void clickCancle() 
	{getdriver().switchTo().alert().dismiss();}
	public static void getText() 
	{getdriver().switchTo().alert().getText();}
	public static void sendValue(String value) 
	{getdriver().switchTo().alert().sendKeys(value);}
	public static String captureValueAndClickOnOkButton() {
		String value = getdriver().switchTo().alert().getText();
		getdriver().switchTo().alert().accept();
		return value;
	}

	public static String captureValueAndClickOnCancelButton() {
		String value = getdriver().switchTo().alert().getText();
		getdriver().switchTo().alert().dismiss();
		return value;
	}

	public static void EnterValueAndClickOnOkButton(String value) {
		getdriver().switchTo().alert().sendKeys(value);
		getdriver().switchTo().alert().accept();
	}

	public static void EnterValueAndClickOnCancelButton(String value) {
		getdriver().switchTo().alert().sendKeys(value);
		getdriver().switchTo().alert().dismiss();

	}
}
