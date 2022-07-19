@regression
Feature: new Vehicles Fuel Logs
  Verify that USER can create new Vehicles Fuel Logs

  Background:
    Given user logged in with valid credentials

  Scenario: User can create new Vehicles Fuel Logs
    When user clicks Fleet module
    And user clicks Vehicles Fuel Logs
    And user clicks Create button
    And user selects one of created vehicles
    And user clicks save button
    Then user verify that created model is displayed

  Scenario: User can not create new Vehicles Fuel Logs without selecting any option
    When user clicks Fleet module
    And user clicks Vehicles Fuel Logs
    And user clicks Create button
    And user clicks save button
    Then user verify that error message is displayed