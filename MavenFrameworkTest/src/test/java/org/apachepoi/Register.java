package org.apachepoi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.allbaseclass.BaseClass;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Register extends BaseClass {
	//DataProvider its login data return to the login method
		@DataProvider(name="Registration")
		public String[][] getData() throws IOException {
			//input datas get from Read ExcelFile Apachepoi methods
			String[][] input=getExcelData();
			return input;
			//return the values to  Login method as paramter Constructor
		}
		

 
		//read data from Excel using ApachePoi
		public String[][] getExcelData() throws IOException {
			String file="./Excel/Dynamicdatalogin.xlsx";
			//get workbook 
			XSSFWorkbook  wb=new XSSFWorkbook(file);
			//get sheet
			XSSFSheet sheet = wb.getSheet("sheet1");
			//get no of row in sheet
			int noOfRow = sheet.getLastRowNum();  //without Header
			System.out.println("No of Columns:" +noOfRow );
			//get no of column
			short noOfColumn = sheet.getRow(0).getLastCellNum();
			System.out.println("No of Columns:" +noOfColumn );
			
			//data variable is declared array
			String[][]  data = new String[noOfRow][noOfColumn];
			//gat all rows and column values
			for(int i=1;i<=noOfRow;i++) {
				//get row
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<noOfColumn;j++) {
					//get cellvalue
					XSSFCell cell = row.getCell(j);
					//data convert into String
					DataFormatter dft=new DataFormatter();
					String value = dft.formatCellValue(cell);
					//print excel values
					System.out.println(cell);
			
				//now the value should be return to the dataprovider  =>i-1=>0-1=0  becuse array always accept 0 index and 1
				
				  data[i-1][j]=value;  //[0][0],[0][1],[0][2],[0][3],  next row =>[1][0],[1][1],[1][2],[1][3],.....
					
				}
			}
			//return data out of from loop
			return data;
			
		}
		
//		@BeforeMethod
//		public void launchBrowser() {
//
//			launchChromeBrowser();
//			implicitWait(3000, TimeUnit.SECONDS);
//			loadUrl("https://www.tnsports.org.in/webapp/login.aspx");
//			//close dialog box
//			driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[1]/button")).click();
//			//click registration link
//			driver.findElement(By.xpath(" //*[@id=\"form\"]/div[4]/div/div/div/div[1]/div[5]/a")).click();
//			
//			
//		}
		
		//Login Method datas are getting from dataprovider
		@Test(dataProvider="Registration")
		
		public void Login(String email,String pass) {
			//Driver Methods from Base Class
			
			setUpChrome("https://www.tnsports.org.in/webapp/login.aspx");
			//close dialog box
			driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[1]/button")).click();
			//click registration link
			driver.findElement(By.xpath(" //*[@id=\"form\"]/div[4]/div/div/div/div[1]/div[5]/a")).click();
			
			//waits
			implicitWait(3000, TimeUnit.SECONDS);
			maximize();
			     
			//sendkeys value are passed through the login constuctor
			driver.findElement(By.id("name")).sendKeys(email);
			driver.findElement(By.id("mobNumber")).sendKeys(pass);
            
		}
	
	

}
