Feature: Call Logs
  
  Given the user is on the Telehealth Home Page

  Scenario: User Clicks on the Logs under the Administration Tab
    When the user Lands on the Home Page
    And the user clicks on the Adminstration Panel
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
    * the user will be able to see the From Date/Time Filter
    * the user will be able to see the To Date/Time Filter
    * the user will be able to see the Clear Button to clears the Filters
    * the user will be able to see the Search Button
    * the user will be able to see the Showing records
    * the user will be able to see the Pagination window
    * the user will be able to see the Show items on the right Bottm

  Scenario: User Clicks on the Call type ToolTip
    When the user clicks on the Call type Tool Tip
    Then the user will be able to see the Group Call with Group Call icon
    And the user will be able to see the Peer to Peer Audio Call and Peer with Audio icon
    And the user will be able to see the Peer to Peer Video Call and Peer with Video icon

  Scenario: By Default Pagination
    When the user Lands on the Calls logs Page
    Then the user will be able to see the Default Pagiantion which is set to 10
    And the user will be able to see the Records Showing on the Page

  Scenario: User Changes the Default Pagination to some other numbers
    When the user lands on the Call Logs Page
    And the user clicks on the Show Records Drop Down
    And the user selects the Paginations limit
    And the user selects the 25 Items per page
    Then there will be 25 items on the page

  Scenario: User Goes to the second page
    When the user lands on the Calls logs Page
    And the user goes to the next page of the logs
    Then the user will be able to see the records

  Scenario: User Clicks on the Call type Filter
    When the user Lands on the Call logs
    And the user clicks on the Call Type Filter
    Then the user will be able to see the Call Type values

  #Group Call
  #Peer to Peer Call
  Scenario: User selects the Peer to Peer Call Filter
    When the user lands on the Call Logs
    And the user clicks on the Call type Filter
    And the user selects the Peer to Peer Call Filter
    Then the user will be able to see the Peer to Peer type results

  Scenario: User selects the Group Call Filter
    When the user lands on the Call Logs
    And the user clicks on the Call type Filter
    And the user selects the Group Call Filter
    Then the user will be able to see the Group Call type results

  Scenario: User First Selects Peer to Peer and then Group Call filter
    When the user Lands on the Call logs
    And the user clicks on the Call Type Filter and selects the Peer to Peer Call type
    And the user will be able to see the Peer Peer call type results
    Then the user clicks on the Call type filter and now selects the Group Call type
    And now the user will be able to see the Group Call type results

  Scenario Outline: User Enter the Name to Search in the Call logs
    When the user lands on the Calls logs
    And the user enters the <Name> to search from the Logs
    And the user clicks on the Search Button
    Then the user will be able too see the records with the Name searched

    Examples: 
      | Name  |
      | Fasih |

  Scenario Outline: User Enter any irrelevant data to search in the Calls logs
    When the user lands on the Calls Logs
    And the user enters the <Data> to search from the Logs
    And the user clicks on the search button
    Then with irrelevant data, user will not be able to see any irrelevant data
    And there is no error on the UI

    Examples: 
      | Data                                                             |
      | ;	e)  Video-7 Enhanced Graphics Adapter (CGA, EGA, or HMGC mode) |

  Scenario Outline: User enters the From Date/Time
    When the user Lands on the Calls Logs
    And the user selects the From <Date Time>
    And clicks on the Search button
    Then all the records From that specific Date and Time will be shown

    Examples: 
      | Date Time           |
      | 10/04/2021 08:30 AM |

  Scenario Outline: User enters the TO Date/Time
    When the user Lands on the Calls Logs
    And the user selects the To <Date Time>
    And clicks on the Search button
    Then all the records To that specific Date and Time will be shown

    Examples: 
      | Data Time           |
      | 10/04/2021 08:30 PM |
