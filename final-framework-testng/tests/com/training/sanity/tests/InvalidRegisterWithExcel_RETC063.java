package com.training.sanity.tests;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;


import utils.excelutils.ExcelUtils1;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
 import org.openqa.selenium.By;
 
 import org.openqa.selenium.WebDriver;
 import java.sql.Connection;

 
 import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
 
 import org.testng.annotations.Test;

import com.training.dataproviders.InvalidregisterDataProviders063;


import com.training.generics.ScreenShot;

import com.training.pom.RegisterPOM061;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.DataProvider;
 

 public class InvalidRegisterWithExcel_RETC063 {
	

	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM061 RegisterPOM061;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object Element;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	RegisterPOM061 = new RegisterPOM061(driver);
	baseUrl = properties.getProperty("baseURL");
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	
	}
 
   
 
 @Test(priority=2,dataProvider="excel-inputs",dataProviderClass=InvalidregisterDataProviders063.class)
 
    public void Registration_data(String email,String firstname,String lastname)throws  Exception{
 
	 RegisterPOM061.clicklogin();
	 System.out.println("loginbttnclicked");
	 
	 RegisterPOM061.clickregisterlink();
	  
	 System.out.println("registerlink is clicked");
       

 
   RegisterPOM061.sendemail(email);
   //Passing invalid email from test data excel sheet  and checking for error messages
 
   System.out.println("invalidemail is entered");
 
   RegisterPOM061.sendfirstname(firstname);
 
 System.out.println("firstname is entered");
 
 RegisterPOM061.sendlastname(lastname);
 
 System.out.println("lastname is entered");
 
 RegisterPOM061.clickregisterbttn();
  
 System.out.println("registerbttn is clicked");
 //scrolling up to view the error message
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_PAGE_UP);
	 robot.keyRelease(KeyEvent.VK_PAGE_UP);
 
 }
 
    @AfterMethod
    public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		//driver.quit();
	}

}
 
  