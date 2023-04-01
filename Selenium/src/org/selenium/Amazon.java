package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//set property
	//	System.setProperty("webdrive.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //debugging use f6
		driver.getTitle();
		//nav-a nav-a-2 nav-progressive-attribute
		//driver.findElement(By.id("glow-ingress-block")).click();
	//	driver.findElement(By.xpath("//input[text()='Sign in to see your addresses']")).click();
		//driver.findElement(By.id("nav-cart")).click();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='boAt Rockerz 370 On Ear Bluetooth Headphones with Upto 12 Hours Playtime, Cozy Padded Earcups and Bluetooth v5.0, with Mic (Buoyant Black)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submit.buy-now']")).click();
	}

}
