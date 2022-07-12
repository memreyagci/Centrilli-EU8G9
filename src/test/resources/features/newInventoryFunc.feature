@CNTR-343
Feature: Inventory Functionality

  User story: As a PosManager, I should be able to add new products to inventory

  Background: POs manager enters on centrilli web app
    Given  User is logged in as PosManager
    And    User is on Vehicles page


  @CNTR-342
  Scenario: Verify that the user can create a product.
    When   User clicks on create and edit option
    And   User enters vehicle model
    And   User enters vehicle make
    And   User click save button
    And   User clicks confirms new creation
    And   User Enters license plate no
    And   User click Save button
    Then   Verify New created vehicles details appear


  @CNTR-352
  Scenario: Verify that a new product can be found in the search.
    When   User clicks on create and edit option
    And   User enters vehicle model
    And   User enters vehicle make
    And   User click save button
    And   User clicks confirms new creation
    And   User Enters license plate no
    And   User click Save button
    And   Clicks on vehicles option
    And   Enters new created vehicle name and model on search
    Then  Verify User can see new created vehicle


  @CNTR-353
  Scenario: PosManager tries creating new vehicle without entering license plate
    When   User clicks on create and edit option
    And   User enters vehicle model
    And   User enters vehicle make
    And   User click save button
    And   User clicks confirms new creation
    And   User click Save button
    Then  Verify User is not able to create a new vehicle