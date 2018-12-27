package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_003 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM3 loginpom3;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginpom3 = new LoginPOM3(driver);
	baseUrl = properties.getProperty("baseURL");
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	
	}
	@Test(priority=1)
	public void validLoginTest() {
		loginpom3.clicklogin();
		loginpom3.clicklostyourpassword();
	}
	@Test(priority=2)
	public void validPasswordTest() {
		loginpom3.sendemailaddress("angmail1@rediffmail.com");
		loginpom3.clickresetpassword();
	}
	@Test(priority=3)
	public void validTest() {
		driver.get("http://realestate.hommelle.com/wp-login.php?action=rp&key=8cmf4kFvyAj2NagKCSdM&login=angmail1%40rediffmail.com");
		loginpom3.sendnewpassword("1234567890113!");
		loginpom3.sendrepeatnewpassword("1234567890113!");
		loginpom3.clicksubmit();
		
			}
	
		
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		//driver.quit();
	}
}
