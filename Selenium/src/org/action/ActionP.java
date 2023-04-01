package org.action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionP {
//mousehover 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\mozilawebdriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver(); //dynamicbinding
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		WebElement movetoElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a"));
		WebElement menu = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[4]"));
		WebElement submenu = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[4]/ul/li[1]"));
		WebElement sub = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[4]/ul/li[1]/a/span"));
		WebElement cancelticket = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[5]/a/span[1]"));
		WebElement eticket = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[5]/ul/li[1]/a/span"));

		Actions a=new Actions(driver);
		a.moveToElement(movetoElement).moveToElement(menu).moveToElement(submenu).perform();//Train
		//a.moveToElement(menu).perform();//IRCTC TRAINS
	  // a.moveToElement(submenu).perform();//Group Booking
		//click Group Booking
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[4]/ul/li[1]")).click();
		a.moveToElement(cancelticket).perform();//cancel Tickets
		a.moveToElement(eticket).perform();//E-Tickets
		//click on etickets
	driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[5]/ul/li[1]/a/span")).click();
  //  driver.findElement(By.xpath("//*[@id=\"8742821\"]")).sendKeys("ragavi");	
    //driver.findElement(By.id("1502794")).sendKeys("123456");
	

	}

}
