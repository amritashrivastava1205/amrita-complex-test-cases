package com.training.bean;

public class RealestateBean {
	private String driver;
	private String url;
	private String email;
	private String firstname;
	private String lastname;

	public RealestateBean() {
	}

	public RealestateBean(String email, String firstname, String lastname) {
		super();
		
		this.url = url;
		this.driver = driver;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
			
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
    public String getemail() {
		return email;
		
	}

	public void setemail(String email) {
		
	}
	
	
	public String getfirstname()
	{
		return firstname;
	}

	public void setfirstname(String firstName) {
		
	}

    public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastName) {
		
	}
	
	
	@Override
	public String toString() {
		return "RealestateBean [email=" + email + ", firstname=" + firstname + ", lastname="  + lastname+ ""; 
	}

	
	

	

	
	

}
