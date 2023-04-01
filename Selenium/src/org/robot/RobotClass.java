package org.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	Actions a=new Actions(driver);
	a.sendKeys(email,"Ragavi").perform();
	a.doubleClick().perform();
	a.contextClick().perform();  //right click option
	Thread.sleep(2000);
	//Robot class create for keyboard actions
	Robot r= new Robot();
	for(int i=1;i<=3;i++) {
	r.keyPress(KeyEvent.VK_DOWN);   //keydown in 3times use forloop for click copy option
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	//to click enter button from keyboard
	r.keyPress(KeyEvent.VK_CONTROL); 
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//password to cpy text from email
	driver.findElement(By.id("pass")).click();
	Thread.sleep(2000);
	//we should wrrie keyrelease when we use keypress 
	r.keyPress(KeyEvent.VK_CONTROL);  //paste the value
	r.keyPress(KeyEvent.VK_V);

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_CONTROL); 
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	
	

}
	}
