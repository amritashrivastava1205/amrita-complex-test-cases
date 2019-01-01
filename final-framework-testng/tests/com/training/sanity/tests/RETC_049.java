package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM049;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_049 {

	

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM049 loginPOM049;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object Element;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM049 = new LoginPOM049(driver);
	baseUrl = properties.getProperty("baseURL");
	
	screenShot = new ScreenShot(driver);
	// open the browser
	driver.get(baseUrl);
	
	}
	@Test(priority=1)
	public void validLoginTest() throws AWTException, InterruptedException {
		loginPOM049.clickbloglonk();
		loginPOM049.clickreadmorelink();
		loginPOM049.sendcommenttextbox("saibaba1");
		loginPOM049.sendname("amritanigam");
		loginPOM049.sendemailaddress("angmail1@rediffmail.com");
		loginPOM049.clickpostcomment();
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_UP);
	    robot.keyRelease(KeyEvent.VK_UP);
	    Thread.sleep(5000);
				
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://realestate.hommelle.com/admin");
	    loginPOM049.sendusername1("admin");
	    
	    loginPOM049.sendpassword1("admin@123");
	    loginPOM049.clicksignin1();
	    loginPOM049.clickcomments();
	    
	 
	    robot.keyPress(KeyEvent.VK_UP);
	    robot.keyRelease(KeyEvent.VK_UP);
	    

	    WebElement text = driver.findElement(By.xpath("//*[contains(text(),'saibaba1')]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(text, 10, 5).clickAndHold().moveByOffset(30, 0).release().perform();
	  
	   // WebElement element = driver.findElement(By.xpath("//*[@id="comment-1794"]/td[2]/div[1]"));
	   //Actions action = new Actions(driver);
	   // action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id="comment-1794"]/td[2]/div[1]]/td[2]/p"))).click().build().perform();
	   	 
	
	    	loginPOM049.clickreply1();
	    	
	   	   loginPOM049.sendreplyeditorareaadmin("reply123");
	   	Thread.sleep(1000);
	   	   loginPOM049.clickapproveandreply();
	   	   
	   	   
	    
	} 		
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
				//driver.quit();
	}
}
