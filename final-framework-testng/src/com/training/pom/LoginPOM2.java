package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM2 {
	private WebDriver driver; 
		
	public LoginPOM2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	private WebElement login; 
	
	@FindBy(xpath="//*[@id=\"user_login\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"user_pass\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
	private WebElement signin;

	
	public void clicklogin() {
		this.login.click();
	}
	public void clicksignin() {
		this.signin.click();
	}
	
		public void sendusername(String login) {
		this.username.clear();
		this.username.sendKeys("manzoor@gmail.com");
	}	
	public void sendpassword(String login) {
		this.password.clear();
		this.password.sendKeys("manzoor");
	}
		 
	
	
}

