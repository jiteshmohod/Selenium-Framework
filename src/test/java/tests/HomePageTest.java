package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {

	
	
	private HomePage homePage;

	@Test
	public void validateHomePage() {
		homePage = new HomePage(driver);
	String title =homePage.getTitle();
	Assert.assertEquals(title, "Let's Shop", "Page Title Does Not match");
	}

}
