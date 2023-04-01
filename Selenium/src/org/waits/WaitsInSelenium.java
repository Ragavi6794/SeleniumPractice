package org.waits;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//Waits in Implicit
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
//Explicit Waits
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']")).click();
		
//		WebElement until = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt89']")));
//        until.click();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Alert until = waits.until(ExpectedConditions.alertIsPresent());
        until.accept();
        
        
      //1.webdrivertWaits
        driver.get("https://letcode.in/signin");
        waits.until(ExpectedConditions.titleContains("LetCode"));
        System.out.println(driver.getTitle());
        
        //handle popup toast
        
 driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
 WebElement toast = driver.findElement(By.xpath("//*[@id=\"toast-container\"]"));
        waits.until(ExpectedConditions.visibilityOf(toast));  //wait for toast visible
        waits.until(ExpectedConditions.invisibilityOf(toast));  //waits for invisible toast
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
        
        
        
      //2.fluentWaits
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).
        		withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
        		
        WebElement fluent = wait.until(new Function<WebDriver,WebElement>()
        		{
        	public WebElement apply(WebDriver driver) {
        		return
        				driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[1]/div/input"));
        	}
        		});
      fluent.sendKeys("ragavi");;
		
	}

}
