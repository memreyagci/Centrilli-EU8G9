@CNTR-363
Feature: Centrilli application calendar feature

  User Story: As a user, I should be able to create and edit events in "Calendar" module

  Background: For the scenarios in the feature files, user is expected to be on log in page
    #@CNTR-362
    Given user is already logged in
    Given user clicks calendar module in navigation bar

  @CNTR-356
  Scenario: User lands on weekly display by default
    Then user should be on weekly calendar display

  @CNTR-357
  Scenario: User changes the display to daily display
    When user clicks day button
    Then user should be on daily calendar display

  @CNTR-358
  Scenario: User changes the display to weekly display
    When user clicks week button
    Then user should be on weekly calendar display

  @CNTR-359
  Scenario: User changes the display to monthly display
    When user clicks month button
    Then user should be on monthly calendar display

  @CNTR-360
  Scenario: User can create event by clicking on time box
    When user clicks any time box
    And user enters summary of the event
    And user clicks create button
    Then user should be able to see the event created

  @CNTR-361
  Scenario: User can edit a created event
    When user clicks created event on calendar
    And user clicks edit button
    And user changes meeting subject
    And user changes meeting starting date
    Then user should be able to click save button
