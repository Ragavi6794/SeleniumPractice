package org.pomAmazon;

import java.io.IOException;

import org.openqa.selenium.WebElement;
public class AmazonClass extends PomFrameWork {

	public static void main(String args[]) throws IOException, InterruptedException {
		setUpChrome("https://www.amazon.in/");
		 PomFrameWork pm=new PomFrameWork();
		 
		 WebElement search = pm.getSearch();
		 sendkeys(search,"Baby dress");
		 
		 pm.getIcon().click();
		
		 WebElement dress = pm.getDress();
		  Thread.sleep(2000);
		 scrollDown(dress);  //js Executor
		 dress.click();
		 
		 childWindow();  //window handling 
		 
		 WebElement addToCart = pm.getAddToCart();
		 scrollDown(addToCart); //js Executor
		 addToCart.click();
		 
		 screenShot("./screenshot/babydress.png");
		 
	}
}
