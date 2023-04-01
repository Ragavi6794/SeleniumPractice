package org.pomframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;


public class Facebook extends PomFrameWork{
  
	public static void main(String[] args) throws InterruptedException {
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");
		//waits
		implicitWait(2000, TimeUnit.SECONDS);
		maximize();
		
	PomFrameWork pm=new PomFrameWork();
	
	WebElement email = pm.getEmail();
	Thread.sleep(2000);
	sendkey(email,"ragavi@gmail.com");
	
	WebElement password =pm.getPassword();
	sendkey(password,"ragavi6794");
	
	WebElement login = pm.getLogin();
	login.click();
   }
	
}
