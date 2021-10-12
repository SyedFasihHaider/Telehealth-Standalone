Feature: Call Logs
  
  Given the user is on the Telehealth Home Page

  Scenario: User Clicks on the Logs under the Administration Tab
    When the user clicks on the Adminstration Panel
    And the user clicks on the Logs options
    Then the user will be lands on the Call page

  Scenario: Default Logs Page under the Logs sections
    When the user lands on the Logs section
    Then the user will see the Default Calls Logs Page

  Scenario: Items Present On the Call logs Page
    When the user lands on the Call Logs Page
    Then the User will be able to See the Call logs Heading
    And the user will be able to see the Filter icon
    And Upon clicking on the Call type tooltip user will be able to see the Call types
    * the User will be able to see the Name Column
    * the user will be able to see the Date Column
    * the user will be able to see the Start Time Column
    * the user will be able to see the End Time Column
    * the user will be able to see the Duration Column
    * the user will be able to see the Call Type Filter
    * the user will be able to see the Name Field to search Specific Name from the Logs
    * the user will be able to see the From Date-Time Filter
    * the user will be able to see the To Date-Time Filter
    * the user will be able to see the Clear Button to clears the Filters
    * the user will be able to see the Search Button
    * the user will be able to see the Showing records
    * the user will be able to see the Pagination window
    * the user will be able to see the Show items on the right Bottom

  Scenario: User Clicks on the Call type ToolTip
    When the user clicks on the Call type Tool Tip
    Then the user will be able to see the Group Call with Group Call icon
    And the user will be able to see the Peer to Peer Audio Call and Peer with Audio icon
    And the user will be able to see the Peer to Peer Video Call and Peer with Video icon

  Scenario: By Default Pagination
    When the user Lands on the Calls logs Page
    Then the user will be able to see the Default Pagiantion which is set to 10
    And the user will be able to see the Records Showing on the Page

  Scenario: User Changes the Default Pagination to 25items Per Page
    When the provider lands on the Call Logs Page
    And the user clicks on the Show Records Drop Down
    And the user selects the 25 Items per page
    Then there will be 25 items on the page

    Scenario: User Changes the Default Pagination to 50Items Per Page
    When the Provider is Landed on the Call Logs Page
    And the user click on the Show Items Per Page DropDown
    And the user selects the 50 Items per page
    Then there will be 50 items on the page
    
    Scenario: User Changes the Default Pagination to 100Items Per Page
    When the Provider is Landed on the Call Logs Page to select the new Pagination
    And the user click on the Show Records Drop Down and selects 100items Per Page
    Then there will be 100 items on the page
    
    Scenario: User Changes the Default Pagination to 5Items Per Page
    When the user is Landed on the Call Logs Page to select the new Pagination
    And the user click on the Show Records Drop Down and selects 5items Per Page
    Then there will be 5 items on the page