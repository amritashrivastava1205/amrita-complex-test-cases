package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM037 {
	
	private WebDriver driver; 
		public LoginPOM037(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-item-570\"]/a")
	private WebElement plots;

	@FindBy(xpath="//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]")
	private WebElement searchbttn;
	
	@FindBy(xpath="//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]")
	private WebElement searchbttneditor;
	
	@FindBy(xpath="//*[@id=\"mCSBap_1_container\"]/div/div[1]/div[1]/h3/a/span")
	private WebElement nullemapartmentslink;
	
	@FindBy(xpath="//*[@id=\"text-4\"]/div/div/p[2]/a")
	private WebElement dropusalinelink;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[1]/div/span/input")
	private WebElement yourname;
	
	@FindBy(name="email")
	private WebElement emailaddress;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[3]/div/span/input")
	private WebElement subject;
	
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[3]/span/textarea")
	private WebElement message;
	
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/p/input")
	private WebElement send;
	
	
		
	public void clicklogin() {
		// TODO Auto-generated method stub
			this.login.click();
	}
	
	public void clickplots() {
		// TODO Auto-generated method stub
			this.plots.click();
	}
	
	public void sendusername(String username) {
		this.username.click();
		this.username.sendKeys(username);
		
	}
			
	public void sendpassword(String password) {
		this.password.click();
		this.password.sendKeys(password);
	}
	public void clicksignin() {
		// TODO Auto-generated method stub
			this.signin.click();
	}
	public void clicksearchbttn() {
		// TODO Auto-generated method stub
			this.searchbttn.click();
	}
	public void sendsearchbttneditor(String text) {
		// TODO Auto-generated method stub
			this.searchbttneditor.click();
			this.searchbttneditor.sendKeys(text);
			
	}
	public void clicknullemapartmentslink() {
		// TODO Auto-generated method stub
			this.nullemapartmentslink.click();
	}
	
	public void clickdropusalinelink() {
		// TODO Auto-generated method stub
			this.dropusalinelink.click();
	}
	
	
	public void sendyourname(String yourname) {
		// TODO Auto-generated method stub
			this.yourname.click();
			this.yourname.sendKeys(yourname);
	}
	
	public void sendemailaddress(String emailaddress) {
		// TODO Auto-generated method stub
			this.emailaddress.click();
			this.emailaddress.sendKeys(emailaddress);
	}
	
	public void sendsubject(String subject) {
		// TODO Auto-generated method stub
			this.subject.click();
			this.subject.sendKeys(subject);
	}
	
	public void sendmessage(String message) {
		// TODO Auto-generated method stub
			this.message.click();
			this.message.sendKeys(message);
	}
	
	public void clicksend() {
		// TODO Auto-generated method stub
			this.send.click();
	}

	
	
}