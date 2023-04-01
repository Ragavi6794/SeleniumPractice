package org.test;


import org.allbaseclass.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTestNg extends PojoClass {
	@org.testng.annotations.Test

	public void main() throws InterruptedException {
		//set property
		
	    launchChromeBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //debugging use f6
		driver.getTitle();
		getCurrentUrl();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    driver.quit();

}
}
