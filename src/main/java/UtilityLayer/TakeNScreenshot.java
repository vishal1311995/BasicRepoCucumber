package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeNScreenshot extends BaseClass{
		
	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	public static String screenshot(String Foldername, String ScreenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)getdriver();
		File pic = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "\\" + Foldername + "\\" + ScreenshotName + date() + ".png";
		FileUtils.copyFile(pic, new File(path));
		return path;
	}
}
