package TestLayer;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import UtilityLayer.ExcelReaderClass;
import UtilityLayer.UtilsClass;

@Test( groups = {"EndToEndTesting", "SmokeTesting", "SanityTesting", "RegressionTesting"}, dependsOnGroups = "HomePage")
public class ContactPageTest extends BaseClass{
		
	@DataProvider(name = "dataSheet")
	public static Object[][] getContactNames() throws IOException{
		ExcelReaderClass excelreader = new ExcelReaderClass("C:\\Users\\HP\\eclipse-workspace\\P1_Hybrid\\src\\test\\ResourcesNew\\projectData2.xlsx");
		return excelreader.getSheetValues(0);
		
	}
	
	@Test(priority = 5, dataProvider = "dataSheet" )
	public static void validateContactForm(String fname, String lname, String value) throws Exception {
		ContactPage contactpage = new ContactPage();
		contactpage.enterUserData(fname, lname, value);
	}
    
}
