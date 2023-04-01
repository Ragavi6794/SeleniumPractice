package org.screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/"); 
		driver.manage().window().maximize();
		//take screenshot
		TakesScreenshot tk=(TakesScreenshot) driver;//Add type casting its interface
		File src=tk.getScreenshotAs(OutputType.FILE); //get screenshot
		File des=new File("./image/insta.png");  //store screenshot
		FileHandler.copy(src, des);//default filehandler for selenium

	}

}
