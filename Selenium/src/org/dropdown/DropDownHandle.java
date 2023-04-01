package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		//Selected dropdown options
		WebElement singledrop = driver.findElement(By.id("fruits"));
		//Select class default in selenium
		Select s=new Select(singledrop);
		s.selectByIndex(2); //it selected index based values  =Orange
		s.selectByValue("3");  //selected by value=3 = Banana
		s.selectByVisibleText("Pine Apple");  //selected by text
		
		//check multiple or not
		System.out.println("Single Drop check \t:" +s.isMultiple());
		
		//now we can getText of last selected value
		WebElement firstselect = s.getFirstSelectedOption();     //=>get only selected options value
		System.out.println("Selected Values\t"+firstselect.getText());
		
		//get all options from dropdowns
		List<WebElement> options = s.getOptions();       //=>getoptions method it return all dropdown options 
		//System.out.println(options);
		for(WebElement All:options) {
			System.out.println(All.getText());
		}
		
		//select multiple options
		WebElement multidrop = driver.findElement(By.id("superheros"));
		Select s1=new Select(multidrop);
		boolean ismultiple = s1.isMultiple();    //return boolean value
		System.out.println("Is Multiple \t:" +ismultiple);  //it check its multiple or not
		
		//select multiple options in dropdown
		s1.selectByValue("bt");
		s1.selectByVisibleText("Captain Marvel");
		s1.selectByVisibleText("Ghost Rider");
		s1.selectByIndex(4);
		
		//getAllSelectedoptions in dropdownlist
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for(WebElement Multi:allSelectedOptions) {
			System.out.println(Multi.getText());
		}
		
		
		//deselect the option from Selected option list
		s1.deselectByValue("bt"); //deslected
		
		//then print value after the deselect it only 3 values
		List<WebElement> afterdeselect = s1.getAllSelectedOptions();
		for(WebElement deselect:afterdeselect) {
			System.out.println( deselect.getText());
		}
		
	}

}
