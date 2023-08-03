package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;

public class HomePage extends BaseClass{
	// in this class we verify that we reached the required Home Page or Not
	
	@FindBy(xpath = "//div[@class = 'header item']")
	private WebElement logo;
	
	public HomePage(){
		PageFactory.initElements(getdriver(), this);
	}
	
	public String getURL() {
		return getdriver().getCurrentUrl();
	}
	public String getTitle() {
		return getdriver().getTitle();
	}
	
	public void waitForTime() throws InterruptedException {
		Thread.sleep(4000);
	}
	public boolean verifyLogo() {
		//WebElement logo = getdriver().findElement(By.xpath("//div[@class = 'header item']"));
		return displayStatus(logo);
	}

}
