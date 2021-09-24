Feature: Invite SMS
  
  Given the user is on the Telehealth Home Page

  Scenario: Invite via SMS Pop- up Verification
    When the user clicks on the Invite Option
    Then the user will be able to select the Invite via SMS option
    And the user will be able to see the Invite Via SMS Text and SMS icon on the Pop-up
    * the user will be able to see the Patient Mobile Number Heading and Patient Mobile Number field
    * the user will be able to see the Message Heading and Message body which includes the Template of the SMS
    #* the user will be able to see the Choose language Heading and able to select other Language through drop down
    #* by default english will be selected as Language
    * the user will be able to see the Send SMS Button
    * the user will be able to see the Cancel Button to close the SMS Pop-Up

  Scenario Outline: Invite via SMS with valid Mobile Number
    When the user opens the SMS invite option
    And the user enters the valid mobile <Number>
    And the user clicks on the Send SMS Button
    Then the SMS will be sent to the respective mobile number
    And there will be a Sucessful message will be shown on the top After send button is pressed

    Examples: 
      | Number        |
      | +1 9294154089 |

  Scenario Outline: Invite via SMS with invalid Mobile Number
    When the provider clicked on the on the invite option and open the SMS Invite
    And the user enters the invalid mobile <Number>
    And the system will analyse the mobile number
    Then the system will generate an error under the Mobile Number field

    Examples: 
      | Number    |
      | +1 929415 |

  Scenario: Invite via SMS Template without Passcode
    When the user opens the SMS invite
    And the user will see the SMS Template in the SMS Body
    And there will be no passcode in the SMS Body

  #Scenario: Invite via SMS Template with Passcode
   # When the user clicks on the SMS Invite
   # And the user will be able to see the SMS Template
   # And there will be a passcode in the SMS Template
