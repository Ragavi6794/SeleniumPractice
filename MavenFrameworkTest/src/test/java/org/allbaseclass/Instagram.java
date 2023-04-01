package org.allbaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Instagram extends BaseClass {
@Test
	public void main() throws InterruptedException {
		
	   setUpChrome("https://www.instagram.com/");
		//waits
		
          //webElemets locator
		WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        //sendkeys value
		sendkey(username, "ragavi6794@gmail.com");
		sendkey(password, "ragavi");
		click(login);

	}

}
