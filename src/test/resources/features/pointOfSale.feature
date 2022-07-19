@CNTR-390
Feature: Point of Sale functionality

  User story:
  As a POS Manager I should be able to create  Point Of Sale

  Background: User is logged in and in Point of Sale page
    Given user is already logged in
    And user is in "Point of Sale" page
    And user clicks "Point of Sale" under Configuration

  @CNTR-384
  Scenario: Verify that the user can create new Point Of Sale
    When user clicks Create button in Point of Sale
    And user enters "Fast Spring" in name input field
    And user selects "Return Operations" under inventory
    And user clicks Save button in Point of Sale
    Then user should be able to see expected "Fast Spring" title

  @CNTR-385
  Scenario: Verify that the user can switch Kanban-List view
    When user clicks Kanban button in Point of Sale
    Then user should be able to see options in kanban board
    And user clicks List button in Point of Sale
    Then user should be able to see options in list

  @CNTR-386
  Scenario: Verify that the user can discard changes
    When user clicks Create button in Point of Sale
    And user enters "Fast Spring" in name input field
    And user clicks Discard button
    Then user should be able to return Point of Sale main page

  @CNTR-387
  Scenario: Verify that the user can edit Point Of Sale
    When user selects "Fast Spring" from list
    And user clicks Edit button in Point of Sale
    And user enters new name "Revel" in name input field
    And user selects "7yy" under inventory
    And user clicks Save button in Point of Sale
    Then user should be able to see expected "Revel" title and expected "7yy" operation type

  @CNTR-388
  Scenario: Verify user cannot create new Point of Sale without Point of Sale name
    When user clicks Create button in Point of Sale
    And user enters "Fast Spring" in name input field
    And user clicks Save button in Point of Sale
    Then user should be able to see error message

  @CNTR-389
  Scenario: Verify user cannot create new Point of Sale without Operation type
    When user clicks Create button in Point of Sale
    And user selects "Return Operations" under inventory
    And user clicks Save button in Point of Sale
    Then user should be able to see error message




