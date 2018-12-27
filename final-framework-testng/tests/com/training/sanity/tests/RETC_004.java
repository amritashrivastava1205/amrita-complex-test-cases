package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.LoginPOM4;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_004 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM4 loginpom4;
	private static Properties properties;
	//private JavascriptExecutor js;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	}
	@BeforeMethod
	public void setUp() throws Exception{
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	//js=(JavascriptExecutor)driver;
	loginpom4 = new LoginPOM4(driver);
	baseUrl = properties.getProperty("baseURL");
		// open the browser
	driver.get(baseUrl);
	}
	
		@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		driver.quit();
	}
	@Test

	public void validlogintest() throws InterruptedException {
			
		loginpom4.clicklogin();
		loginpom4.sendusername("nigam_0218@rediffmail.com");
		loginpom4.sendpassword("SjQjlJYAHDll");
		loginpom4.clicksignin();
	    loginpom4.clickmyprofile();
	    loginpom4.sendagenttitle("test12345");
	    loginpom4.sendphone("9158555101");
        loginpom4.clicksavechanges();
	   
		}
}
	