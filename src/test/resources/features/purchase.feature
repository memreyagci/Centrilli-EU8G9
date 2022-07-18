Feature: New  Vendor Bill

  User story:
  As a POS Manager I should be able to create  Incoming Product

  Background: User is logged in and in Purchase page
    Given user is already logged in
    And user is in Purchase page
    And user clicks Vendor Bill under Control

  Scenario: Verify that the user can create new  Vendor Bill
    When user clicks Create button in Vendor Bill
    And user enters Vendor name
    And user clicks Save button in Vendor Bill
    Then user should be able to see expected Draft Bill title


