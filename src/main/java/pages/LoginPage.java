package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage  {


	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	By email = By.id("userEmail");
	By password = By.id("userPassword");
	By  loginbtn = By.id("login");
	
	public void enterEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public  HomePage clickLogin() {
		driver.findElement(loginbtn).click();
		return new HomePage(driver);
	}
	
	 public String getToasterMsg() {
	    	waitForTaosterToAppear();
	    	return driver.findElement(toaster).getText();
	    }
	
}
