package com.centrilli.step_defs;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.IncomingProductPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncomingProduct_StepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    IncomingProductPage page = new IncomingProductPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    private Object driver;
    JavascriptExecutor executor = (JavascriptExecutor) driver;


    @When("user clicks Incoming Products")
    public void user_clicks_incoming_products() {
        page.incomingProduct.click();
    }
    @And("user clicks create button in Incoming Product")
    public void user_clicks_create_button_in_incoming_product() {
        new WebDriverWait(Driver.getDriver(), 20).until(ExpectedConditions.titleContains("Incoming Products"));
        page.btnCreateIncomingProduct.click();
    }
    @And("user selects {string} from Source Location")
    public void user_selects_from_source_location(String partnerLocationsCustomers) {
        wait.until(ExpectedConditions.visibilityOf(page.dropDownSourceLocation));
        page.dropDownSourceLocation.click();
        page.partnerLocationsCustomers.click();
    }
    @And("user selects {string} from Destination Location")
    public void user_selects_from_destination_location(String partnerLocationsCustomersEuropeanCustomers) {
        page.dropDownDestinationLocation.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.partnerLocationsCustomersEuropeanCustomers));
        page.partnerLocationsCustomersEuropeanCustomers.click();
    }
    @And("user clicks products dropdown")
    public void user_clicks_products_dropdown() {
        page.dropDownProduct.click();
    }

    @And("user selects one of created product")
    public void user_selects_one_of_created_product() {
        page.testProduct.click();
    }
    @And("user clicks save button in Incoming Products")
    public void user_clicks_save_button_in_incoming_products() {
        page.clickButton("Save");

    }
    @Then("user verify that created product is displayed")
    public void user_verify_that_created_product_is_displayed() {
        wait.until(ExpectedConditions.visibilityOf(page.createdProductVerification));
        page.createdProductVerification.click();
    }

    @And("user clicks Kanban button in Incoming Products")
    public void user_clicks_kanban_button_in_incoming_products() {
        page.kanbanBtnIncoming.click();

    }
    @Then("verify that products are listed as grid")
    public void verify_that_products_are_listed_as_grid() {
        wait.until(ExpectedConditions.urlContains("kanban"));
        BrowserUtils.verifyURLContains("kanban");
    }

    @And("user clicks List button in Incoming Products")
    public void user_clicks_list_button_in_incoming_products() {
        page.listBtnIncoming.click();
    }
    @Then("verify that products are listed as listed")
    public void verify_that_products_are_listed_as_listed() {
        wait.until(ExpectedConditions.urlContains("list"));
        BrowserUtils.verifyURLContains("list");
    }

    @When("user clicks discard button in Incoming Products")
    public void user_clicks_discard_button_in_incoming_products() {
        page.discardBtnIncoming.click();
    }
    @When("user clicks ok button")
    public void user_clicks_ok_button() {
        page.clickButton("Ok");
    }
    @Then("verify that user come back to Incoming Product page")
    public void verify_that_user_come_back_to_incoming_product_page() {
        page.incomingProductVerification.click();
    }

    @When("user clicks Action button in Incoming Product")
    public void user_clicks_action_button_in_incoming_product() {
        wait.until(ExpectedConditions.elementToBeClickable(page.actionbtnIncoming));
        page.actionbtnIncoming.click();
    }
    @When("user clicks delete button in Incoming Product")
    public void user_clicks_delete_button_in_incoming_product() {
        wait.until(ExpectedConditions.elementToBeClickable(page.deletebtnIncoming));
        page.deletebtnIncoming.click();
    }







}
