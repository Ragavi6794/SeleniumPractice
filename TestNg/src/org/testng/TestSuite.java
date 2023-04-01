package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

	 WebDriver driver;
	 long start;
	   @BeforeSuite
		public void lauchBrowser() {
		start = System.currentTimeMillis();
		 System.setProperty("webdriver.geckodriver.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\mozilawebdriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver(); //dynamicbinding
		
		}
	   
	   @Test
	   public void openGoogle() {
		   driver.get("https://testng.org/doc/");
	   }
	   @Test
	   public void openAmazon() {
		   driver.get("https://www.amazon.in/");
	   }
	  
	   
	   
	@AfterSuite
	public void close() {
		driver.quit();
		long end = System.currentTimeMillis();
		long total=end-start;
		System.out.println(total);
		
	}
}
