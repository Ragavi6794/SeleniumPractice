package org.pomframework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PomSubClass  {
	//Without @FindBy and findElement method we can give directly id or name through static webElement Methods Variable

	//public static WebElement email;  //id="email"
	//public static WebElement pass;
	//PageFactory.initElements(PomClass.driver, PomSubClass.class);
		//email.sendKeys("ragavi");
	
    //pom framework
	@Test
	public void facebookLogin() {  //page Object model without main method
		 
		PomClass.ChromeBrowser();
		PomClass.getUrl("https://www.facebook.com/");
		
		//2=> method use PageFactory
		//driver
		PageFactory.initElements(PomClass.driver, PomClass.class);
		PomClass.username.sendKeys("ragavi");
		PomClass.password.sendKeys("ragavi123");
		PomClass.login.click();
		
		
//		driver.findElement(By.id("email")).sendKeys("ragavi");
//		driver.findElement(By.id("pass")).sendKeys("ragavi123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
