package UtilityLayer;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptExecutorClass extends BaseClass{

	private static JavascriptExecutor js = (JavascriptExecutor)getdriver();
	
	public static void openWindowJS(String url) {
		
		String path = "window.location= '" + url + "';";
		js.executeScript(path);
	}
	public static void openWindowOpenJS(String url) {
		String path = "window.open('" + url + "');";
		js.executeScript(path);
	}
	
	public static void clickWithJS(WebElement wb) {
		js.executeScript("arguments[0].click();", wb);
	}
	
	public static void sendkeysWithJS(WebElement wb, String str) {
		String argument = "arguments[0].value= '" + str + "';";
		js.executeScript(argument, wb);
	}
	public static void refreshOrNavigateWithJS(String index) {
		// 0 for refresh and -1,-2,1,2 for backward and forward respt
		String argument = "history.go("+ index + ");";
		js.executeScript(argument);
	}
	
	public static void dropdownWithJS(WebElement wb, String value) {
		String path = "arguments[0].value='" + value + "';";
		js.executeScript(path, wb);
	}
	public static void borderlineAnElement(WebElement wb) {	
	js.executeScript("arguments[0].style.border='3px solid red';",wb);
	}
	
	public static void alertPop(String popUp) {
		((JavascriptExecutor) getdriver()).executeScript("alert('" + popUp + "');");
	}

	public static void confirmPop(String popUp) {
		((JavascriptExecutor) getdriver()).executeScript("confirm('" + popUp + "');");
	}

	public static void promptPop(String popUp) {
		((JavascriptExecutor) getdriver()).executeScript("prompt('" + popUp + "');");
	}
	
	public static String getTitleWithJS() {
		return ((JavascriptExecutor) getdriver()).executeScript("return document.title").toString();
	}

	public static String geturlWithJS() {
		return ((JavascriptExecutor) getdriver()).executeScript("return document.URL").toString();
	}

	public static void scrollDownToElementWithJS(WebElement wb) {
		((JavascriptExecutor) getdriver()).executeScript("arguments[0].scrollIntoView(true);", wb);
	}
}
