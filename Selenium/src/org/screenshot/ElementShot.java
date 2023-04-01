package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		//take shot particualar element
		TakesScreenshot tk=(TakesScreenshot) driver;  //driver la irukara screen
		WebElement email = driver.findElement(By.id("email"));  //take screenshot only element of email
		File src = email.getScreenshotAs(OutputType.FILE);     //getfile
		File des=new File("./image/element.png");
		FileUtils.copyFile(src, des);            //save only that element
			
		//take shot particualar section
		WebElement part = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div"));
		File src1 = part.getScreenshotAs(OutputType.FILE);
		File des1=new File("./image/part.png");
		FileUtils.copyFile(src1, des1);
		

	}

}
