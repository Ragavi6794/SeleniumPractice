package org.hyperlinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate the links
		driver.findElement(By.linkText("Go to Dashboard")).click();
        driver.navigate().back();
        
        //find where to go in href
        WebElement href = driver.findElement(By.partialLinkText("Find the URL"));
        String hreflink = href.getAttribute("href");
        System.out.println("Where To Go Link" +hreflink);
        
        //IsBroken Link
        WebElement broken = driver.findElement(By.linkText("Broken?"));
        broken.click();
        String title = driver.getTitle();
        if(title.contains("404")) {
        	System.out.println("The Link is Broken");
        }
        else {
        	System.out.println("The Link is not Broken");
        }
        driver.navigate().back();
        
        //same link
        
    	driver.findElement(By.linkText("Go to Dashboard")).click();
        driver.navigate().back();
        
        //find no of links in page
        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
        int size = totalLinks.size();
        System.out.println("No of Links \t" +size);
        
	}

}
