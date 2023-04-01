package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://www.facebook.com");
	   
	   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ragavi6794@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("7402050943");
	  driver.findElement(By.name("login")).click();
	     
	     
	     
	     
//	     web.findElement(By.className("_42ft _4jy0 _82go _4jy6 _517h _51sy")).click();
		  
//	 	email.sendKeys("ragavi6794@gmail.com");
	 //  password.sendKeys("7402050943");
//	 	login.click();
	
	}

}
