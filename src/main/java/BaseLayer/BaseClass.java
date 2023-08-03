package BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilityLayer.HandleProperties;


public class BaseClass {

	private static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<WebDriver>();
	public static WebDriver browser;
	public static void initialization(String browsername) throws Exception {
		if (browsername.equalsIgnoreCase("chrome")){
			browser = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")){
			browser = new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			browser = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("headless")){
			ChromeOptions cop = new ChromeOptions();
			cop.addArguments("--headless");
			browser = new ChromeDriver(cop);
		}
		else if (browsername.equalsIgnoreCase("incognito")){
			ChromeOptions cop = new ChromeOptions();
			cop.addArguments("--incognito");
			browser = new ChromeDriver(cop);
		}
		threadlocal.set(browser);
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		browser.manage().window().maximize();
		browser.manage().deleteAllCookies();
		browser.get(HandleProperties.props().getProperty("url"));
		
	}
	
	public static WebDriver getdriver() {
		return threadlocal.get();
	}
	
}
