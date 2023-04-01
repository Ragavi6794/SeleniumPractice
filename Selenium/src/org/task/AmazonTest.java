package org.task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //dynamic binding
	
		driver.get("https://www.amazon.in/"); //it launch the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //implicity waits
		//Explicit Waits
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));  //waits class
		
		String Title = driver.getTitle();     //get title of website
		System.out.println("Title of Website:" +Title);

		driver.manage().window().maximize();
		
		//search path
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Oppo A57" +Keys.ENTER);    //send value of oppophone
		//waits.until(ExpectedConditions.visibilityOf(search));//wait for search visible

		//enter the search button
		//search.sendKeys(Keys.ENTER);

		JavascriptExecutor j=(JavascriptExecutor) driver;  //typecasting =>interface
		WebElement oppo = driver.findElement(By.xpath("//span[text()='Oppo A57 (Glowing Green, 4GB RAM, 64 Storage) with No Cost EMI/Additional Exchange Offers']"));
		j.executeScript("arguments[0].scrollIntoView(true)", oppo); //scroll to oppo 

		waits.until(ExpectedConditions.visibilityOf(oppo));//wait for search visible
		oppo.click();

		//Now we have to handle window
		String windowHandle = driver.getWindowHandle();  //get current window alpha numeric value return in string
		System.out.println("Current Window Handle:" +windowHandle); //CDwindow-2E551622F6DD077A3A73990978921A23

		Set<String> windowHandles = driver.getWindowHandles();  //it handles all window get unique alpha numeric value
		System.out.println("All window Handle:" +windowHandles);//CDwindow-FB32A6B1C2F2D79352CC5269830DAD65

		for(String s:windowHandles) {               //it check equals to window handle code and window handles  code
			if(!s.equals(windowHandle)) {    //!CDwindow-2E551622F6DD077A3A73990978921A23 not equal to  CDwindow-FB32A6B1C2F2D79352CC5269830DAD65
				driver.switchTo().window(s);  //then go to CDwindow-FB32A6B1C2F2D79352CC5269830DAD65 => new window
			}
		}


		WebElement Addtocart = driver.findElement(By.id("add-to-cart-button"));
		j.executeScript("arguments[0].scrollIntoView(true)", Addtocart); //scrollto addtocart
		Addtocart.click();


		//teakescreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./amazon/oppo.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(4000);

		//navigate back
		driver.navigate().back();
		//goes again into parent window
		for(String w:windowHandles) {
			if(w.equals(windowHandle)) {  //whwn equal to parent
				driver.switchTo().window(w);  //it goes into parent window
			}
		}
		driver.navigate().back(); //amazon home screen
		Thread.sleep(2000);

		//scroll down for another product click by jsexecuter
		j.executeScript("window.scroll(0,document.body.scrollHeight)");  //last down of screen
		Thread.sleep(2000);
		WebElement boat = driver.findElement(By.xpath("//img[@alt='ECOVACS DEEBOT U2 PRO 2-in-1 Robotic Vacuum Cleaner with Mopping, Strong Suction, Smart App Enabled, Google Assistant &...']"));
		j.executeScript("arguments[0].scrollIntoView(false)", boat);  //up
		boat.click();
		Thread.sleep(3000);

        //Addtocart at samepage
		WebElement buynow = driver.findElement(By.id("add-to-cart-button"));
		j.executeScript("arguments[0].scrollIntoView(true)",buynow );
		buynow.click();
		Thread.sleep(2000);
		//skip popup
		driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input")).click();
		Thread.sleep(2000);

		//teakescreenshot
		TakesScreenshot tk=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		File des1=new File("./amazon/boat.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(2000);




	}

}
