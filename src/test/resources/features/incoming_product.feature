@CNTR-442
Feature: PURCHASE - Incoming Product

  User Story: As a POS Manager I should be able to create Incoming Product
  #@CNTR-436
  Background: User is expected to be on log in page
    Given user logged in with valid credentials
    And user is in "Purchase" module

  @CNTR-437
  Scenario: Verify that the user can create new  Incoming Product
    When user clicks Incoming Products
    And user clicks create button in Incoming Product
    And user selects "Partner Locations/Customers" from Source Location
    And user selects "Partner Locations/Customers/European Customers" from Destination Location
    And user clicks products dropdown
    And user selects one of created product
    And user clicks save button in Incoming Products
    Then user verify that created product is displayed

  @CNTR-438
  Scenario: Verify that the user can switch Kanban view
    When user clicks Incoming Products
    And user clicks Kanban button in Incoming Products
    Then verify that products are listed as grid

  @CNTR-439
  Scenario: Verify that the user can switch List view
    When user clicks Incoming Products
    And user clicks List button in Incoming Products
    Then verify that products are listed as listed

  @CNTR-440
  Scenario: Verify that the user can discard changes
    When user clicks Incoming Products
    And user clicks create button in Incoming Product
    And user selects "Partner Locations/Customers" from Source Location
    And user selects "Partner Locations/Customers/European Customers" from Destination Location
    And user clicks products dropdown
    And user selects one of created product
    And user clicks discard button in Incoming Products
    And user clicks ok button
    Then verify that user come back to Incoming Product page

  @CNTR-441
  Scenario: Verify that the user can delete Incoming Product
    When user clicks Incoming Products
    And user clicks create button in Incoming Product
    And user selects "Partner Locations/Customers" from Source Location
    And user selects "Partner Locations/Customers/European Customers" from Destination Location
    And user clicks products dropdown
    And user selects one of created product
    And user clicks save button in Incoming Products
    And user clicks Action button in Incoming Product
    And user clicks delete button in Incoming Product
    And user clicks ok button
    Then verify that user come back to Incoming Product page
