package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class SelectClass extends BaseClass{
	public static WebElement wb;
	public static Select sel = new Select(wb);
	
	public static void selectByIndex(int index) {
		sel.selectByIndex(index);
	}
	public static void selectByValue(String Value) {
		sel.selectByValue(Value);
	}
	public static void selectByVisibleText(String visibleText) {
		sel.selectByVisibleText(visibleText);
	}
	
}
