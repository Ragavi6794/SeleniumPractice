package org.hooks;

import org.mainbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginHooks extends BaseClass{

	@Before      //hooks
	public void setUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Chrome Opened");
		
	//chrome 
	}
		
    @Before("@Regression")  //taggedHooks
		private void sysout() {
		System.out.println("Negative Scenario");

		}
		
    @After
    public void closeBrowser() throws InterruptedException {
    	Thread.sleep(2000);
    	close();
}
}