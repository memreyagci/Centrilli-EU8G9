package com.centrilli.step_defs;

import com.centrilli.pages.EmployeesPage;
import com.centrilli.pages.PurchasePage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purchase_StepDefs {

    PurchasePage purchasePage = new PurchasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);


    @When("user enters Vendor name")
    public void user_enters_vendor_name() {
    purchasePage.vendorBox.sendKeys("Test"+ Keys.ENTER);

    }
    @Then("user sees expected Draft Bill title")
    public void user_sees_expected_draft_bill_title() {
        Assert.assertTrue(purchasePage.draftBillTitle.isDisplayed());
    }



    @Then("user can switch Kanban view")
    public void user_can_switch_kanban_view() {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyURLContains("kanban");
    }
    @Then("user can switch List view")
    public void user_can_switch_list_view() {
        wait.until(ExpectedConditions.urlContains("list"));
        BrowserUtils.verifyURLContains("list");
    }



    @Then("user returns Vendor Bills page")
    public void user_returns_vendor_bills_page() {
        wait.until(ExpectedConditions.visibilityOf(purchasePage.vendorBillsTitle));
        Assert.assertTrue(purchasePage.vendorBillsTitle.isDisplayed());
    }



    @When("user changes Vendor name")
    public void user_changes_vendor_name() {
    purchasePage.vendorBox.clear();
    purchasePage.vendorBox.sendKeys("Name Changed"+Keys.ENTER);
    }
    @Then("Vendor name changes")
    public void vendor_name_changes() {
    Assert.assertTrue(purchasePage.vendorName.isDisplayed());
    }



    @When("user clicks Action button")
    public void user_clicks_action_button() {

    }
    @Then("Vendor Bills is deleted")
    public void vendor_bills_is_deleted() {

    }

}

