package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\iedriver\\IEDriverServer_x64_4.8.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		//driver.get("http://www.instagram.com");
		//driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Class<? extends WebDriver> class1 = driver.getClass();
		
		System.out.println(class1);
//	     driver.quit();
	}
}
