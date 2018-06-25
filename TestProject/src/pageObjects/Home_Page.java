package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class Home_Page implements IPage {
	
	

	@FindBy(id = "login-name-input")
	static WebElement accountElement;
	
	@FindBy(id = "pwd-input")
	static WebElement passwordElement;
	
	@FindBy(id = "login-btn")
	static WebElement signinButtonElement;
	
	public Home_Page() {
		PageObjectModel.wait.until(ExpectedConditions.elementToBeClickable(By.id("login-btn")));
		PageFactory.initElements(PageObjectModel.driver, this);
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
	public String getTitle() {
		String title = PageObjectModel.driver.getTitle();
		
		return title;
	}
}
