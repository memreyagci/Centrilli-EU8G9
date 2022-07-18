@elle
Feature: Point of Sale functionality

  User story:
  As a POS Manager I should be able to create  Point Of Sale

  Background: User is logged in and in Point of Sale page
    Given user is already logged in
    And user is in "Point of Sale" page

  Scenario: Verify that the user can create new Point Of Sale
    When user clicks Point of Sale under Configuration
    And user clicks Create button in Point of Sale
    And user enters "Fast Spring" in name input field
    And user selects "Return Operations" under inventory
    Then user should be able to see expected "Fast Spring" in the header




