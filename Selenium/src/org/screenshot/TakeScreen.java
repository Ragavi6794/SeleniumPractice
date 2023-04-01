package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class TakeScreen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/"); 
		driver.manage().window().maximize();
		
		//take screnshot
		TakesScreenshot tk=(TakesScreenshot) driver;   //takescreenshot in driver
		File src = tk.getScreenshotAs(OutputType.FILE);//get screenshot entire page
	    File des=new File("./image/util.png");         //store screenshot
		FileUtils.copyFile(src, des);                 //File utils used for apache external jar file added
//		FileHandler.copy(src, des);                  //default filehandler for selenium
		
	}

}
