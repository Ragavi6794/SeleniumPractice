package org.parameter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	//parameter passed through constructor
	//this file run only in testngparameters.xml file 
	//because it passed parameters through xml
	//we can use this xml file use 
	
	//<parameter name="emailId" value="ragavi6794@gmail.com"></parameter>
	//<parameter name="password" value="ragavi"></parameter>
	// <parameter name="browser" value="edge"></parameter>
    //<parameter name="browser" value="firefox"></parameter>
	
	WebDriver driver;
	@Parameters({"emailid","password","browser"})
	@Test
	public void Login(String email,String pass,String browse){
		//crossbrowser testing and parallely
		switch(browse) {
		case "edge":driver=new EdgeDriver();
		break;
		case "chrome":driver=new ChromeDriver();
		break;
		default:System.out.println("No browser launched");
		break;
		}
//		
//		System.setProperty("webdriver.geckodriver.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\mozilawebdriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//
//		WebDriver driver=new FirefoxDriver(); //dynamicbinding
		driver.get("https://www.facebook.com/"); //it launch the url
		String Title = driver.getTitle(); 
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		  driver.findElement(By.name("login")).click();
}
}