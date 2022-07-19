@regression
@CNTR-351
Feature:Vehicles Services Logs Test

  Background:
    Given User is logged in with valid credentials

  @CNTR-346
  Scenario: Create new Vehicles Services Logs.
    When User goes to Fleet menu
    And User clicks Vehicles Services Logs
    And User is on Vehicles Services Logs Page
    And User clicks Create Button
    And User selects one of the vehicles
    And User clicks save button
    Then Vehicle Service Log is created

  @CNTR-349
  Scenario: Fail to create new Vehicles Services Logs.
    When User goes to Fleet menu
    And User clicks Vehicles Services Logs
    And User is on Vehicles Services Logs Page
    And User clicks Create Button
    And User clicks save button
    Then Vehicle Service Log is not created








