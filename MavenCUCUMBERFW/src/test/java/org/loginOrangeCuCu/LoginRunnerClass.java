package org.loginOrangeCuCu;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(features="Features/LoginOrange.feature",
                glue= {"org.loginOrangeCuCu","org.hooks"},dryRun=false,
                monochrome=true,   //its remove junk cahracters in output
                snippets=SnippetType.CAMELCASE,  //it remove the _ charcter in methods
                plugin= {"pretty","html:target/loginOrange.html"})
public class LoginRunnerClass {

}
