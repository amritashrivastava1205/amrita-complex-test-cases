package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM055;
import com.training.pom.VerifyaddedpostinblogPOM065;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ValidateAddedPost_Inblog_RETC065 {

	private WebDriver driver;
	private String adminUrl;
	private VerifyaddedpostinblogPOM065 verifyaddedpostinblogPOM065;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	verifyaddedpostinblogPOM065 = new VerifyaddedpostinblogPOM065(driver);
	adminUrl = properties.getProperty("adminURL");
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(adminUrl);
	
	}
	@SuppressWarnings("null")
	@Test
	public void validLoginTest() throws AWTException, InterruptedException {
		verifyaddedpostinblogPOM065.sendusername1("admin");
		System.out.println("admin username is entered");//admin username is entered
		verifyaddedpostinblogPOM065.sendpassword("admin@123");
		System.out.println("admin password is entered");//admin password is entered
		verifyaddedpostinblogPOM065.clicksignin();
		System.out.println("signin button  is clicked for successfull logon");//admin has successffully signedin
		verifyaddedpostinblogPOM065.mouseoverpostslink();
	    System.out.println("At Dashboard page mouse overed postslink");//admin came to Dashboard page and mouseovered posts link
	    verifyaddedpostinblogPOM065.clickcategories();//admin clicked on categories
	    System.out.println("category is selected");
	    verifyaddedpostinblogPOM065.sendname("Engine");//admin entered name
	    System.out.println("name is entered");
	    verifyaddedpostinblogPOM065.sendslug("Happy New motor");//admin entered slug details
	    System.out.println("slug is entered");
	    verifyaddedpostinblogPOM065.senddescription("Car");
	    System.out.println("description is entered");//admin entered description
	    verifyaddedpostinblogPOM065.clickaddnewcategorybttn();
	    System.out.println("Add newcategorybuttonis clicked");//admin clicked on add new category button
	    driver.navigate().refresh();//page is refreshed to navigate to current url and view the added details
	    driver.getCurrentUrl(); 
	    verifyaddedpostinblogPOM065.mouseoveraddnewlinklink();//admin mouseovered add new link
	  	 verifyaddedpostinblogPOM065.clickaddnewlink();
	  	System.out.println("Addnewlink is clicked");
	  	verifyaddedpostinblogPOM065.sendentertitle("New Launches"); //admin entered title
	  	System.out.println("Entertilehere text box is passed with values");
	  	verifyaddedpostinblogPOM065.sendbodytextbox(" New Launch in Home"); //admin entered some text
	  	System.out.println("Text is entered in body textbox");
	  	verifyaddedpostinblogPOM065.clickcategorycheckbox(); //admin checked the category checkbox
	  	System.out.println("Category checkbox is clicked");
	  Thread.sleep(7000);
	  	verifyaddedpostinblogPOM065.clickpublish(); //admin clicked on publish
	  		  	System.out.println("Publish bttn is clicked");
	  	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  	  	  		  	 
	  	verifyaddedpostinblogPOM065.mouseoverhowdyadminlink(); 
	  		  	verifyaddedpostinblogPOM065.clicklogout();//admin loggedout successfully by clicking logout
	  	System.out.println("logout option is clicked");
	  verifyaddedpostinblogPOM065.clickrealestatelink();//admin clicks on home link from My profile page
	  	System.out.println("realestate link is clicked");
	  	verifyaddedpostinblogPOM065.clickblog();//admin clicks on blog at Home page
	  	System.out.println("blog option is clicked");
	  	Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  	
	  	
	  	
	}
        		       			
  
	@AfterMethod
	public void tearDown() throws Exception {
		
		
		//driver.quit();
	
}
}
