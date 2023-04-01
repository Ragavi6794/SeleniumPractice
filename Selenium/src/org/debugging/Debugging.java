package org.debugging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugging {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.triotend.com/"); //open url
	//Debugging = execute script line by line
	//double click on the debugging line
	//run debug click F6 =>execute line by line 
	//F8 =>execute particular part of code =>execute code break point to break point
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl()); //current url
	System.out.println(driver.getTitle()); //site title
	driver.findElement(By.xpath("//*[@id=\"intro\"]/div[1]/div/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-menu-container\"]/ul/li[6]/a")).click();

	
	}
	

}
