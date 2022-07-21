@regression
@smoke
@CNTR-395
Feature: Expense Manager should be able to create Expense Report Summary

  Background: User is logged in as PosManager & in Expenses module
    Given User is logged in with valid credentials
    And user is in "Expenses" module

  @CNTR-391
  Scenario: Verify that the Expense Manager is able to create Expenses Report Summary by selecting "Create" option for each Employee.
    Given user is in "Expense Reports" submenu
    When user creates an Expense Report
    Then 'Expense Report created' message appears


  @CNTR-392
  Scenario: Verify that the "The following fields are invalid: Employee" error message is displayed when mandatory field Employee left blank
    Given user is in "Expense Reports" submenu
    When user creates an employee by filling in "Employee"
    Then "The following fields are invalid:" "Expense Report Summary" error message is displayed


  @CNTR-393
  Scenario: Verify that the "The following fields are invalid: Expense Report Summary" error message is displayed when mandatory field Expense Report Summary left blank
    Given user is in "Expense Reports" submenu
    When user creates an employee by filling in "Expense Report Summary"
    Then "The following fields are invalid:" "Employee" error message is displayed


  @CNTR-394
  Scenario: Verify that the "You cannot add expense lines of another employee" error message is displayed when selecting expenses of another employee when approving an expense on Expenses to Approve page.
    Given user is in "Expense Reports To Approve" submenu
    When user edits an Expense Report
    And user adds items to Expense Lines
    And user clicks "Approve" button
    Then "You cannot add expense lines of another employee." error message is displayed
