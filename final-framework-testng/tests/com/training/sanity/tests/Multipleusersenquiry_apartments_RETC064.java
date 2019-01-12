package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.MultipleusersenquiryDataProviders64;

import com.training.generics.ScreenShot;
import com.training.pom.MultipleusersenquiryPOM064;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Multipleusersenquiry_apartments_RETC064 {

	private WebDriver driver;
	private String baseUrl;
	private  MultipleusersenquiryPOM064  multipleusersenquiryPOM064;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	multipleusersenquiryPOM064 = new MultipleusersenquiryPOM064(driver);
	baseUrl = properties.getProperty("baseURL");
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	
	}
	
	 @Test(priority=2,dataProvider="excel-inputs",dataProviderClass=MultipleusersenquiryDataProviders64.class)
	
	 public void Logintest(String name,String email,String subject,String yourmessage)throws Exception{
	
		multipleusersenquiryPOM064.mouseoverapartments();//apartment is clicked
		//multipleusersenquiryPOM064.mouseovergateway55();//gateway55is clicked
		multipleusersenquiryPOM064.clickgateway55();//gateway55is clicked
		Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		multipleusersenquiryPOM064.sendname(name);
		multipleusersenquiryPOM064.sendemail(email);//name is entered
		multipleusersenquiryPOM064.sendsubject(subject);//subject is entered
		multipleusersenquiryPOM064.sendyourmessage(yourmessage);//subject is entered
		multipleusersenquiryPOM064.clicksendbttn();//sujject is entered
	  	
	}
	 
        		       			
  
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		
		//driver.quit();
	
}
}
