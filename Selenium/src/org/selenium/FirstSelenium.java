package org.selenium;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class FirstSelenium {
	//set the path of webdriver
public static void main(String[] args) throws InterruptedException {
	//SetProperty 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();//dynamic binding-overriding
	
	driver.get("https://www.javatpoint.com/selenium-webdriver-locating-strategies");
	
	
	//Maximize window
	driver.manage().window().maximize();
	//GET URL
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

	//GET TITLE
	String title = driver.getTitle();
	System.out.println("Website Title:" +title);
	
	//getwindowhandle()
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	
	//getwindowhandles() //get current alpha numeric value
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	
	//pagesource
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	
	//return the webdriver class name is =>org.openqa.selenium.chrome.ChromeDriver
	Class<? extends WebDriver> class1 = driver.getClass();
	System.out.println(class1);
	
	//return the hashcode for webpage
	int hashCode = driver.hashCode();
	System.out.println(hashCode);
	
	
	Set<Cookie> cookies = driver.manage().getCookies();
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie);
	}
	
	driver.manage().deleteAllCookies();
	
//	WebElement activeElement = driver.switchTo().activeElement();
//	System.out.println(activeElement);
	
	//Navigation methods
	driver.navigate().forward(); //forward the webpage
	Thread.sleep(3000);
	driver.navigate().back();  //back 
	Thread.sleep(3000);
	driver.navigate().to("http://www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	
	
     

    
     
     // web.close(); //close the current web page
	
	//driver.quit();   //close tha all webpages in browser
 	
	

	//web.quit();
}
}
