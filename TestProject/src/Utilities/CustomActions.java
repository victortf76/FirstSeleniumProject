package Utilities;

import org.openqa.selenium.WebElement;

public class CustomActions {

	public static WebElement customClick(WebElement element, String details){
		element.click();
		PageObjectModel.test.info(details);
		return element;
	}
	
	public static WebElement customSubmit(WebElement element, String details){
		element.submit();
		PageObjectModel.test.info(details);
		return element;
	}
	
	public static WebElement customSendKeys(WebElement element, String details,String keys) {
		element.sendKeys(keys);
		PageObjectModel.test.info(details);
		return element;
	}
	
	public static String customGetTitle(String details) {
		
		String title = PageObjectModel.driver.getTitle();
		PageObjectModel.test.info(details);
		
		return title;
	}
}
