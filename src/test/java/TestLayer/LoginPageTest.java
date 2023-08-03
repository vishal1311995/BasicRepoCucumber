package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;


@Test(priority = 1)
public class LoginPageTest extends BaseClass{
	
	@Parameters({"browsername"}) // more than one parameter requires "{}"
	@BeforeTest (groups = {"LoginPage", "EndToEndTesting"})
	public static void setUp(String browsername) throws Exception {
		initialization(browsername);
	}
	
	//@Parameters({"username", "passwd"})
	@Test(priority = 1, groups = {"LoginPage", "EndToEndTesting"})
	public static void logIntoPage() throws Exception {
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunction();
	}
	
	
	@AfterTest(groups = {"LoginPage", "EndToEndTesting"}) 
	public static void
	finish() {
	  
	}
	 
}
