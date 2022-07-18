
Feature: Sales functionality
  User Story :
  As a POS Manager I should be able to create Repair Order

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the home page and on repair option

  Scenario: Verify that the user can create new  Repair Order
    When User click's create button in repair
    And User chooses a product to repair
    And User click's save in repair
    Then Verify user created repair order


  Scenario: Verify that the user can switch Kanban-List view
    When User click's kanban button in repair
    Then verify user sees kanban grafic
    And User click's list button in repair
    Then Verify user sees list


  Scenario: Verify that the user can discard changes
    When User click's create button in repair
    Then Verify that user can discard


  Scenario: Verify that the user can edit Repair Order
    When User chooses a product from created list in repair
    And User click's Edit button in repair
    And User click's Save button in repair
    Then Verify user sees edited page in repair


  Scenario: Verify that the user can delete Repair Order
    When User click's chosen products radio button in repair
    And User click's Delete in repair
    Then Verify chosen product deleted
