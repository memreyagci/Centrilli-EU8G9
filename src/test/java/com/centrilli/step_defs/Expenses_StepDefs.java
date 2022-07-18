package com.centrilli.step_defs;

import com.centrilli.pages.ExpenseReportsPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expenses_StepDefs {
    ExpenseReportsPage expenseReportsPage = new ExpenseReportsPage();


    @When("user clicks Create button in Expense Reports")
    public void user_clicks_create_button_in_expense_reports() {
        new WebDriverWait(Driver.getDriver(), 20).until(ExpectedConditions.titleContains("My Reports"));
        expenseReportsPage.btnCreate.click();
    }

    @When("user fills in Expense Report Summary field")
    public void user_fills_in_expense_report_summary_field() {
        expenseReportsPage.inputExpenseReportSummary.sendKeys("Test Summary Title");
    }

    @When("user selects an employee")
    public void user_selects_an_employee() {
        expenseReportsPage.dropdownInputEmployee.click();
        expenseReportsPage.dropdownItemFirstEmployee.click();
    }

    @And("user clicks Save button in Expense Reports")
    public void user_clicks_save_button_in_expense_reports() {
        expenseReportsPage.btnSave.click();
    }

    @Then("'Expense Report created' message appears")
    public void message_appears() {
        Assert.assertTrue(expenseReportsPage.textExpenseReportCreated.isDisplayed());
    }

    @Then("{string} {string} error message is displayed")
    public void error_message_is_displayed(String expectedErrMsgTitle, String expectedErrMsgContent) {
        String expectedErrMsg = expectedErrMsgTitle + " " + expectedErrMsgContent;
        Assert.assertEquals(expectedErrMsg, expenseReportsPage.getErrMsg());
    }

}
