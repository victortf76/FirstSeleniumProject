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
	
	

	@FindBy(id = "account")
	static WebElement myAccountElement;
	
	@FindBy(id = "account_logout")
	static WebElement logoutElement;
	
	public Home_Page() {
		PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("slides")));
		PageFactory.initElements(PageObjectModel.driver, this);
	}
	
	public IPage goToMyAccount() {
		myAccountElement = CustomActions.customClick(myAccountElement,"Accessing to my account");
		return new LogIn_Page();
	}
	
	public void logout() {
		logoutElement = CustomActions.customClick(logoutElement, "Loging out");
	}
	
	public String getTitle() {
		String title = PageObjectModel.driver.getTitle();
		
		return title;
	}
}
