package com.training.sanity.tests;
import java.awt.AWTException;
import java.io.FileInputStream;


import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.Test;

import com.training.dataproviders.DatabasedataProviders62;



import com.training.generics.ScreenShot;

import com.training.pom.RegisterPOMusingdatabaseRETC_062;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


 

 public class ValidRegisterWithDatabase_RETC62 {
	

	private WebDriver driver;
	private String baseUrl;
	private RegisterPOMusingdatabaseRETC_062 registerPOMusingdatabaseRETC_062;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object Element;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	registerPOMusingdatabaseRETC_062 = new RegisterPOMusingdatabaseRETC_062(driver);
	baseUrl = properties.getProperty("baseURL");
	
	
	
	
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	screenShot = new ScreenShot(driver);
	
	// open the browser
	driver.get(baseUrl);
	}
	
	@Test(priority=2,dataProvider="db-inputs",dataProviderClass=DatabasedataProviders62.class)
 
    public void verifyRegistrationdataindatabasetest(String email,String firstname,String lastname)throws  Exception{
	
		registerPOMusingdatabaseRETC_062.clicklogin();
		 System.out.println("loginbttnclicked");
		 
		 registerPOMusingdatabaseRETC_062.clickregisterlink();
		  
		 System.out.println("registerlink is clicked");
	       
	 
		 registerPOMusingdatabaseRETC_062.sendemail("amrita@gmail.com");
	 
	   System.out.println("email is entered");
	   String Actualtext = driver.findElement(By.name("email")).getAttribute("value");
		 Assert.assertEquals(Actualtext, "amrita@gmail.com");
		 System.out.println("Values of Email Matched");
	   
	 registerPOMusingdatabaseRETC_062.sendfirstname("amrita");
	 
	 System.out.println("firstname is entered");
	 
	 String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"first-name\"]")).getAttribute("value");
	 Assert.assertEquals(Actualtext2,"amrita");
	 System.out.print("Values of First Name Matched");
	 
	 
	 registerPOMusingdatabaseRETC_062.sendlastname("nigam");
	 
	 System.out.println("lastname is entered");
	 
	 String Actualtext3 = driver.findElement(By.xpath("//*[@id=\"last-name\"]")).getAttribute("value");
	 Assert.assertEquals(Actualtext3, "nigam");
	 System.out.print("Values of Last Name Matched");
	 
	 
	 
	 registerPOMusingdatabaseRETC_062.clickregisterbttn();
	  
	 System.out.println("registerbttn is clicked");
	 
	 }
	

 

	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		
		driver.quit();
	}
}

	 
	
	