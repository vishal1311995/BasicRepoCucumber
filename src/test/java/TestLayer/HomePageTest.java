package TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test( groups = {"EndToEndTesting", "SmokeTesting", "SanityTesting", "RegressionTesting", "HomePage"}, dependsOnGroups = "LoginPage")
public class HomePageTest extends BaseClass{
	
	HomePage home;
	
	@Test(priority = 2)
	public void waitingTime() throws InterruptedException{
		home = new HomePage();
		home.waitForTime();
	}
	@Test(priority = 3)
	public void validatePageTitle() {
		
		Assert.assertEquals(home.getTitle().contains("mento"), true);
	}
	
	@Test(priority =4)
	public void vlaidateHomeURL() {
		
		Assert.assertEquals(home.getURL().contains("cog"), true);
	}
	
	
	 @Test(priority = 5) 
	 public void verifyLogoC() {
	 Assert.assertEquals(home.verifyLogo(), true); 
	 }

	 
	 
	 
}
