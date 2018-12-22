package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM4;
import com.training.pom.LoginPOM5;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_005 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM5 loginpom5;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginpom5 = new LoginPOM5(driver);
	baseUrl = properties.getProperty("baseURL");
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	
	}
	@Test
	public void validLoginTest() {
		loginpom5.clicklogin();
		loginpom5.sendusername("angmail1@rediffmail.com");
		loginpom5.sendpassword("12345678901!");
		loginpom5.clicksignin();
	   	   loginpom5.clickchangepasswordlink();
	    loginpom5.sendcurrentpassword("12345678901!");
	    loginpom5.sendnewpassword("123456789011!");
	    loginpom5.sendconfirmnewpassword("123456789011!");
	    loginpom5.clicksavechanges();
	    
	}
		
		
		
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		driver.quit();
	}
}
