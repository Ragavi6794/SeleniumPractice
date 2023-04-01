package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/grid.xhtml");
		
        //Dynamic tables
		WebElement table = driver.findElement(By.id("form:dt-products")); 
		//table.findElement(By.id("form:dt-products:j_idt101")).click(); //sorting
		Thread.sleep(2000);
	WebElement page5 = table.findElement(By.xpath("//a[@aria-label='Page 5']"));
	page5.click();
	
	List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"form:dt-products_data\"]/tr"));
	int size = rows.size();
	System.out.println("No of Rows"+size);
	Thread.sleep(2000);


	
	//Find out no of pages in table
	WebElement purple = driver.findElement(By.xpath("//*[@id=\"form:dt-products_data\"]/tr[4]/td[3]"));
	String text1 = purple.getText();
	System.out.println(text1);
	
	if(text1.equals("Purple T-Shirt")) {
		purple.findElement(By.xpath("//*[@id=\"form:dt-products_data\"]/tr[4]/td[1]")).click();
	}
	else {
		System.out.println("Not click");
	}
	
	if(text1.equals("Purple T-Shirt")) {
		purple.findElement(By.xpath("//*[@id=\\\"form:dt-products_data\\\"]/tr[4]/td[9]")).click();
	}
	else {
		System.out.println("Not click");
	}
	}

}
