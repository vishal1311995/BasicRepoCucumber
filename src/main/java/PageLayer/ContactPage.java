package PageLayer;

import static UtilityLayer.ActionClass.moveToElement;
import static UtilityLayer.HandleDropdownOptionsClass.*;
import static UtilityLayer.UtilsClass.sendKeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;


public class ContactPage extends BaseClass{
		@FindBy(xpath = "//a[@href='/contacts']")
		private WebElement contactButton;
		
		@FindBy(xpath = "(//button[@class='ui linkedin button'])[3]")
		private WebElement createButton;
		
		@FindBy(name = "first_name")
		private WebElement firstName;
		
		@FindBy(name = "last_name")
		private WebElement lastName;
		
		@FindBy(xpath = "(//div[@class = 'ui selection dropdown'])[2]")
		private WebElement dropdown;
		
		@FindBy(xpath = "//div[@name='status'][@role='option']")
		private List<WebElement> dropOptions;
		
		@FindBy(xpath = "//button[@class='ui linkedin button']")
		private WebElement saveButton;
		
		public ContactPage() throws Exception{
			PageFactory.initElements(getdriver(), this);
		}
		
		
		public void enterUserData( String fname, String lname, String value) throws InterruptedException {
			moveToElement(contactButton);
			UtilsClass.click(contactButton);
			UtilsClass.click(createButton);
			sendKeys(firstName, fname);
			sendKeys(lastName, lname);
			UtilsClass.click(dropdown);
			selectByLoop(dropOptions, value);
			UtilsClass.click(saveButton);
			Thread.sleep(2000);
			
		}
}
