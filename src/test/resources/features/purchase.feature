@1907
Feature: POS Manager should be able to create new PURCHASE - Vendor Bill

  User story:
  As a POS Manager I should be able to create  Incoming Product

  Background: User is logged in and in Purchase page
    Given User is logged in with valid credentials
    And user is in "Purchase" module
    And user is in "Vendor Bills" submenu


  Scenario: Verify that the user can create new  Vendor Bill
    When user clicks "Create" button
    And user enters Vendor name
    And user clicks Save button
    Then user sees expected Draft Bill title


  Scenario: Verify that the user can switch Kanban-List view
    When user clicks Kanban button
    Then user can switch Kanban view
    And user clicks List button
    Then user can switch List view


  Scenario: Verify that the user can discard changes
    When user clicks "Create" button
    And user enters Vendor name
    And user clicks "Discard" button
    Then user returns Vendor Bills page


  Scenario:Verify that the user can edit Vendor Bill
    When user clicks "Create" button
    And user enters Vendor name
    And user clicks Save button
    When user clicks "Edit" button
    And user changes Vendor name
    And user clicks Save button
    Then Vendor name changes


  Scenario:Verify that the user can delete Vendor Bill
    When user clicks "Create" button
    And user enters Vendor name
    And user clicks Save button
    When user deletes Vendor Bill
    Then Vendor Bills is deleted


    Scenario: Verify that user can not create Vendor Bill without Vendor name
      When user clicks "Create" button
      And user clicks Save button
      Then The following fields are invalid message is displayed


