package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleProperties;

import static UtilityLayer.UtilsClass.*; // remember to make it static to use without creating obj

import java.io.IOException;

public class LoginPage extends BaseClass{

	@FindBy(name = "email")
	private WebElement Username;
	
	@FindBy(name = "password")
	private WebElement Passwd;
	
	@FindBy(xpath = "//div[@class = 'ui fluid large blue submit button']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@href='/home']")
	private WebElement Homebutton;
	
	public LoginPage() throws Exception{
		PageFactory.initElements(getdriver(), this);
	}
	
	public void loginFunction() throws Exception {
		sendKeys(Username, HandleProperties.props().getProperty("username")); // import the functionality from the utils calss first
		sendKeys(Passwd, HandleProperties.props().getProperty("passwd"));
		click(loginButton);
	}
}
