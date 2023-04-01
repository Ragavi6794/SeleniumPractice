package org.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\splpt777\\Desktop\\Javaprogram\\Selenium\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();  

		//get the button position
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("Position of X " +x);
		System.out.println("Position of Y " +y);

		//Find the color of Button while changing color on hover time
		WebElement color = driver.findElement(By.id("j_idt88:j_idt100"));
		String cssValue = color.getCssValue("background-color");
		System.out.println("Get Css Value:" +cssValue);
		Thread.sleep(2000);
		//after hovering
		WebElement hover = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions a=new Actions(driver);
		a.moveToElement(hover).build().perform();
		String afterhover = hover.getCssValue("background-color");
		System.out.println("After hovering:" +afterhover);
		Thread.sleep(2000);


		//Find the button height and width
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Button Size" +height   +width);

		//is Button disabled or not
		WebElement disabled = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean buttonenabled = disabled.isEnabled();
		System.out.println("Button is Enabled" +buttonenabled);   //false

		//click image button
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();  //click then view on image

		//Click the button
		WebElement button = driver.findElement(By.xpath("//span[text()='Click']"));
		button.click();
	}

}
