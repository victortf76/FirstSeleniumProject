package automationFramework;

import java.io.FileReader;
import org.testng.Assert;
import Utilities.Constants;
import Utilities.ExcelUtils;
import Utilities.PageObjectModel;
import au.com.bytecode.opencsv.CSVReader;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTestCase {
	Home_Page homeObject;
	LogIn_Page loginObject;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws Exception {
		
		PageObjectModel.initializeAll(browser);
		
	}
	
	@Test
	public void getTitle() {
		try {
			//Initialize Extent Test
			PageObjectModel.test = PageObjectModel.extent.createTest("getTitle("+PageObjectModel.usedBrowser+")", "Checks the actual page's title");
			homeObject = new Home_Page();
			
			//Get the site's title
			String realResult = homeObject.getTitle();
			String expectedResult = "Sign In";
			
			// Print a Log In message to the screen
			System.out.println("Real result: " + realResult + " Expected result: " + expectedResult);
			
			//Compare if the gotten title is the expected one
			Assert.assertTrue(realResult.equalsIgnoreCase(expectedResult));
			PageObjectModel.test.pass("Page title expected: '"+realResult+"'");
			
		}catch(AssertionError e){
			
			PageObjectModel.test.fail("Page title doesn't match");
			
		}catch(Exception ef){
			
			PageObjectModel.test.fatal(ef.toString());
			
		}
	}
	
	@AfterTest
	public void shutDown() {
		
		if (PageObjectModel.driver!=null) {
			// Close the driver
			PageObjectModel.driver.quit();
			
		}
		
		PageObjectModel.extent.flush();
		
	}
}