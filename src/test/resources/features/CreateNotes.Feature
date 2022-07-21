@regression
Feature:POS Manager should be able to create notes

  Background:
    Given User is logged in with valid credentials
    And user is in "Notes" module

    Scenario: Verify that the user can create new note
      Then
