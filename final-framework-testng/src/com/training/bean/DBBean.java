package com.training.bean;

/**
 * 
 * @author Naveen
 * @see this class shall get the bean data 
 */
public class DBBean {
	private String url; 
	private String driver; 
		//private String userName; 
	//private String password;
	
	public DBBean() {}
			
	public DBBean(String url, String driver) {
		super();
		this.url = url;
		this.driver = driver;
		//this.userName = userName;
		//this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void getUserName() {
		
	}

	public void setUserName(String userName) {
		
	}

	public void getPassword() {
		
	}

	public void setPassword(String password) {
		
	}


	
}
