Feature: Expense Manager should be able to create Expense Report Summary

  Background: User is logged in as PosManager & on Expense Manager
    Given User is logged in with valid credentials
    And user is in "Expenses" module


  Scenario: Verify that the Expense Manager is able to create Expenses Report Summary by selecting "Create" option for each Employee.
    When user is in "Expense Reports" submenu
    And user clicks Create button in Expense Reports
    And user fills in Expense Report Summary field
    And user selects an employee
    And user clicks Save button in Expense Reports
    Then 'Expense Report created' message appears


  Scenario: Verify that the "The following fields are invalid: Employee" error message is displayed when mandatory field Employee left blank
    When user is in "Expense Reports" submenu
    And user clicks Create button in Expense Reports
    And user fills in Expense Report Summary field
    And user clicks Save button in Expense Reports
    Then "The following fields are invalid:" "Employee" error message is displayed


  Scenario: Verify that the "The following fields are invalid: Expense Report Summary" error message is displayed when mandatory field Expense Report Summary left blank
    When user is in "Expense Reports" submenu
    And user clicks Create button in Expense Reports
    And user selects an employee
    And user clicks Save button in Expense Reports
    Then "The following fields are invalid:" "Expense Report Summary" error message is displayed


  Scenario: Verify that the "You cannot add expense lines of another employee" error message is displayed when selecting expenses of another employee when approving an expense on Expenses to Approve page.
    When user is in "Expense Reports To Approve" submenu
    And user clicks on an Expense Report
    And user clicks Edit button in Expense Reports to Approve
    And user clicks Add an item button in Expense Lines
    And user checks select all checkbox in Add: Expense Lines
    And user clicks on Select button in Add: Expense Lines
    And user clicks Approve button in Expense Reports to Approve
    Then "You cannot add expense lines of another employee." error message is displayed