@CNTR-410
Feature:POS Manager should be able to create CRM/CUSTOMER


  Background: Customer precondition
    Given User is logged in with valid credentials
    And user is in "CRM" module
    And user is in "Customers" submenu

@CNTR-405
  Scenario: Verify that the user can create new CUSTOMER
    When user clicks "Create" button
    And user provides new customer name
    When user clicks "Save" button
    Then Contact created message is displayed

@CNTR-406
  Scenario: Verify that the user can switch Kanban-List view
    When user clicks List button in CRM_Customer
    Then customers are displayed as list
    When user clicks Kanban button in CRM_Customer
    Then customers are displayed as grid

@CNTR-407
  Scenario: Verify that the user can discard changes
    When user clicks "Create" button
    And user provides new customer name
    When user clicks "Discard" button
    And Warning message is displayed
    When user clicks "Ok" button
    And user searches the customer name on the search box
    Then customer is listed in the search result

@CNTR-408
  Scenario: Verify that the user can edit CUSTOMER
    When user selects a customer
    And user clicks "Edit" button
    And user provides new customer name
    And user enters "Blumen str" as street name
    Then user clicks "Save" button
    And Contact created message is displayed

@CNTR-409
  Scenario: Verify that the user can delete CUSTOMER
    When user selects a customer
    And user clicks "Action" button
    And user selects delete from dropdown
    And confirmation message is displayed
    When user clicks "Ok" button







    
    