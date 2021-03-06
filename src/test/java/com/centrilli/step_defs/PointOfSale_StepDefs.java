package com.centrilli.step_defs;

import com.centrilli.pages.PointOfSalePage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSale_StepDefs {

    PointOfSalePage pointOfSalePage = new PointOfSalePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @When("user enters {string} in name input field")
    public void user_enters_in_name_input_field(String pointOfSale) {
        pointOfSalePage.inputBox.sendKeys(pointOfSale);
    }

    @When("user selects {string} under inventory")
    public void user_selects_under_inventory(String operationType) {
        pointOfSalePage.operationTypeBox.click();
        pointOfSalePage.searchMore.click();
        pointOfSalePage.selectOperationType(operationType);
    }

    @Then("user should be able to see expected {string} title")
    public void user_should_be_able_to_see_expected_title(String expectedPointOfSale) {
        Assert.assertEquals("Expected value does not match actual value", expectedPointOfSale, pointOfSalePage.actualPointOfSale.getText());
    }

    @When("user clicks Kanban button in Point of Sale")
    public void user_clicks_kanban_button_in_point_of_sale() {
        wait.until(ExpectedConditions.visibilityOf(pointOfSalePage.kanbanButton));
        pointOfSalePage.kanbanButton.click();
    }

    @Then("user should be able to see options in kanban board")
    public void user_should_be_able_to_see_options_in_kanban_board() {
        wait.until(ExpectedConditions.urlContains("kanban"));
        BrowserUtils.verifyURLContains("kanban");
    }

    @Then("user clicks List button in Point of Sale")
    public void user_clicks_list_button_in_point_of_sale() {
        pointOfSalePage.listButton.click();
    }

    @Then("user should be able to see options in list")
    public void user_should_be_able_to_see_options_in_list() {
        wait.until(ExpectedConditions.urlContains("list"));
        BrowserUtils.verifyURLContains("list");
    }

    @When("user clicks Discard button")
    public void user_clicks_discard_button() {
        pointOfSalePage.discardButton.click();
        pointOfSalePage.warningMessageConfirmation.click();
    }

    @Then("user should be able to return Point of Sale main page")
    public void user_should_be_able_to_return_point_of_sale_main_page() {
        Assert.assertTrue(pointOfSalePage.mainPageHeader.isDisplayed());
        BrowserUtils.verifyURLContains("list");
    }

    @When("user selects point of sale")
    public void user_selects_point_of_sale() {
        wait.until(ExpectedConditions.urlContains("list"));
        pointOfSalePage.pointOfSale.click();
    }

    @When("user enters new name {string} in name input field")
    public void user_enters_new_name_in_name_input_field(String newName) {
        pointOfSalePage.inputBox.clear();
        pointOfSalePage.inputBox.sendKeys(newName);
    }

    @Then("user should be able to see expected {string} title and expected {string} operation type")
    public void user_should_be_able_to_see_expected_title_and_expected_operation_type(String expectedPointOfSale, String expectedOperationType) {
        Assert.assertEquals("Expected value does not match actual value", expectedPointOfSale, pointOfSalePage.actualPointOfSale.getText());
        Assert.assertTrue("Actual value does not contain expected value", pointOfSalePage.actualOperationType.getText().contains(expectedOperationType));
    }

    @Then("user should be able to see error message")
    public void user_should_be_able_to_see_error_message() {
        wait.until(ExpectedConditions.visibilityOf(pointOfSalePage.errorMessage));
        Assert.assertTrue(pointOfSalePage.errorMessage.isDisplayed());
    }

}
