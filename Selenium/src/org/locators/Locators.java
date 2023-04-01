package org.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://accounts.lambdatest.com/register");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        
        //Locators
        //id =>id("value") =>locate fatestest and unique
        driver.findElement(By.id("name")).sendKeys("Ragavi");       //username  
        //name =>name("value") 
        driver.findElement(By.name("email")).sendKeys("ragavi@gmail.com");  //email
        //class => className("value") =>duplicates not access easyly
        // driver.findElement(By.className("w-full tracking-custom xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 placeholder:text-gray-300 text-black rounded xxxl:px-24 xxl:px-18 px-12 flex items-center xxld:h-65 xxl:h-55 xlx:h-47 xls:h-40 h-35")).sendKeys("1234567"); //password
        
        //tagname =>tagName("value")  =>duplicates more no more uses
          // driver.findElement(By.tagName("input")); 
          
        //cssSelector =>like xpath =>tagName[attribute='value']
        driver.findElement(By.cssSelector("input[placeholder='Desired Password*']")).sendKeys("12345678"); //password
        
        driver.findElement(By.cssSelector("input[placeholder='Phone*']")).sendKeys("9842328349"); //phoneno
        
        driver.findElement(By.cssSelector("button[data-amplitude='R_signup']")).click();  //login
        Thread.sleep(5000);
        
        //driver.navigate().back();//backward
        Thread.sleep(3000);
        
        //LinkText =>type full text => linkText("value") 
        driver.findElement(By.linkText("Sign up with Google")).click();  //login with google
        Thread.sleep(3000);
        
        driver.navigate().back();
        Thread.sleep(3000);
        
        //partiallinkText => partial text of link=> partiallinkText("value")
        driver.findElement(By.partialLinkText("Github")).click();       //login with github
        driver.navigate().back();
        Thread.sleep(3000);

	}

}
