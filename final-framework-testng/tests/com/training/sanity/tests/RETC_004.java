package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.training.pom.LoginPOM4;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_004 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM4 loginpom4;
	private static Properties properties;
		
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginpom4 = new LoginPOM4(driver);
	baseUrl = properties.getProperty("baseURL");
		// open the browser
	driver.get(baseUrl);
	}
	
	@Test
	public void validLoginTest() {
			
		loginpom4.clicklogin();
		loginpom4.sendusername("nigam_0218@rediffmail.com");
		loginpom4.sendpassword("SjQjlJYAHDll");
		loginpom4.clicksignin();
	    loginpom4.clickmyprofile();
		loginpom4.sendagenttitle("test1234");
		loginpom4.sendphone("1234567890");
		loginpom4.clicksavechanges();
		
				}
	
		
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		//driver.quit();
	}	
}

