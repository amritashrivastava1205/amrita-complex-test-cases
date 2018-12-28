package com.training.sanity.tests;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM037;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_037 {

	

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM037 loginPOM037;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object Element;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM037 = new LoginPOM037(driver);
	baseUrl = properties.getProperty("baseURL");
	
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	  
	}
	@Test
	public void validLoginTest() throws InterruptedException, AWTException  {
		loginPOM037.clicklogin();
		loginPOM037.sendusername("nigam_0218@rediffmail.com");
		loginPOM037.sendpassword("SjQjlJYAHDll");		
		loginPOM037.clicksignin();
		loginPOM037.clickplots();
		loginPOM037.clicksearchbttn();
		loginPOM037.sendsearchbttneditor("Nullam hendrerit apartment");
		loginPOM037.clicknullemapartmentslink();
		Thread.sleep(5000);
			   //Code to switch to old tab: 
	    Set <String> st= driver.getWindowHandles();
	    Iterator<String> it = st.iterator();
	    String parent =  it.next();
	    String child =it.next();
	    //switch to parent
	    driver.switchTo().window(parent);
	    System.out.println("Returned to parent");
	   	     
       //code to check for message after send
	   loginPOM037.clickdropusalinelink();
	   loginPOM037.sendyourname("selenium");
	   loginPOM037.sendemailaddress("selenium@gmail.com");
	  loginPOM037.sendsubject("apartment");
	  loginPOM037.sendmessage("looking for apartment");
	  loginPOM037.clicksend();
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	   }
	   
		
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
				//driver.quit();
	}
}
