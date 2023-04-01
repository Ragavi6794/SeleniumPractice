package org.task;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Meesho {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		   	WebDriver driver=new ChromeDriver();
		   	driver.get("https://www.meesho.com/");
		   	driver.manage().window().maximize();
		   	driver.getTitle();
		   	//click on Womens Western using action class
		   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[3]/span")).click(); 
		   	Thread.sleep(2000);
		   	//click on moveelement of topwear
    	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[4]/div/div[1]/div/span")).click();
			Thread.sleep(2000);
			
			WebElement tops = driver.findElement(By.xpath("//p[text()='Tops']")); //tops
			Thread.sleep(2000);
		   	WebElement dress = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[4]/div/div[1]/a[2]/p"));//dress
		   
		    Actions a=new Actions(driver);
			a.moveToElement(tops).perform();  //tops
		   	a.moveToElement(dress).perform();
		   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[4]/div/div[1]/a[2]/p")).click(); //click on dress
		   Thread.sleep(4000);
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		    
		    js.executeScript("window.scrollTo(0,1500)");
		    Thread.sleep(2000);
		     
		  
		     driver.navigate().back();
		     Thread.sleep(5000);
		     
		    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input")).sendKeys("baby dress");
		    Thread.sleep(2000);
		    Robot robot=new Robot();
		    robot.keyPress(KeyEvent.VK_ENTER);  //enter mouse operations for search product
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(5000);
		    
		    driver.navigate().back();Thread.sleep(5000);
		    //onscreen
		    WebElement chudi = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[10]/a/div/div[1]"));
		    Thread.sleep(3000);
		    js.executeScript("arguments[0].scrollIntoView(true)", chudi);  Thread.sleep(3000);
		    js.executeScript("arguments[0].click()",chudi); Thread.sleep(3000);
		    
		    TakesScreenshot tk=(TakesScreenshot) driver;
		     File src= tk.getScreenshotAs(OutputType.FILE);
		     File des=new File("./Task/chudi.png");
		     FileUtils.copyFile(src, des);
		     System.out.println("Take screenshot successfully");
		     
		     driver.navigate().back();Thread.sleep(5000);
		    
		     driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[9]/div[1]/div[1]/span")).click();
		     driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[9]/div[1]/div[2]/div/div/div[4]/span[2]")).click();

		     driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[6]/a/div/div[1]/picture/img")).click();
		     Thread.sleep(5000);
	}

}
