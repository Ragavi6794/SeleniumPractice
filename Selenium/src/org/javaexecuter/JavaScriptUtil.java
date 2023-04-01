package org.javaexecuter;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));

		//draw border 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",logo); //draw border for ui

		//takescreenshot
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/logo.png");
		FileUtils.copyFile(src, des);
		
		//website title
		String title = js.executeScript("return document.title").toString();
		System.out.println("Document Title:" +title);
		
		//click
//		WebElement register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
//		js.executeScript("arguments[0].click()", register);
		
		//refresh page
		js.executeScript("history.go(0)");
		
		//scrolldown last end page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //lastpage
		
		//scroll up
		js.executeScript("window.scrollTo(0,0)");//top page
		
		//Zoompage
		js.executeScript("document.body.style.zoom='100%'");
	
		
		//flash
		WebElement lo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		js.executeScript("arguments[0].style.backgroundColor='yellow'", lo);
		
		//
		js.executeScript("return document.documentElement.innerText").toString(); 
		
	}


}
