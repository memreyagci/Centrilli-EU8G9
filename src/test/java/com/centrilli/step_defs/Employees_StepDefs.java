package com.centrilli.step_defs;

import com.centrilli.pages.EmployeesPage;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Employees_StepDefs {
    EmployeesPage employeesPage = new EmployeesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    private final String employeeName = new Faker().name().name();

    @When("user creates an employee")
    public void user_creates_an_employee() {
        employeesPage.clickButton("Create");
        employeesPage.inputName.sendKeys(employeeName);
        employeesPage.clickButton("Save");
    }

    @Given("user is on Employees page")
    public void user_is_on_employees_page() {
        employeesPage.btnNavigationEmployees.click();
    }

    @When("user clicks Kanban button")
    public void user_clicks_kanban_button() {
        employeesPage.btnSwitchKanbanView.click();
    }

    @When("user clicks List button")
    public void user_clicks_list_button() {
        employeesPage.btnSwitchListView.click();
    }

    @When("user clicks Save button in New Employees page")
    public void clicks_save_button() {
        employeesPage.btnSave.click();
    }

    @When("user searches the employee name")
    public void user_searches_the_employee_name() {
        wait.until(ExpectedConditions.visibilityOf(employeesPage.inputSearchBox));
        employeesPage.inputSearchBox.sendKeys(""); // Interact with the element so that it is attached to the DOM. Otherwise, it gives "element is not attached to the page document" error
        employeesPage.inputSearchBox.sendKeys(employeeName + Keys.ENTER);
    }

    @Then("employee creation page shows up")
    public void employee_creation_page_shows_up() {
        Assert.assertTrue(employeesPage.textNewEmployee.isDisplayed());
    }

    @Then("employees are listed as grid")
    public void employees_are_listed_as_grid() {
        Assert.assertTrue(employeesPage.kanbanViewEmployees.isDisplayed());
    }

    @Then("employees are listed as a list")
    public void employees_are_listed_as_a_list() {
        Assert.assertTrue(employeesPage.listViewEmployees.isDisplayed());
    }

    @Then("'Employee created' message appears under full profile")
    public void employee_created_message_appears_under_full_profile() {
        Assert.assertTrue(employeesPage.textEmployeeCreated.isDisplayed());
    }

    @Then("employee is listed in the search result")
    public void employee_is_listed() {
        employeesPage.getSearchedEmployee("");
        Assert.assertTrue(employeesPage.getSearchedEmployee(employeeName).isDisplayed());
    }

    @Then("Name field is highlighted")
    public void name_field_is_highlighted() {
        Assert.assertTrue(employeesPage.inputNameWithInvalidHighlight.isDisplayed());
    }

}