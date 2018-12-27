package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM5 {
	private WebDriver driver; 
		
	public LoginPOM5(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	WebElement login;  
	
	@FindBy(xpath="//*[@id=\"user_login\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"user_pass\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id=\"responsive\"]")
	private WebElement Hiamritalink;
	
	
	@FindBy(xpath="//*[@id=\"post-133\"]/div[1]/div/div/ul[2]/li[1]/a")
	private WebElement changepasswordlink;
	
	@FindBy(xpath="//*[@id=\"post-129\"]/div[2]/div/div[1]/form/input[1]")
	private WebElement currentpassword;
	
	@FindBy(xpath="//*[@id=\"post-129\"]/div[2]/div/div[1]/form/input[2]")
	private WebElement newpassword;
	
	@FindBy(xpath="//*[@id=\"post-129\"]/div[2]/div/div[1]/form/input[3]")
	private WebElement confirmnewpassword;
		
	@FindBy(xpath="//*[@id=\"wp-submit\"]")
	private WebElement savechanges;

	public void clicklogin() {
		// TODO Auto-generated method stub
				this.login.click();
	}

	public void sendusername(String login) {
	username.sendKeys("amrita.shrivastava1980@gmail.com");
	}	
	public void sendpassword(String login) {
		this.password.clear();
		this.password.sendKeys("godisthere12");
	}
	public void clicksignin() {
		// TODO Auto-generated method stub
			this.signin.click();
	}
	@SuppressWarnings("null")
	public void mouseoverOnHiamritalink() {
		
	Actions action = null;
		action.moveToElement(this.Hiamritalink).click().build().perform();
	}	

	
	public void clickchangepasswordlink() {
		// TODO Auto-generated method stub
		this.changepasswordlink.click();
	}
	public void sendcurrentpassword(String login1) {
		this.currentpassword.sendKeys("godisthere12");
	}
	public void sendnewpassword(String login2) {
		this.newpassword.sendKeys("godisthere125");
	}
	public void sendconfirmnewpassword(String login3) {
		this.confirmnewpassword.sendKeys("godisthere125");
	}
	
	public void clicksavechanges() {
	this.savechanges.click();
}







}




		