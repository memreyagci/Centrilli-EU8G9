package com.centrilli.step_defs;

import com.centrilli.pages.CRM_CustomerPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CRM_Customer_StepDef {

    CRM_CustomerPage crmCustomerPage = new CRM_CustomerPage();
    private final String customerName = new Faker().name().name();


    @When("user click's Create button in CRM_Customer")
    public void user_click_s_create_button_in_crm_customer() {
        crmCustomerPage.createOption.click();

    }
    @When("user provides customer name {string}")
    public void user_provides_customer_name(String customerName) {
        crmCustomerPage.customerNameInput.sendKeys(customerName);

    }
    @When("user click's save in CRM_Customer")
    public void user_click_s_save_in_crm_customer() {
        crmCustomerPage.saveButton.click();
    }

    @Then("Contact created message is displayed")
    public void contactCreatedMessageIsDisplayed() {
        Assert.assertTrue(crmCustomerPage.contactCreatedMessage.isDisplayed());
    }

    @And("user is in Customers submenu")
    public void userIsInCustomersSubmenu() {
        BrowserUtils.waitFor(10);
        crmCustomerPage.customersModule.click();
    }

    @When("user clicks Kanban button in CRM_Customer")
    public void userClicksKanbanButtonInCRM_Customer() {
        crmCustomerPage.kanbanViewOption.click();
    }

    @Then("customers are displayed as grid")
    public void customersAreDisplayedAsGrid() {
        Assert.assertTrue(crmCustomerPage.kanbanView.isDisplayed());
    }

    @When("user clicks List button in CRM_Customer")
    public void userClicksListButtonInCRM_Customer() {
        crmCustomerPage.listViewOption.click();
    }

    @Then("customers are displayed as list")
    public void customersAreDisplayedAsList() {
        Assert.assertTrue(crmCustomerPage.listView.isDisplayed());
    }

    @And("Warning message is displayed")
    public void warningMessageIsDisplayed() {
        //Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//*[@id=\"modal_716\"]/div")));

        Assert.assertTrue(crmCustomerPage.warningMessage.isDisplayed());
    }


    @Then("customer record is discarded")
    public void customerRecordIsDiscarded() {

    }

    @When("user selects a customer")
    public void userSelectsACustomer() {
        crmCustomerPage.selectCustomer.click();

    }



    @And("user enters {string} as street name")
    public void userEntersAsStreetName(String street) {
        BrowserUtils.waitFor(2);
        crmCustomerPage.streetName.sendKeys(street);
    }

    @And("user changes email to {string}")
    public void userChangesEmailTo(String email) {
        crmCustomerPage.emailAddress.sendKeys(email);
    }

    @When("user searches the created customer in search bar")
    public void userSearchesTheCreatedCustomerInSearchBar() {
        crmCustomerPage.searchBar.sendKeys("John Lennon");
        crmCustomerPage.searchBar.sendKeys(Keys.ENTER);
    }

    @And("selects created customer")
    public void selectsCreatedCustomer() {
        crmCustomerPage.selectFirstResult.click();
    }


    @And("user selects delete from dropdown")
    public void userSelectsDeleteFromDropdown() {

        crmCustomerPage.deleteButton.click();
    }

    @And("confirmation message is displayed")
    public void confirmationMessageIsDisplayed() {
        crmCustomerPage.confirmationMessage.isDisplayed();
    }


    @When("user clicks Ok button")
    public void userClicksOkButton() {
        crmCustomerPage.okButton.click();
    }

    @Then("customer is listed in the search result")
    public void customerIsListedInTheSearchResult() {
        Assert.assertFalse(crmCustomerPage.SearchedCustomer(customerName));
    }

    @And("user provides new customer name")
    public void userProvidesNewCustomerName() {
        crmCustomerPage.customerNameInput.clear();
        BrowserUtils.waitFor(2);

        crmCustomerPage.customerNameInput.sendKeys(customerName);
    }

    @And("user searches the customer name on the search box")
    public void userSearchesTheCustomerNameOnTheSearchBox() {
        crmCustomerPage.searchBar.sendKeys(customerName+Keys.ENTER);
    }
}
