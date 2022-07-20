@regression
@smoke
@CNTR-341
Feature: Employee Menu

  Background: Verify that user is logged in
    Given user is logged in as PosManager
    And user is in "Employees" module


  @CNTR-334
  Scenario: Verify that Create button works as expected
    When user clicks "Create" button
    Then employee creation page shows up


  @CNTR-335
  Scenario: Verify that Kanban button works as expected
    When user clicks Kanban button
    Then employees are listed as grid


  @CNTR-336
  Scenario: Verify that List button works as expected
    When user clicks List button
    Then employees are listed as a list


  @CNTR-337
  Scenario: Verify that "Employee created" message appears under full profile
    When user creates an employee
    Then 'Employee created' message appears under full profile


  @CNTR-338
  Scenario: Verify that user is not able create an employee without specifying the mandatory Name field
    When user clicks "Create" button
    And user clicks Save button in New Employees page
    Then Name field is highlighted


  @CNTR-339
  Scenario: Verify that the created employee is listed after clicking the Employees module
    Given user creates an employee
    And user is in "Employees" module
    When user searches the employee name
    Then employee is listed in the search result
