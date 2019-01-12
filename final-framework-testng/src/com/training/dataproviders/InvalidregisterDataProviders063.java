package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;


public class InvalidregisterDataProviders063 {

			
		@DataProvider(name = "excel-inputs")
		public Object[][] getExcelData(){
			//String fileName = "C:/Users/Naveen/Desktop/Testing.xlsx";
			String fileName3 = "C:/complex/RETD_002.xlsx";
	
			List<List<Object>> retVal = ApachePOIExcelRead.getExcelContent(fileName3);
			System.out.println("size " + retVal.size());
			
			Object[][] result = new Object[retVal.size()][retVal.size()]; 
			int count = 0; 
	
			for(List<Object> temp : retVal){
				if(temp!=null){
				Object[]  obj = new Object[3]; 
				System.out.println(temp.get(0));
				System.out.println(temp.get(1));
				System.out.println(temp.get(2));
	
			obj[0] = temp.get(0); 
			obj[1] = temp.get(1); 
			obj[2] = temp.get(2);
				
				result[count ++] = obj; 
				}
			}
			
			return result; 
		}
}
		
		
	
	
	
	
	