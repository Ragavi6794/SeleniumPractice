package org.pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;  //pagefactory

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomClass {
	public static WebDriver driver;
	
	public static void ChromeBrowser() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(co);
	}

	public static void FirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();

	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	//PageFactory Annotation for replace find element
	//findelement replaced it find username path and it returns webelement
	//username
	@FindBy(id="email")
	public static WebElement username;
	
	//password
	@FindBy(id="pass")
    public static WebElement password;	
	
	//login
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;
	
	
}
