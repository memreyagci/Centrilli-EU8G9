package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.NewVehicleCostPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewVehicleCost_StepDefs {
    LoginPage loginPage = new LoginPage();
    NewVehicleCostPage newVehicleCostPage = new NewVehicleCostPage();

    @Then("user already logged in page")
    public void user_already_logged_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("project.url"));
        loginPage.login();
    }

    @When("user goes to fleet menu")
    public void user_goes_to_fleet_menu() {
        newVehicleCostPage.moreOptionDropdown.click();
        newVehicleCostPage.fleetOption.click();
    }

    @When("user click to Vehicle Costs button")
    public void user_click_to_vehicle_costs_button() {
        newVehicleCostPage.vehicleCostsButton.click();
    }
    @Then("user is  on Vehicle Cost page")
    public void user_is_on_vehicles_services_logs_page() {
        Assert.assertTrue(newVehicleCostPage.textVehicleCost.isDisplayed());
    }


    @When("user click on Create button")
    public void user_click_on_create_button() {
        newVehicleCostPage.createButton.click();
    }


    @When("user selects any car the dropdown")
    public void user_selects_any_car_the_dropdown() {
       newVehicleCostPage.vehicleDropdown.click();
       newVehicleCostPage.vehicleSelection.click();

    }
    @Then("user click on Save button")
    public void user_click_on_save_button() {
        newVehicleCostPage.saveButton.click();


    }

    @Then("user should be able to created Vehicle Cost")
    public void user_should_be_able_to_created_vehicle_cost() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(newVehicleCostPage.newVehicleCostTitle));
       Assert.assertTrue("new vehicle cost is not created",newVehicleCostPage.newVehicleCostTitle.isDisplayed());
    }

    @Then("Vehicle Cost is not created")
    public void vehicle_cost_is_not_created() {
        Assert.assertTrue(newVehicleCostPage.errorMessage.isDisplayed());
    }



        }
