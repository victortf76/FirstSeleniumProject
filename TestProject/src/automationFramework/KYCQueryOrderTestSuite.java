package automationFramework;

import static org.testng.Assert.assertTrue;

import Utilities.Constants;
import Utilities.PageObjectModel;
import pageObjects.Home_Page;
import pageObjects.KYCQuery_Page;
import pageObjects.LogIn_Page;
import pageObjects.ManageKYC_Page;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KYCQueryOrderTestSuite {
	Home_Page homeObject;
	LogIn_Page loginObject;
	KYCQuery_Page queryObject;
	ManageKYC_Page manageKYCObject;
	
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws Exception {
		
		PageObjectModel.initializeAll(browser, "KYCQueryOrderTestSuite");
		
	}
			
	@Test
	public void KYCQueryOrderPageParametersDisplayedTest() {
		try {
			
			PageObjectModel.driver.get(Constants.URL2);
			PageObjectModel.test = PageObjectModel.extent.createTest("KYCQueryOrderPageParametersDisplayedTest ("+PageObjectModel.usedBrowser+")", "Checks the buttons on the search page");
			
			loginObject = new LogIn_Page();
			
			loginObject.insertUserCredentials(Constants.Username2, Constants.Password2);
			loginObject.submitUserCredentials();
			
			homeObject = new Home_Page();
			
			queryObject = (KYCQuery_Page) homeObject.goToKYCQueryPage();
			
			
			PageObjectModel.test.info("Looking for Login ID input box");		
			assertTrue(queryObject.presenceOfLoginIdBox());
			PageObjectModel.test.pass("Login ID input box present");
			
			PageObjectModel.test.info("Looking for Status dropdown box");
			assertTrue(queryObject.presenceOfStatusDropdownBox());
			PageObjectModel.test.pass("Status dropdown box present");
			
			PageObjectModel.test.info("Looking for Search button");
			assertTrue(queryObject.presenceOfSearchButton());
			PageObjectModel.test.pass("Search button present");
			
			PageObjectModel.test.info("Looking for Clear button");
			assertTrue(queryObject.presenceOfClearButton());
			PageObjectModel.test.pass("Clear button present");
			
			
			PageObjectModel.test.info("Getting KYC Order ID text");
			String orderIdText = queryObject.getOrderIdText();
			assertTrue(orderIdText.equalsIgnoreCase("KYC Order ID"));
			PageObjectModel.test.pass("KYC Order ID displayed correctly");
			
			PageObjectModel.test.info("Getting Login ID text");
			String loginIdText = queryObject.getloginIdText();
			assertTrue(loginIdText.equalsIgnoreCase("Login ID"));
			PageObjectModel.test.pass("Login ID displayed correctly");
			
			PageObjectModel.test.info("Getting User Account Name text");
			String usernameText = queryObject.getUsernameText();
			assertTrue(usernameText.equalsIgnoreCase("User Account Name"));
			PageObjectModel.test.pass("User Account Name displayed correctly");
			
			PageObjectModel.test.info("Getting Submission Date text");
			String submissionText = queryObject.getsubmissionText();
			assertTrue(submissionText.equalsIgnoreCase("Submission Date"));
			PageObjectModel.test.pass("Submission Date displayed correctly");
			
			PageObjectModel.test.info("Getting Document Type text");
			String documentText = queryObject.getDocumentText();
			assertTrue(documentText.equalsIgnoreCase("Document Type"));
			PageObjectModel.test.pass("Document Type displayed correctly");
			
			PageObjectModel.test.info("Getting Status text");
			String statusText = queryObject.getStatusText();
			assertTrue(statusText.equalsIgnoreCase("Status"));
			PageObjectModel.test.pass("Status displayed correctly");
			
			PageObjectModel.test.info("Getting Modified Date text");
			String modifiedText = queryObject.getModifiedText();
			assertTrue(modifiedText.equalsIgnoreCase("Modified Date"));
			PageObjectModel.test.pass("Modified Date displayed correctly");
			
			PageObjectModel.test.info("Getting Action text");
			String actionText = queryObject.getActionIdText();
			assertTrue(actionText.equalsIgnoreCase("Action"));
			PageObjectModel.test.pass("Action displayed correctly");
			
			PageObjectModel.test.pass("All elements are present");
			
		}catch(AssertionError e){
			
			PageObjectModel.test.fail("One or more items are missing");
			
		}catch(Exception ef) {
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
