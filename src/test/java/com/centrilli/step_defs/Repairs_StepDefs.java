package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.Repairs_Page;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repairs_StepDefs {

    Repairs_Page repair = new Repairs_Page();
    LoginPage login = new LoginPage();

    @Given("User is on the home page and on repair option")
    public void userIsOnTheHomePageAndOnRepairOption() {
        login.login();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(repair.repair_button));
        repair.repair_button.click();


    }

    @When("User click's create button in repair")
    public void userClickSCreateButtonInRepair() {
        repair.create_button.click();
    }

    @And("User chooses a product to repair")
    public void userChoosesAProductToRepair() {
        repair.repair_product2.click();
       repair.repair_product.click();
    }

    @And("User click's save in repair")
    public void userClickSSaveInRepair() {
        repair.save_button.click();
    }

    @Then("Verify user created repair order")
    public void verifyUserCreatedRepairOrder() {
        repair.repair_saved_message.isDisplayed();
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User click's kanban button in repair")
    public void userClickSKanbanButtonInRepair() {
        repair.Kanban_button.click();
    }

    @Then("verify user sees kanban grafic")
    public void verifyUserSeesKanbanGrafic() {
        repair.kanban_grafic.isDisplayed();
    }

    @And("User click's list button in repair")
    public void userClickSListButtonInRepair() {
        repair.list_button.click();
    }

    @Then("Verify user sees list")
    public void verifyUserSeesList() {
        repair.list_grafic.isDisplayed();
    }



    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//


    @Then("Verify that user can discard")
    public void verifyThatUserCanDiscard() {
        repair.discard_button.click();
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User chooses a product from created list in repair")
    public void userChoosesAProductFromCreatedListInRepair() {
        repair.product_item.click();
    }

    @And("User click's Edit button in repair")
    public void userClickSEditButtonInRepair() {
        repair.edit_button_repair.click();
    }

    @And("User click's Save button in repair")
    public void userClickSSaveButtonInRepair() {
        repair.save_button.click();
    }

    @Then("Verify user sees edited page in repair")
    public void verifyUserSeesEditedPageInRepair() {
        repair.repair_saved_message.isDisplayed();
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User click's chosen products radio button in repair")
    public void userClickSChosenProductsRadioButtonInRepair() {
        repair.product_item_radio.click();
    }

    @And("User click's Delete in repair")
    public void userClickSDeleteInRepair() {
        repair.action_button.click();
        repair.delete_button.click();
    }

    @Then("Verify chosen product deleted")
    public void verifyChosenProductDeleted() {
        repair.delete_ok_button.click();
    }
}
