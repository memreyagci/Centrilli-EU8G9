@CNTR-431
Feature:POS Manager should be able to create Notes

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user already logged in page

  @CNTR-430
    Scenario: Verify that the user can create new note
      When User clicks Notes button
      And User clicks on Create button
      And User selects Tags to Notes
      And User clicks on save button
      Then Note created message appears
  @CNTR-432
    Scenario: Verify that the user can switch Kanban-List view
      When User clicks Notes button
      And User clicks Kanban button
      Then User clicks List button
  @CNTR-433
    Scenario: Verify that the user can discard changes
      When User clicks Notes button
      And User clicks on Create button
      And User selects Tags to Notes
      And User clicks Discard button
      Then Verify user can discard notes
  @CNTR-434
      Scenario: Verify that the user can edit notes
        When User clicks Notes button
        And User selects one of the created Notes from list in Notes
        And User clicks Edit button
        And User clicks on save button
        Then Verify User can edited notes
  @CNTR-435
      Scenario: Verify that the user can delete notes
        When User clicks Notes button
        And User selects one of the created Notes from list in Notes
        And User clicks action button
        Then Verify User deleted selected notes





