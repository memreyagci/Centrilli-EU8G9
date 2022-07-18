package com.centrilli.step_defs;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.PointOfSalePage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSale_StepDefs {

    BasePage basePage = new BasePage();
    PointOfSalePage pointOfSalePage = new PointOfSalePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is in {string} page")
    public void user_is_in_page(String pointOfSale) {
        basePage.clickNavBarBtn(pointOfSale);
    }

    @When("user clicks Point of Sale under Configuration")
    public void user_clicks_point_of_sale_under_configuration() {
        pointOfSalePage.pointOfSale.click();
    }

    @When("user clicks Create button in Point of Sale")
    public void user_clicks_create_button_in_point_of_sale() {
       wait.until(ExpectedConditions.visibilityOf(pointOfSalePage.createButton));
       pointOfSalePage.createButton.click();
    }

    @When("user enters {string} in name input field")
    public void user_enters_in_name_input_field(String pointOfSale) {
        pointOfSalePage.inputBox.sendKeys(pointOfSale);
    }

    @When("user selects {string} under inventory")
    public void user_selects_under_inventory(String operationType) {
        pointOfSalePage.operationTypeBox.click();
        pointOfSalePage.searchMore.click();
        pointOfSalePage.selectOperationType(operationType);
        pointOfSalePage.saveButton.click();
    }

    @Then("user should be able to see expected {string} in the header")
    public void user_should_be_able_to_see_expected_in_the_header(String expectedPointOfSale) {
        Assert.assertEquals("Expected value does not match actual value", expectedPointOfSale, pointOfSalePage.actualPointOfSale.getText());
    }

}
