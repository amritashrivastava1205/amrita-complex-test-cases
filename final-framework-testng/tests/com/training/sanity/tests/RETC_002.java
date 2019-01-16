package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM2;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_002 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM2 loginpom2;
	private static Properties properties;
		
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginpom2 = new LoginPOM2(driver);
	baseUrl = properties.getProperty("baseURL");
		// open the browser
	driver.get(baseUrl);
	
	}
	@Test
	public void validLoginTest() {
	
		loginpom2.clicklogin();
		loginpom2.sendusername("manzoor@gmail.com");
		loginpom2.sendpassword("manzoor");
		loginpom2.clicksignin();
		
		
				}
	
		
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		//driver.quit();
	}
}
