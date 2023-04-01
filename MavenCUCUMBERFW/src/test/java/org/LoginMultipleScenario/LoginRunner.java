package org.LoginMultipleScenario;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/LoginScenarioOutline.feature",
                 glue="org.LoginMultipleScenario", monochrome=true,
                 plugin= {"pretty","html:target/LoginMultipleScenario.html"})

public class LoginRunner {

}
