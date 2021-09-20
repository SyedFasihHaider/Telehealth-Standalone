Feature: Login


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
      | Username | Password |
      | weqw     | sadasd   |