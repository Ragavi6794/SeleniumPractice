package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinitions extends BaseClass {
	WebDriver driver;
	@Given("User Go to the {string} login url")
	public void user_Go_to_the_login_url(String string) {
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
	}

	@When("User enter the invalid username and invalid password")
	public void user_enter_the_invalid_username_and_invalid_password() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("ragavi@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
       password.sendKeys("ragavi");
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("User should be invalid credentials page")
	public void user_should_be_invalid_credentials_page() {
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("privacy_mutation_token")) {
			System.out.println("User in Invalid Credential Page");
		}
		else {
			System.out.println("User is not invalid Credential Page");
		}
	}


}
