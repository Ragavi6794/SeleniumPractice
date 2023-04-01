package org.apachepoi;

	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.pomframeworkproject.PomClass;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProvider {
		@org.testng.annotations.DataProvider(name="Login")
		//dataprovider have 2D Array
		public String[][] getData() {
			
			String[][] data=new String[3][2];
			data[0][0]="ragavi6794@gmail.com";  //valid username
			data[0][1]="ragavi_67";              //valid password
			//row2
			data[1][0]="viknesh@gmail.com";   //validusername
			data[1][1]="vivki";               //invalid password
			 
			data[2][0]="lithiks";   //invalidusername
			data[2][1]="lithi_90";  //validpassword
					
			
			return data;
		}
		
		@Test(dataProvider="Login")
		//it consider as 0 and 1 index
		public void Login(String email,String password){
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/"); //it launch the url
			String Title = driver.getTitle(); 
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(password);
			  driver.findElement(By.name("login")).click();
		}
	}

