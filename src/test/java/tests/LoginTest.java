package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	HomePage homePage;
	LoginPage loginPage;
	
	
	
	
	@Test
	public void loginTest() {
		homePage = new HomePage(driver);
		String toastermsg =homePage.getToasterMsg();
		Assert.assertEquals(toastermsg, "Login Successfully", "Toaster Msg does not mathc on login");
		
	}
	


}
