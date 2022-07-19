@regression
@smoke
Feature: Sales functionality
  User Story :
  As a Sales Manager, I should be able to create and edit a new customers from "Sales" module


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the home page and on customer option

    Scenario: Verifying all the buttons in design stage
      When User click's List button
      And User click's Kanban button
      Then User click's Create button

    Scenario: Verify that the page title changes to the the customer name and address after creation.
      When User clicks Create button
      And User enter name
      And User enter address
      And User click's save
      Then User should see name and address on the title of the page

    Scenario: Verify that the user should be able to see created customer is listed after clicking the Customers module.
      And User enter created name on text
      Then User sees the searched value


