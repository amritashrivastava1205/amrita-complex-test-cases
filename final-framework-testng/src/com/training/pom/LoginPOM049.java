package com.training.pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM049 {
	
	private WebDriver driver; 
		public LoginPOM049(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
 
	@FindBy(xpath="//*[@id=\"menu-item-617\"]")
	private WebElement bloglonk;
	
	@FindBy(xpath="//*[@id=\"post-3045\"]/div/a")
	private WebElement readmorelink;

	
	@FindBy(xpath="//*[@id=\"comment\"]")
	private WebElement commenttextbox;
	
	@FindBy(xpath="//*[@id=\"author\"]")
	private WebElement name;

	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement emailaddress;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	private WebElement postcomment;
	
	@FindBy(xpath="//*[@id=\"comment-1776\"]/div[2]/div[2]/a")
	private WebElement reply;
	
	 	
		@FindBy(name="log")
		private WebElement username1;
		
		@FindBy(name="pwd")
		private WebElement password1;
		
		@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
		private WebElement signin1;
		
		@FindBy(xpath="//*[@id=\"menu-comments\"]/a/div[3]")
		private WebElement comments;
		
		@FindBy(xpath="//*[@id=\"comment-1776\"]/td[2]")
		private WebElement comment;
		
		//@FindBy(xpath="//*[@id=\"comment-1794\"]/td[2]/div[1]")
		//private WebElement saibaba1;
		
		@FindBy(xpath="//*[@id=\"comment-1795\"]/td[2]/div[3]/span[3]/a")
		private WebElement reply1;
		
		@FindBy(xpath="//*[@id=\"replycontent\"]")
		private WebElement replyeditorareaadmin;
	
		@FindBy(xpath="//*[@id=\"replybtn\"]")
		private WebElement approveandreply;
	
	public void clickbloglonk() {
		this.bloglonk.click();
	}
		
	 public void clickreadmorelink() {
		 this.readmorelink.click();
	 }
	 	 
	 public void sendcommenttextbox(String comments) {
		 this.commenttextbox.click();
		 this.commenttextbox.sendKeys(comments);
	 }
	 
	 public void sendname(String name) {
		 this.name.click();
		 this.name.sendKeys(name);
	 }
	 
	  
	 public void sendemailaddress(String email) {
		 this.emailaddress.click();
		 this.emailaddress.sendKeys(email);
	 }
	 
	 public void clickpostcomment() {
		 this.postcomment.click();
	 }
	 
	 public void sendusername1(String username) {
		 this.username1.click();
		 this.username1.sendKeys(username);
	 }
	 	 
	 public void sendpassword1(String password) {
		 this.password1.click();
		 this.password1.sendKeys(password);
	 }
	 	
	 public void clicksignin1() {
		 this.signin1.click();
	
	 }
	 	  
	 public void clickcomments() {
		 this.comments.click();
	
	 } 
	 	
	public void clickreply1() {
	this.reply1.click();
		 }
	public void sendreplyeditorareaadmin(String replyeditorareaadmin) {
	this.replyeditorareaadmin.click();
	this.replyeditorareaadmin.sendKeys(replyeditorareaadmin);
	}
	
	public void clickapproveandreply() {
		 this.approveandreply.click();
		 
	 }
	
	
	
}

	 


