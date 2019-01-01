package com.training.pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM031 {
	@SuppressWarnings("unused")
	private static final String waituntilExpectedcondition=null ;

	private WebDriver driver; 
	private JavascriptExecutor je ;
		
	public LoginPOM031(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"ui-id-1\"]")
	private WebElement price;
	
	@FindBy(xpath="//*[@id=\"_price\"]")
	private WebElement pricetextbox;
	
	@FindBy(xpath="//*[@id=\"price_tab\"]/div[2]/div[1]/label")
	private WebElement pricepersqmeter;
	
	@FindBy(xpath="//*[@id=\"_price_per\"]")
	private WebElement pricepersqmetertextbox;
	
	@FindBy(xpath="//*[@id=\"ui-id-2\"]")
	private WebElement maindetails;
	
	@FindBy(xpath="//*[@id=\"_status\"]")
	private WebElement status;
	
	@FindBy(xpath="//*[@id=\"_location\"]")
	private WebElement location;
	
	@FindBy(xpath="//*[@id=\"_possession\"]")
	private WebElement posession;
	
	@FindBy(xpath="//*[@id=\"ui-id-3\"]")
	private WebElement locationtab;
	
	@FindBy(xpath="//*[@id=\"_friendly_address\"]")
	private WebElement address;
	
	@FindBy(xpath="//*[@id=\"_address\"]")
	private WebElement googlemaps;
	
	@FindBy(xpath="//*[@id=\"_geolocation_lat\"]")
	private WebElement latitude;
	
	@FindBy(xpath="//*[@id=\"_geolocation_long\"]")
	private WebElement longitude;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]")
	private WebElement detailstab;
	
	@FindBy(xpath="//*[@id=\"_storage_room\"]")
	private WebElement storageroom;
	
	@FindBy(xpath="//*[@id=\"acf-group_5aa6786492979\"]/div/div/div[2]/div/div[2]/ul/li[1]/ul/li[1]/label/span")
	private WebElement centralbangalorecheckbox;
		
		
	public void clickusername()  {
		     this.username.click();
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
public void clickprice() {
	this.price.click();
}
public void sendpricetextbox(String string ) {
	this.pricetextbox.click();
	this.pricetextbox.sendKeys(string);
}
public void sendpricepersqmeter(String string ) {
	this.pricepersqmeter.click();
}
public void sendpricepersqmetertextbox(String string ) {
	this.pricepersqmetertextbox.click();
	this.pricepersqmetertextbox.sendKeys(string);
	
}
public void clickmaindetails() {
	this.maindetails.click();
}
public void sendstatus(String status ) {
	this.status.click();
	this.status.sendKeys(status);
	
}
public void sendlocation(String location ) {
	this.location.click();
	this.location.sendKeys(location);
	
}
public void sendposession(String posession ) {
	this.posession.click();
	this.posession.sendKeys(posession);
	
}
public void clicklocationtab() {
	this.locationtab.click();
}
public void sendaddress(String address ) {
	this.address.click();
	this.address.sendKeys(address );
	
}
public void sendgooglemaps(String googlemaps ) {
	this.googlemaps.click();
	this.googlemaps.sendKeys(googlemaps );
	
}
public void sendlatitude(String latitude ) {
	this.latitude.click();
	this.latitude.sendKeys(latitude);
	
}
public void sendlongitude(String longitude ) {
	this.longitude.click();
	this.longitude.sendKeys(longitude);
	
}
public void clickdetailstab() {
	this.detailstab.click();
}
public void sendstorageroom(String storageroom) {
	this.storageroom.click();
	this.storageroom.sendKeys(storageroom);
}
public void clickcentralbangalorecheckbox() {
	centralbangalorecheckbox.click();
	centralbangalorecheckbox.isSelected();
}

//Click on Publish button
	public void clickpublish() {
		// TODO Auto-generated method stub
		this.publish.click();
	}

@FindBy(xpath = "//input[@id='publish']")
private WebElement publish;



}


