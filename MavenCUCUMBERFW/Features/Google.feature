#@Google
#Feature: Test Google Application Functionality
#
  #@Google @Smoke @Sanity @Module
  #Scenario Outline: Test Google Home Page functionality
    #Given The user has opened "Chrome" browser
    #When User enters "https://www.google.co.in" application
    #Then User asserts that the page title is "Google"
#
    #Examples: 
      #| application              |
      #| https://www.google.co.in |
      @Google
Feature: Open Google.com  to search 
@Regression
Scenario: Search something in google it comes correct result
Given User is entering www.google.co.in
When User is entering for search something  like that "Selenium"
And aftet User is enter that search icon 
Then The User should be get that result about Selenium 
      