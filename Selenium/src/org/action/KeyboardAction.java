package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
//Multiple Keyboard actions
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\splpt777\\\\Desktop\\\\Javaprogram\\\\Selenium\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.text-compare.com/");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		WebElement input2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		input1.sendKeys("Welcome to Selenium");
		
		Actions builder=new Actions(driver);
		//builder.sendKeys(Keys.ENTER).perform();
		//Ctrl+A 
		builder.keyDown(Keys.CONTROL); //keypress
		builder.sendKeys("a");
		builder.keyUp(Keys.CONTROL);  //keyrelease
		builder.perform();
		
		//Ctrl+C
		builder.keyDown(Keys.CONTROL);
		builder.sendKeys("c");
		builder.keyUp(Keys.CONTROL);
		builder.perform();
		
		//tab
		builder.keyDown(Keys.TAB);
		builder.perform();
		
		//Ctrl+V
		builder.keyDown(Keys.CONTROL);
		builder.sendKeys("v");
		builder.keyUp(Keys.CONTROL);
		builder.perform();
		
		//compare texts
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text is Copied!!");
		}
		else {
			System.out.println("Text is not Copied!!!");
		}
		
		
		
		WebElement input3 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
       System.out.println(input3.getAttribute("value"));
	}

}
