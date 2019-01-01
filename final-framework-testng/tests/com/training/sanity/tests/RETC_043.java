package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.LoginPOM043;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_043 {


	private WebDriver driver;
	private String adminUrl;
	private LoginPOM043 loginPOM043;
	private static Properties properties;
	private ScreenShot screenShot;

	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM043 = new LoginPOM043(driver);
	adminUrl = properties.getProperty("adminURL");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(adminUrl);
	driver.manage().window().maximize();
		}
	
	@Test(priority=1)
	public void validLoginTest() throws AWTException, InterruptedException {
		loginPOM043.clickusername();
		loginPOM043.sendusername("admin");
		loginPOM043.clickpassword();		
		loginPOM043.sendpassword("admin@123");
		loginPOM043.clicksignin();
		loginPOM043.clickpropertieslink();
		loginPOM043.addnewlink();
		loginPOM043.sendentertitlehere("new launch123");
		loginPOM043.clicktextbox();
		loginPOM043.sendeditorarea("new launch123");
		  Thread.sleep(7000);
		loginPOM043.clickpublish();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
				//driver.quit();
	}
}
