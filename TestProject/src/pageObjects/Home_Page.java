package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class Home_Page implements IPage {
	
	

	@FindBy(css = "#J-nav > li:nth-child(7) > a")
	static WebElement userNavBar;
	
	@FindBy(css = "#nav-sub > div:nth-child(7) > dl:nth-child(2) > dd > ul > li:nth-child(1) > a")
	static WebElement KYCQueryNavBar;
	
	public Home_Page() {
		PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#J-sidemenu > div > ul > li:nth-child(2) > a")));
		PageFactory.initElements(PageObjectModel.driver, this);
	}
	
	public void goToKYCPage() {
		PageObjectModel.wait.until(ExpectedConditions.visibilityOf(userNavBar));
		userNavBar = CustomActions.customClick(userNavBar, "clicking on user");
		PageObjectModel.wait.until(ExpectedConditions.visibilityOf(KYCQueryNavBar));
		KYCQueryNavBar = CustomActions.customClick(KYCQueryNavBar, "clicking on KYC Query Order");
		
	}
	
	/* Deprecated
	public IPage goToMyAccount() {
		myAccountElement = CustomActions.customClick(myAccountElement,"Accessing to my account");
		return new LogIn_Page();
	}
	
	public void logout() {
		logoutElement = CustomActions.customClick(logoutElement, "Loging out");
	}
	*/
	
}
