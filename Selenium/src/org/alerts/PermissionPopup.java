package org.alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {

	public static void main(String[] args) {
		//it handled with chromeoption
		ChromeOptions option=new ChromeOptions();     //chromeoptions class
		option.addArguments("--disable-notifications"); //it disabled the browser notification
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/"); //its shows first PErmission notifications
		driver.manage().window().maximize();
		

	}

}
