package org.stepdefinitions;




import org.pomframework.PomClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends PomClass {

	//Paramter passed through
	@Given("User go to the link OrangeHrm login  {string}")  //parameter passed
	public void user_go_to_the_link_orange_hrm_login(String url) {
	  setUpChrome(url);
	  
	}
     
	@When("User enter the valid username and password into the login page")
	public void user_enter_the_valid_username_and_password_into_the_login_page() {
//	findBy("name", "username").sendKeys("Admin");
//	findBy("name","password").sendKeys("admin123");
//  valid username and password
		pageFactory();
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	   
	}

	@When("User click on the Login button")
	public void user_click_on_the_login_button() throws InterruptedException {
		//click login button
		pageFactory();
		login.click();
		threads();
	}
   @AfterClass
	@Then("User should be login its navigate to home page")
	public void user_should_be_login_its_navigate_to_home_page() {
		String homePageUrl = driver.getCurrentUrl();
		if(homePageUrl.contains("dashboard")) {
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login failed");
		}
	    
	}
   
   //Paramter passed through
   @When("User enter the invalid username {string} and password {string} into the login page")
   public void user_enter_the_invalid_username_and_password_into_the_login_page(String userName, String passWord) {
	   pageFactory();
		username.sendKeys(userName);
		password.sendKeys(passWord);
   }
//   @When("User enter the invalid username and password into the login page")
//   public void user_enter_the_invalid_username_and_password_into_the_login_page() {
//	   pageFactory();
//		username.sendKeys(userName);
//		password.sendKeys(passWord);
//   }

   @When("User should not be login")
   public void user_should_not_be_login() {
	   String homePageUrl = driver.getCurrentUrl();
		if(homePageUrl.contains("dashboard")) {
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login failed");
		}
	    
   }




}
