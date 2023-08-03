package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class FrameClass extends BaseClass{
		
		public static void selectFrameIndex(int index) {
			getdriver().switchTo().frame(index);
		}
		public static void selectFrameName(String name) {
			getdriver().switchTo().frame(name);
		}
		public static void selectFrameElement(WebElement wb) {
			getdriver().switchTo().frame(wb);
		}
		public static void selectFrameID(String id) {
			getdriver().switchTo().frame(id);
		}
		public static void parentFrame() {
			getdriver().switchTo().parentFrame();
		}
		public static void DefaultFrame() {
			getdriver().switchTo().defaultContent();
		}
		
}
