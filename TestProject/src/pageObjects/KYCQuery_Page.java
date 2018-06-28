package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class KYCQuery_Page implements IPage {
	
	@FindBy(id = "loginIdInput")
	static WebElement idInput;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content > div > div:nth-child(5) > div > div > div > div")
	static WebElement statusBox;
	
	@FindBy (css = "body > div:nth-child(17) > div > div > div > ul")
	static WebElement statusBoxDropDown;
	
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
	
	public boolean presenceOfLoginIdBox() {
		try {
			
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginIdInput")));			
			
			return true;
			
		}catch(Exception ef) {
			PageObjectModel.test.fatal(ef.toString());
			return false;
		}
	}
	
	public boolean presenceOfStatusDropdownBox() {
		try {
			
			PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content > div > div:nth-child(5) > div > div > div > div > div > div > div.ant-select-selection-selected-value")));
			//if(checkDropDownOptions()) 	
			
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
	
	public boolean checkDropDownOptions() {
		try {
			PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(statusBox));
			CustomActions.customClick(statusBox, "Displaying drop down option");
			Select dropDown = new Select (statusBoxDropDown);
			List<WebElement> dd = dropDown.getOptions();
			
			String option1 = dd.get(0).toString();
			assertTrue(option1.equalsIgnoreCase("In Review"));
			
			String option2 = dd.get(1).toString();
			assertTrue(option2.equalsIgnoreCase("Pending"));
			
			String option3 = dd.get(2).toString();
			assertTrue(option3.equalsIgnoreCase("Closed"));
			
			return true;
		}catch(AssertionError e) {
			PageObjectModel.test.fail("The Status drop down box options are incorrect");
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
