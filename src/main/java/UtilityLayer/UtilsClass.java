package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}
	public static void sendKeys(WebElement wb, String str) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(str);
		}
	}
	public static boolean displayStatus(WebElement wb) {
		return wb.isDisplayed();
	}
	public static String getAttribute(WebElement wb, String value) {
		return wb.getAttribute(value);
	}
	public static String getText(WebElement wb) {
		return wb.getText();
	}
}
