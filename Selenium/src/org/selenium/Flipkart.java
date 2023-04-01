package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdrive.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	   driver.findElement(By.className("_3704LK")).sendKeys("pendrive");
//	 /  driver.findElement(By.className("L0Z3Pu")).submit();
	  driver.findElement(By.className("CXW8mj")).click();
	   //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a")).click();
	  // driver.findElement(By.xpath("//a[@alt='Consistent 64GB Metal Pendrive With Keychain Carabiner, 5 Years Warranty 64 GB Pen Drive']")).submit();
	 //  driver.findElement(By.className("_4ddWXP")).click();
	  // driver.findElement(By.className("_396cs4")).click();
	//  driver.findElement(By.xpath("//a[text()='Consistent 64GB Metal Pendrive With Keychain Carabiner,...']")).submit();
	   //driver.findElement(By.xpath("//a[@title='Sandisk Cruzer Blade 16 GB Utility Pendrive']")).submit();
	}
	
}
