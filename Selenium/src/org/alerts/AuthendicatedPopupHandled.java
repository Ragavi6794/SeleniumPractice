package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthendicatedPopupHandled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u = "admin";
	      // adding username, password with URL
	      String str = "https://" + u + ":" + u + "@" +
	      "the-internet.herokuapp.com/basic_auth";
	      driver.get(str);
	//	driver.get("https://www.leafground.com/auth.xhtml");
//		 String u = "admin";
//		 String p="testleaf";
	     //  adding username, password with URL
//	      String str = "https://" + u + ":" + p + "@" +
//	      "leafground.com/auth.xhtml";
//	      driver.get(str);
//		driver.manage().window().maximize();
//		driver.findElement(By.id("j_idt88:j_idt90")).click();
//		Alert a=driver.switchTo().alert();
//		a.sendKeys("admin");
//		a.sendKeys("testleaf");
//		a.accept();
	}

}
