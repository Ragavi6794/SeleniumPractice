package org.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadJSX {
	WebDriver driver;
	@org.testng.annotations.DataProvider(name="Login")
	//dataprovider have 2D Array
	public String[][] getData() throws BiffException, IOException {
		String[][] data=getExcelData();
		
//		String[][] data=new String[3][2];
//		data[0][0]="ragavi6794@gmail.com";  //valid username
//		data[0][1]="ragavi_67";              //valid password
//		//row2
//		data[1][0]="viknesh@gmail.com";   //validusername
//		data[1][1]="vivki";               //invalid password
//		 
//		data[2][0]="lithiks";   //invalidusername
//		data[2][1]="lithi_90";  //validpassword
//				
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\splpt777\\Desktop\\SLA\\Excelreadjxl.xls");
		Workbook wb=Workbook.getWorkbook(excel);   //get workbook
		//get sheet
	    Sheet sh = wb.getSheet("read");
	    //get rows and column
	    int rowcount = sh.getRows();
	    int columncount = sh.getColumns();
	  //static value get
	    String[][] data=new String[4][2];  //4 row(1,2,3,4) , 2 column (0,1)
	    //in Excel Sheet
//      ragavi6794@gmail.com	7402050943  [1][0] ,[1][1]
//	    ragavi6794@gmail.com	7402050     [2][0], [2][1]
//	    ragavi@gmail.com	7402050943      [3][0] ,[3][1]
//	    ragavi@gmail.com	74020           [4][0], [4][1]

	    //iterate the row
	    
	    for(int i=1;i<rowcount;i++) {   //row count
	    	for(int j=0;j<columncount;j++) {  //column count
	    	
	    		//data[0][1],[0][2],[0][3],[0][4]
	    		//data[1][1],[1][2],[1][3],[1][4]
	    		data[i-1][j] = sh.getCell(j, i).getContents();    //get all content store into data String 2D= array
	    	}
	    }
	    return data;
	}
	
	
	@BeforeTest
	public void Chrome() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver(co);
		
	}
	
	
	
	@Test(dataProvider="Login")
	//it consider as 0 and 1 index
	public void Login(String email,String password){
		
		driver.get("https://www.facebook.com/"); //it launch the url
		String Title = driver.getTitle(); 
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void quit() {
		driver.close();
	}
}
