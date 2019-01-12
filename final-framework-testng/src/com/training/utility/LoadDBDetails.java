package com.training.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.training.bean.RealestateBean;

/**
 * 
 * @author Naveen
 * @see will load the db details and shall be used in connection class
 */
public class LoadDBDetails {
	public static RealestateBean getDBDetails() {

		try {
			Properties properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/db.properties");
			properties.load(inStream);

			RealestateBean	realestateBean = new RealestateBean(); 
			
			realestateBean.setUrl(properties.getProperty("url"));
			realestateBean.setDriver(properties.getProperty("driver"));
			// getting the user name if not present (by default - root ) 
			//realestateBean.setUserName(properties.getProperty("username", "root"));
			
			
			return realestateBean; 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}


}
