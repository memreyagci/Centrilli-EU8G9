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
    And user clicks "Save" button
    Then user should be able to see expected Draft Bill title




