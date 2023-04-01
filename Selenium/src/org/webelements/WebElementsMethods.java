package org.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//dynamic binding
        driver.get("https://demo.guru99.com/test/radio.html");
        
        //Webelement is displayed and isenabled  or not
        //www.google.com
//        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//       System.out.println("Displayed:" +search.isDisplayed());  //return type boolean
//       
      // search.sendKeys("selenium");
       
      // System.out.println("Enabled:" +search.isEnabled());  //return type boolean
        
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));  //radiobutton is selected or not
        radio.click();          //after click is selected is true                                                     
        System.out.println("RadioButton:"+radio.isSelected());                     //return type boolean false
        
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));//radiobutton is selected or not 
        checkbox.click(); //after click is selected is true
        System.out.println("Checkbox:" +checkbox.isSelected()); //return type boolean  false
        
        System.out.println( "Attribute Id:"+checkbox.getAttribute("id"));  //return type string =>get attribute value
         
        System.out.println("Attribute value:"+checkbox.getAttribute("value")); //get thet element value
        
        System.out.println("Get Tagname:"+ checkbox.getTagName());   //get tag name
        
        WebElement text = driver.findElement(By.xpath("/html/body/div[4]/strong[2]"));
        System.out.println("Get Text:"+ text.getText());    //get text of that element
        
        
       
       

        
        
        
	}

}
