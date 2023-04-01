package org.tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\splpt777\\\\Desktop\\\\Javaprogram\\\\Selenium\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		String expectTooltip="YouTube";
		
        WebElement tooltip = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[3]"));
        String actualTooltip = tooltip.getAttribute("title");  //check tooltip
        System.out.println("Actual Tooltip:" +actualTooltip);
        
        if(actualTooltip.equals(expectTooltip)) {   //it check actual tool tip = to expected tooltip
        	System.out.println("TestCase Passed");
        }

	}

}
