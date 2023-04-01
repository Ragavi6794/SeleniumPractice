package org.extendreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportClass {

	public static void main(String[] args) {
		//for report blank HTML
		ExtentSparkReporter report=new ExtentSparkReporter("./TestReport.html");
		//Actual Report
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(report);
		//testcase id=Name
		ExtentTest search = extent.createTest("TC001-Search");
		search.pass("enter the product");
		search.pass("enter the add to cart");
		search.pass("Buy now");
		
		//test case 2

		ExtentTest search2 = extent.createTest("TC002-SearchFailed");
		search2.pass("enter the product");
		//add screenshot to report 
		search2.fail("search product failed",MediaEntityBuilder.createScreenCaptureFromPath("logo.png").build());
		
		
		//created  last execute
		extent.flush();
		
		
	}

}
