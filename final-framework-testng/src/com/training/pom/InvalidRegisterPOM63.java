
package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import oracle.jdbc.pool.OracleDataSource;


public class InvalidRegisterPOM63 {
	private WebDriver driver; 
		
	public InvalidRegisterPOM63(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	private WebElement login; 
	
	@FindBy(xpath="//*[@id=\"post-133\"]/div/div/div/ul/li[2]")
	private WebElement registerlink;
	
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	private WebElement lastname; 
	
	@FindBy(xpath="//*[@id=\"signupform\"]/p[5]/input")
	private WebElement registerbttn;
	
	
	public void clicklogin() {
		this.login.click(); 
		
			}
	public void clickregisterlink() {
		this.registerlink.click(); 
		
			}
	public void sendemail(String login) {
		this.email.clear();
		this.email.sendKeys(login);
	}	
	public void sendfirstname(String firstname) {
	     this.firstname.click();
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlastname(String lastname) {
		this.lastname.click();
		this.lastname.sendKeys(lastname); 
	}
	
	public void clickregisterbttn() {
		this.registerbttn.click();
	
}
}




		