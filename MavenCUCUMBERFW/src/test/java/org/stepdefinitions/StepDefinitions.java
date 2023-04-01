package org.stepdefinitions;

import org.mainbase.BaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions extends BaseClass{

	@Given("User is entering www.google.co.in")
	public void user_is_entering_www_google_co_in() {
	 setUpChrome("https://www.google.com/");

	   
	}

	@When("User is entering for search something  like that {string}")
	public void user_is_entering_for_search_something_like_that(String string) {
		findBy("name","q").sendKeys("Cucumber");	   
	}

	@When("aftet User is enter that search icon")
	public void aftet_User_is_enter_that_search_icon() {
		 findBy("name","q").sendKeys(Keys.ENTER);
	    
		
	}

	@Then("The User should be get that result about Selenium")
	public void the_User_should_be_get_that_result_about_Selenium() {
	    String title = driver.getTitle();
	    if(title.contains("Google")) {
	    	System.out.println("Selenium is Displayed");
	    }
	    else {
	    	System.out.println("Not Displayed");
	    }
	   
	}

}
