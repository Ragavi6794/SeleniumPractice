package org.pomframework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Facebook extends PomFrameWork{
   @Test
	public static void loginFB() {
	setUpChrome("https://www.facebook.com/");
	
	//when we create object the constructor will be automatically called without method calling
	PomFrameWork pm=new PomFrameWork();
	WebElement email = pm.getEmail();
	sendkeys(email,"ragavi@gmail.com");
	
	WebElement password =pm.getPassword();
	sendkeys(password,"ragavi6794");
	
	WebElement login = pm.getLogin();
	login.click();
   }
	
}
