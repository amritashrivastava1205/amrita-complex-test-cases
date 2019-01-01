package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM031;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_031 {

	

	private WebDriver driver;
	private String adminUrl;
	private LoginPOM031 loginPOM031;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object Element;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	loginPOM031 = new LoginPOM031(driver);
	adminUrl = properties.getProperty("adminURL");
	
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(adminUrl);
	
	}
	@Test(priority=1)
	public void validLoginTest() throws AWTException, InterruptedException {
		loginPOM031.clickusername();
		loginPOM031.sendusername("admin");
		loginPOM031.clickpassword();		
		loginPOM031.sendpassword("admin@123");
		loginPOM031.clicksignin();
		loginPOM031.clickpropertieslink();
		loginPOM031.addnewlink();
		loginPOM031.sendentertitlehere("NEWYEAR");
		loginPOM031.clicktextbox();
		loginPOM031.sendeditorarea("NEWYEAR");
		loginPOM031.clickprice();
		loginPOM031.sendpricetextbox("50000.00") ;
		loginPOM031.sendpricepersqmetertextbox("200.00");
		loginPOM031.clickmaindetails();
		loginPOM031.sendstatus("New");
		loginPOM031.sendlocation("Electronic city");
		loginPOM031.sendposession("immediate");
		loginPOM031.clicklocationtab();
		loginPOM031.sendaddress("yeshwanthapur");
		loginPOM031.sendgooglemaps("yeshwanthapur");
		loginPOM031.sendlatitude("120");
		loginPOM031.sendlongitude("56");
		loginPOM031.clickdetailstab();
		loginPOM031.sendstorageroom("2");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		loginPOM031.clickcentralbangalorecheckbox();
		Thread.sleep(7000);
		// This  will scroll up the page by  1000 pixel 
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		 robot.keyRelease(KeyEvent.VK_PAGE_UP);
     // JavascriptExecutor js; executeScript("window.scrollBy(0,-2000)");
	
		loginPOM031.clickpublish();
				
		}
		
			 		
	
	
	private void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
				//driver.quit();
	}
}
