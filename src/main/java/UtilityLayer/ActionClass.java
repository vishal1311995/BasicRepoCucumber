package UtilityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{
		
		public static Actions act = new Actions(getdriver());
		
		public static void click() 
		{act.click();}
		public static void click(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.click(wb);
						}
			}
		public static void doubleClick() {
			act.doubleClick();
			}
		public static void doubleClick(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.doubleClick(wb);
						}
			}
		public static void contextClick() {
			act.contextClick();
			}
		public static void contextClick(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.contextClick(wb);
						}
			}
		public static void moveToElement(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.moveToElement(wb);
						}
			}
		public static void dragAndDrop(WebElement dragFrom, WebElement dropHere) 
		{
			if (dragFrom.isDisplayed() && dragFrom.isEnabled()) {
				if (dropHere.isDisplayed() && dropHere.isEnabled()) {
					act.dragAndDrop(dragFrom, dropHere);
									}
						}
			}
		public static void clickAndHold() {
			act.clickAndHold();
			}
		public static void clickAndHold(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.clickAndHold(wb);
						}
			}
		public static void scrollToElement(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.scrollToElement(wb);
						}
			}
		public static void release() {
			act.release();
			}
		public static void release(WebElement wb) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.release(wb);
						}
			}
		public static void sendKeys(WebElement wb, String value) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				act.sendKeys(wb, value).build().perform();
			}
		}
		public static void EnterUpperCaseLetter(WebElement wb, String value) {
			if (wb.isDisplayed() && wb.isEnabled()) {
				// act.keyUp(org.openqa.selenium.Keys.SHIFT)
				act.keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
			}
		}
		
}
