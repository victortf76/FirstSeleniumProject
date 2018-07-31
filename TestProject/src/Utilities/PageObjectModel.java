package Utilities;

import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class PageObjectModel {

	// Create a new instance of the web driver
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;
	public WebElement webElement;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String usedBrowser;
	
	public static void initializeAll(String browser, String test) throws MalformedURLException {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Convidad01\\QAEnvironment\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//Starts the Firefox driver
		if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Convidad01\\QAEnvironment\\TestProject\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//Launch the Online Website
		driver.get(Constants.URL2);
		//Initialize actions
		action = new Actions(driver);
		//Initialize WebDriverait
		wait = new WebDriverWait(driver,15);
		//Initialize Extent Reports
		extent = ExtentManager.getReport(browser, test);
		usedBrowser = browser;
		
	}
	
	public static ExtentTest newTest(String name, String description) {
		return test;
	}
	
	public static boolean changeToWindow(String windowTitle, boolean closeOtherTabs) {
			
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		boolean newWindowFound = false;
	
		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle); 
		    if(driver.getTitle().equalsIgnoreCase(windowTitle))
		    {
		        
		    	newWindowFound = true;  
			        
			}else if (closeOtherTabs) driver.close();
		}
		
		return newWindowFound;	
		
	}
		
}
