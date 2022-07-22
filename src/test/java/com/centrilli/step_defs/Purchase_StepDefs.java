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
        purchasePage.vendorBox.click();
        wait.until(ExpectedConditions.elementToBeClickable(purchasePage.vendorBox));
        purchasePage.vendorName.click();

    }
    @Then("user sees expected Draft Bill title")
    public void user_sees_expected_draft_bill_title() {
        Assert.assertTrue(purchasePage.draftBillTitle.isDisplayed());
    }



    @Then("user can switch Kanban view")
    public void user_can_switch_kanban_view() {
        wait.until(ExpectedConditions.urlContains("kanban"));
        BrowserUtils.verifyURLContains("kanban");
    }
    @Then("user can switch List view")
    public void user_can_switch_list_view() {
        wait.until(ExpectedConditions.urlContains("list"));
        BrowserUtils.verifyURLContains("list");
    }



    @Then("user returns Vendor Bills page")
    public void user_returns_vendor_bills_page() {
        purchasePage.okButton.click();
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
        Assert.assertTrue(purchasePage.newVendorName.isDisplayed());
    }



    @When("user deletes Vendor Bill")
    public void user_deletes_vendor_bill() {
        BrowserUtils.sleep(3);
        purchasePage.actionsDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(purchasePage.deleteButton));
        purchasePage.deleteButton.click();
        purchasePage.okButton.click();

    }
    @Then("Vendor Bills is deleted")
    public void vendor_bills_is_deleted() {
        wait.until(ExpectedConditions.textToBePresentInElement(purchasePage.vendorCount, "80"));
        Assert.assertEquals("80", purchasePage.vendorCount.getText());



    }
    @Then("The following fields are invalid message is displayed")
    public void the_following_fields_are_invalid_message_is_displayed() {
        purchasePage.vendorReferance.sendKeys("1234567");
        wait.until(ExpectedConditions.visibilityOf(purchasePage.errorMessage));
        Assert.assertTrue(purchasePage.errorMessage.isDisplayed());


    }
    @Then("user clicks Save button")
    public void user_save_button() {
        purchasePage.save.click();
    }

}

