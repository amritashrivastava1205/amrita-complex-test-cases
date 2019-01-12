
package com.training.pom;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import oracle.jdbc.pool.OracleDataSource;


public class MultipleusersenquiryPOM064 {
	private WebDriver driver; 
		
	public MultipleusersenquiryPOM064(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-346\"]/a")
	private WebElement apartments; 
	
	@FindBy(xpath="//*[@id=\"wpmm-megamenu\"]/div[2]/div[2]")
	private WebElement gateway55; 
	
	
		
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[1]/label/span/input")
	private WebElement name;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[2]/label/span/input")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[4]/label/span/textarea")
	private WebElement subject;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[4]/label/span/textarea")
	private WebElement yourmessage;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[5]/input")
	private WebElement sendbttn;
	
	
	public void mouseoverapartments() {
		Actions action=new Actions(driver);
		action.moveToElement(this.apartments).build().perform();
	}
	
	
	public void mouseovergateway55() {
		Actions action=new Actions(driver);
		action.moveToElement(this.gateway55).build().perform();
	}
	

	public void clickgateway55() {
		// TODO Auto-generated method stub
		this.gateway55.click();
	}

	
	public void sendname(String name) {
		this.name.click();
		this.name.sendKeys(name);
		
	}
	
	public void sendemail(String email) {
		this.email.click();
		this.email.sendKeys(email);
		
	}
	public void sendsubject(String subject) {
		this.subject.click();
		this.subject.sendKeys(subject);
	}
	
	public void sendyourmessage(String yourmessage) {
		this.yourmessage.click();
		this.yourmessage.sendKeys(yourmessage);
	}
	
	public void clicksendbttn() {
		this.sendbttn.click();
		
		
	}


	
	
	}
	
	