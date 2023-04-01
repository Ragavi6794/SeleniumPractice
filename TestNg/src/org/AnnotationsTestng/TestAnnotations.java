package org.AnnotationsTestng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestAnnotations {
	@BeforeSuite           //first happen
	public void amazon() {
		System.out.println("launch browser");
	}
	@AfterClass  
	public void list() {
		System.out.println("related product list");
	}
    @BeforeTest
    public void amazonurl() {
    	System.out.println("Amazon Url print");
    }
    @BeforeMethod
    public void searchMobile() {
    	System.out.println("Search mobile Product");
    }
	@Test
	public void serach() {
		System.out.println("Entry search text");
	}
	@AfterMethod
	public void click()
	{
		System.out.println("Click ");
	}
	@AfterSuite //last happen
	public void enter() {
		System.out.println("Enter button");
	}
  
 
}
