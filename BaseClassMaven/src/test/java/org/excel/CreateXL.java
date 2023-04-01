package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateXL {

	public static void main(String[] args) throws IOException {
		File f=new File("./Second.xlsx");
		 XSSFWorkbook book=new XSSFWorkbook(); //downcasting
		 Sheet sh=book.createSheet("sheet1");
		 Row createRow = sh.createRow(0);
		// Row createRow1 = sh.createRow(1);
		 Cell createCell = createRow.createCell(0);
		 Cell createCell2 = createRow.createCell(1);
		 createCell.setCellValue("selenium");
		 createCell2.setCellValue("Ragavi");
		 
		 //output file
		 FileOutputStream fout=new FileOutputStream(f);
		 book.write(fout);
		 System.out.println("done");
	}

}















//row2
//Cell createCell3 = createRow1.createCell(0);
//Cell createCell4 = createRow1.createCell(1);
//createCell3.setCellValue("selenium");
//createCell4.setCellValue("Ragavi");
