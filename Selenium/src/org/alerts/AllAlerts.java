package org.alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//alert is simple popup box
	//simple alert 
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Alert simple = driver.switchTo().alert(); 
		Thread.sleep(2000);                        //handle alert
		System.out.println(simple.getText());    //print text in alert
		simple.accept();                         //accept alert box ok
		
		//confirmbox alert
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		Alert con = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(con.getText());
		con.dismiss();                           //dismiss alert box cancel
		
		//prompt box
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		Alert prompt = driver.switchTo().alert();        //prompt box alert
		Thread.sleep(2000);
		prompt.sendKeys("Vikneshwaraa");                //sendkeys values to prompt box
		System.out.println(prompt.getText());
		prompt.accept();                                //accept 
		
		//modalbox can be inspectable no use of alert
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]")).click();       //click open modal
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();//modal box click to dismiss button
		
		//handled close with sweetalert
		
		driver.findElement(By.id("j_idt88:j_idt100")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a")).submit();
		Thread.sleep(2000);
		
		//modal sweet alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();  //sweet alert can be inspectable
		driver.findElement(By.id("j_idt88:j_idt108")).click();
	
		
		
	}

}
