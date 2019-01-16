package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import com.training.bean.RealestateBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class RealestateDAO {
	
	Properties properties; 
	
	public RealestateDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<RealestateBean> getRelestateBean(){
		String sql = properties.getProperty("get.TableCredentialsregister"); 
		
		GetConnection gc  = new GetConnection(); 
		List<RealestateBean> list = null;
		try {
			gc.ps1 = GetConnection.getUCanAccess(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<RealestateBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RealestateBean temp = new RealestateBean(); 
				//temp.setUserName(gc.rs1.getString(1));
				//temp.setPassword(gc.rs1.getString(2));
				temp.setemail(gc.rs1.getString(1));
				temp.setfirstname(gc.rs1.getString(2));
				temp.setlastname(gc.rs1.getString(3));
				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new RealestateDAO().getRelestateBean().forEach(System.out :: println);
	}

	

}

	
	
	

