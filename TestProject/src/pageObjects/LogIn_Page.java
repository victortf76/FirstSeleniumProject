package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.Constants;
import Utilities.CustomActions;
import Utilities.ExcelUtils;
import Utilities.PageObjectModel;

public class LogIn_Page implements IPage {
	
	@FindBy(id = "log")
	static WebElement usernameBoxElement;
	
	@FindBy(id = "pwd")
	static WebElement passwordBoxElement;
	 
	@FindBy(id = "login")
	static WebElement loginButtonElement;
	
    public LogIn_Page() {
    	PageObjectModel.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
    	PageFactory.initElements(PageObjectModel.driver, this);
    }
    
    public void insertUserCredentials(String username, String password) throws Exception {
    	
    	//usernameBoxElement.clear();
    	//passwordBoxElement.clear();
    	
    	usernameBoxElement = CustomActions.customSendKeys(usernameBoxElement,"Filling username credentials: "+username,username);
    	passwordBoxElement = CustomActions.customSendKeys(passwordBoxElement,"Filling password credentials:"+password,password);
    }
    
    public String submitUserCredentials() {
    	loginButtonElement = CustomActions.customClick(loginButtonElement,"Submiting user credentials");
    	String result;
    	try {
			Thread.sleep(500);
			PageObjectModel.wait.until(ExpectedConditions.invisibilityOf(PageObjectModel.driver.findElement(By.cssSelector("#ajax_loginform > div"))));
			Thread.sleep(500);
			//String result = PageObjectModel.driver.findElement(By.cssSelector("#ajax_loginform > p.response")).getAttribute("innerhtml").toString();
			result = PageObjectModel.driver.findElement(By.cssSelector("#ajax_loginform > p.response")).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "SUCCESS";
		}
    	return result;
    }
    
    public String getUserFromExcel() throws Exception {
    	return ExcelUtils.getCellData(1,1);
    }
    
    public String getPassFromExcel() throws Exception {
    	return ExcelUtils.getCellData(1, 2);
    }
	
}
