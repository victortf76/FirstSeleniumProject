package automationFramework;

import static org.testng.Assert.assertTrue;

import Utilities.Constants;
import Utilities.PageObjectModel;
import pageObjects.Home_Page;
import pageObjects.KYCQuery_Page;
import pageObjects.LogIn_Page;
import pageObjects.ManageKYCDetails_Page;
import pageObjects.ManageKYC_Page;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ManageKYCTestSuite {
	Home_Page homeObject;
	LogIn_Page loginObject;
	KYCQuery_Page queryObject;
	ManageKYC_Page manageKYCObject;
	ManageKYCDetails_Page manageKYCDetailsObject;
	
	
	@Parameters("browser")
	@BeforeTest(groups = {"prepost"})
	public void setUp(String browser) throws Exception {
		
		PageObjectModel.initializeAll(browser, "ManageKYCTestSuite");
		
	}
	
	@Test(groups = {"Manage"})
	public void ManageKYCPageParametersDisplayedTest() {
		try {
			
			PageObjectModel.driver.get(Constants.URL);
			PageObjectModel.test = PageObjectModel.extent.createTest("ManageKYCPageParametersDisplayedTest ("+PageObjectModel.usedBrowser+")", "Checks the main elements on the Manage KYC page");
			
			loginObject = new LogIn_Page();
			
			loginObject.insertUserCredentials(Constants.Username2, Constants.Password2);
			loginObject.submitUserCredentials();
			
			homeObject = new Home_Page();
			
			manageKYCObject = (ManageKYC_Page) homeObject.goToManageKYCPage();
			
			
			PageObjectModel.test.info("Looking for Login ID input box");		
			assertTrue(manageKYCObject.presenceOfFilterBox());
			PageObjectModel.test.pass("Login ID input box present");
						
			PageObjectModel.test.info("Looking for Search button");
			assertTrue(manageKYCObject.presenceOfSearchButton());
			PageObjectModel.test.pass("Search button present");
			
			PageObjectModel.test.info("Looking for Clear button");
			assertTrue(manageKYCObject.presenceOfClearButton());
			PageObjectModel.test.pass("Clear button present");			
			
			PageObjectModel.test.info("Getting KYC Order ID text");
			String orderIdText = manageKYCObject.getOrderIdText();
			assertTrue(orderIdText.equalsIgnoreCase("KYC Order ID"));
			PageObjectModel.test.pass("KYC Order ID displayed correctly");
			
			PageObjectModel.test.info("Getting E-KYC ID text");
			String EKYCIdText = manageKYCObject.getEKYCIdText();
			assertTrue(EKYCIdText.equalsIgnoreCase("E-KYC ID"));
			PageObjectModel.test.pass("E-KYC ID displayed correctly");
			
			PageObjectModel.test.info("Getting Login ID text");
			String loginIdText = manageKYCObject.getloginIdText();
			assertTrue(loginIdText.equalsIgnoreCase("Login ID"));
			PageObjectModel.test.pass("Login ID displayed correctly");
			
			PageObjectModel.test.info("Getting Submission Date text");
			String submissionText = manageKYCObject.getsubmissionText();
			assertTrue(submissionText.equalsIgnoreCase("Submission Date"));
			PageObjectModel.test.pass("Submission Date displayed correctly");
			
			PageObjectModel.test.info("Getting Document Type text");
			String documentText = manageKYCObject.getDocumentText();
			assertTrue(documentText.equalsIgnoreCase("Document Type"));
			PageObjectModel.test.pass("Document Type displayed correctly");
			
			PageObjectModel.test.info("Getting Status text");
			String statusText = manageKYCObject.getStatusText();
			assertTrue(statusText.equalsIgnoreCase("Status"));
			PageObjectModel.test.pass("Status displayed correctly");
			
			PageObjectModel.test.info("Getting Modified Date text");
			String modifiedText = manageKYCObject.getModifiedText();
			assertTrue(modifiedText.equalsIgnoreCase("Modified Date"));
			PageObjectModel.test.pass("Modified Date displayed correctly");
			
			PageObjectModel.test.info("Getting Action text");
			String actionText = manageKYCObject.getActionIdText();
			assertTrue(actionText.equalsIgnoreCase("Action"));
			PageObjectModel.test.pass("Action displayed correctly");
			
			PageObjectModel.test.pass("All elements are present");
			
		}catch(AssertionError e){
			
			PageObjectModel.test.fail("One or more items are missing");
			
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
		}
	}
	
	@Test (groups = {"Manage"})
	public void checkFilterFunctionality() throws Exception {
		try{
			PageObjectModel.driver.get(Constants.URL);
			PageObjectModel.test = PageObjectModel.extent.createTest("checkFilterFunctionality ("+PageObjectModel.usedBrowser+")", "Checks that the filter swaps between options");
			
			loginObject = new LogIn_Page();
			
			loginObject.insertUserCredentials(Constants.Username2, Constants.Password2);
			loginObject.submitUserCredentials();
			
			homeObject = new Home_Page();
			
			manageKYCObject = (ManageKYC_Page) homeObject.goToManageKYCPage();
			
			PageObjectModel.test.info("Checking filter by ID");
			assertTrue(manageKYCObject.checkFilterById());
			PageObjectModel.test.pass("Filter by ID working");
			
			PageObjectModel.test.info("Checking filter by Status");
			assertTrue(manageKYCObject.checkFilterByStatus());
			PageObjectModel.test.pass("Filter by Status working");
			
			PageObjectModel.test.pass("Filter functionality working properly");
			
		}catch(AssertionError e){
			
			PageObjectModel.test.fail("One or more items are missing");
			
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
		}		
	}
	
	@Test (groups = {"Details"})
	public void ManageKYCDetailsPageDisplayedTest() {
		try {
			PageObjectModel.driver.get(Constants.URL);
			PageObjectModel.test = PageObjectModel.extent.createTest("ManageKYCDetailsPageDisplayedTest ("+PageObjectModel.usedBrowser+")", "Checks if the Manage KYC Details page is displayed ");
			
			loginObject = new LogIn_Page();
			
			loginObject.insertUserCredentials(Constants.Username2, Constants.Password2);
			loginObject.submitUserCredentials();
			
			homeObject = new Home_Page();
			
			manageKYCObject = (ManageKYC_Page) homeObject.goToManageKYCPage();
			
			manageKYCDetailsObject = (ManageKYCDetails_Page) manageKYCObject.goToDetailsPage();
			
			if (manageKYCDetailsObject != null) PageObjectModel.test.pass("Details page displayed");
			else PageObjectModel.test.fail("Details page not found");
				
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
		}
	}
	
	@Test (groups = {"Details"})
	public void ManageKYCPageDetailsParametersDisplayedTest() {
		try {
			PageObjectModel.driver.get(Constants.URL2);
			PageObjectModel.test = PageObjectModel.extent.createTest("ManageKYCPageDetailsParametersDisplayedTest ("+PageObjectModel.usedBrowser+")", "Checks the main elements on the Manage KYC Details page");
			
			loginObject = new LogIn_Page();
			
			loginObject.insertUserCredentials(Constants.Username2, Constants.Password2);
			loginObject.submitUserCredentials();
			
			homeObject = new Home_Page();
			
			manageKYCObject = (ManageKYC_Page) homeObject.goToManageKYCPage();
			
			manageKYCDetailsObject = (ManageKYCDetails_Page) manageKYCObject.goToDetailsPage();
			
			PageObjectModel.test.info("Getting KYC Order Details text");
			String KYCOrderDetailsText = manageKYCDetailsObject.getKYCOrderDetailsText();
			assertTrue(KYCOrderDetailsText.equalsIgnoreCase("KYC Order Details"));
			PageObjectModel.test.pass("KYC Order Details displayed correctly");
			/*		
			PageObjectModel.test.info("Getting KYC Order ID text");
			String KYCOrderIDText = manageKYCDetailsObject.getKYCOrderIDText();
			assertTrue(KYCOrderIDText.equalsIgnoreCase("KYC Order ID: "));
			PageObjectModel.test.pass("KYC Order ID displayed correctly");
			*/
			PageObjectModel.test.info("Getting E-KYC ID text");
			String EKYCIDText = manageKYCDetailsObject.getEKYCIDText();
			assertTrue(EKYCIDText.equalsIgnoreCase("E-KYC ID"));
			PageObjectModel.test.pass("E-KYC ID displayed correctly");
			
			PageObjectModel.test.info("Getting User Account Name text");
			String userAccountNameText = manageKYCDetailsObject.getUserAccountNameText();
			assertTrue(userAccountNameText.equalsIgnoreCase("User Account Name"));
			PageObjectModel.test.pass("User Account Name displayed correctly");
			
			PageObjectModel.test.info("Getting Order Status text");
			String orderStatusText = manageKYCDetailsObject.getOrderStatusText();
			assertTrue(orderStatusText.equalsIgnoreCase("Order Status"));
			PageObjectModel.test.pass("Order Status displayed correctly");
			
			PageObjectModel.test.info("Getting Submission Date text");
			String submissionDateText = manageKYCDetailsObject.getSubmissionDateText();
			assertTrue(submissionDateText.equalsIgnoreCase("Submission Date"));
			PageObjectModel.test.pass("Submission Date displayed correctly");
			
			PageObjectModel.test.info("Getting Modified Date text");
			String modifiedDateText = manageKYCDetailsObject.getModifiedDateText();
			assertTrue(modifiedDateText.equalsIgnoreCase("Modified Date"));
			PageObjectModel.test.pass("Modified Date displayed correctly");
			
			PageObjectModel.test.info("Getting KYC Data text");
			String KYCDataText = manageKYCDetailsObject.getKYCDataText();
			assertTrue(KYCDataText.equalsIgnoreCase("KYC Data"));
			PageObjectModel.test.pass("KYC Data displayed correctly");
			
			PageObjectModel.test.info("Getting KTP ID text");
			String KTPIDText = manageKYCDetailsObject.getKTPIDText();
			assertTrue(KTPIDText.equalsIgnoreCase("KTP ID"));
			PageObjectModel.test.pass("KTP ID displayed correctly");
			
			PageObjectModel.test.info("Getting Name text");
			String NameText = manageKYCDetailsObject.getNameText();
			assertTrue(NameText.equalsIgnoreCase("Name"));
			PageObjectModel.test.pass("Name displayed correctly");
			
			PageObjectModel.test.info("Getting Place of Birth text");
			String PlaceBirthText = manageKYCDetailsObject.getPlaceBirthText();
			assertTrue(PlaceBirthText.equalsIgnoreCase("Place of Birth"));
			PageObjectModel.test.pass("Place of Birth displayed correctly");
			
			PageObjectModel.test.info("Getting Date of Birth text");
			String DateBirthText = manageKYCDetailsObject.getDateBirthText();
			assertTrue(DateBirthText.equalsIgnoreCase("Date of Birth"));
			PageObjectModel.test.pass("Date of Birth displayed correctly");
			
			PageObjectModel.test.info("Getting Gender text");
			String GenderText = manageKYCDetailsObject.getGenderText();
			assertTrue(GenderText.equalsIgnoreCase("Gender"));
			PageObjectModel.test.pass("Gender displayed correctly");
			
			PageObjectModel.test.info("Getting Religion text");
			String ReligionText = manageKYCDetailsObject.getReligionText();
			assertTrue(ReligionText.equalsIgnoreCase("Religion"));
			PageObjectModel.test.pass("Religion displayed correctly");
			
			PageObjectModel.test.info("Getting KK ID text");
			String KKIDText = manageKYCDetailsObject.getKKIDText();
			assertTrue(KKIDText.equalsIgnoreCase("KK ID"));
			PageObjectModel.test.pass("KK ID displayed correctly");
			
			PageObjectModel.test.info("Getting Occupy text");
			String OccupyText = manageKYCDetailsObject.getOccupyText();
			assertTrue(OccupyText.equalsIgnoreCase("Occupy"));
			PageObjectModel.test.pass("Occupy displayed correctly");
			
			PageObjectModel.test.info("Getting Province text");
			String ProvinceText = manageKYCDetailsObject.getProvinceText();
			assertTrue(ProvinceText.equalsIgnoreCase("Province"));
			PageObjectModel.test.pass("Province displayed correctly");
			
			PageObjectModel.test.info("Getting City/Region text");
			String CityText = manageKYCDetailsObject.getCityText();
			assertTrue(CityText.equalsIgnoreCase("City/Region"));
			PageObjectModel.test.pass("City/Region displayed correctly");
			
			PageObjectModel.test.info("District Data text");
			String DistrictText = manageKYCDetailsObject.getDistrictText();
			assertTrue(DistrictText.equalsIgnoreCase("District"));
			PageObjectModel.test.pass("District displayed correctly");
			
			PageObjectModel.test.info("Getting Address text");
			String AddressText = manageKYCDetailsObject.getAddressText();
			assertTrue(AddressText.equalsIgnoreCase("Address"));
			PageObjectModel.test.pass("Address displayed correctly");
			
			PageObjectModel.test.pass("All elements are present");
			
		}catch(AssertionError e){
			
			PageObjectModel.test.fail("One or more items are missing");
			
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
		}
	}
	
	@AfterTest(groups = {"prepost"})
	public void shutDown() {
		
		if (PageObjectModel.driver!=null) {
			
			PageObjectModel.driver.quit();
			
		}
		
		PageObjectModel.extent.flush();
		
	}
}