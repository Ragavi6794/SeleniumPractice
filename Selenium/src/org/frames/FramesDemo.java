package org.frames;
import java.awt.Frame;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
//frames
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letcode.in/frame");
		driver.manage().window().maximize();
		//how to handle the frame  =>its overloading example in selenium 
		driver.switchTo().frame(0);                      //index based frame

//driver.switchTo().frame("firstFr")  ;                //id frame  based

//		WebElement frameElement = driver.findElement(By.id("firstFr"));
//		driver.switchTo().frame(frameElement);          //webelement based

		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("ragavi");
		driver.findElement(By.cssSelector("[name='lname'")).sendKeys("M");
		//      it handle inner frames   
//  driver.switchTo().frame(0).switchTo().frame(0);  //it handle inner frames
		WebElement frame2 = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe")); //webelement find iframes
		driver.switchTo().frame(frame2); 

		driver.findElement(By.cssSelector("[name='email']")).sendKeys("ragavi@gmail.com");

		//Again out from the inner frame so i can go for parent element
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("Vikneshwaran");  //change again name in parent iframe
		Thread.sleep(2000);
		
		//I count total iframes in Html document
	 List<WebElement> countFrameTags = driver.findElements(By.tagName("iframe")); //findelements
	 int size = countFrameTags.size();
	 System.out.println("Total Iframes:" +size);

		//I Go to Main Html
		driver.switchTo().defaultContent();  //its totally outer from the iframes to Main html
		driver.findElement(By.linkText("Watch tutorial")).click();  //click link
		driver.navigate().back();  //back to page
	}

}
