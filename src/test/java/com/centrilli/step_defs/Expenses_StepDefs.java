package com.centrilli.step_defs;

import com.centrilli.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Expenses_StepDefs {
    BasePage basePage = new BasePage();

    @Given("user is in Expenses page")
    public void user_is_in_expenses_page() {
        basePage.clickNavBarBtn("Expenses");
    }

    @When("user clicks Expense Reports button")
    public void user_clicks_expense_reports_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks Create button in Expense Reports")
    public void user_clicks_create_button_in_expense_reports() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user fills in Expense Report Summary field")
    public void user_fills_in_expense_report_summary_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects an employee")
    public void user_selects_an_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("'Expense Report created' message appears")
    public void message_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
