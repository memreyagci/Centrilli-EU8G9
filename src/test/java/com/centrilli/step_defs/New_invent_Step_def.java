package com.centrilli.step_defs;

import com.centrilli.pages.CreatePage;
import com.centrilli.pages.HomePage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_invent_Step_def {

    public class _3_stepDefinitions {


        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        CreatePage createPage = new CreatePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        Faker faker = new Faker();
        String vehicleMake = faker.bothify("??xxx????");
        String vehicleModel = faker.bothify("Toyota?x?x");


        @Given("User is logged in as PosManager")
        public void user_is_logged_in_as_pos_manager() {
            Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
            loginPage.loginButton.click();
            wait.until(ExpectedConditions.titleContains("#Inbox"));
            homePage.moreElement.click();
            homePage.fleetOption.click();
        }

        @Given("User is on Vehicles page")
        public void user_is_on_vehicles_page() {
            Assert.assertTrue(homePage.verifyCreatePage.isDisplayed());
            createPage.createButton.click();
            createPage.modelDropdown.click();
        }


        @When("User clicks on create and edit option")
        public void user_clicks_on_create_and_edit_option() {
            createPage.createAndEdit.click();
        }

        @And("User enters vehicle model")
        public void userEntersVehicleModel() {
            BrowserUtils.waitFor(2);
            createPage.vehicleNameAndModelBox.sendKeys(vehicleModel);
        }

        @And("User enters vehicle make")
        public void userEntersVehicleMake() {
            BrowserUtils.waitFor(2);
            createPage.vehicleBrandBox.sendKeys(vehicleMake);
        }

        @When("User click save button")
        public void user_click_save_button() {
            createPage.saveButton.click();
        }

        @And("User clicks confirms new creation")
        public void userConfirmsNewCreation() throws InterruptedException {
            createPage.createButtonInsideCreate.click();
            createPage.saveButton.click();
            BrowserUtils.sleep(3);
            createPage.close.click();
        }

        @And("User Enters license plate no")
        public void userEntersLicensePlateNo() {
            wait.until(ExpectedConditions.visibilityOf(createPage.licensePlateBox));
            createPage.licensePlateBox.sendKeys(faker.bothify("###???"));
        }

        @Then("Verify New created vehicles details appear")
        public void new_created_vehicles_details_appear() {
            wait.until(ExpectedConditions.titleContains(vehicleModel));
            Assert.assertTrue(Driver.getDriver().getTitle().contains(vehicleModel));

        }

        @When("Clicks on vehicles option")
        public void clicks_on_vehicles_option() {


            // wait.until(ExpectedConditions.visibilityOf(createPage.close));
            // createPage.close.click();
            wait.until(ExpectedConditions.titleContains(vehicleModel));
            createPage.vehicleOption.click();
        }

        @And("User click Save button")
        public void userClickSaveButton() {
            createPage.lasSaveButton.click();
            wait.until(ExpectedConditions.visibilityOf(createPage.licensePlateBox));
        }

        @When("Enters new created vehicle name and model on search")
        public void enters_new_created_vehicle_name_and_model_on_search() {
            BrowserUtils.sleep(4);
            Assert.assertTrue(createPage.searchBar.isDisplayed());
            createPage.searchBar.sendKeys(vehicleModel + Keys.ENTER);
        }

        @Then("Verify User can see new created vehicle")
        public void userCanSeeNewCreatedVehicle() {

            Assert.assertTrue(createPage.newElementVerification.isDisplayed());
        }

        @Then("Verify User is not able to create a new vehicle")
        public void userIsNotAbleToCreateANewVehicle() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("New"));

        }

    }
}
