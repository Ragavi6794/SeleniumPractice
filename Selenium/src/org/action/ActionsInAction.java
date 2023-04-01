package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsInAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\splpt777\\\\Desktop\\\\Javaprogram\\\\Selenium\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		//handle frame
		WebElement frame = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
        driver.switchTo().frame(frame);
        
		//it handled
		WebElement from = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		WebElement src = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
	
		Actions builder=new Actions(driver);//actions class
		//Action is Interface
		//build the action in interface
		Action act=builder.dragAndDrop(from, to).dragAndDrop(src, to).build();
		act.perform();  //it perform the serious actions
	}

}
