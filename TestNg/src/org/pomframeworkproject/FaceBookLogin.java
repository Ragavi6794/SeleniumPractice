package org.pomframeworkproject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookLogin {

	//DataProvider used to passed multiple values to the chrome browser
	//Based on login testcases Scenario
	@DataProvider(name="login")
	public String[][] getData() throws InterruptedException {
		String[][] data=new String[4][2];
		//1=>Scenario correct emailid and password
		data[0][0]="ragavi6794@gmail.com";
		data[0][1]="7402050943";
		Thread.sleep(2000);
		//1=>Scenario wronng emailid and correct password
		data[1][0]="ragavi@gmail.com";
		data[1][1]="7402050943";
		Thread.sleep(2000);
		//1=>Scenario correct emailid and wrong password
		data[2][0]="ragavi6794@gmail.com";
		data[2][1]="raga";
		Thread.sleep(2000);
		//1=>Scenario wrong emailid and password
		data[3][0]="ragavi@gmail.com";
		data[3][1]="749";
		Thread.sleep(2000);
		
		return data;
		
	}
//dataProvider is test annotation Attribute	
@Test(dataProvider="login")
//it consider as 0 and 1 index
public void Login(String email,String pass) throws InterruptedException  {
	
	PomClass.chromeBrowser();
	PomClass.getUrl("https://www.facebook.com/");
	
	//get driver and locators from PomClass
	PageFactory.initElements(PomClass.driver, PomClass.class); 
	PomClass.email.sendKeys(email);
	PomClass.password.sendKeys(pass);
	PomClass.login.click();
	//Thread.sleep(3000);
	
	
}
	

}
