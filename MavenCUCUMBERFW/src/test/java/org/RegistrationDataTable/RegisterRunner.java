package org.RegistrationDataTable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/BookCart.feature",glue="org.RegistrationDataTable",monochrome=true,
                  plugin= {"pretty","html:target/Registration.html","json:target/Registration.json","html:target/RegisterReport",
                		  "junit:target/Registeration.xml"})
public class RegisterRunner {

}
