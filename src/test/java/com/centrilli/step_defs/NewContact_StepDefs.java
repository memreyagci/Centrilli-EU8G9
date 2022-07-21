package com.centrilli.step_defs;

import com.centrilli.pages.ContactsPage;
import com.centrilli.pages.HomePage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewContact_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();
    String customerName = faker.bothify("?????? ??????");



    @Given("User is logged in with valid credentials.")
    public void userIsLoggedInWithValidCredentials() {
        Driver.getDriver().get("https://qa.centrilli.com/");
        loginPage.userName.sendKeys("posmanager10@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginButton.click();
        wait.until(ExpectedConditions.titleContains("#Inbox"));
    }

    @And("Enters name and contact name on according fields")
    public void entersNameAndContactNameOnAccordingFields() {
        contactsPage.enterName.sendKeys(customerName);
        contactsPage.createContactbutton.click();
        contactsPage.enterName2.sendKeys(customerName);
        BrowserUtils.waitFor(1);
        contactsPage.saveNcloseButton.click();
    }

    @And("Clicks save button")
    public void clicksSaveButton() {
        contactsPage.saveButton.click();
        // BrowserUtils.waitFor(1);
        // contactsPage.discardButton.click();
    }

    @Then("Verify that new contact is created")
    public void verifyThatNewContactIsCreated() {
        wait.until(ExpectedConditions.titleContains(customerName));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(customerName));

    }

    @When("User is on kanban view")
    public void userIsOnKanbanView() {
        contactsPage.kanbanVerification.isDisplayed();
    }

    @And("User click on list view")
    public void userClickOnListView() {
        contactsPage.listViewButton.click();
    }

    @Then("Verify that list view is displayed")
    public void verifyThatListViewIsDisplayed() {
        contactsPage.listViewVerification.isDisplayed();
    }

    @And("User clicks discard button")
    public void userClicksDiscardButton() {
        contactsPage.discardButton2.click();
        contactsPage.okButton.click();
    }


    @Then("Verify changes are not saved")
    public void verifyChangesAreNotSaved() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Contacts"));
    }


    @When("User clicks on a old contact")
    public void userClicksOnAOldContact() {
        contactsPage.oldContact.click();
    }

    @And("Clicks edit button")
    public void clicksEditButton() {
        contactsPage.editButton.click();

    }

    @And("User clicks Action button and deletes the contact")
    public void userClicksActionButtonAndDeletesTheContact() {
        contactsPage.actionButton.click();
        contactsPage.deleteButton.click();
        contactsPage.confirmDeletion.click();

    }

    @Then("Verify that contact is deleted")
    public void verifyThatContactIsDeleted() {
        BrowserUtils.waitFor(2);
        Assert.assertFalse(Driver.getDriver().getTitle().contains(customerName));
    }

    @And("user is in Customers menu")
    public void userIsInCustomersMenu() {
        BrowserUtils.waitFor(1);
        homePage.contactsElement.click();
    }

    @When("User clicks Create bttn")
    public void userClicksCreateBttn() {
        contactsPage.createButton.click();
    }


}
