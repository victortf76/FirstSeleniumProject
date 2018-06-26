package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class KYCQuery_Page implements IPage {
	
	@FindBy(id = "loginIdInput")
	static WebElement idInput;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content > div > div:nth-child(5) > div > div > div > div > div > div > div.ant-select-selection-selected-value")
	static WebElement statusBox;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button.ant-btn.ant-btn-primary.ant-btn-lg")
	static WebElement searchButton;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button:nth-child(2)")
	static WebElement clearButton;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(1)")
	static WebElement orderIdElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(2)")
	static WebElement loginIdElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(3)")
	static WebElement usernameElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(4)")
	static WebElement submissionElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(5)")
	static WebElement documentElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(6)")
	static WebElement statusElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(7)")
	static WebElement modifiedElement;
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead > tr > th:nth-child(8)")
	static WebElement actionElement;
	
	public KYCQuery_Page() {
    	PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead")));
		PageFactory.initElements(PageObjectModel.driver, this);
    }
	
	public boolean presenceOfMainElements() {
		boolean passed = true;
		try {
			PageObjectModel.test.info("Looking for Login ID input box");
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginIdInput")));
			PageObjectModel.test.pass("Login ID input box present");
			
			PageObjectModel.test.info("Looking for Status dropdown box");
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content > div > div:nth-child(5) > div > div > div > div > div > div > div.ant-select-selection-selected-value")));
			PageObjectModel.test.pass("Status dropdown box present");
			
			PageObjectModel.test.info("Looking for Search button");
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button.ant-btn.ant-btn-primary.ant-btn-lg")));
			PageObjectModel.test.pass("Search button present");
			
			PageObjectModel.test.info("Looking for Clear button");
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-footer > button:nth-child(2)")));
			PageObjectModel.test.pass("Clear button present");
				
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
			return false;
		}
		return passed;
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
	
	public String getUsernameText() {
		String text;
		try {
			text = usernameElement.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("usernameElement not found");
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

}
