package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioCheckBox {
@Test
	public void radio() throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\mozilawebdriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver(); //dynamicbinding
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//radio button select
		driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]")).click();;
		Thread.sleep(3000);  //click radio button to be selected
		
	   //isselectable or not
		WebElement isselect = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
		isselect.click();Thread.sleep(3000);
		System.out.println("check select:" +isselect.isSelected());  //it check selected or not
		
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
       //Checkbox
		driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]")).click();
		
		//togglebutton
		WebElement toggle = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]"));  //clcik tooglebutton
		toggle.click();Thread.sleep(3000);
		//again untoggled
		if(toggle.isSelected()) { //check condition
			toggle.click();
			Thread.sleep(3000);  //again automatic deselected
		}
		
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		System.out.println(disabled.isSelected());
		
		//dropdown =>multiple select in dropdownlist
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul")).click();    //click dropdown 
		//driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[2]/input")).sendKeys("r");
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[6]/div/div[2]")).click();  //Brazila Selected
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/div/div[2]")).click();   //paris selected
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul")).click();
		Thread.sleep(3000);
		
		
		WebElement selectable = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul"));  //get selcted valued
		String text = selectable.getText();
		System.out.println(text);
	}

}
