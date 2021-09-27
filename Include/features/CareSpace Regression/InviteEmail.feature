Feature: Invite Email
  
  Given the user is on the Telehealth Home Page

  Scenario: Invite via Email Pop- up Verification
    When the provider clicks on the Invite Option
    Then the user will be able to select the Invite via Email option
    And the user will be able to see the Invite Via Email Text and Email icon on the Pop-up
    * the user will be able to see the Patient email address Heading and Patient Email address field
    * the user will be able to see the Message Heading and Message body which includes the Template of the Email
    * the user will be able to see the Choose language Heading and able to select other Language through drop down in Invite Email
    * by default english will be selected as Language in Invite Email
    * the user will be able to see the Send Email Button
    * the user will be able to see the Cancel Button

  Scenario Outline: Invite via Email with valid Email Address
    When the user opens the Email invite option
    And the user enters the valid <Email> address
    And the user clicks on the Send Email Button
    Then the email will be sent to the respective email address
    And there will be a Sucessful message will be shown on the top

    Examples: 
      | Email                 |
      | fasih.haider@sltn.net |

  Scenario Outline: Invite via email with invalid Email Address
    When the provider clicked on the on the invite option and open the Email Invite
    And the user enters the invalid <Email> address
    And the system will analyse the email address
    Then the system will generate an error under the Email field

    Examples: 
      | Email   |
      | abc.com |

  Scenario: Invite via Email Template without Passcode
    When the user opens the Email invite
    And the user will see the Email Template in the Email Body
    And there will be no passcode in the Email Body

  #Scenario: Invite via Email Template with Passcode
   # When the user clicks on the Email Invite
   # And the user will be able to see the Email Template
   # And there will be a passcode in the Email Template
