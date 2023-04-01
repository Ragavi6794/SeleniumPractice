package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadRobo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
	    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	     WebElement browse = driver.findElement(By.xpath("//*[@id=\"file-upload-form\"]/button"));
	    browse.click(); // Click on browse option on the webpage
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	 
		//click upload button =>using SendKeys method
		
	//  WebElement uploadPhotoBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
	//	uploadPhotoBtn.sendKeys("C:\\Users\\splpt777\\Downloads\\Ragavi.pdf");
	//	driver.findElement(By.id("file-submit")).click();	
	    
	    // creating object of Robot class
	    Robot r = new Robot();
		
	 // copying File path to Clipboard
		StringSelection ss=new StringSelection("C:\\Users\\splpt777\\Downloads\\Ragavi.docx"); //convert data transfer into plaintext
		//we have to get that plain text file then copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Robot class used to paste the copy value into file upload 
		// press Contol+V for pasting
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//now the file will be uploaded
		
		
	}

}
