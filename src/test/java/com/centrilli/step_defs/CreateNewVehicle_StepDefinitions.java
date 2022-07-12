package com.centrilli.step_defs;



import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehiclePages;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewVehicle_StepDefinitions {
    VehiclePages VehiclePages = new VehiclePages();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("user clicks fleet module")
    public void user_clicks_fleet_module() {
    VehiclePages.moreOptionDropdown.click();
    VehiclePages.fleetOptions.click();

    }


    @When("user clicks Vehicle Module")
    public void userClicksVehicleModule() {
        VehiclePages.vehicleModule.click();

    }

    @And("user clicks Create")
    public void userClicksCreate() {
        VehiclePages.createButton.click();
    }

    @And("user enter Model")
    public void userEnterModel() {
        VehiclePages.inputModelName.sendKeys("S");
        //VehiclePages.fieldModel.sendKeys("");
    }

    @And("user enter Make")
    public void userEnterMake() {
        VehiclePages.inputMakeName.sendKeys("Tesla");
        wait.until(ExpectedConditions.visibilityOf(VehiclePages.modulOptionMenu));
        VehiclePages.inputMakeName.sendKeys(Keys.ENTER);

        //VehiclePages.fieldMake.sendKeys("");
    }

    @And("user clicks save")
    public void userClicksSave() {
        VehiclePages.saveButton.click();
       // VehiclePages.create2Button.click();
      //  VehiclePages.saveButton.click();

    }

    @Then("new vehicle module created")
    public void newVehicleModuleCreated() {
        Assert.assertTrue(VehiclePages.headerDisplay.isDisplayed());



    }

    @Then("Make fields is highlighted")
    public void makeFieldsIsHighlighted() {
        Assert.assertTrue(VehiclePages.fieldMake.isDisplayed());
    }

    @Then("Model fields is highlighted")
    public void modelFieldsIsHighlighted() {
        Assert.assertTrue(VehiclePages.fieldModel.isDisplayed());
    }
}