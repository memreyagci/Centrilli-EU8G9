package com.centrilli.step_defs;

import com.centrilli.pages.CreateNotesPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class
CreateNotes_StepDefs {

    CreateNotesPage createNotesPage = new CreateNotesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User clicks Notes button")
    public void user_clicks_notes_button() {
        createNotesPage.notesButton.click();
    }

    @And("User clicks on Create button")
    public void user_clicks_on_create_button() {
        createNotesPage.createButton.click();
    }
    @And("User selects Tags to Notes")
    public void user_selects_tags_to_notes() {
        createNotesPage.moreOptionDropdown.click();
        createNotesPage.tagsOptions.click();
    }
    @And("User clicks on save button")
    public void user_clicks_on_save_button() {
        createNotesPage.saveButton.click();
    }
    @Then("Note created message appears")
    public void note_created_message_appears() {
        Assert.assertTrue(createNotesPage.elementP.isDisplayed());
    }

    @When("User clicks Kanban button")
    public void user_clicks_kanban_button() {
        createNotesPage.kanbanButton.click();
    }
    @Then("User clicks List button")
    public void user_clicks_list_button() {
        createNotesPage.listButton.click();
    }

    @When("User clicks Discard button")
    public void user_clicks_discard_button() {
        createNotesPage.discardButton.click();
    }
    @Then("Verify user can discard notes")
    public void verify_user_can_discard_notes() {
        createNotesPage.warningMessageConfirmation.click();
    }

    @When("User selects one of the created Notes from list in Notes")
    public void user_selects_one_of_the_created_notes() {
         createNotesPage.listButton.click();
         createNotesPage.note.click();
    }

    @When("User clicks Edit button")
    public void user_clicks_edit_button() {
         createNotesPage.editButton.click();
         createNotesPage.textBox.sendKeys("edited");

    }

    @Then("Verify User can edited notes")
    public void verify_user_can_edited_notes() {
         Assert.assertTrue(createNotesPage.textMessage.isDisplayed());
    }

    @When("User clicks action button")
    public void user_clicks_action_button() {
        wait.until(ExpectedConditions.visibilityOf(createNotesPage.actionButton));
        createNotesPage.actionButton.click();
    }

    @Then("Verify User deleted selected notes")
    public void verify_user_deleted_selected_notes() {
        createNotesPage.deleteButton.click();
        createNotesPage.okButton.click();

    }




}
