package org.pomframeworkproject.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomClass {

	public static WebDriver driver;
	
	public static void chromeBrowser() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void getUrl(String Url) {
		driver.get(Url);
	}
	
	//facebook locators using pageFactory
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="pass")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit]")
	public static WebElement login;
	
}
