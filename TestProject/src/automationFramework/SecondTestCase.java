package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	//Create Soft Assertions
	public SoftAssert softAssert = new SoftAssert();
	
	// Create a new instance of the Chrome driver
	public WebDriver driver;
	public Actions action;
	public WebDriverWait wait;
	public WebElement webElement;
	
	@Parameters("browser")
	
	@BeforeClass
	public void setUp(String browser) {
		
		//Starts the Chrome driver
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Convidad01\\QAEnvironment\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//Starts the Firefox driver
		if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Convidad01\\QAEnvironment\\TestProject\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Launch the Online Website
		driver.get("http://www.softwaretestingmaterial.com/");
		//Initialize actions
		action = new Actions(driver);
		//Initialize WebDriverait
		wait = new WebDriverWait(driver,5);		
	}
	
	@Test
	public void getTitle() {
		//Get the site's title
		String realResult = driver.getTitle();
		String expectedResult = "Software Testing Material";
		
		// Print a Log In message to the screen
		System.out.println("Real result: " + realResult + " Expected result: " + expectedResult);
		
		//Compare if the gotten title is the expected one
		softAssert.assertTrue(realResult.equalsIgnoreCase(expectedResult), "Page title doesn't match");
	}
	
	@Test
	public void testLocator1() throws InterruptedException {
		//driver.findElement(By.id("menu-item-4275"));
		By locator = By.id("menu-item-4275");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		webElement = driver.findElement(locator);
		action.click(webElement).build().perform();
		Thread.sleep(5000);
		String realResult = driver.getTitle();
		String expectedResult = "Guest Post Guidelines";
		// Print a Log In message to the screen
		System.out.println("Real result: " + realResult + " Expected result: " + expectedResult);
				
		//Compare if the gotten title is the expected one
		softAssert.assertTrue(realResult.equalsIgnoreCase(expectedResult), "Page title doesn't match");

	}
	
	@AfterClass
	public void shutDown() {
		if (driver!=null) {
			// Close the driver
			driver.quit();
		}
		softAssert.assertAll();		
	}

}
