package org.javaexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExeElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Ragavi')",email);//without sendkeys give input
		Thread.sleep(2000);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", email);//return get value from email
		System.out.println(executeScript);
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','ragavi')", pass);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		js.executeScript("arguments[0].click()", login);
		
				

	}

}
