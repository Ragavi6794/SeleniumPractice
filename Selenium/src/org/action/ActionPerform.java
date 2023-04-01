package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPerform {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\splpt777\\\\Desktop\\\\Javaprogram\\\\Selenium\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")); //double click
//	/WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));//contextclick
	//Action class used to perform mouse operations
	Actions act=new Actions(driver);
	act.doubleClick(doubleclick).perform(); //double click
	//act.contextClick(rightclick).perform();
	
	//Dimension size = doubleclick.getSize();

	}

}
