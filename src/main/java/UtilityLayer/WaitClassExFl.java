package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitClassExFl extends BaseClass {

	//Here we maintain explicit wait and fluent wait code.
	
		public static WebElement visibilityOfElement(WebElement wb) {
			WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
			return wait.until(ExpectedConditions.visibilityOf(wb));
		}

		public static void visibilityOfAlert() {
			WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.alertIsPresent());
		}

		public static void visibilityOfFrameToBePresent(int frameIndex) {
			WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		}

		public static void visibilityOfFrameToBePresent(WebElement wb) {
			WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
		}

		public static void visibilityOfFrameToBePresent(String frameIdOrName) {
			WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));

		}
}
