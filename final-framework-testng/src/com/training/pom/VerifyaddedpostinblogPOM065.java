package com.training.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class VerifyaddedpostinblogPOM065 {
	
	private WebDriver driver; 
		public VerifyaddedpostinblogPOM065(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(name="log")
		private WebElement username1;
		
		@FindBy(name="pwd")
		private WebElement password;
		
		@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
		
		private WebElement signin;
		
		@FindBy(xpath="//*[@id=\"menu-posts\"]/a/div[2]")
		private WebElement postslink;
		
		@FindBy(xpath="//*[@id=\"menu-posts\"]/ul/li[4]/a")
		private WebElement categories;
				
		@FindBy(xpath="//*[@id=\"tag-name\"]")
		private WebElement name;
		
		@FindBy(xpath="//*[@id=\"tag-slug\"]")
		private WebElement slug;
		
		
		@FindBy(xpath="//*[@id=\"tag-description\"]")
		private WebElement description;
		
		@FindBy(xpath="//*[@id=\"submit\"]")
		private WebElement addnewcategorybttn;		
		
		@FindBy(xpath="//*[@id=\"menu-posts\"]/ul/li[3]/a")
		private WebElement addnewlink;
		
		@FindBy(xpath="//*[@id=\"title\"]")
		private WebElement entertitle;

		@FindBy(xpath="//*[@id=\"content\"]")
		private WebElement bodytextbox;
		
		@FindBy(xpath="//*[@id=\"category-416\"]/label")
		private WebElement categorycheckbox;
		// explicit wait - to wait for the compose button to be click-able
		
		  
		
		              // click on the howdyadmin link button as soon as the "howdyadminlink"  is visible
		
		@FindBy(xpath=("//*[@id=\"wp-admin-bar-top-secondary\"]"))
		private WebElement howdyadminlink;
		
			
		//WebDriverWait wait = new WebDriverWait(driver,700);
	  	//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="wp-admin-bar-user-actions"]")));	 

		
		@FindBy(xpath="//*[@id=\"wp-admin-bar-logout\"]/a")
		private WebElement logout;
		
		@FindBy(xpath="//*[@id=\"logo\"]/h2/a")
		private WebElement realestatelink;
		
		@FindBy(xpath="//*[@id=\"menu-item-617\"]/a")
		private WebElement blog;
		
		
		
	   
	public void sendusername1(String username) {
		this.username1.click();
		this.username1.sendKeys(username);
	}
	
	public void sendpassword(String password) {
		this.password.click();
		this.password.sendKeys(password);
	}
	
	public void clicksignin() {
		this.signin.click();
	}
	
	public void mouseoverpostslink() {
		Actions action = new Actions(driver);
		action.moveToElement(this.postslink).build().perform();
	}
	public void clickpostslink() {
		this.postslink.click();
	}
	
	public void clickcategories() {
		this.categories.click();
	}

	
	public void sendname(String name) {
		this.name.click();
		this.name.sendKeys(name);
	}
	
	public void sendslug(String slug) {
		this.slug.click();
		this.slug.sendKeys(slug);
	}
	public void senddescription(String description) {
		this.description.click();
		this.description.sendKeys(description);
	}
	
	public void clickaddnewcategorybttn() {
		this.addnewcategorybttn.click();
	}

public void mouseoveraddnewlinklink() {
	Actions action = new Actions(driver);
	action.moveToElement(this.addnewlink).build().perform();
}

public void clickaddnewlink() {
	// TODO Auto-generated method stub
	this.addnewlink.click();
}

@FindBy(xpath="//*[@id=\"newcategory\"]")
private WebElement addnewcategorytextbox;


public void sendentertitle(String title) {
	this.entertitle.click();
	this.entertitle.sendKeys(title);
}
public void sendbodytextbox(String text) {
	this.bodytextbox.click();
	this.bodytextbox.sendKeys(text);
}
public void clickcategorycheckbox() {
	this.categorycheckbox.click();
}

@FindBy(xpath = "//input[@id='publish']")
private WebElement publish;


public void clickpublish() {
	// TODO Auto-generated method stub
	this.publish.click();
}
public void clickhowdyadminlink() {
	this.howdyadminlink.click();
}
	public void clicklogout() {
		// TODO Auto-generated method stub
		this.logout.click();
	}

	public void mouseoverhowdyadminlink( ) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(this.howdyadminlink).build().perform();
		
	}
	public void clickrealestatelink() {
		// TODO Auto-generated method stub
		this.realestatelink.click();
	}
	
	public void clickblog() {
		// TODO Auto-generated method stub
		this.blog.click();
	}

	
		
	}
	
	
	
	
