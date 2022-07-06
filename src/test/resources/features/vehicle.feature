@CNTR-345
Feature: Centrilli application create a new vehicle  feature
  User Story: As a user, I should be able to create a new vehicle model
  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is already logged in
    Given user clicks fleet module

  @CNTR-344
    Scenario: USER can create a new "Vehicle Model"
      When user clicks Vehicle Module
      And user clicks Create
      And user enter Model
      And user enter Make
      And user clicks save

      Then new vehicle module created
  @CNTR-348
  Scenario: USER sees the error message ("The following fields are invalid: ") if "Make" is empty
    When user clicks Vehicle Module
    And user clicks Create
    And user enter Model
    And user clicks save

   Then Make fields is highlighted

@CNTR-350
  Scenario: USER sees the error message ("The following fields are invalid: ") if "Model" is empty
    When user clicks Vehicle Module
    And user clicks Create
    And user enter Make
    And user clicks save

    Then Model fields is highlighted
