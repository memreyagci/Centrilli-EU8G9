package com.centrilli.step_defs;

import com.centrilli.pages.EmployeesPage;
import com.centrilli.pages.LoginPage;
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


public class Employees_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    EmployeesPage employeesPage = new EmployeesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    private final String employeeName = new Faker().name().name();


    @Given("user is logged in as PosManager")
    public void user_is_logged_in_as_pos_manager() {
        loginPage.login();

        // Needed to wait for Inbox page to load, otherwise it directs to it later on, thus doesn't end up on desired page
        wait.until(ExpectedConditions.titleContains("#Inbox"));
    }
    @Given("user is on Employees page")
    public void user_is_on_employees_page() {
        employeesPage.buttonNavigationEmployees.click();
    }


    @When("user clicks Create button")
    public void user_clicks_create_button() {
        employeesPage.buttonCreate.click();
    }
    @Then("employee creation page shows up")
    public void employee_creation_page_shows_up() {
        Assert.assertTrue(employeesPage.textNewEmployee.isDisplayed());
    }


    @When("user clicks Kanban button")
    public void user_clicks_kanban_button() {
        employeesPage.buttonSwitchKanbanView.click();
    }
    @Then("employees are listed as grid")
    public void employees_are_listed_as_grid() {
        Assert.assertTrue(employeesPage.kanbanViewEmployees.isDisplayed());
    }


    @When("user clicks List button")
    public void user_clicks_list_button() {
        employeesPage.buttonSwitchListView.click();
    }
    @Then("employees are listed as a list")
    public void employees_are_listed_as_a_list() {
        Assert.assertTrue(employeesPage.listViewEmployees.isDisplayed());
    }


    @When("user fills in Name field")
    public void fills_in_name_field() {
        employeesPage.inputName.sendKeys("SomeName");
    }
    @And("user clicks Save button")
    public void clicks_save_button() {
        employeesPage.buttonSave.click();
    }
    @Then("'Employee created' message appears under full profile")
    public void employee_created_message_appears_under_full_profile() {
        Assert.assertTrue(employeesPage.textEmployeeCreated.isDisplayed());
    }



    @And("user types in a name to Name field")
    public void user_types_in_to_name_field() {
        employeesPage.inputName.sendKeys(employeeName);
    }
    @And("user clicks the Employees module")
    public void user_clicks_the_employees_module() {
        employeesPage.buttonNavigationEmployees.click();
    }
    @And("user searches the name on the search box")
    public void user_types_in_to_search_box() {
        wait.until(ExpectedConditions.visibilityOf(employeesPage.inputSearchBox));
        employeesPage.inputSearchBox.sendKeys(employeeName + Keys.ENTER);
    }
    @Then("employee is listed in the search result")
    public void employee_is_listed() {
        Assert.assertTrue(employeesPage.getSearchedEmployee(employeeName).isDisplayed());
    }

    @Then("Name field is highlighted")
    public void name_field_is_highlighted() {
        Assert.assertTrue(employeesPage.inputNameWithInvalidHighlight.isDisplayed());
    }
}