package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Repairs_StepDefs {


    LoginPage login = new LoginPage();

    @Given("User is on the home page and on repair option")
    public void userIsOnTheHomePageAndOnRepairOption() {
    }

    @When("User click's create button in repair")
    public void userClickSCreateButtonInRepair() {
    }

    @And("User chooses a product to repair")
    public void userChoosesAProductToRepair() {
    }

    @And("User click's save in repair")
    public void userClickSSaveInRepair() {
    }

    @Then("Verify user created repair order")
    public void verifyUserCreatedRepairOrder() {
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User click's kanban button in repair")
    public void userClickSKanbanButtonInRepair() {
    }

    @Then("verify user sees kanban grafic")
    public void verifyUserSeesKanbanGrafic() {
    }

    @And("User click's list button in repair")
    public void userClickSListButtonInRepair() {
    }

    @Then("Verify user sees list")
    public void verifyUserSeesList() {
    }



    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//


    @Then("Verify that user can discard")
    public void verifyThatUserCanDiscard() {
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User chooses a product from created list in repair")
    public void userChoosesAProductFromCreatedListInRepair() {
    }

    @And("User click's Edit button in repair")
    public void userClickSEditButtonInRepair() {
    }

    @And("User click's Save button in repair")
    public void userClickSSaveButtonInRepair() {
    }

    @Then("Verify user sees edited page in repair")
    public void verifyUserSeesEditedPageInRepair() {
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//



    @When("User click's chosen products radio button in repair")
    public void userClickSChosenProductsRadioButtonInRepair() {
    }

    @And("User click's action button in repair")
    public void userClickSActionButtonInRepair() {
    }

    @And("User click's Delete in repair")
    public void userClickSDeleteInRepair() {
    }

    @Then("Verify chosen product deleted")
    public void verifyChosenProductDeleted() {
    }
}
