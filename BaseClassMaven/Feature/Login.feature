Feature: To Validate login functionality in facebook application

  Scenario: To Validate login using invalid username and invalid password
    Given User Go to the "www.facebook.com" login url
    When User enter the invalid username and invalid password
    And User click on the login button
    Then User should be invalid credentials page
