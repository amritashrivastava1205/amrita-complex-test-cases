package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;


import com.training.bean.RealestateBean;

import com.training.dao.RealestateDAO;
import com.training.readexcel.ApachePOIExcelRead;


public class DatabasedataProviders62 {
	
	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<RealestateBean> list = new RealestateDAO().getLogins(); 

		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RealestateBean temp : list){
			Object[]  obj = new Object[3]; 
			//obj[0] = temp.getUserName(); 
			//obj[1] = temp.getPassword();
			obj[0] = temp.getemail();
			obj[1] = temp.getfirstname();
			obj[2] = temp.getlastname();
			

			result[count ++] = obj; 
		}


		return result;
	}

}
		
		
	
	
	
	
	