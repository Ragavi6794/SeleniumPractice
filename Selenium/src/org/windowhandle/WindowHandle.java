package org.windowhandle;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandle {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.geckodriver.driver",  "C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\mozilawebdriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver(); //dynamicbinding
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/"); //it launch the url
		String Title = driver.getTitle();     //get title of website
		System.out.println("Title of Website:" +Title);

		driver.manage().window().maximize();
		//search path
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Oppo A57" +Keys.ENTER);    //send value of oppophone
		Thread.sleep(2000);

		//enter the search button
		//search.sendKeys(Keys.ENTER);

		JavascriptExecutor j=(JavascriptExecutor) driver;  //typecasting
		WebElement oppo = driver.findElement(By.xpath("//span[text()='Oppo A57 (Glowing Gold, 4GB RAM, 64 Storage) with No Cost EMI/Additional Exchange Offers']"));
		j.executeScript("arguments[0].scrollIntoView(true)", oppo); //scroll to oppo 
		Thread.sleep(2000);
		oppo.click();
		Thread.sleep(2000);
		//Now we have to handle window
		String windowHandle = driver.getWindowHandle();  //get current window alpha numeric value return in string
		System.out.println("Current Window Handle:" +windowHandle); //CDwindow-2E551622F6DD077A3A73990978921A23

		Set<String> windowHandles = driver.getWindowHandles();  //it handles all window get unique alpha numeric value
		System.out.println("All window Handle:" +windowHandles);//CDwindow-FB32A6B1C2F2D79352CC5269830DAD65

		for(String s:windowHandles) {               //it check equals to window handle code and window handles  code
			if(!s.equals(windowHandle)) {    //!CDwindow-2E551622F6DD077A3A73990978921A23 not equal to  CDwindow-FB32A6B1C2F2D79352CC5269830DAD65
				driver.switchTo().window(s);  //then go to CDwindow-FB32A6B1C2F2D79352CC5269830DAD65 => new window
			}
		}

		WebElement Addtocart = driver.findElement(By.id("add-to-cart-button"));
		j.executeScript("arguments[0].scrollIntoView(true)", Addtocart); //scrollto addtocart
		Addtocart.click();

		//teakescreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);  //get screenshot on to store src
		File des=new File("./amazon/oppo.png");          //copy to the file path
		FileUtils.copyFile(src, des);   
		Thread.sleep(4000);
        
		
	}

}


//driver.findElement(By.id("ap_email")).sendKeys("7402050943"); //go to signin page then emsil or phoneno
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("7402050943"); //go to signin page then give password
//		driver.findElement(By.id("auth-signin-button")).click();
//		driver.findElement(By.cssSelector("[name='rememberMe']")).click();

//String windowHandle2 = driver.getWindowHandle();
//Set<String> windowHandles2 = driver.getWindowHandles();ap_password
//for(String s1:windowHandles2) {
//	if(!s1.equals(windowHandle2)) {
//		driver.switchTo().window(s1);
//	}
//}
