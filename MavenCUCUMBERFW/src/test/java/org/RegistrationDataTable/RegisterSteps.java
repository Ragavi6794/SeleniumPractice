package org.RegistrationDataTable;

import java.util.List;

import org.mainbase.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass {
	@Given("User go to the url {string}")
	public void user_go_to_the_url(String Url) {
		setUpChrome(Url);
	   
	}

	@When("User enter all details in fields")
	public void user_enter_all_details_in_fields(DataTable data) throws InterruptedException {
	 List<String> register = data.asList(String.class);
	 String fname = register.get(0);
	 String lname = register.get(1);
	 String uname = register.get(2);
	 String pass  = register.get(3);
	 String cpass = register.get(4);
	 
	 findBy("id", "mat-input-0").sendKeys(fname);
	 findBy("id","mat-input-1").sendKeys(lname);
	 findBy("id", "mat-input-2").sendKeys(uname);
	 findBy("id","mat-input-3").sendKeys(pass);
	 findBy("id", "mat-input-4").sendKeys(cpass);
	 findBy("xpath","//*[@id=\"mat-radio-3\"]/label/span[1]/span[2]").click();
	 Thread.sleep(3000);
	}

	@When("user click on the Register button")
	public void user_click_on_the_register_button() throws InterruptedException {
	   findBy("xpath","//span[text()=\"Register\"]").click();
	   Thread.sleep(3000);
	   
	}

	@Then("user navigated to login page")
	public void user_navigated_to_login_page() {
	  String textUrl = getCurrentUrl();
	  if(textUrl.contains("login")) {
		  System.out.println("User Registeration Successfully");
	  }
	  else {
		  System.out.println("User Registeration Failed");
	  }
	}



}
