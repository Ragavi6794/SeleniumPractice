package org.extendreport;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.allbaseclass.BaseClass;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportwithDataApache extends BaseClass{

	//Extend Report
	ExtentSparkReporter report;  //htmlreporter
	ExtentReports extent;


	//DataProvider its login data return to the login method
	@DataProvider(name="Login")
	public String[][] getData() throws IOException {
		//input datas get from Read ExcelFile Apachepoi methods
		String[][] input=getExcelData();
		return input;
		//return the values to  Login method as paramter Constructor
	}



	@BeforeTest  
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




	@BeforeMethod
	public void launchBrowser() {

		//extend report
		report=new ExtentSparkReporter("./ExtentReport/LoginReport.html");
		extent=new ExtentReports();
		extent.attachReporter(report);

		ExtentTest open=extent.createTest("TC-001-OpenBrowser");
		open.log(Status.INFO, "Launch Browser");
		setUpChrome("https://www.instagram.com/");
		getTitle();
		open.log(Status.PASS, "Open Browser Successfully");

	}

	//Login Method datas are getting from dataprovider
	@Test(dataProvider="Login")
	public void Login(String email,String pass) throws IOException {
		//Driver Methods from Base Class

		//waits
		implicitWait(3000, TimeUnit.SECONDS);
		maximize();


		ExtentTest datas=extent.createTest("TC-002-Login");
		datas.log(Status.INFO, "MulipleDatas are passed through Apachepoi and DataProvider");

		//sendkeys value are passed through the login constuctor
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys(email);
		datas.log(Status.PASS, "Email Passed Successfully ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		datas.log(Status.PASS, "Passsword Passed Successfully");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//data passed or not	 
		datas.log(Status.PASS, " Login Successfully ");
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("./instagram.png");
		FileUtils.copyFile(src, des);
		datas.pass("Logged Suucessfully", MediaEntityBuilder.createScreenCaptureFromPath("./instagram.png").build());
		//datas.addScreenCaptureFromPath("./instagram.png");
		
		
		
		
		
		
		
		
		
		extent.flush();	

		driver.quit();

	}


}


