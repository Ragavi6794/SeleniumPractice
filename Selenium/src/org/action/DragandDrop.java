package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");//open url
	driver.manage().window().maximize();
	WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]")); //drag BANK
	WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'][1])")); //drop BANK here
	WebElement amodrag = driver.findElement(By.xpath("(//li[@id='fourth'][1])")); //5000
	WebElement amodrop = driver.findElement(By.id("amt7"));
	
	WebElement source = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));//drag SALES
	WebElement des = driver.findElement(By.id("loan"));//drop SALES here
	WebElement amod = driver.findElement(By.xpath("(//li[@id='fourth'][1])")); //5000
	WebElement amo = driver.findElement(By.id("amt8"));
	
	
	//mouse actions can do that use action INTERFACE
	Actions a=new Actions(driver); 
	a.dragAndDrop(drag, drop).perform();  //drag and drop actions done
	a.dragAndDrop(source, des).perform();
	a.dragAndDrop(amodrag, amodrop).perform();
	a.dragAndDrop(amod, amo).perform();
	
	

	}

}
