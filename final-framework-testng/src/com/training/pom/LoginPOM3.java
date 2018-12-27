package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM3 {
	private WebDriver driver; 
		
	public LoginPOM3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	private WebElement login; 
	
	@FindBy(xpath="//*[@id=\"tab1\"]/form/p[4]/a")
	private WebElement lostyourpassword;
	
	@FindBy(id="user_login")
			private WebElement emailaddress; 
	
	@FindBy(id="resetpass-button")
	private WebElement submit; 
	
		
   @FindBy(id="pass1")
	private WebElement newpassword; 
	
	@FindBy(xpath="//*[@id=\"pass2\"]")
	private WebElement repeatnewpassword; 
	
	
	@FindBy(xpath="//*[@id=\"resetpass-button\"]")
			private WebElement resetpassword; 
	
	public void clicklogin() {
		this.login.click(); 
		
			}
	
	public void clickresetpassword() {
		// TODO Auto-generated method stub
		this.resetpassword.click();
		
			}

		public void clicklostyourpassword() {
		// TODO Auto-generated method stub
		this.lostyourpassword.click();
	      }

		public void sendemailaddress(String string) {
		// TODO Auto-generated method stub
			this.emailaddress.clear();
		this.emailaddress.sendKeys("angmail1@rediffmail.com");
	     }
		public void sendnewpassword(String string) {
			// TODO Auto-generated method stub
				this.newpassword.clear();
			this.newpassword.sendKeys("1234567890113!");
		 
		}

		
		public void sendrepeatnewpassword(String string) {
			// TODO Auto-generated method stub
				this.repeatnewpassword.clear();
			this.repeatnewpassword.sendKeys("1234567890113!");
		}
		
				
		
		public void clicksubmit() {
			// TODO Auto-generated method stub
			this.submit.click();
		}

}
	
		
	
	

