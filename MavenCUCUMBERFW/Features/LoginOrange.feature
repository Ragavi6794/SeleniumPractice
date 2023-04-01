@Login
Feature: This is the login feature for OrangeHrm

#it have common both cases at scenarios its run every scenario
Background: 
Given User go to the link OrangeHrm login  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"  

@Smoke    #OR Condition
Scenario: Positive Login Scenario
#Given User go to the link OrangeHrm login  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"  
When User enter the valid username and password into the login page 
And User click on the Login button 
Then User should be login its navigate to home page


   #AND Condition
# Negative test case fail
@Regression 
Scenario: Negative Login Scenario
#"Admin1","admin" passed throuh parameters
#Given User go to the link OrangeHrm  login  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enter the invalid username "Admin1" and password "admin" into the login page 
And User click on the Login button 
But User should not be login 