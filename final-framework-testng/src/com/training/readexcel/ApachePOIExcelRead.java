package com.training.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Naveen
 * @see this class  will take the records from excel sheet, and return it as list of list of object, and can be 
 *    		 generic, can given any records until it exists. Test it with main method provided, and the path is 
 *    		hard coded, participatns are asked to refractor this path in the property file and access.  
 */

public class ApachePOIExcelRead
 {

	public static List<List<Object>> getExcelContent(String fileName4) {
		List<List<Object>> list = new ArrayList<List<Object>>();
		try {
			
			//System.out.println("File Name  Got " + fileName2);
			//System.out.println("File Name  Got " + fileName3);
			System.out.println("File Name  Got " + fileName4);
			//FileInputStream fis = new FileInputStream(new File("C:/complex/RETD_001.xlsx"));
			//FileInputStream tesco = new FileInputStream(new File("C:/complex/RETD_002.xlsx"));
			FileInputStream telly = new FileInputStream(new File("C:/complex/RETD_003.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			//XSSFWorkbook workbook = new XSSFWorkbook(fis);
			//XSSFWorkbook workbook = new XSSFWorkbook(tesco);
			XSSFWorkbook workbook = new XSSFWorkbook(telly);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				// skipping first record

				List<Object> tempList = new ArrayList<Object>();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					switch (cell.getCellType()) {

					case Cell.CELL_TYPE_NUMERIC:
						tempList.add(((Double) cell.getNumericCellValue()).toString());
						break;
					case Cell.CELL_TYPE_STRING:
						tempList.add(cell.getStringCellValue());
						break;
					}

				}
				list.add(tempList);
			}
			//fis.close();
			//tesco.close();
			telly.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	
	  public static void main(String[] args) {
		//String fileName = "C:/Users/Naveen/Desktop/Testing.xlsx";

		//String fileName2 = "C:/complex/RETD_001.xlsx";
		//String fileName3 = "C:/complex/RETD_002.xlsx";
		String fileName4 = "C:/complex/RETD_003.xlsx";

		
		
		for (List<Object> temp :  getExcelContent(fileName4)) {
			System.out.println(temp.get(0) + ", " + temp.get(1));
		}
	}
}
