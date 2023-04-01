package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadeMethod2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
	//Download File
		
		 driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]")).click();
		//check file is download ornot
		 File location=new File("C:\\Users\\splpt777\\Downloads");
		File[] listFiles = location.listFiles();
		for(File f:listFiles) {
			if(f.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is Downloaded Successfully");
				break;
			}
		}
		
		
	//upload File
		
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]"));
		uploadButton.click();
		Thread.sleep(2000);
//		Actions a=new Actions(driver);
//		a.moveToElement(uploadButton).click().perform();
		
		Robot r=new Robot();
	
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
