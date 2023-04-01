package org.apachepoi;

import java.io.Closeable;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;     //interface
import org.apache.poi.xssf.usermodel.XSSFRow;      //interface
import org.apache.poi.xssf.usermodel.XSSFSheet;    //interface
import org.apache.poi.xssf.usermodel.XSSFWorkbook;//interface

public class ApachePoi {
public static void main(String[] args) throws IOException {
	//NUllpointer,IllegalState Exception can handled in this
	
 //Get Dynamic all excel values 
	//find the locator
	String filePath="./Excel/Dynamicdatalogin.xlsx";
	//get Workbook
	XSSFWorkbook workbook=new XSSFWorkbook(filePath);
	//getSheet from workbook
	XSSFSheet sheet = workbook.getSheet("sheet1");
	
	//getLastRow from sheet it avoid header row  not calculate the header row
	int lastRowNum = sheet.getLastRowNum();  //lasr row value
	System.out.println("No of Rows in Sheet without Header:" +lastRowNum);
	
	//getPhysicalNumberofRow it accept all rows included header
	int allRows = sheet.getPhysicalNumberOfRows(); 
	System.out.println("No of AllRows in sheet with Header: " +allRows);
		
	//get dynamic column use row cell num
	short lastColumn = sheet.getRow(0).getLastCellNum();
	System.out.println("No of Columns:" +lastColumn);
	
	for (int i = 1; i <=lastRowNum ; i++) {   //get rows
		//get all the values form Row and cell
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < lastColumn; j++) {  //getlastcolumns
			XSSFCell cell = row.getCell(j);
			
			//Accept all datatype data use DataFormatter it convert into String 
			DataFormatter dft=new DataFormatter();
			String value = dft.formatCellValue(cell);
			System.out.println(value);
			
			
		}
	}
	

	
}
}
