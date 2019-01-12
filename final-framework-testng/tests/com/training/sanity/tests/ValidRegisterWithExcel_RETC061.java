package com.training.sanity.tests;
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


import com.training.dataproviders.ValidregisterDataProviders;
import com.training.generics.ScreenShot;

import com.training.pom.RegisterPOM061;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.DataProvider;
 

 public class ValidRegisterWithExcel_RETC061 {
	

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
 
   
 
 @Test(priority=2,dataProvider="excel-inputs",dataProviderClass=ValidregisterDataProviders.class)
 
    public void Registration_data(String email,String firstname,String lastname)throws  Exception{
 
	 RegisterPOM061.clicklogin();
	 System.out.println("loginbttnclicked");
	 
	 RegisterPOM061.clickregisterlink();
	  
	 System.out.println("registerlink is clicked");
       
//Passing values of email,firstname and lastname through excel
 
   RegisterPOM061.sendemail(email);
 
   System.out.println("email is entered");
 
   RegisterPOM061.sendfirstname(firstname);
 
 System.out.println("firstname is entered");
 
 RegisterPOM061.sendlastname(lastname);
 
 System.out.println("lastname is entered");
 
 RegisterPOM061.clickregisterbttn();
  
 System.out.println("registerbttn is clicked");
 
 }
 
    @AfterMethod
    public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		//driver.quit();
	}

}
 
  