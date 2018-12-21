package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM4 {
	private WebDriver driver; 
		
	public LoginPOM4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	private WebElement login; 
	
	@FindBy(xpath="//*[@id=\"post-133\"]/div/div/div/ul/li[2]/a")
	private WebElement register;
	
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	private WebElement lastname; 
	
	
	public void clicklogin() {
		this.login.click(); 
		
			}
	public void sendemail(String login) {
		this.email.clear();
		this.email.sendKeys("manzoor@gmail.com");
	}	
	public void sendfirstname(String login) {
		this.firstname.clear();
		this.firstname.sendKeys("manzoor");
	}
	
	public void sendlastname(String password) {
		this.lastname.clear(); 
		this.lastname.sendKeys("mehadi"); 
	}
	
	public void clickregister() {
		this.register.click();
	
}
}
