package org.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//plain Java Application 

public class ExcelReadApachePOI {
    WebDriver driver;
	static List<String> username=new ArrayList<String>();
	static List<String> password=new ArrayList<String>();

	public void readData() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\splpt777\\Desktop\\SLA\\ApachePoi.xlsx");
		//HSSF =>2003 version   =>xls
		//XSSF =>latest version =>xlsx
		Workbook wb=new XSSFWorkbook(file);
		//getsheet
		Sheet sh = wb.getSheetAt(0);
		//find no of rows in Excel

		//rows 
		Iterator<Row> rows = sh.iterator();
		//get  row datas
		while(rows.hasNext()) {
			Row rowData = rows.next();
			//columns data
			Iterator<Cell> columns = rowData.iterator();
			int i=2;
			//cell data
			while(columns.hasNext()) {
				if(i%2==0) {
					username.add(columns.next().getStringCellValue());
				}
				else {
					password.add(columns.next().getStringCellValue());
				}
				i++;
			}

		}

	}
	

	//it consider as 0 and 1 index
	public void Login(String email,String password){
		
		driver.get("https://www.facebook.com/"); //it launch the url
		String Title = driver.getTitle(); 
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	
	public void executeTest() {
		for(int i=0;i<username.size();i++) {
			Login(username.get(i),password.get(i));
		}
	}
	
		public static void main(String args[]) throws IOException
		{
			ExcelReadApachePOI poi=new ExcelReadApachePOI();
			poi.readData();
			System.out.println("email" +username);
			System.out.println("password" +password);
		}




















		//  int rowCount= sh.getLastRowNum() - sh.getFirstRowNum();  //1-5=4 
		//all the rows of data read 
		//	  for (int i = 0; i < rowCount+1; i++) { //rowcount start in 0 used +1
		//		  Row row = sh.getRow(i);
		//		   
		//		  //print cell values
		//		  for (int j = 0; j <row.getLastCellNum(); j++) {
		//			  //print excel data in console
		//			      String stringCellValue = row.getCell(j).getStringCellValue();
		//			      System.out.println(stringCellValue);
		//			
		//		}
		//		  
		//		System.out.println();
		//	}




	}



