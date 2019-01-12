package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM055;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_055 {

	private WebDriver driver;
	private String adminUrl;
	private LoginPOM055 loginPOM055;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	JavascriptExecutor je ;
	loginPOM055 = new LoginPOM055(driver);
	adminUrl = properties.getProperty("adminURL");
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(adminUrl);
	
	}
	@SuppressWarnings("null")
	@Test
	public void validLoginTest() throws AWTException, InterruptedException {
		loginPOM055.sendusername1("admin");
		loginPOM055.sendpassword("admin@123");
		loginPOM055.clicksignin();
	    loginPOM055.mouseoverpostslink();
	    loginPOM055.clickpostslink();
	    loginPOM055.clickaddnew();
	   
	    loginPOM055.clickaddnewcategorylink();
	    loginPOM055.sendaddnewcategorytextbox("finalgoal");
	    loginPOM055.selectparentcategory1ByIndex(10);
	        
	   loginPOM055.clickaddnewcategorybttn(); 
	   Robot robot = new Robot();
	   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   driver.get("http://realestate.hommelle.com/wp-admin/post-new.php");  
	   driver.navigate().refresh();
	  
	  
	   loginPOM055.clickallcategory(); 
	   //loginPOM055.selectallcategoryByVisibleText("chacolate1234");
	  loginPOM055.finalcheckbox();
	  Thread.sleep(7000);
	
	   loginPOM055.clickpublish();
	   
	
	}
        		       			
  
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		
		//driver.quit();
	}
}
