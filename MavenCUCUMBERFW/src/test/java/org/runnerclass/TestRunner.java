package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features",glue="org.stepdefinitions",
                 plugin= {"pretty","html:Report/CucumberReport.html","json:Report/Cucumber.json","junit:Report/Cucumber.xml"},
                 monochrome=true)
//                tags= "@Login")
                // tags= "@Regression and @Smoke" )
//"pretty","html:Report/CucumberReport.html","json:Report/Cucumber.json","junit:Report/Cucumber.xml",


public class TestRunner {

}

//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//Chrome Options
//==============
//plugin= {"pretty","html:target/Cucumber.html"}

//dryRun=true   =>it only check feature file method are properly implemented or not

//strict=true   =>its check after running feature file methods missing or not

//monochrome=true  =>it remove unwanted character

// snippets=SnippetType.CAMELCASE  =>it remove the _ charcter in methods

//tags="@Regression"          =>it execute only this tags scenario
// tags= "@Regression or @Smoke"  =>it execute OR condition like all scenario
// tags= "@Regression and @Smoke"  =>it execute scenrio which have both tags scenario
//tags="~@Regression"         =>it skip the particular scenario in feature file






//Data  Table

//multiple data can be passed through datathrough at single scenario using Datatable with pipeline in future file
//get table data use get(0)  =>get index based 
//List<String> data=signup.asList(String.class);
//sendKeys(data.get(0));
//sendKeys(data.get(1));

