package org.task;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Flipkart {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		   	WebDriver driver=new ChromeDriver();
		   	driver.get("https://www.flipkart.com/");
		   	driver.manage().window().maximize();
		   	
		   	//scrolldown and scrollup in javascripexecuter
		   	JavascriptExecutor js=(JavascriptExecutor) driver; //typecasting
		   	js.executeScript("window.scroll(0,2000)");  //scrolldown
		   	Thread.sleep(2000);
		   	js.executeScript("window.scroll(0,-1000)"); 	Thread.sleep(2000);  //scrollup 
		   	js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 	Thread.sleep(2000); //scroll last
		   	js.executeScript("window.scroll(0,0)");  	Thread.sleep(2000); //scroll top
		  
		   	//scroll at particular element
		    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("sarees");
		  	Thread.sleep(2000); //scrollup fromlast
		    driver.findElement(By.xpath("//button[@type='submit']")).submit(); 
		    Thread.sleep(3000);
		    js.executeScript("window.scroll(0,500)"); Thread.sleep(5000);  //scroll down
		  
		   	TakesScreenshot tk=(TakesScreenshot) driver;  //screenshot interface
		   	File src = tk.getScreenshotAs(OutputType.FILE); //store src
		   	File des=new File("./Task/saree.png");
		   	FileUtils.copyFile(src, des);	Thread.sleep(3000);   //store shots
		   	
		   	
		   	
		   	driver.navigate().back();
		   	

			
		   	
		   
		   	
		   
		   	

	}

}
