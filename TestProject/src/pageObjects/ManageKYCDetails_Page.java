package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.PageObjectModel;

public class ManageKYCDetails_Page implements IPage {
	
	@FindBy(css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-head")
	static WebElement KYCOrderDetails;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-subtitle > div > div")
	static WebElement KYCOrderID;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(1) > div.ant-col-8")
	static WebElement EKYCID;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(2) > div.ant-col-8")
	static WebElement loginId;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(3) > div.ant-col-8")
	static WebElement userAccountName;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div:nth-child(2) > div > div:nth-child(1) > div.ant-col-8")
	static WebElement orderStatus;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div:nth-child(2) > div > div:nth-child(2) > div.ant-col-8")
	static WebElement submissionDate;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(1) > div.ant-card-body > div > div.kyc-content-separator > div > div:nth-child(2) > div > div:nth-child(3) > div.ant-col-8")
	static WebElement modifiedDate;
	
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-head")
	static WebElement KYCData;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(1) > div.ant-col-8")
	static WebElement KTPID;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(2) > div.ant-col-8")
	static WebElement name;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(3) > div.ant-col-8")
	static WebElement placeBirth;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(4) > div.ant-col-8")
	static WebElement dateBirth;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(5) > div.ant-col-8")
	static WebElement gender;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div.ant-col-12.border-separator.left-separator > div > div:nth-child(6) > div.ant-col-8")
	static WebElement religion;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(1) > div.ant-col-8")
	static WebElement KKID;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.ant-col-8")
	static WebElement occupy;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(3) > div.ant-col-8")
	static WebElement province;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(4) > div.ant-col-8")
	static WebElement city;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(5) > div.ant-col-8")
	static WebElement district;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(2) > div.ant-card-body > div > div > div > div:nth-child(2) > div > div:nth-child(6) > div.ant-col-8")
	static WebElement address;
	
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(3) > div.ant-card-head")
	static WebElement imageData;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div:nth-child(3) > div.ant-card-body > div > div > div > div > div > div > div")
	static WebElement image;
	
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div.kyc-btn-container.clearfix > button")
	static WebElement backButton;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div.kyc-btn-container.clearfix > div > button:nth-child(1)")
	static WebElement editButton;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div.kyc-btn-container.clearfix > div > button:nth-child(2)")
	static WebElement lockButton;
	
	
	public ManageKYCDetails_Page() {
    	PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.ant-layout > div > div > div > div > div:nth-child(3) > div.ant-card-body > div > div > div > div > div > div > div")));
		PageFactory.initElements(PageObjectModel.driver, this);
    }
	
	public String getKYCOrderDetailsText() {
		String text;
		try {
			text = KYCOrderDetails.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("KYCOrderDetails not found");
			return null;
		}
	}
	
	public String getKYCOrderIDText() {
		String text;
		try {
			text = KYCOrderID.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("KYCOrderID not found");
			return null;
		}
	}
	
	public String getEKYCIDText() {
		String text;
		try {
			text = EKYCID.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("EKYCID not found");
			return null;
		}
	}
	
	public String getLoginIDText() {
		String text;
		try {
			text = loginId.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("loginId not found");
			return null;
		}
	}
	
	public String getUserAccountNameText() {
		String text;
		try {
			text = userAccountName.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("userAccountName not found");
			return null;
		}
	}

	public String getOrderStatusText() {
		String text;
		try {
			text = orderStatus.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("orderStatus not found");
			return null;
		}
	}
	
	public String getSubmissionDateText() {
		String text;
		try {
			text = submissionDate.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("submissionDate not found");
			return null;
		}
	}
	
	public String getModifiedDateText() {
		String text;
		try {
			text = modifiedDate.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("modifiedDate not found");
			return null;
		}
	}
	
	public String getKYCDataText() {
		String text;
		try {
			text = KYCData.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("KYCData not found");
			return null;
		}
	}
	
	public String getKTPIDText() {
		String text;
		try {
			text = KTPID.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("KTPID not found");
			return null;
		}
	}
	
	public String getNameText() {
		String text;
		try {
			text = name.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("name not found");
			return null;
		}
	}
	
	public String getPlaceBirthText() {
		String text;
		try {
			text = placeBirth.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("placeBirth not found");
			return null;
		}
	}
	
	public String getDateBirthText() {
		String text;
		try {
			text = dateBirth.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("dateBirth not found");
			return null;
		}
	}
	
	public String getGenderText() {
		String text;
		try {
			text = gender.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("gender not found");
			return null;
		}
	}
	
	public String getReligionText() {
		String text;
		try {
			text = religion.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("religion not found");
			return null;
		}
	}
	
	public String getKKIDText() {
		String text;
		try {
			text = KKID.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("KKID not found");
			return null;
		}
	}
	
	public String getOccupyText() {
		String text;
		try {
			text = occupy.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("occupy not found");
			return null;
		}
	}
	
	public String getProvinceText() {
		String text;
		try {
			text = province.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("province not found");
			return null;
		}
	}
	
	public String getCityText() {
		String text;
		try {
			text = city.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("city not found");
			return null;
		}
	}
	
	public String getDistrictText() {
		String text;
		try {
			text = district.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("district not found");
			return null;
		}
	}
	
	public String getAddressText() {
		String text;
		try {
			text = address.getText();
			return text;
		}catch(Exception ef) {
			PageObjectModel.test.fail("address not found");
			return null;
		}
	}
	
}
