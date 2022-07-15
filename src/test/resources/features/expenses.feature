Feature: Expense Manager should be able to create Expense Report Summary

  Background: User is logged in as PosManager & on Expense Manager
    Given User is logged in
    And user is in "Expenses" module

  Scenario: Verify that the Expense Manager is able to create Expenses Report Summary by selecting "Create" option for each Employee.
    When user clicks Expense Reports button
    And user clicks Create button in Expense Reports
    And user fills in Expense Report Summary field
    And user selects an employee
    Then 'Expense Report created' message appears

