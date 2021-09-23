Feature: Login

  Scenario: Items should be available on the Login Page
    When the user lands on the Login Page
    Then the user should be able to see the Persivia Telehealth Logo
    And the user should be able to Login into the Standalone Credentials
    * the user should be able to Login via CareSpace

  # * the user should be able to Login via CM Portal
  Scenario: Login with correct credentials
    Given The user navigate to login page
    When The user enters <Username> and <Password>
    And Click on the login button
    Then The user will nevigate to the home page

  Scenario Outline: Login with incorrect credentials
    Given User navigates to login page
    When User enters <Username> and <Password>
    And User click on the login button
    Then The user will see the authentication message

    Examples: 
      | Username      | Password |
      | XYz@gmail.com | Fasih    |
      
   Scenario: User Clicks on the Cancel button 
   	When the user clicks on the Login via Carespace button
   	And enters the <Username> and <Password>
   	And clicks on the Cancel button
   	Then the user will not be logged into the Telehealth
   	And user will be navigated back to the Main login page 
   
