package org.javaexecuter;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JsExecuter {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
//      Javascript executer is a interface
//		javascript executer is used to intracting with webelements
		JavascriptExecutor js=(JavascriptExecutor) driver;  //webdriver interface change into jsinterface typecasting
		js.executeScript("window.scroll(0,1000)"); //x-horizontal scroll, y-vertical -scroll down
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-1000)");//scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//full page vertical scrolldown
		Thread.sleep(2000);
		
//		scroll down for particular element
		WebElement down = driver.findElement(By.xpath("//span[text()='Stuffed Animals & Toys under $10']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);  //scroll down for particular page element
		Thread.sleep(2000);
		
//		scroll up for particular element
		WebElement up = driver.findElement(By.xpath("//h2[text()='Beauty picks']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);  //scroll up for particular page element
		Thread.sleep(2000);
		
//		scroll again on top of page
		js.executeScript("window.scroll(0,0)");  //again go to top
		Thread.sleep(2000);
		
//		reload functions in js
		js.executeScript("location.reload()");  //reload page
		Thread.sleep(2000);
//	   JavascriptExecutor in Selenium to send text use setAttribute
	 	WebElement id = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"] "));
		js.executeScript("arguments[0].setAttribute('value','phone')",id);
		Thread.sleep(2000);
		
//		JavascriptExecuter in Selenium to getAttribute value
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",id);
		System.out.println(executeScript);
//		get website title
		String title = js.executeScript("return document.title;").toString();
	     System.out.println(title);
	     
//	    get innertext all of webpage
	     String innertext = js.executeScript("return document.documentElement.innerText").toString();
	     System.out.println(innertext);
		
//		JavascriptExecuter in Selenium to click
		WebElement search = driver.findElement(By.xpath("//input[@value='Go']"));
		js.executeScript("arguments[0].click()",search);
		Thread.sleep(2000);
		
		//js.executeScript("alert(‘hello world’)");   //alert
		
//		js.executeScript("window.scroll(0,1000)"); //x-horizontal scroll, y-vertical -scroll down
//		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		

	}

}
