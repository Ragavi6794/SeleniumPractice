package org.apachepoi;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		//locator file
		//FileInputStream file=new FileInputStream("./Excel/Login.xlsx");  //Excel file in my project ./=>current folder
		String file="./Excel/Login.xlsx";
		//XSSFWorkbook ->interface ,it accept arguments file is string,file inputstream
		//access workbook
		XSSFWorkbook wb=new XSSFWorkbook(file);  //overloaded constructor becasu it have different arguments
		
		//getSheet from workbook
		XSSFSheet sh = wb.getSheet("loginReaddata");
		for (int i = 1; i<=4; i++) {
			//getRow from sheet
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j< 2; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
	  
		

	}

}
