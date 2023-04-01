package org.windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlesWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\New Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://leafground.com/window.xhtml"); //it launch the url
		String Title = driver.getTitle();     //get title of website
		System.out.println("Title of Website:" +Title);

		driver.manage().window().maximize();

		//find element click button then open new window
		driver.findElement(By.id("j_idt88:new")).click();  //open new window
		String currentwindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id :" +currentwindowId);

		//now opened new window
		Set<String> AllwindowsId = driver.getWindowHandles(); //parent +child window id
		System.out.println("All Windows Id in Array:" +AllwindowsId);

		//I handle that windows
		for(String s:AllwindowsId) {  //1=parentid  //2=childid
			driver.switchTo().window(s);
		}

		driver.findElement(By.id("email")).sendKeys("ragavi@gmail.com");
		driver.findElement(By.id("message")).sendKeys("hi nice practice site");
		driver.findElement(By.id("j_idt130")).click();


		//count the windows
		int size = driver.getWindowHandles().size();
		System.out.println("No of windows opened:" +size);

		//close the child window =child window operations
		for(String close:AllwindowsId) {
			if(!close.equals(currentwindowId)) {  //not equal to parent =child
				driver.switchTo().window(close);
				System.out.println("Get Child window Title:" +driver.getTitle());  //dashboard
				System.out.println("Get current URL:" +driver.getCurrentUrl());

				driver.close();
			}
		}

		Thread.sleep(3000);


		//close the child window =parent window operations
		for(String close:AllwindowsId) {
			if(close.equals(currentwindowId)) { //equal to id is parent
				driver.switchTo().window(close);
				System.out.println("Get Child window Title:" +driver.getTitle());  //windowhandle
				System.out.println("Get current URL:" +driver.getCurrentUrl());

				driver.close(); //it closed only currnt window
			}
		}

		Thread.sleep(3000);


		Set<String> Totalwin = driver.getWindowHandles();

		//Iterator methods
		Iterator<String> allwin = Totalwin.iterator(); //i++	
		String parent = allwin.next(); //get 1 st window id
		String child = allwin.next();  //get 2 nd window
		System.out.println(child);
		driver.switchTo().window(child);  //its handle child window 


		//Array List method
		List<String> li=new ArrayList(Totalwin); //collections -converting set into the List
		String Parent = li.get(0);
		String Child = li.get(1);
		driver.switchTo().window(Child);  //its handle child window 
		driver.switchTo().window(Parent); 



		driver.quit();  //it closes all opened window








	}

}
