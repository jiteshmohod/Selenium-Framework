package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage  {

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	 public String getToasterMsg() {
	    	waitForTaosterToAppear();
	    	return driver.findElement(toaster).getText();
	    }
	

}
