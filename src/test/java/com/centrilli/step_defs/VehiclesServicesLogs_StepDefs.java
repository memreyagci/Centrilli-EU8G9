package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehicleServicesLogsPage;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class VehiclesServicesLogs_StepDefs {

    VehicleServicesLogsPage vehicle_services_logs_page = new VehicleServicesLogsPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is logged in with valid credentials")
    public void user_is_logged_in_with_valid_credentials() {
        loginPage.login();

    }
    @When("User goes to Fleet menu")
    public void user_goes_to_fleet_menu() {

        vehicle_services_logs_page.moreOptionDropdown.click();
        vehicle_services_logs_page.fleetOption.click();

    }
    @When("User clicks Vehicles Services Logs")
    public void user_clicks_vehicles_services_logs() {

        vehicle_services_logs_page.vehicleServicesLogs.click();

    }
    @Then("User is on Vehicles Services Logs Page")
    public void user_is_on_vehicles_services_logs_page() {

        Assert.assertTrue(vehicle_services_logs_page.textVehicleServicesLogs.isDisplayed());

    }

    @When("User clicks Create Button")
    public void userClicksCreateButton() {
        vehicle_services_logs_page.createButton.click();
    }


    @And("User selects one of the vehicles")
    public void userSelectsOneOfTheVehicles() {
        vehicle_services_logs_page.vehicleDropdown.click();
        vehicle_services_logs_page.vehicleSelection.click();
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        vehicle_services_logs_page.saveButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Vehicle Service Log is created")
    public void vehicleServiceLogIsCreated() {
        String expectedTitle = "Audi/A1/";
        String actualTitle = "New";

        //Assert.assertTrue(actualTitle.contains(expectedTitle));
        
        Assert.assertEquals(expectedTitle, vehicle_services_logs_page.verificationText.getText());



    }

    @Then("Vehicle Service Log is not created")
    public void vehicleServiceLogIsNotCreated() {

        Assert.assertTrue(vehicle_services_logs_page.inputNameWithInvalidHighlight.isDisplayed());


    }
}
