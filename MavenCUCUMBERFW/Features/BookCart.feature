

#https://bookcart.azurewebsites.net/


@BookCart
Feature: Go to Registeration
Scenario: Enter Register details
Given User go to the url "https://bookcart.azurewebsites.net/register"
When User enter all details in fields
     |Ragavi|
     |M     |
     |Vikneshwara|
     |Ragavi94|
     |Ragavi94|
     
 And user click on the Register button 
 Then user navigated to login page
     
     
