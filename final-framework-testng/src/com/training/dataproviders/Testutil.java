package com.training.dataproviders;



import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Testutil {
 

	public static ExcelReader excel = new ExcelReader("C:\\complex\\RETC061.xlsx");

	@DataProvider(name="dp")
	public Object[][] getData(Method m) {

		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows-1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			
		}
		return data;

	}
		return data;	
}
 }
