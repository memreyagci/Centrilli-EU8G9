@regression
@CNTR-369
Feature: User can create new Costs

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user already logged in page
  @CNTR-368
  Scenario: Create new Costs
    When user goes to fleet menu
    And user click to Vehicle Costs button
    And user is  on Vehicle Cost page
    And user click on Create button
    And  user selects any car the dropdown
    And user click on Save button
    Then  user should be able to created Vehicle Cost

  @CNTR-370
  Scenario: Fail to create new Vehicle Costs
    When user goes to fleet menu
    And user click to Vehicle Costs button
    And user is  on Vehicle Cost page
    And user click on Create button
    And user click on Save button
    Then Vehicle Cost is not created





