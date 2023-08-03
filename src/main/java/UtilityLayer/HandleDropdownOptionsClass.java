package UtilityLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropdownOptionsClass extends BaseClass{
		
		public static void selectByIndex(WebElement wb, int index) {
			if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
			}
		}
		public static void selectByVisibletext(WebElement wb, String visibleValue) {
			if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByVisibleText(visibleValue);
			}
		}
		
		public static String selectByIndexAndGetValue(WebElement wb, int index) {
			if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
			}
			return new Select(wb).getFirstSelectedOption().getText();
		}
		public static String selectByVisibletextAndGetValue(WebElement wb, String visibleValue) {
			if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByVisibleText(visibleValue);
			}
			return new Select(wb).getFirstSelectedOption().getText();
		}
		
		public static String verifySelectedValue(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				return new Select(wb).getFirstSelectedOption().getText();
			}
			return null;
		}
		public static void printEveryOption(WebElement wb) {
			List <WebElement> listw = new Select(wb).getOptions();
			for (int i=0;i<listw.size();i++) {
				System.out.println(i);
			}
		}
		public static int getSizeofDropdown(WebElement wb) {
			int size = 0;
			if (wb.isDisplayed() && wb.isEnabled()) {
			size = new Select(wb).getOptions().size();
			}
			return size;
		}
		
		public static void checkValueIsPresentOrNot(List<WebElement> list, String reqValue)
		{
			for (WebElement web:list) {
				String webE = web.getText();
				if (webE.equalsIgnoreCase(reqValue)) {
					System.out.println( reqValue + " - is Present");
				}
				else {
					System.out.println( reqValue + " - is absent");
				}
			}
		}
		
		public static void selectByLoop(List<WebElement> list, String reqValue) {
			//List <WebElement> listw = getdriver().findElements(By.xpath(Xpath));
			for (WebElement web:list) {
				String webE = web.getText();
				if (webE.equalsIgnoreCase(reqValue)) {
					web.click();
					//System.out.println("Selected value: " + webE);
					break;
				}
			}
		}
		public static void selectByJS(WebElement wb, String value) {
			JavascriptExecutor js = (JavascriptExecutor)getdriver();
			String argument = "arguments[0].value= "+ "'"+ value + "'" ;
			js.executeScript(argument, wb);
		}
}
