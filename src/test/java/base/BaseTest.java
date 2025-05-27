package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class BaseTest {
	protected WebDriver driver;
	protected Properties prop;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void setUP() throws IOException {
		
		prop = new Properties();
		 driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\jites\\eclipse-workspace\\Selenium-Framework\\src\\main\\java\\poperties\\config.properties");
		prop.load(fis);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get(prop.getProperty("url"));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	////Login method
	login();
	
	}

	@AfterMethod
	public void tearDown() {
		 if (driver != null) {
	            driver.quit(); // close only after each method
	        }
	}
	
	public void login() {
		 loginPage = new LoginPage(driver);
	    loginPage.enterEmail(prop.getProperty("email"));
	    loginPage.enterPassword(prop.getProperty("password"));
	    loginPage.clickLogin();
	}
}
