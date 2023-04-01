package org.baseclassinterface;


import java.io.IOException;
import java.util.Set;

import org.allbaseclass.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleClass extends BaseClass {
	@Test
        void search() throws InterruptedException, IOException {
		setUpChrome("https://www.google.com/");
		WebElement search = findBy("name","q");
		//WebElement search = element("name","q");
		search.sendKeys("selenium"+Keys.ENTER);
        
		
		scrollToDown();
		Thread.sleep(2000);
		scrollToTop();
		screenShot("./screen.png");
	}
	
}