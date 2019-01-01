package com.training.pom;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM043 {
	

	private WebDriver driver; 
		
	public LoginPOM043(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(name="log")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/a/div[3]")
	private WebElement propertieslink;

	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[3]/a")
	private WebElement addnewlink;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	private WebElement entertitlehere;
	
	@FindBy(xpath="//*[@id=\"content-html\"]")
	private WebElement textbox;
	
	@FindBy(xpath="//*[@id=\"content\"]")
	private WebElement editorarea;
	
	@FindBy(xpath="//*[@id=\"publish\" ]")

	private WebElement publish;
		
    	
		
	public void clickusername()  {
		     this.username.click();
	}
	private Component getlocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public void sendusername(String username)  {
			this.username.sendKeys(username);
	}	
	public void clickpassword() {
		this.password.click();
		
	}
	public void sendpassword(String password){
	this.password.sendKeys(password);
	}
	public void clicksignin() {
		this.signin.click();
	}

public void mouseoverOnPropertieslink() {
	Actions action = new Actions(driver);
	action.moveToElement(this.propertieslink).build().perform();
}	
public void clickpropertieslink() {
	propertieslink.click();
}
public void mouseoverOnAddnewlink() {
	Actions action = new Actions(driver);
	action.moveToElement(this.addnewlink).build().perform();
}
public void sendentertitlehere(String title) {
	this.entertitlehere.click();
	this.entertitlehere.sendKeys(title);
}
public void addnewlink() {
	addnewlink.click();
}
public void clicktextbox() {
	this.textbox.click();
}
public void sendeditorarea(String text) {
	this.editorarea.click();
	this.editorarea.sendKeys(text);
}
public void clickpublish() {
	// TODO Auto-generated method stub
	this.publish.click();
}

}

	

	



