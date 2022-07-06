package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehicleFuelLogsPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleFuelLogs_StepDefs {

    LoginPage loginPage = new LoginPage();
    VehicleFuelLogsPage page = new VehicleFuelLogsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("user logged in with valid credentials")
    public void user_logged_in_with_valid_credentials() {
       loginPage.login();
    }

    @When("user clicks Fleet module")
    public void user_clicks_fleet_module() {

        page.dropDownMore.click();
        page.fleetModule.click();

    }
    @And("user clicks Vehicles Fuel Logs")
    public void user_clicks_vehicles_fuel_logs() {
        page.vehiclesFuelLogsOption.click();
    }
    @And("user clicks Create button")
    public void user_clicks_create_button() {
        page.btnCreate.click();
    }
    @And("user selects one of created vehicles")
    public void user_selects_one_of_created_vehicles() {
        wait.until(ExpectedConditions.visibilityOf(page.dropDownVehicle));
        page.dropDownVehicle.click();
        page.selectedVehicle.click();
    }
    @And("user clicks save button")
    public void user_clicks_save_button() {
        page.btnSave.click();
    }
    @Then("user verify that created model is displayed")
    public void user_verify_that_created_model_is_displayed() {
        Assert.assertTrue(page.createdVehicleText.isDisplayed());
    }

    @Then("user verify that error message is displayed")
    public void userVerifyThatErrorMessageIsDisplayed() {
        Assert.assertTrue(page.errorMessage.isDisplayed());
    }
}
