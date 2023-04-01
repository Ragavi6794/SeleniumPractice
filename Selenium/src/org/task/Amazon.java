package org.task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Amazon {
	//Task-1 amazon page
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
   	WebDriver driver=new ChromeDriver();
   	driver.get("https://www.amazon.com");
   	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	
   	//scrolldown and scrollup in javascripexecuter
   	JavascriptExecutor js=(JavascriptExecutor) driver; //typecasting
   	WebElement toys = driver.findElement(By.xpath("//h2[text()='New arrivals in Toys']"));
   	js.executeScript("arguments[0].scrollIntoView(true)",toys );Thread.sleep(2000);
   	
   	WebElement toy = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
   	js.executeScript("arguments[0].click()",toy); Thread.sleep(2000);
   	
	js.executeScript("window.scroll(0,1000)");	Thread.sleep(2000);
	//select pockemon radio button
   	driver.findElement(By.xpath("//*[@id=\"p_89/Pokemon\"]/span/a/div/label/i")).click(); 
	Thread.sleep(2000);
   	
   	js.executeScript("window.scroll(0,1000)");	Thread.sleep(2000);
  //click radio button for age
   	WebElement pockemon = driver.findElement(By.xpath("//*[@id=\"p_n_age_range/165936011\"]/span/a/div/label/i")); 
   	js.executeScript("arguments[0].click()", pockemon);Thread.sleep(3000);
   	
   	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
   	//Thread.sleep(5000);
   	
   	TakesScreenshot tk=(TakesScreenshot) driver;
   	File src = tk.getScreenshotAs(OutputType.FILE);
   	File des=new File("./Task/toys.png");
   	FileHandler.copy(src, des);

	
	}


}
