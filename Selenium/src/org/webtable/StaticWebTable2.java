package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));
		//print headers name
		List<WebElement> header= table.findElements(By.tagName("th"));
		for (WebElement h : header) {
			String text = h.getText();
			System.out.println(text);
		}
		//print rows 
		List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"simpletable\"]/tbody/tr"));
		int size = rows.size(); //3
		System.out.println("No of Rows" +size);
		
		//get alldata
		for (WebElement data : rows) {
			List<WebElement> column = data.findElements(By.tagName("td"));
			for (WebElement c : column) {
				System.out.println(c.getText());
			}
		}
		
		//get first index column data
		for (WebElement first : rows) {
			List<WebElement> f = first.findElements(By.tagName("td"));
			String firstColumn = f.get(0).getText();
			System.out.println(firstColumn);
		}
		
		//get 2nd raj data then click button
		for(int i=0;i<size;i++) {
			List<WebElement> r = rows.get(i).findElements(By.tagName("td"));
			String text = r.get(1).getText();
			System.out.println(text);
			if(text.equals("Man")) {  
				WebElement input = r.get(3).findElement(By.tagName("input"));//3rd column
				input.click();
				break;
			}
		}
		

	}

}
