package org.calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//body/app-root[1]/app-calender[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nwb-date-picker[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		

	}

}
