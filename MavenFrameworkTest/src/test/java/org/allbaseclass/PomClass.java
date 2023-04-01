package org.allbaseclass;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomClass {
      public static WebDriver driver;
      public static Alert a;
      public static Actions ac;
      public static Select s;
      public static Robot r;
      public static JavascriptExecutor js;
      public static TakesScreenshot tk;
      
    
      //launch ChromeBrowsers
      public static void chromeBrowser() {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
//    	  get("https://www.letcode.in/frame");
      }
      //Firfox Browser
      public static void fireFoxBrowser() {
    	  WebDriverManager.firefoxdriver().setup();
    	  driver=new FirefoxDriver();
   
    	  
      }
      //ie driver
      public static void internetExplorer() {
    	  WebDriverManager.iedriver().setup();
    	  driver=new InternetExplorerDriver();
      }
      //WebDriver Methods
      //get Url
      public static void get(String Url) {
    	  driver.get(Url);
      }
      public static void title(String Text) {
    	  String title = driver.getTitle();
    	  System.out.println("Title:" +title);
      }
      
      
      
      
      
      
  
      
      public static void main(String[] args) {
//    	  PomClass pc=new PomClass();  
 //static methods run without object creation 
 //non static methods run only with object creation
    	 chromeBrowser();
    	
      }
}
