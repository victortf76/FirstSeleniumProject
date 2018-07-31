package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class ManageKYC_Page implements IPage {
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content.row-multiple > div:nth-child(1) > div.ant-col-5.col-content-text > div" )
	static WebElement filterBox;
	
	@FindBy(css = "body > div:nth-child(16) > div > div > div > ul > li:nth-child(1)")
	static WebElement filterByID;
	
	@FindBy(id = "loginIdInput")
	static WebElement idInput;
	
	@FindBy(css = "body > div:nth-child(16) > div > div > div > ul > li:nth-child(2)")
	static WebElement filterByStatus;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content.row-multiple > div:nth-child(2) > div.ant-col-5.col-content-text > div > div > div > div" )
	static WebElement orderStatusBox;
	
	@FindBy (css = "body > div:nth-child(17) > div > div > div > ul > li:nth-child(1)")
	static WebElement uncheckedOption;
	
	@FindBy (css = "body > div:nth-child(17) > div > div > div > ul > li:nth-child(2)")
	static WebElement checkedOption;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button.ant-btn.ant-btn-primary.ant-btn-lg")
	static WebElement searchButton;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button:nth-child(2)")
	static WebElement clearButton;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(1)")
	static WebElement orderIdElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(2)")
	static WebElement EKYCIdElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(3)")
	static WebElement loginIdElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(4)")
	static WebElement submissionElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(5)")
	static WebElement documentElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(6)")
	static WebElement statusElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(7)")
	static WebElement modifiedElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(8)")
	static WebElement actionElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	static WebElement viewDetails;
	
	public ManageKYC_Page() {
    	PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(5)")));
		PageFactory.initElements(PageObjectModel.driver, this);
    }
	
	public boolean presenceOfFilterBox() {
		try {
			
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content.row-multiple > div:nth-child(1) > div.ant-col-5.col-content-text > div")));			
			
			return true;
			
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
			return false;
		}
	}
	
	public boolean presenceOfSearchButton() {
		try {
			
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button.ant-btn.ant-btn-primary.ant-btn-lg")));
			
			return true;
			
		}catch(Exception ef) {
			
			PageObjectModel.test.fatal(ef.toString());
			return false;
			
		}
		
	}
	
	public boolean presenceOfClearButton() {
		try {
			
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button:nth-child(2)")));
			
			return true;
			
		}catch(Exception ef) {
			
			PageObjectModel.test.fatal(ef.toString());
			return false;
			
		}
	}
	
	public boolean checkFilterById() {
		try {
			CustomActions.customClick(filterBox, "Droping down filter box");
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(filterByID));
			CustomActions.customClick(filterByID, "Selecting filter by id");
			
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(idInput));
			
			return true;
			
		}catch(Exception ef) {
			
			PageObjectModel.test.fatal(ef.toString());
			
			return false;
		}	
	}
	
	public boolean checkFilterByStatus() {
		try {
			CustomActions.customClick(filterBox, "Droping down filter box");
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(filterByID));
			Thread.sleep(300);
			CustomActions.customClick(filterByStatus, "Selecting filter by status");
			
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(orderStatusBox));
			
			return true;
			
		}catch(Exception ef) {
			
			PageObjectModel.test.fatal(ef.toString());
			
			return false;
		}
	}
	
	public String getOrderIdText() {
		String text;
		try {
			text = orderIdElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail(orderIdElement+" not found");
			return null;
		}
		
	}
	
	public String getEKYCIdText() {
		String text;
		try {
			text = EKYCIdElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("EKYCIdElement not found");
			return null;
		}
	}
	
	public String getloginIdText() {
		String text;
		try {
			text = loginIdElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("loginIdElement not found");
			return null;
		}
		
	}
	
	public String getsubmissionText() {
		String text;
		try {
			text = submissionElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("submissionElement not found");
			return null;
		}
		
	}
	
	public String getDocumentText() {
		String text;
		try {
			text = documentElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("documentElement not found");
			return null;
		}
		
	}
	
	public String getStatusText() {
		String text;
		try {
			text = statusElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("statusElement not found");
			return null;
		}
		
	}
	
	public String getModifiedText() {
		String text;
		try {
			text = modifiedElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("modifiedElement not found");
			return null;
		}
		
	}
	
	public String getActionIdText() {
		String text;
		try {
			text = actionElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("actionElement not found");
			return null;
		}
		
	}
	
	public IPage goToDetailsPage() {
		try {
			
			CustomActions.customClick(filterBox, "Droping down filter box");
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(filterByStatus));
			Thread.sleep(300);
			CustomActions.customClick(filterByStatus, "Selecting filter by status");
			CustomActions.customClick(orderStatusBox, "Opening drop down status box");
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(uncheckedOption));
			Thread.sleep(300);
			CustomActions.customClick(uncheckedOption, "Selecting unchecked option");
			CustomActions.customClick(searchButton, "Click on search button");
			PageObjectModel.test.info("Waiting for details to be displayed");
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")));
			PageObjectModel.test.info("Waiting for details to be clickable");
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(viewDetails));
			Thread.sleep(300);
			CustomActions.customClick(viewDetails, "Accessing to details page");
			
			
			String actualWindowTitle = "KYC Manage Detail";
			
			if (PageObjectModel.changeToWindow(actualWindowTitle, true)) return new ManageKYCDetails_Page();
			else return null;
			
			
			
		}catch(Exception ef) {
			
			PageObjectModel.test.fatal(ef.toString());
			return null;
			
		}
	}

}